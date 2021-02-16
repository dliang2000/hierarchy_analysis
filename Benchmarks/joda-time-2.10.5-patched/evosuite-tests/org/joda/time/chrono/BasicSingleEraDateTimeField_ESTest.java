/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 06:13:17 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationField;
import org.joda.time.chrono.BasicSingleEraDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicSingleEraDateTimeField_ESTest extends BasicSingleEraDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("0");
      Locale locale0 = Locale.JAPAN;
      long long0 = basicSingleEraDateTimeField0.set((-1783L), "1", locale0);
      assertEquals((-1783L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField(".{fqEhA'}3aD@+2HbD");
      long long0 = basicSingleEraDateTimeField0.set(2046L, 1);
      assertEquals(2046L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("jNR]oHSVQ{G)'.0Y+'a");
      long long0 = basicSingleEraDateTimeField0.set((-100L), 1);
      assertEquals((-100L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      Locale locale0 = Locale.GERMANY;
      int int0 = basicSingleEraDateTimeField0.getMaximumTextLength(locale0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("jRkr*xgT'C.{f/[z");
      Locale locale0 = Locale.ITALIAN;
      int int0 = basicSingleEraDateTimeField0.getMaximumTextLength(locale0);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField((String) null);
      Locale locale0 = Locale.KOREAN;
      String string0 = basicSingleEraDateTimeField0.getAsText(1, locale0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      Locale locale0 = Locale.GERMANY;
      String string0 = basicSingleEraDateTimeField0.getAsText(1, locale0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField((String) null);
      Locale locale0 = Locale.ENGLISH;
      // Undeclared exception!
      try { 
        basicSingleEraDateTimeField0.set((-3L), "MaTnfLv!h", locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("jv)T-4>Cbx+H~J$+)0");
      // Undeclared exception!
      try { 
        basicSingleEraDateTimeField0.set((-1L), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for era must be in the range [1,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("gqr#qR'(&B:bXj+l");
      Locale locale0 = Locale.FRANCE;
      String string0 = basicSingleEraDateTimeField0.getAsText(0, locale0);
      assertEquals("gqr#qR'(&B:bXj+l", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("*]s");
      int int0 = basicSingleEraDateTimeField0.getMaximumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      Locale locale0 = Locale.GERMANY;
      // Undeclared exception!
      try { 
        basicSingleEraDateTimeField0.set(9223372036854775807L, "org/joda/time/tz/data", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"org/joda/time/tz/data\" for era is not supported
         //
         verifyException("org.joda.time.chrono.BasicSingleEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      Locale locale0 = Locale.UK;
      long long0 = basicSingleEraDateTimeField0.set(2629746000L, "1", locale0);
      assertEquals(2629746000L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      Locale locale0 = Locale.ITALIAN;
      long long0 = basicSingleEraDateTimeField0.set(0L, "", locale0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      Locale locale0 = Locale.ITALY;
      String string0 = basicSingleEraDateTimeField0.getAsShortText(1102L, locale0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      long long0 = basicSingleEraDateTimeField0.roundFloor(1521L);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      long long0 = basicSingleEraDateTimeField0.set(0L, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      long long0 = basicSingleEraDateTimeField0.roundHalfCeiling(1312L);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      int int0 = basicSingleEraDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      long long0 = basicSingleEraDateTimeField0.roundHalfEven(1);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField((String) null);
      DurationField durationField0 = basicSingleEraDateTimeField0.getRangeDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField((String) null);
      Locale locale0 = new Locale("org/joda/time/tz/data", "org/joda/time/tz/data", "year");
      // Undeclared exception!
      try { 
        basicSingleEraDateTimeField0.getMaximumTextLength(locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicSingleEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      long long0 = basicSingleEraDateTimeField0.roundCeiling(0L);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      long long0 = basicSingleEraDateTimeField0.roundHalfFloor(1);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      DurationField durationField0 = basicSingleEraDateTimeField0.getDurationField();
      assertFalse(durationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      boolean boolean0 = basicSingleEraDateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("jNR]oHSVQ{G)'.0Y+'a");
      int int0 = basicSingleEraDateTimeField0.get((-1301L));
      assertEquals(1, int0);
  }
}
