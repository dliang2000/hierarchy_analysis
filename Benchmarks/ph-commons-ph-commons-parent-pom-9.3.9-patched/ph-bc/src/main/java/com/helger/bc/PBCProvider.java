/**
 * Original copyright by Apache Software Foundation
 * Copyright (C) 2017-2019 Philip Helger (www.helger.com)
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
package com.helger.bc;

import java.security.Provider;
import java.security.Security;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.commons.annotation.PresentForCodeCoverage;

/**
 * One and only BouncyCastle (BC) Provider Provider
 *
 * @author Philip Helger
 */
@Immutable
public final class PBCProvider
{
  /**
   * Special provider name for the FIPS version of BouncyCastle. As there is no
   * Maven artefact, the constant is here for the sake of completeness only.
   */
  public static final String PROVIDER_NAME_BC_FIPS = "BCFIPS";

  private static final Logger LOGGER = LoggerFactory.getLogger (PBCProvider.class);

  // Singleton instance
  private static final Provider PROVIDER;

  static
  {
    Provider aProvider = Security.getProvider (BouncyCastleProvider.PROVIDER_NAME);
    if (aProvider == null)
    {
      // Create and add a new one
      aProvider = new BouncyCastleProvider ();
      Security.addProvider (aProvider);
    }
    else
    {
      // Check if existing one is from BC
      if (!(aProvider instanceof BouncyCastleProvider))
        LOGGER.warn ("Security provider '" +
                     BouncyCastleProvider.PROVIDER_NAME +
                     "' is not of type org.bouncycastle.jce.provider.BouncyCastleProvider but it is a '" +
                     aProvider.getClass ().getName () +
                     "'");
    }
    PROVIDER = aProvider;
  }

  @PresentForCodeCoverage
  private static final PBCProvider s_aInstance = new PBCProvider ();

  private PBCProvider ()
  {}

  /**
   * @return The non-<code>null</code> BouncyCastleProvider instance
   */
  @Nonnull
  public static Provider getProvider ()
  {
    return PROVIDER;
  }
}
