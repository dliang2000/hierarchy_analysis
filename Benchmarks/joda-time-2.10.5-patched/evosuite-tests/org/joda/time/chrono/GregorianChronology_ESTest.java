/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 06:38:44 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GregorianChronology_ESTest extends GregorianChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      long long0 = gregorianChronology0.calculateFirstDayOfYearMillis(500);
      assertEquals((-46388678400000L), long0);
      assertEquals(4, gregorianChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      // Undeclared exception!
      try { 
        gregorianChronology0.getDayOfMonth((-175L), (-1216), 2356);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2355
         //
         verifyException("org.joda.time.chrono.BasicGJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      gregorianChronology0.assemble(assembledChronology_Fields0);
      assertEquals(4, gregorianChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      boolean boolean0 = gregorianChronology0.isLeapYear(86399999);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      int int0 = gregorianChronology0.getMaxYear();
      assertEquals(292278993, int0);
      assertEquals(4, gregorianChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      long long0 = gregorianChronology0.getAverageMillisPerYearDividedByTwo();
      assertEquals(4, gregorianChronology0.getMinimumDaysInFirstWeek());
      assertEquals(15778476000L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      long long0 = gregorianChronology0.getAverageMillisPerMonth();
      assertEquals(2629746000L, long0);
      assertEquals(4, gregorianChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      long long0 = gregorianChronology0.getApproxMillisAtEpochDividedByTwo();
      assertEquals(31083597720000L, long0);
      assertEquals(4, gregorianChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      // Undeclared exception!
      try { 
        GregorianChronology.getInstance(dateTimeZone0, (-292275054));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -292275054
         //
         verifyException("org.joda.time.chrono.GregorianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        gregorianChronology0.assemble((AssembledChronology.Fields) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 1);
      assertEquals(1, gregorianChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Chronology chronology0 = gregorianChronology0.withUTC();
      assertSame(chronology0, gregorianChronology0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      long long0 = gregorianChronology0.calculateFirstDayOfYearMillis(0);
      assertEquals(4, gregorianChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-62167219200000L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      boolean boolean0 = gregorianChronology0.isLeapYear(1516);
      assertEquals(4, gregorianChronology0.getMinimumDaysInFirstWeek());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 1);
      long long0 = gregorianChronology0.calculateFirstDayOfYearMillis(1970);
      assertEquals(1, gregorianChronology0.getMinimumDaysInFirstWeek());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      GregorianChronology gregorianChronology1 = (GregorianChronology)gregorianChronology0.withZone(dateTimeZone0);
      assertSame(gregorianChronology1, gregorianChronology0);
      assertEquals(4, gregorianChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) null, 4);
      assertEquals(4, gregorianChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      GregorianChronology gregorianChronology1 = (GregorianChronology)gregorianChronology0.withZone((DateTimeZone) null);
      assertEquals(4, gregorianChronology1.getMinimumDaysInFirstWeek());
      assertNotSame(gregorianChronology1, gregorianChronology0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-100));
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      // Undeclared exception!
      try { 
        gregorianChronology0.getYearMonthDayMillis((-100), (-100), (-100));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -101
         //
         verifyException("org.joda.time.chrono.BasicGJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.calculateFirstDayOfYearMillis(292271022);
      assertEquals(4, gregorianChronology0.getMinimumDaysInFirstWeek());
      assertEquals(9223120445040000000L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2478));
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 1);
      int int0 = gregorianChronology0.getMinYear();
      assertEquals((-292275054), int0);
      assertEquals(1, gregorianChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 1);
      long long0 = gregorianChronology0.getAverageMillisPerYear();
      assertEquals(31556952000L, long0);
      assertEquals(1, gregorianChronology0.getMinimumDaysInFirstWeek());
  }
}
