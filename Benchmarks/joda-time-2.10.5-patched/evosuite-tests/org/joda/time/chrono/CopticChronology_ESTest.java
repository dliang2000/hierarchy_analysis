/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 07:17:02 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.chrono.ThaiBuddhistDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CopticChronology_ESTest extends CopticChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      boolean boolean0 = copticChronology0.isLeapDay(21859200000L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      copticChronology0.assemble(assembledChronology_Fields0);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getMinYear();
      assertEquals((-292269337), int0);
      assertEquals(4, copticChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getMaxYear();
      assertEquals(292272708, int0);
      assertEquals(4, copticChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = copticChronology0.calculateFirstDayOfYearMillis(1687);
      assertEquals(4, copticChronology0.getMinimumDaysInFirstWeek());
      assertEquals(21859200000L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      long long0 = copticChronology0.calculateFirstDayOfYearMillis((-1686));
      assertEquals((-106421904000000L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        copticChronology0.isLeapDay((-106421904000000L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      // Undeclared exception!
      try { 
        copticChronology0.isLeapDay((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ThaiBuddhistDate thaiBuddhistDate0 = MockThaiBuddhistDate.now();
      CopticChronology copticChronology0 = null;
      try {
        copticChronology0 = new CopticChronology((Chronology) null, thaiBuddhistDate0, 4810);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 4810
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      CopticChronology copticChronology0 = new CopticChronology(buddhistChronology0, buddhistChronology0, 1);
      long long0 = copticChronology0.getApproxMillisAtEpochDividedByTwo();
      assertEquals(26607895200000L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(117);
      // Undeclared exception!
      try { 
        CopticChronology.getInstance(dateTimeZone0, 117);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 117
         //
         verifyException("org.joda.time.chrono.CopticChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      copticChronology0.withUTC();
      assertEquals(4, copticChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      boolean boolean0 = copticChronology0.isLeapDay(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      CopticChronology copticChronology1 = (CopticChronology)copticChronology0.withZone(dateTimeZone0);
      assertEquals(1, copticChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      CopticChronology copticChronology1 = (CopticChronology)copticChronology0.withZone((DateTimeZone) null);
      assertEquals(4, copticChronology1.getMinimumDaysInFirstWeek());
      assertNotSame(copticChronology1, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      boolean boolean0 = copticChronology0.isLeapDay(1209600028L);
      assertFalse(boolean0);
      assertEquals(4, copticChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1077));
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      assertEquals(4, copticChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null, 7);
      long long0 = copticChronology0.getYearDifference(7, 7);
      assertEquals(0L, long0);
  }
}
