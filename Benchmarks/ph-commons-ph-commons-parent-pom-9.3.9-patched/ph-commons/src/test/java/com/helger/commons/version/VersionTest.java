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
package com.helger.commons.version;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.helger.commons.mock.CommonsTestHelper;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * Test class for class {@link Version}.
 *
 * @author Philip Helger
 */
public final class VersionTest
{
  @Test
  @SuppressFBWarnings ("TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED")
  public void testVersionIntIntInt ()
  {
    // use 0.0.0
    Version v = new Version (0, 0, 0);
    assertEquals (0, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertNull (v.getQualifier ());
    assertNotNull (v.toString ());

    // use 0.0
    v = new Version (0, 0);
    assertEquals (0, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertNull (v.getQualifier ());

    // use 9.7
    v = new Version (9, 7);
    assertEquals (9, v.getMajor ());
    assertEquals (7, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertNull (v.getQualifier ());

    // use 0
    v = new Version (0);
    assertEquals (0, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertNull (v.getQualifier ());

    // use 2
    v = new Version (2);
    assertEquals (2, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertNull (v.getQualifier ());

    // try 97.98.99
    v = new Version (97, 98, 99);
    assertEquals (97, v.getMajor ());
    assertEquals (98, v.getMinor ());
    assertEquals (99, v.getMicro ());
    assertNull (v.getQualifier ());

    // try 97.98.99.alpha
    v = new Version (97, 98, 99, "alpha");
    assertEquals (97, v.getMajor ());
    assertEquals (98, v.getMinor ());
    assertEquals (99, v.getMicro ());
    assertEquals ("alpha", v.getQualifier ());

    try
    {
      // try negative value - needs to fail
      new Version (-1, 1, 1);
      fail ();
    }
    catch (final IllegalArgumentException ex)
    {}

    try
    {
      // try negative value - needs to fail
      new Version (1, -1, 1);
      fail ();
    }
    catch (final IllegalArgumentException ex)
    {}

    try
    {
      // try negative value - needs to fail
      new Version (1, 1, -1);
      fail ();
    }
    catch (final IllegalArgumentException ex)
    {}
  }

  @Test
  public void testVersionString ()
  {
    // check valid
    Version v = Version.parse ("1.2.3.alpha");
    assertEquals (1, v.getMajor ());
    assertEquals (2, v.getMinor ());
    assertEquals (3, v.getMicro ());
    assertEquals ("alpha", v.getQualifier ());

    // no qualifier
    v = Version.parse ("4.5.6");
    assertEquals (4, v.getMajor ());
    assertEquals (5, v.getMinor ());
    assertEquals (6, v.getMicro ());
    assertNull (v.getQualifier ());

    // no micro
    v = Version.parse ("7.8");
    assertEquals (7, v.getMajor ());
    assertEquals (8, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertNull (v.getQualifier ());

    // no minor
    v = Version.parse ("9");
    assertEquals (9, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertNull (v.getQualifier ());

    try
    {
      // try negative value - needs to fail
      Version.parse ("-1.1.1");
      fail ();
    }
    catch (final IllegalArgumentException ex)
    {}

    try
    {
      Version.parse ("1.-1.1");
      fail ();
    }
    catch (final IllegalArgumentException ex)
    {}

    try
    {
      Version.parse ("1.1.-1");
      fail ();
    }
    catch (final IllegalArgumentException ex)
    {}

    // empty string
    v = Version.parse ("");
    assertEquals (0, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertNull (v.getQualifier ());

    // very weird stuff - fails because String.split does not split
    v = Version.parse ("...");
    assertEquals (0, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertNull (v.getQualifier ());

    // very weird stuff - fails because String.split does not split
    v = Version.parse ("..");
    assertEquals (0, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertNull (v.getQualifier ());

    // very weird stuff - fails because String.split does not split
    v = Version.parse (".");
    assertEquals (0, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertNull (v.getQualifier ());

    // null string
    v = Version.parse (null);
    assertEquals (0, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertNull (v.getQualifier ());

    // alphabetic string
    v = Version.parse ("a.b.c.d", true);
    assertEquals (0, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertEquals ("d", v.getQualifier ());

    // alphabetic string
    v = Version.parse ("a.b.c.d", false);
    assertEquals (0, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertEquals ("a.b.c.d", v.getQualifier ());

    // alphabetic string
    v = Version.parse ("a.b.c", true);
    assertEquals (0, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertNull (v.getQualifier ());

    // alphabetic string
    v = Version.parse ("a.b.c", false);
    assertEquals (0, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertEquals ("a.b.c", v.getQualifier ());

    // alphabetic string
    v = Version.parse ("a5.b5.c5", true);
    assertEquals (0, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertNull (v.getQualifier ());

    // alphabetic string
    v = Version.parse ("a5.b5.c5", false);
    assertEquals (0, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertEquals ("a5.b5.c5", v.getQualifier ());

    // invalid numeric string
    v = Version.parse ("3a.3b.3c", true);
    assertEquals (0, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertNull (v.getQualifier ());

    // invalid numeric string
    v = Version.parse ("3a.3b.3c", false);
    assertEquals (0, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertEquals ("3a.3b.3c", v.getQualifier ());

    // Dash separator
    v = Version.parse ("3.0.0-RC1", true);
    assertEquals (3, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertNull (v.getQualifier ());

    // Dash separator
    v = Version.parse ("3.0.0-RC1", false);
    assertEquals (3, v.getMajor ());
    assertEquals (0, v.getMinor ());
    assertEquals (0, v.getMicro ());
    assertEquals ("RC1", v.getQualifier ());
  }

  @Test
  public void testCompareTo ()
  {
    final Version v1 = new Version (1, 2, 3);
    final Version v2 = new Version (1, 2, 3);
    final Version v3 = Version.parse ("1.2.3");
    final Version v4 = Version.parse ("1.2.3.alpha");
    final Version v5 = Version.parse ("1.2.3.beta");
    final Version v6 = Version.parse ("1.2");
    final Version v7 = Version.parse ("1");
    final Version v8 = Version.parse (null);
    final Version v9 = new Version (0, 0, 0);

    // check v1
    assertEquals (0, v1.compareTo (v1));
    assertEquals (0, v1.compareTo (v2));
    assertEquals (0, v1.compareTo (v3));
    assertTrue (v1.compareTo (v4) < 0);
    assertTrue (v1.compareTo (v5) < 0);
    assertTrue (v1.compareTo (v6) > 0);
    assertTrue (v1.compareTo (v7) > 0);
    assertTrue (v1.compareTo (v8) > 0);
    assertTrue (v1.compareTo (v9) > 0);

    // check v2
    assertEquals (0, v2.compareTo (v1));
    assertEquals (0, v2.compareTo (v2));
    assertEquals (0, v2.compareTo (v3));
    assertTrue (v2.compareTo (v4) < 0);
    assertTrue (v2.compareTo (v5) < 0);
    assertTrue (v2.compareTo (v6) > 0);
    assertTrue (v2.compareTo (v7) > 0);
    assertTrue (v2.compareTo (v8) > 0);
    assertTrue (v2.compareTo (v9) > 0);

    // check v3
    assertEquals (0, v3.compareTo (v1));
    assertEquals (0, v3.compareTo (v2));
    assertEquals (0, v3.compareTo (v3));
    assertTrue (v3.compareTo (v4) < 0);
    assertTrue (v3.compareTo (v5) < 0);
    assertTrue (v3.compareTo (v6) > 0);
    assertTrue (v3.compareTo (v7) > 0);
    assertTrue (v3.compareTo (v8) > 0);
    assertTrue (v3.compareTo (v9) > 0);

    // check v4
    assertTrue (v4.compareTo (v1) > 0);
    assertTrue (v4.compareTo (v2) > 0);
    assertTrue (v4.compareTo (v3) > 0);
    assertEquals (0, v4.compareTo (v4));
    assertTrue (v4.compareTo (v5) < 0);
    assertTrue (v4.compareTo (v6) > 0);
    assertTrue (v4.compareTo (v7) > 0);
    assertTrue (v4.compareTo (v8) > 0);
    assertTrue (v4.compareTo (v9) > 0);

    // check v5
    assertTrue (v5.compareTo (v1) > 0);
    assertTrue (v5.compareTo (v2) > 0);
    assertTrue (v5.compareTo (v3) > 0);
    assertTrue (v5.compareTo (v4) > 0);
    assertEquals (0, v5.compareTo (v5));
    assertTrue (v5.compareTo (v6) > 0);
    assertTrue (v5.compareTo (v7) > 0);
    assertTrue (v5.compareTo (v8) > 0);
    assertTrue (v5.compareTo (v9) > 0);

    // check v6
    assertTrue (v6.compareTo (v1) < 0);
    assertTrue (v6.compareTo (v2) < 0);
    assertTrue (v6.compareTo (v3) < 0);
    assertTrue (v6.compareTo (v4) < 0);
    assertTrue (v6.compareTo (v5) < 0);
    assertEquals (0, v6.compareTo (v6));
    assertTrue (v6.compareTo (v7) > 0);
    assertTrue (v6.compareTo (v8) > 0);
    assertTrue (v6.compareTo (v9) > 0);

    // check v7
    assertTrue (v7.compareTo (v1) < 0);
    assertTrue (v7.compareTo (v2) < 0);
    assertTrue (v7.compareTo (v3) < 0);
    assertTrue (v7.compareTo (v4) < 0);
    assertTrue (v7.compareTo (v5) < 0);
    assertTrue (v7.compareTo (v6) < 0);
    assertEquals (0, v7.compareTo (v7));
    assertTrue (v7.compareTo (v8) > 0);
    assertTrue (v7.compareTo (v9) > 0);

    // check v8
    assertTrue (v8.compareTo (v1) < 0);
    assertTrue (v8.compareTo (v2) < 0);
    assertTrue (v8.compareTo (v3) < 0);
    assertTrue (v8.compareTo (v4) < 0);
    assertTrue (v8.compareTo (v5) < 0);
    assertTrue (v8.compareTo (v6) < 0);
    assertTrue (v8.compareTo (v7) < 0);
    assertEquals (0, v8.compareTo (v8));
    assertEquals (0, v8.compareTo (v9));

    // check v9
    assertTrue (v9.compareTo (v1) < 0);
    assertTrue (v9.compareTo (v2) < 0);
    assertTrue (v9.compareTo (v3) < 0);
    assertTrue (v9.compareTo (v4) < 0);
    assertTrue (v9.compareTo (v5) < 0);
    assertTrue (v9.compareTo (v6) < 0);
    assertTrue (v9.compareTo (v7) < 0);
    assertEquals (0, v9.compareTo (v8));
    assertEquals (0, v9.compareTo (v9));

    // test weird stuff
    try
    {
      v1.compareTo (null);
      fail ();
    }
    catch (final NullPointerException ex)
    {}
  }

  @Test
  public void testEqualsObject ()
  {
    final Version v1 = new Version (1, 2, 3);
    final Version v2 = new Version (1, 2, 3);
    final Version v3 = Version.parse ("1.2.3");
    final Version v4 = Version.parse ("1.2.3.alpha");
    final Version v5 = Version.parse ("1.2.3.beta");
    final Version v6 = Version.parse ("1.2");
    final Version v7 = Version.parse ("1");
    final Version v8 = Version.parse (null);
    final Version v9 = new Version (0, 0, 0);

    // test v1
    assertEquals (v1, v1);
    assertEquals (v1, v2);
    assertEquals (v1, v3);
    assertFalse (v1.equals (v4));
    assertFalse (v1.equals (v5));
    assertFalse (v1.equals (v6));
    assertFalse (v1.equals (v7));
    assertFalse (v1.equals (v8));
    assertFalse (v1.equals (v9));

    // test v2
    assertEquals (v2, v1);
    assertEquals (v2, v2);
    assertEquals (v2, v3);
    assertFalse (v2.equals (v4));
    assertFalse (v2.equals (v5));
    assertFalse (v2.equals (v6));
    assertFalse (v2.equals (v7));
    assertFalse (v2.equals (v8));
    assertFalse (v2.equals (v9));

    // test v3
    assertEquals (v3, v1);
    assertEquals (v3, v2);
    assertEquals (v3, v3);
    assertFalse (v3.equals (v4));
    assertFalse (v3.equals (v5));
    assertFalse (v3.equals (v6));
    assertFalse (v3.equals (v7));
    assertFalse (v3.equals (v8));
    assertFalse (v3.equals (v9));

    // test v4
    assertFalse (v4.equals (v1));
    assertFalse (v4.equals (v2));
    assertFalse (v4.equals (v3));
    assertEquals (v4, v4);
    assertFalse (v4.equals (v5));
    assertFalse (v4.equals (v6));
    assertFalse (v4.equals (v7));
    assertFalse (v4.equals (v8));
    assertFalse (v4.equals (v9));

    // test v5
    assertFalse (v5.equals (v1));
    assertFalse (v5.equals (v2));
    assertFalse (v5.equals (v3));
    assertFalse (v5.equals (v4));
    assertEquals (v5, v5);
    assertFalse (v5.equals (v6));
    assertFalse (v5.equals (v7));
    assertFalse (v5.equals (v8));
    assertFalse (v5.equals (v9));

    // test v6
    assertFalse (v6.equals (v1));
    assertFalse (v6.equals (v2));
    assertFalse (v6.equals (v3));
    assertFalse (v6.equals (v4));
    assertFalse (v6.equals (v5));
    assertEquals (v6, v6);
    assertFalse (v6.equals (v7));
    assertFalse (v6.equals (v8));
    assertFalse (v6.equals (v9));

    // test v7
    assertFalse (v7.equals (v1));
    assertFalse (v7.equals (v2));
    assertFalse (v7.equals (v3));
    assertFalse (v7.equals (v4));
    assertFalse (v7.equals (v5));
    assertFalse (v7.equals (v6));
    assertEquals (v7, v7);
    assertFalse (v7.equals (v8));
    assertFalse (v7.equals (v9));

    // test v8
    assertFalse (v8.equals (v1));
    assertFalse (v8.equals (v2));
    assertFalse (v8.equals (v3));
    assertFalse (v8.equals (v4));
    assertFalse (v8.equals (v5));
    assertFalse (v8.equals (v6));
    assertFalse (v8.equals (v7));
    assertEquals (v8, v8);
    assertEquals (v8, v9);

    // test v9
    assertFalse (v9.equals (v1));
    assertFalse (v9.equals (v2));
    assertFalse (v9.equals (v3));
    assertFalse (v9.equals (v4));
    assertFalse (v9.equals (v5));
    assertFalse (v9.equals (v6));
    assertFalse (v9.equals (v7));
    assertEquals (v9, v8);
    assertEquals (v9, v9);

    // test weird stuff
    assertNotEquals (v1, null);
    assertNotEquals (v1, "anyString");

    assertEquals (Version.parse ("2.1.0"), Version.parse ("2.1"));
    assertEquals (Version.parse ("2.0.0"), Version.parse ("2"));
  }

  @Test
  public void testGetAsString ()
  {
    Version v = new Version (1, 2, 3);
    assertEquals ("1.2.3", v.getAsString ());
    assertEquals (v, Version.parse (v.getAsString ()));

    v = Version.parse ("1.2.3.");
    assertEquals ("1.2.3", v.getAsString ());
    assertEquals (v, Version.parse (v.getAsString ()));

    v = Version.parse ("1.2.3.alpha");
    assertEquals ("1.2.3.alpha", v.getAsString ());
    assertEquals (v, Version.parse (v.getAsString ()));

    v = Version.parse ("1.2.0.alpha");
    assertEquals ("1.2.0.alpha", v.getAsString ());
    assertEquals (v, Version.parse (v.getAsString ()));

    v = Version.parse ("1.2.3");
    assertEquals ("1.2.3", v.getAsString ());
    assertEquals (v, Version.parse (v.getAsString ()));

    v = Version.parse ("1.2.0");
    assertEquals ("1.2", v.getAsString ());
    assertEquals (v, Version.parse (v.getAsString ()));

    v = Version.parse ("1.0.2");
    assertEquals ("1.0.2", v.getAsString ());
    assertEquals (v, Version.parse (v.getAsString ()));

    v = Version.parse ("4.5");
    assertEquals ("4.5", v.getAsString ());
    assertEquals (v, Version.parse (v.getAsString ()));

    v = Version.parse ("4.0");
    assertEquals ("4", v.getAsString ());
    assertEquals (v, Version.parse (v.getAsString ()));

    v = Version.parse ("6");
    assertEquals ("6", v.getAsString ());
    assertEquals (v, Version.parse (v.getAsString ()));

    v = Version.parse (null);
    assertEquals (Version.DEFAULT_VERSION_STRING, v.getAsString ());
    assertEquals (v, Version.parse (v.getAsString ()));

    v = Version.parse (".2");
    assertEquals ("0.2", v.getAsString ());
    assertEquals (v, Version.parse (v.getAsString ()));

    v = Version.parse ("..2");
    assertEquals ("0.0.2", v.getAsString ());
    assertEquals (v, Version.parse (v.getAsString ()));

    v = Version.parse ("...2");
    assertEquals ("0.0.0.2", v.getAsString ());
    assertEquals (v, Version.parse (v.getAsString ()));

    v = Version.parse ("3.0.0-RC1", true);
    assertEquals ("3", v.getAsString ());
    assertEquals (v, Version.parse (v.getAsString ()));

    v = Version.parse ("3.0.0-RC1", false);
    assertEquals ("3.0.0.RC1", v.getAsString ());
    assertEquals (v, Version.parse (v.getAsString ()));
  }

  @Test
  public void testGetAsStringBoolean ()
  {
    Version v = new Version (1, 2, 3);
    assertEquals ("1.2.3", v.getAsString (true));
    assertEquals ("1.2.3", v.getAsString (true, true));
    assertEquals (v, Version.parse (v.getAsString (true)));

    v = Version.parse ("1.2.3.");
    assertEquals ("1.2.3", v.getAsString (true));
    assertEquals (v, Version.parse (v.getAsString (true)));

    v = Version.parse ("1.2.3.alpha");
    assertEquals ("1.2.3.alpha", v.getAsString (true));
    assertEquals (v, Version.parse (v.getAsString (true)));

    v = Version.parse ("1.2.0.alpha");
    assertEquals ("1.2.0.alpha", v.getAsString (true));
    assertEquals (v, Version.parse (v.getAsString (true)));

    v = Version.parse ("1.2.3");
    assertEquals ("1.2.3", v.getAsString (true));
    assertEquals ("1.2.3", v.getAsString (false));
    assertEquals ("1.2.3", v.getAsString (false, true));
    assertEquals (v, Version.parse (v.getAsString (true)));

    v = Version.parse ("1.2.0");
    assertEquals ("1.2.0", v.getAsString (true));
    assertEquals ("1.2", v.getAsString (false));
    assertEquals ("1.2", v.getAsString (false, true));
    assertEquals (v, Version.parse (v.getAsString (true)));

    v = Version.parse ("1.0.2");
    assertEquals ("1.0.2", v.getAsString (true));
    assertEquals ("1.0.2", v.getAsString (false));
    assertEquals ("1.0.2", v.getAsString (false, true));
    assertEquals (v, Version.parse (v.getAsString (true)));

    v = Version.parse ("4.5");
    assertEquals ("4.5.0", v.getAsString (true));
    assertEquals ("4.5", v.getAsString (false));
    assertEquals ("4.5", v.getAsString (false, true));
    assertEquals (v, Version.parse (v.getAsString (true)));

    v = Version.parse ("4.0");
    assertEquals ("4.0.0", v.getAsString (true));
    assertEquals ("4", v.getAsString (false));
    assertEquals ("4.0", v.getAsString (false, true));
    assertEquals (v, Version.parse (v.getAsString (true)));

    v = Version.parse ("6");
    assertEquals ("6.0.0", v.getAsString (true));
    assertEquals ("6", v.getAsString (false));
    assertEquals ("6.0", v.getAsString (false, true));
    assertEquals (v, Version.parse (v.getAsString (true)));

    v = Version.parse (null);
    assertEquals ("0.0.0", v.getAsString (true));
    assertEquals ("0", v.getAsString (false));
    assertEquals ("0.0", v.getAsString (false, true));
    assertEquals (v, Version.parse (v.getAsString (true)));

    v = Version.parse (".2");
    assertEquals ("0.2.0", v.getAsString (true));
    assertEquals (v, Version.parse (v.getAsString (true)));

    v = Version.parse ("..2");
    assertEquals ("0.0.2", v.getAsString (true));
    assertEquals (v, Version.parse (v.getAsString (true)));

    v = Version.parse ("...2");
    assertEquals ("0.0.0.2", v.getAsString (true));
    assertEquals (v, Version.parse (v.getAsString (true)));

    v = Version.parse ("3.0.0-RC1", true);
    assertEquals ("3.0.0", v.getAsString (true));
    assertEquals (v, Version.parse (v.getAsString (true)));

    v = Version.parse ("3.0.0-RC1", false);
    assertEquals ("3.0.0.RC1", v.getAsString (true));
    assertEquals (v, Version.parse (v.getAsString (true)));

    v = Version.parse ("3-RC1", true);
    assertEquals ("0.0.0", v.getAsString (true));
    assertEquals (v, Version.parse (v.getAsString (true)));

    v = Version.parse ("3-RC1", false);
    assertEquals ("3.0.0.RC1", v.getAsString (true));
    assertEquals (v, Version.parse (v.getAsString (true)));
  }

  @Test
  public void testHashCode ()
  {
    CommonsTestHelper.testDefaultImplementationWithEqualContentObject (new Version (1, 2, 3, "4"),
                                                                       new Version (1, 2, 3, "4"));
    CommonsTestHelper.testDefaultImplementationWithEqualContentObject (new Version (1, 2, 3, "4"),
                                                                       Version.parse ("1.2.3.4"));
    CommonsTestHelper.testDefaultImplementationWithEqualContentObject (new Version (1), Version.parse ("1"));
    CommonsTestHelper.testDefaultImplementationWithEqualContentObject (Version.parse ("1"), Version.parse ("   1"));

    CommonsTestHelper.testDefaultImplementationWithDifferentContentObject (new Version (1, 2, 3, "4"),
                                                                           new Version (1, 2, 3));
    CommonsTestHelper.testDefaultImplementationWithDifferentContentObject (new Version (1, 2, 3, "4"),
                                                                           new Version (1, 2, 3, "5"));
    CommonsTestHelper.testDefaultImplementationWithDifferentContentObject (new Version (1, 2, 3, "4"),
                                                                           Version.parse ("1.3.3.4"));
    CommonsTestHelper.testDefaultImplementationWithDifferentContentObject (new Version (2), Version.parse ("1"));
    CommonsTestHelper.testDefaultImplementationWithDifferentContentObject (Version.parse ("1"),
                                                                           Version.parse ("   11"));
  }

  @Test
  public void testCompare ()
  {
    assertTrue (new Version (1, 2).isGT (new Version (1, 1)));
    assertFalse (new Version (1, 2).isGT (new Version (1, 2)));
    assertFalse (new Version (1, 2).isGT (new Version (1, 3)));
    assertTrue (new Version (1, 2).isGE (new Version (1, 1)));
    assertTrue (new Version (1, 2).isGE (new Version (1, 2)));
    assertFalse (new Version (1, 2).isGE (new Version (1, 3)));
    assertFalse (new Version (1, 2).isLT (new Version (1, 1)));
    assertFalse (new Version (1, 2).isLT (new Version (1, 2)));
    assertTrue (new Version (1, 2).isLT (new Version (1, 3)));
    assertFalse (new Version (1, 2).isLE (new Version (1, 1)));
    assertTrue (new Version (1, 2).isLE (new Version (1, 2)));
    assertTrue (new Version (1, 2).isLE (new Version (1, 3)));
  }

  @Test
  public void testSerialization ()
  {
    CommonsTestHelper.testDefaultSerialization (new Version (1, 2, 3));
    CommonsTestHelper.testDefaultSerialization (Version.parse ("1.2a"));
  }
}
