/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 05:48:57 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.chrono.GJLocaleSymbols;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GJLocaleSymbols_ESTest extends GJLocaleSymbols_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.monthOfYearValueToText(1);
      assertEquals("1\u6708", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.monthOfYearValueToShortText(2);
      assertEquals("Feb", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("am");
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.halfdayTextToValue("am");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale((Locale) null);
      int int0 = gJLocaleSymbols0.eraTextToValue("BCE");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.dayOfWeekValueToText(3);
      assertEquals("\u661F\u671F\u4E09", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.dayOfWeekValueToShortText(0);
      assertNull(string0);
      assertEquals(10, gJLocaleSymbols0.getDayOfWeekMaxTextLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.monthOfYearValueToText(48);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 48
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.monthOfYearValueToShortText((-3563));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3563
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.monthOfYearTextToValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.halfdayValueToText(3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      Integer integer0 = new Integer(3);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.eraValueToText((int) integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.eraTextToValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale((Locale) null);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.dayOfWeekValueToText((-1589));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1589
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.dayOfWeekTextToValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.halfdayTextToValue("\u706B");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\u706B\" for halfdayOfDay is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.halfdayTextToValue("pm");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.dayOfWeekTextToValue("\u661F\u671F\u4E09");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("am");
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.dayOfWeekTextToValue("Chinese (Taiwan)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"Chinese (Taiwan)\" for dayOfWeek is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      gJLocaleSymbols0.monthOfYearTextToValue("Feb");
      assertEquals(7, gJLocaleSymbols0.getEraMaxTextLength());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.monthOfYearTextToValue("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\" for monthOfYear is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.eraTextToValue("CE");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.eraTextToValue("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\" for era is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale((Locale) null);
      // Undeclared exception!
      try { 
        gJLocaleSymbols0.dayOfWeekValueToShortText((-1952768450));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1952768450
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.getHalfdayMaxTextLength();
      assertEquals(3, gJLocaleSymbols0.getDayOfWeekMaxTextLength());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.getMonthMaxShortTextLength();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.dayOfWeekValueToText(0);
      assertNull(string0);
      assertEquals(2, gJLocaleSymbols0.getDayOfWeekMaxShortTextLength());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.halfdayValueToText(0);
      assertEquals(10, gJLocaleSymbols0.getDayOfWeekMaxTextLength());
      assertEquals("AM", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.getDayOfWeekMaxShortTextLength();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      gJLocaleSymbols0.eraValueToText(0);
      assertEquals(4, gJLocaleSymbols0.getDayOfWeekMaxShortTextLength());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.getEraMaxTextLength();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.dayOfWeekValueToShortText(2);
      assertEquals("\u706B", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.getDayOfWeekMaxTextLength();
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      int int0 = gJLocaleSymbols0.getMonthMaxTextLength();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      String string0 = gJLocaleSymbols0.monthOfYearValueToText(0);
      assertEquals(2, gJLocaleSymbols0.getDayOfWeekMaxShortTextLength());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      GJLocaleSymbols gJLocaleSymbols0 = GJLocaleSymbols.forLocale(locale0);
      gJLocaleSymbols0.monthOfYearValueToShortText(0);
      assertEquals(10, gJLocaleSymbols0.getDayOfWeekMaxTextLength());
  }
}
