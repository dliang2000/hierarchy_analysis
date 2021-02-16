/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 06:25:03 GMT 2020
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractPeriod_ESTest extends AbstractPeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = new Period(0, 0, (-1435), 0, (-680), (-1435), (-1435), (-1435), (PeriodType) null);
      period0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = new Period();
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 0);
      mutablePeriod0.setDays(1);
      boolean boolean0 = mutablePeriod0.equals(period0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.weeks(17);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(17).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = period0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = Period.hours((-10));
      String string0 = period0.toString();
      assertEquals("PT-10H", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      Period period0 = new Period(1L, periodType0);
      Period period1 = period0.toPeriod();
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = new Period(957L);
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      boolean boolean0 = period0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = new Period(572L, 572L);
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      int int0 = period0.indexOf(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = new Period(0L);
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      int int0 = period0.indexOf(durationFieldType0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.minutes(0);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn((-2039)).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      // Undeclared exception!
      try { 
        period0.toString(periodFormatter0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(416).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      MutablePeriod mutablePeriod0 = periodFormatter0.parseMutablePeriod("");
      // Undeclared exception!
      try { 
        mutablePeriod0.getFieldType(416);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Duration duration0 = Duration.standardDays(2946L);
      Period period0 = duration0.toPeriod((PeriodType) null);
      Seconds seconds0 = duration0.toStandardSeconds();
      Weeks weeks0 = seconds0.toStandardWeeks();
      Hours hours0 = weeks0.toStandardHours();
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      int int0 = period0.get(durationFieldType0);
      assertEquals(70704, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      PeriodType periodType0 = PeriodType.years();
      Period period0 = new Period(localTime0, localTime0, periodType0);
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      int int0 = period0.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.hours((-10));
      int[] intArray0 = period0.getValues();
      assertArrayEquals(new int[] {0, 0, 0, 0, (-10), 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = new Period((-1705), 5, (-1705), 8, 2013, 99, 3554, (-72));
      int int0 = period0.size();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(3697L, 3697L);
      DurationFieldType durationFieldType0 = mutablePeriod0.getFieldType(0);
      assertEquals("years", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-10L));
      int int0 = mutablePeriod0.indexOf((DurationFieldType) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = new Period((-3323L), 1209600000L);
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodParser0);
      // Undeclared exception!
      try { 
        period0.toString(periodFormatter0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.ZERO;
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L);
      boolean boolean0 = mutablePeriod0.equals(period0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Period period0 = new Period((-1011L), (Chronology) julianChronology0);
      Weeks weeks0 = period0.toStandardWeeks();
      boolean boolean0 = period0.equals(weeks0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      boolean boolean0 = mutablePeriod0.equals(periodType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      Period period0 = new Period((Object) null, julianChronology0);
      boolean boolean0 = period0.equals(period0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.ZERO;
      MutablePeriod mutablePeriod0 = new MutablePeriod((-10L));
      boolean boolean0 = mutablePeriod0.equals(period0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = new Period(0, 0, (-1435), 0, (-680), (-1435), (-1435), (-1435), (PeriodType) null);
      DurationFieldType[] durationFieldTypeArray0 = period0.getFieldTypes();
      assertNotNull(durationFieldTypeArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      PeriodType periodType0 = PeriodType.yearDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 0, periodType0, (Chronology) julianChronology0);
      String string0 = mutablePeriod0.toString((PeriodFormatter) null);
      assertEquals("P0D", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(3697L, 3697L);
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      PeriodType periodType0 = PeriodType.yearDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 0, periodType0, (Chronology) julianChronology0);
      MutablePeriod mutablePeriod1 = mutablePeriod0.toMutablePeriod();
      assertNotSame(mutablePeriod0, mutablePeriod1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      Period period0 = new Period((Object) null, julianChronology0);
      boolean boolean0 = period0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }
}
