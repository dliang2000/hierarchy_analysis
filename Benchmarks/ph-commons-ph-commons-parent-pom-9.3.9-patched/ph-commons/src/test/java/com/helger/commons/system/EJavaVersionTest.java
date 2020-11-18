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
package com.helger.commons.system;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Test class for class {@link EJavaVersion}.,
 *
 * @author Philip Helger
 */
public final class EJavaVersionTest
{
  @Test
  public void testBasic ()
  {
    for (final EJavaVersion e : EJavaVersion.values ())
      assertSame (e, EJavaVersion.valueOf (e.name ()));

    assertFalse (EJavaVersion.JDK_1_1.isCurrentVersion ());
    assertFalse (EJavaVersion.JDK_1_2.isCurrentVersion ());
    assertFalse (EJavaVersion.JDK_1_3.isCurrentVersion ());
    assertFalse (EJavaVersion.JDK_1_4.isCurrentVersion ());
    assertFalse (EJavaVersion.JDK_1_5.isCurrentVersion ());
    assertFalse (EJavaVersion.JDK_1_6.isCurrentVersion ());
    assertFalse (EJavaVersion.JDK_1_7.isCurrentVersion ());
    assertTrue (EJavaVersion.JDK_1_8.isCurrentVersion () ||
                EJavaVersion.JDK_9.isCurrentVersion () ||
                EJavaVersion.JDK_10.isCurrentVersion () ||
                EJavaVersion.JDK_11.isCurrentVersion () ||
                EJavaVersion.JDK_12.isCurrentVersion () ||
                EJavaVersion.JDK_13.isCurrentVersion ());
    final EJavaVersion eJV = EJavaVersion.getCurrentVersion ();
    assertTrue (eJV == EJavaVersion.JDK_1_8 ||
                eJV == EJavaVersion.JDK_9 ||
                eJV == EJavaVersion.JDK_10 ||
                eJV == EJavaVersion.JDK_11 ||
                eJV == EJavaVersion.JDK_12 ||
                eJV == EJavaVersion.JDK_13);

    assertEquals (EJavaVersion.UNKNOWN, EJavaVersion.getFromVersionNumber (44.0));
    assertEquals (EJavaVersion.JDK_1_5, EJavaVersion.getFromMajorAndMinor (49, 0));
    assertEquals (EJavaVersion.JDK_1_5, EJavaVersion.getFromVersionNumber (49.0));
    assertEquals (EJavaVersion.JDK_1_6, EJavaVersion.getFromMajorAndMinor (50, 0));
    assertEquals (EJavaVersion.JDK_1_6, EJavaVersion.getFromVersionNumber (50.0));
    assertEquals (EJavaVersion.JDK_1_7, EJavaVersion.getFromVersionNumber (51.0));
    assertEquals (EJavaVersion.JDK_1_8, EJavaVersion.getFromVersionNumber (52.0));
    assertEquals (EJavaVersion.JDK_9, EJavaVersion.getFromVersionNumber (53.0));
    assertEquals (EJavaVersion.JDK_10, EJavaVersion.getFromVersionNumber (54.0));
    assertEquals (EJavaVersion.JDK_11, EJavaVersion.getFromVersionNumber (55.0));
    assertEquals (EJavaVersion.JDK_12, EJavaVersion.getFromVersionNumber (56.0));
    assertEquals (EJavaVersion.JDK_13, EJavaVersion.getFromVersionNumber (57.0));
    assertEquals (EJavaVersion.UNKNOWN, EJavaVersion.getFromVersionNumber (58.0));

    assertTrue (EJavaVersion.JDK_1_1.isSupportedVersion ());
    assertTrue (EJavaVersion.JDK_1_2.isSupportedVersion ());
    assertTrue (EJavaVersion.JDK_1_3.isSupportedVersion ());
    assertTrue (EJavaVersion.JDK_1_4.isSupportedVersion ());
    assertTrue (EJavaVersion.JDK_1_5.isSupportedVersion ());
    assertTrue (EJavaVersion.JDK_1_6.isSupportedVersion ());
    assertTrue (EJavaVersion.JDK_1_7.isSupportedVersion ());

    if (EJavaVersion.JDK_1_8.isCurrentVersion ())
    {
      assertTrue (EJavaVersion.JDK_1_8.isSupportedVersion ());
      assertFalse (EJavaVersion.JDK_9.isSupportedVersion ());
      assertFalse (EJavaVersion.JDK_10.isSupportedVersion ());
      assertFalse (EJavaVersion.JDK_11.isSupportedVersion ());
      assertFalse (EJavaVersion.JDK_12.isSupportedVersion ());
    }
    else
      if (EJavaVersion.JDK_9.isCurrentVersion ())
      {
        assertTrue (EJavaVersion.JDK_1_8.isSupportedVersion ());
        assertTrue (EJavaVersion.JDK_9.isSupportedVersion ());
        assertFalse (EJavaVersion.JDK_10.isSupportedVersion ());
        assertFalse (EJavaVersion.JDK_11.isSupportedVersion ());
        assertFalse (EJavaVersion.JDK_12.isSupportedVersion ());
      }
      else
        if (EJavaVersion.JDK_10.isCurrentVersion ())
        {
          assertTrue (EJavaVersion.JDK_1_8.isSupportedVersion ());
          assertTrue (EJavaVersion.JDK_9.isSupportedVersion ());
          assertTrue (EJavaVersion.JDK_10.isSupportedVersion ());
          assertFalse (EJavaVersion.JDK_11.isSupportedVersion ());
          assertFalse (EJavaVersion.JDK_12.isSupportedVersion ());
        }
        else
          if (EJavaVersion.JDK_11.isCurrentVersion ())
          {
            assertTrue (EJavaVersion.JDK_1_8.isSupportedVersion ());
            assertTrue (EJavaVersion.JDK_9.isSupportedVersion ());
            assertTrue (EJavaVersion.JDK_10.isSupportedVersion ());
            assertTrue (EJavaVersion.JDK_11.isSupportedVersion ());
            assertFalse (EJavaVersion.JDK_12.isSupportedVersion ());
          }
          else
            if (EJavaVersion.JDK_12.isCurrentVersion ())
            {
              assertTrue (EJavaVersion.JDK_1_8.isSupportedVersion ());
              assertTrue (EJavaVersion.JDK_9.isSupportedVersion ());
              assertTrue (EJavaVersion.JDK_10.isSupportedVersion ());
              assertTrue (EJavaVersion.JDK_11.isSupportedVersion ());
              assertTrue (EJavaVersion.JDK_12.isSupportedVersion ());
            }
            else
              fail ("Implement me");
  }

  @Test
  public void testIsOlderOrEqualsThan ()
  {
    assertFalse (EJavaVersion.JDK_1_2.isOlderOrEqualsThan (EJavaVersion.JDK_1_1));
    assertTrue (EJavaVersion.JDK_1_2.isOlderOrEqualsThan (EJavaVersion.JDK_1_2));
    assertTrue (EJavaVersion.JDK_1_2.isOlderOrEqualsThan (EJavaVersion.JDK_1_7));

    assertFalse (EJavaVersion.JDK_1_7.isOlderOrEqualsThan (EJavaVersion.JDK_1_1));
    assertFalse (EJavaVersion.JDK_1_7.isOlderOrEqualsThan (EJavaVersion.JDK_1_6));
    assertTrue (EJavaVersion.JDK_1_7.isOlderOrEqualsThan (EJavaVersion.JDK_1_7));
    assertTrue (EJavaVersion.JDK_1_7.isOlderOrEqualsThan (EJavaVersion.JDK_1_8));
    assertTrue (EJavaVersion.JDK_1_7.isOlderOrEqualsThan (EJavaVersion.JDK_9));
    assertTrue (EJavaVersion.JDK_1_7.isOlderOrEqualsThan (EJavaVersion.JDK_10));
    assertTrue (EJavaVersion.JDK_1_7.isOlderOrEqualsThan (EJavaVersion.JDK_11));
    assertTrue (EJavaVersion.JDK_1_7.isOlderOrEqualsThan (EJavaVersion.JDK_12));
    assertTrue (EJavaVersion.JDK_1_7.isOlderOrEqualsThan (EJavaVersion.JDK_13));
  }

  @Test
  public void testIsNewerOrEqualsThan ()
  {
    assertTrue (EJavaVersion.JDK_1_1.isNewerOrEqualsThan (EJavaVersion.JDK_1_1));
    assertFalse (EJavaVersion.JDK_1_1.isNewerOrEqualsThan (EJavaVersion.JDK_1_2));
    assertFalse (EJavaVersion.JDK_1_1.isNewerOrEqualsThan (EJavaVersion.JDK_1_7));

    assertTrue (EJavaVersion.JDK_1_7.isNewerOrEqualsThan (EJavaVersion.JDK_1_1));
    assertTrue (EJavaVersion.JDK_1_7.isNewerOrEqualsThan (EJavaVersion.JDK_1_6));
    assertTrue (EJavaVersion.JDK_1_7.isNewerOrEqualsThan (EJavaVersion.JDK_1_7));
    assertFalse (EJavaVersion.JDK_1_7.isNewerOrEqualsThan (EJavaVersion.JDK_1_8));
    assertFalse (EJavaVersion.JDK_1_7.isNewerOrEqualsThan (EJavaVersion.JDK_9));
    assertFalse (EJavaVersion.JDK_1_7.isNewerOrEqualsThan (EJavaVersion.JDK_10));
    assertFalse (EJavaVersion.JDK_1_7.isNewerOrEqualsThan (EJavaVersion.JDK_11));
    assertFalse (EJavaVersion.JDK_1_7.isNewerOrEqualsThan (EJavaVersion.JDK_12));
    assertFalse (EJavaVersion.JDK_1_7.isNewerOrEqualsThan (EJavaVersion.JDK_13));
  }
}
