/**
 * Copyright (C) 2014-2019 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.commons.locale.country;

import java.util.Locale;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.annotation.Singleton;
import com.helger.commons.annotation.VisibleForTesting;
import com.helger.commons.collection.impl.CommonsHashSet;
import com.helger.commons.collection.impl.ICommonsList;
import com.helger.commons.collection.impl.ICommonsSet;
import com.helger.commons.concurrent.SimpleReadWriteLock;
import com.helger.commons.locale.LocaleCache;
import com.helger.commons.locale.LocaleHelper;
import com.helger.commons.state.EChange;
import com.helger.commons.string.StringHelper;

/**
 * This is a global cache for country objects to avoid too many object flowing
 * around.<br>
 * This cache is application independent.
 *
 * @author Philip Helger
 */
@ThreadSafe
@Singleton
public class CountryCache
{
  private static final class SingletonHolder
  {
    private static final CountryCache s_aInstance = new CountryCache ();
  }

  private static final Logger LOGGER = LoggerFactory.getLogger (CountryCache.class);
  private static boolean s_bDefaultInstantiated = false;

  private final SimpleReadWriteLock m_aRWLock = new SimpleReadWriteLock ();

  /** Contains all known countries (as ISO 3166 2-letter codes). */
  @GuardedBy ("m_aRWLock")
  private final ICommonsSet <String> m_aCountries = new CommonsHashSet <> ();

  protected CountryCache ()
  {
    reinitialize ();
  }

  public static boolean isInstantiated ()
  {
    return s_bDefaultInstantiated;
  }

  /**
   * @return The one and only global instances. Never <code>null</code>.
   */
  @Nonnull
  public static CountryCache getInstance ()
  {
    final CountryCache ret = SingletonHolder.s_aInstance;
    s_bDefaultInstantiated = true;
    return ret;
  }

  @Nonnull
  @VisibleForTesting
  final EChange addCountry (@Nonnull final String sCountry)
  {
    ValueEnforcer.notNull (sCountry, "Country");
    final String sValidCountry = LocaleHelper.getValidCountryCode (sCountry);
    ValueEnforcer.isTrue (sValidCountry != null, () -> "illegal country code '" + sCountry + "'");
    ValueEnforcer.isTrue (sCountry.equals (sValidCountry), () -> "invalid casing of '" + sCountry + "'");

    return m_aRWLock.writeLocked ( () -> m_aCountries.addObject (sValidCountry));
  }

  /**
   * The normed country locale associated with the provided locale.
   *
   * @param aCountry
   *        Source locale. May be <code>null</code>.
   * @return <code>null</code> if the source locale is <code>null</code> or if
   *         the source locale does not contain country information.
   */
  @Nullable
  public Locale getCountry (@Nullable final Locale aCountry)
  {
    return aCountry == null ? null : getCountry (aCountry.getCountry ());
  }

  /**
   * Resolve the country from the provided string.<br>
   * Note: this method may be invoked recursively, if the country code contains
   * a locale spearator char.
   *
   * @param sCountry
   *        The country code. May be <code>null</code> or empty.
   * @return <code>null</code> if the provided country code is <code>null</code>
   *         or empty.
   */
  @Nullable
  public Locale getCountry (@Nullable final String sCountry)
  {
    if (StringHelper.hasNoText (sCountry))
      return null;

    // Was something like "_AT" (e.g. the result of getCountry (...).toString
    // ()) passed in? -> indirect recursion
    if (sCountry.indexOf (LocaleHelper.LOCALE_SEPARATOR) >= 0)
      return getCountry (LocaleCache.getInstance ().getLocale (sCountry));

    final String sValidCountry = LocaleHelper.getValidCountryCode (sCountry);
    if (!containsCountry (sValidCountry))
      if (LOGGER.isWarnEnabled ())
        LOGGER.warn ("Trying to retrieve unsupported country '" + sCountry + "'");

    // And use the locale cache
    return LocaleCache.getInstance ().getLocale ("", sValidCountry, "");
  }

  /**
   * @return a set with all contained countries. Never <code>null</code>.
   */
  @Nonnull
  @ReturnsMutableCopy
  public ICommonsSet <String> getAllCountries ()
  {
    return m_aRWLock.readLocked (m_aCountries::getClone);
  }

  /**
   * @return a set with all contained country locales. Never <code>null</code>.
   */
  @Nonnull
  @ReturnsMutableCopy
  public ICommonsSet <Locale> getAllCountryLocales ()
  {
    return m_aRWLock.readLocked ( () -> {
      final LocaleCache aLC = LocaleCache.getInstance ();
      return new CommonsHashSet <> (m_aCountries, x -> aLC.getLocale ("", x, ""));
    });
  }

  /**
   * Check if the passed country is known.
   *
   * @param aCountry
   *        The country to check. May be <code>null</code>.
   * @return <code>true</code> if the passed country is contained,
   *         <code>false</code> otherwise.
   */
  public boolean containsCountry (@Nullable final Locale aCountry)
  {
    return aCountry != null && containsCountry (aCountry.getCountry ());
  }

  /**
   * Check if the passed country is known.
   *
   * @param sCountry
   *        The country to check. May be <code>null</code>.
   * @return <code>true</code> if the passed country is contained,
   *         <code>false</code> otherwise.
   */
  public boolean containsCountry (@Nullable final String sCountry)
  {
    if (sCountry == null)
      return false;

    final String sValidCountry = LocaleHelper.getValidCountryCode (sCountry);
    if (sValidCountry == null)
      return false;
    return m_aRWLock.readLocked ( () -> m_aCountries.contains (sValidCountry));
  }

  /**
   * Reset the cache to the initial state.
   */
  public final void reinitialize ()
  {
    m_aRWLock.writeLocked (m_aCountries::clear);

    final ICommonsList <Locale> aAllLocales = LocaleCache.getInstance ().getAllLocales ();
    for (final Locale aLocale : aAllLocales)
    {
      final String sCountry = aLocale.getCountry ();
      if (StringHelper.hasText (sCountry))
        addCountry (sCountry);
    }

    if (LOGGER.isDebugEnabled ())
      LOGGER.debug ("Reinitialized " + getClass ().getName ());
  }
}
