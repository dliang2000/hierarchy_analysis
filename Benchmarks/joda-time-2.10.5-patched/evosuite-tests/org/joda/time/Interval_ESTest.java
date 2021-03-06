/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 05:15:32 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.UTCDateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.ZonedChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Interval_ESTest extends Interval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Interval interval0 = new Interval((-859L), (-859L));
      MutableInterval mutableInterval0 = new MutableInterval((-2147483648L), (-2147483648L));
      boolean boolean0 = interval0.abuts(mutableInterval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      Interval interval0 = new Interval(0L, 0L, dateTimeZone0);
      boolean boolean0 = interval0.abuts((ReadableInterval) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      Interval interval0 = new Interval((-1001L), (-1001L), buddhistChronology0);
      Calendar calendar0 = MockCalendar.getInstance();
      LocalDate localDate0 = LocalDate.fromCalendarFields(calendar0);
      Interval interval1 = localDate0.toInterval((DateTimeZone) null);
      Interval interval2 = interval0.gap(interval1);
      assertEquals(1392354000000L, interval2.getEndMillis());
      assertEquals((-1001L), interval2.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      Interval interval0 = new Interval(0L, 30962844000000L, dateTimeZone0);
      Interval interval1 = interval0.gap(interval0);
      assertNull(interval1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(73L);
      Instant instant0 = Instant.ofEpochMilli(73L);
      Interval interval0 = duration0.toIntervalFrom(instant0);
      Interval interval1 = interval0.withStartMillis(73L);
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Interval interval0 = new Interval(0L, 0L);
      Interval interval1 = interval0.withStartMillis(0L);
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Interval interval0 = new Interval((Object) null);
      DateTimeUtils.MillisProvider dateTimeUtils_MillisProvider0 = mock(DateTimeUtils.MillisProvider.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeUtils_MillisProvider0).getMillis();
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_MillisProvider0);
      Instant instant0 = Instant.now();
      Interval interval1 = interval0.withStart(instant0);
      assertEquals(0L, interval1.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      Interval interval0 = new Interval((Object) null, lenientChronology0);
      Instant instant0 = new Instant((-1L));
      Instant instant1 = instant0.minus((-3262L));
      Interval interval1 = interval0.withStart(instant1);
      assertEquals(3261L, interval1.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      System.setCurrentTimeMillis((-6169L));
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) islamicChronology0);
      Interval interval0 = new Interval(mutableDateTime0, mutableDateTime0);
      Interval interval1 = interval0.withStart(mutableDateTime0);
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Interval interval0 = new Interval(0L, 0L, julianChronology0);
      Period period0 = interval0.toPeriod((PeriodType) null);
      Days days0 = period0.toStandardDays();
      Interval interval1 = interval0.withPeriodBeforeEnd(days0);
      assertNotSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Interval interval0 = new Interval(0L, 0L, dateTimeZone0);
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateTime0, dateTime0);
      Interval interval1 = interval0.withPeriodAfterStart(mutablePeriod0);
      assertNotSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-192));
      Interval interval0 = new Interval(341L, 341L, dateTimeZone0);
      Interval interval1 = interval0.withEndMillis(341L);
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Interval interval0 = new Interval((-2147483648L), (-1273L));
      Interval interval1 = interval0.withEndMillis((-2147483648L));
      assertEquals((-2147483648L), interval1.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableInstant) null);
      Interval interval1 = interval0.withEnd((ReadableInstant) null);
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Interval interval0 = new Interval(0L, 0L);
      Instant instant0 = new Instant(0L);
      Interval interval1 = interval0.withEnd(instant0);
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      System.setCurrentTimeMillis((-6169L));
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) islamicChronology0);
      Interval interval0 = new Interval(mutableDateTime0, mutableDateTime0);
      Interval interval1 = interval0.withEnd(mutableDateTime0);
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Interval interval0 = new Interval(0L, 0L, dateTimeZone0);
      Duration duration0 = Duration.standardHours(0L);
      Interval interval1 = interval0.withDurationBeforeEnd(duration0);
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableInstant) null);
      Duration duration0 = new Duration((ReadableInstant) null, (ReadableInstant) null);
      Interval interval1 = interval0.withDurationAfterStart(duration0);
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      Interval interval0 = new Interval(0L, 0L, uTCDateTimeZone0);
      Duration duration0 = Duration.standardDays(3605L);
      Interval interval1 = interval0.withDurationAfterStart(duration0);
      assertEquals(311472000000L, interval1.getEndMillis());
      assertEquals(0L, interval1.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      LocalDate localDate0 = monthDay0.toLocalDate(650);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-17));
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      Period period0 = Period.seconds(272);
      Duration duration0 = period0.toStandardDuration();
      Interval interval1 = interval0.withDurationAfterStart(duration0);
      assertEquals((-41651366399983L), interval1.getStartMillis());
      assertEquals((-41651366127983L), interval1.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Interval interval0 = new Interval(0L, 0L, julianChronology0);
      Interval interval1 = interval0.withChronology(julianChronology0);
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      System.setCurrentTimeMillis((-6169L));
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) islamicChronology0);
      Interval interval0 = new Interval(mutableDateTime0, mutableDateTime0);
      Interval interval1 = interval0.withChronology(islamicChronology0);
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Interval interval0 = new Interval(0L, 0L);
      Interval interval1 = interval0.toInterval();
      assertSame(interval0, interval1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeUtils.setCurrentMillisFixed((-1909L));
      Interval interval0 = Interval.parse((String) null);
      assertEquals((-1909L), interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Interval interval0 = new Interval(22L, 2049L, (DateTimeZone) null);
      Interval interval1 = interval0.overlap(interval0);
      assertNotNull(interval1);
      assertTrue(interval1.equals((Object)interval0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, (-421), 0, (-421), 0, 3114);
      LocalDate localDate0 = LocalDate.fromDateFields(mockDate0);
      Interval interval0 = localDate0.toInterval();
      Interval interval1 = interval0.overlap(interval0);
      assertTrue(interval1.equals((Object)interval0));
      assertNotNull(interval1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((Chronology) null);
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      Interval interval0 = localDate0.toInterval((DateTimeZone) uTCDateTimeZone0);
      MutableInterval mutableInterval0 = new MutableInterval();
      Interval interval1 = interval0.gap(mutableInterval0);
      assertNotNull(interval1);
      assertEquals(1392336000000L, interval1.getEndMillis());
      assertEquals(0L, interval1.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Interval interval0 = new Interval((-1L), (-1L));
      // Undeclared exception!
      try { 
        interval0.withStartMillis(1156L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater than the start instant
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Duration duration0 = new Duration(0L);
      Interval interval0 = new Interval(duration0, (ReadableInstant) null);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Period period0 = new Period(0L, (Chronology) gregorianChronology0);
      Period period1 = period0.withHours((-853));
      Minutes minutes0 = period1.toStandardMinutes();
      // Undeclared exception!
      try { 
        interval0.withPeriodBeforeEnd(minutes0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater than the start instant
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      Interval interval0 = new Interval((Object) null, lenientChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2146759124), 4514, (-1837), (-2146759124), (-1477), 4514, 4514, 3600000);
      Period period0 = mutablePeriod0.toPeriod();
      // Undeclared exception!
      try { 
        interval0.withPeriodAfterStart(period0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2146757110 for year must be in the range [-292275054,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Interval interval0 = new Interval(3304L, 3304L);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(3304L, 55L, (PeriodType) null, gregorianChronology0);
      // Undeclared exception!
      try { 
        interval0.withPeriodAfterStart(mutablePeriod0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater than the start instant
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0, 3114);
      LocalDate localDate0 = LocalDate.fromDateFields(mockDate0);
      Interval interval0 = localDate0.toInterval();
      UTCDateTimeZone uTCDateTimeZone0 = (UTCDateTimeZone)UTCDateTimeZone.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime(mockDate0, uTCDateTimeZone0);
      // Undeclared exception!
      try { 
        interval0.withEnd(mutableDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater than the start instant
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      MutableInterval mutableInterval0 = new MutableInterval((-1L), (-1L), buddhistChronology0);
      Interval interval0 = mutableInterval0.toInterval();
      Duration duration0 = Duration.standardDays((-1L));
      // Undeclared exception!
      try { 
        interval0.withDurationBeforeEnd(duration0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater than the start instant
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Interval interval0 = new Interval((Object) null);
      Duration duration0 = Duration.standardMinutes((-1176L));
      // Undeclared exception!
      try { 
        interval0.withDurationAfterStart(duration0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater than the start instant
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        Interval.parseWithOffset((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Interval", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        Interval.parse("kv'vew");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: kv'vew
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 0, 0, 0, (-2022), 0, 0, 47, (PeriodType) null);
      LocalTime localTime0 = LocalTime.now();
      DateTime dateTime0 = localTime0.toDateTimeToday();
      Interval interval0 = null;
      try {
        interval0 = new Interval(mutablePeriod0, dateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater than the start instant
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1642));
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0);
      Instant instant0 = gJChronology0.getGregorianCutover();
      Instant instant1 = instant0.withDurationAdded((long) 4, (int) (byte)3);
      Interval interval0 = null;
      try {
        interval0 = new Interval(instant1, mutableDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater than the start instant
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes((-1L));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTime dateTime0 = DateTime.now((Chronology) buddhistChronology0);
      Interval interval0 = null;
      try {
        interval0 = new Interval(duration0, dateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater than the start instant
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = new Object();
      Interval interval0 = null;
      try {
        interval0 = new Interval(object0, (Chronology) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No interval converter found for type: java.lang.Object
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object object0 = new Object();
      Interval interval0 = null;
      try {
        interval0 = new Interval(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No interval converter found for type: java.lang.Object
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      Interval interval0 = null;
      try {
        interval0 = new Interval(3218L, (-377L), dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater than the start instant
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2784);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      Interval interval0 = null;
      try {
        interval0 = new Interval(2592000000L, 343L, islamicChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater than the start instant
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Interval interval0 = null;
      try {
        interval0 = new Interval(473L, 0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater than the start instant
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      Interval interval0 = new Interval(0L, 0L, dateTimeZone0);
      Interval interval1 = interval0.withDurationAfterStart((ReadableDuration) null);
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) islamicChronology0);
      Interval interval0 = new Interval(mutableDateTime0, mutableDateTime0);
      Interval interval1 = interval0.withChronology(islamicChronology0);
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      Interval interval0 = new Interval(0L, 0L, uTCDateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance();
      Instant instant0 = gJChronology0.getGregorianCutover();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) uTCDateTimeZone0);
      DateTime dateTime0 = instant0.toDateTime((Chronology) buddhistChronology0);
      Interval interval1 = interval0.withStart(dateTime0);
      Interval interval2 = interval1.overlap(interval1);
      assertTrue(interval2.equals((Object)interval1));
      assertNotNull(interval2);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      UTCDateTimeZone uTCDateTimeZone0 = (UTCDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, uTCDateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, (Chronology) zonedChronology0);
      Interval interval0 = new Interval((ReadableInstant) null, mutablePeriod0);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(4772L);
      Interval interval0 = new Interval((ReadableInstant) null, duration0);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Interval interval0 = new Interval((Object) null);
      Interval interval1 = interval0.toInterval();
      assertEquals(1392409281320L, interval1.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((Chronology) null);
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      Interval interval0 = localDate0.toInterval((DateTimeZone) uTCDateTimeZone0);
      Interval interval1 = interval0.withPeriodBeforeEnd((ReadablePeriod) null);
      assertEquals(1392422400000L, interval1.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2403), (-2403), (-2403));
      LocalDate localDate0 = LocalDate.fromDateFields(mockDate0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      Duration duration0 = Duration.standardHours(0L);
      Seconds seconds0 = duration0.toStandardSeconds();
      Hours hours0 = seconds0.toStandardHours();
      Interval interval1 = interval0.withPeriodBeforeEnd(hours0);
      assertEquals((-84567177748000L), interval1.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Duration duration0 = Duration.standardHours(0L);
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      Interval interval0 = duration0.toIntervalTo(dateTime0);
      Interval interval1 = interval0.withDurationBeforeEnd(duration0);
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((Chronology) null);
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      Interval interval0 = localDate0.toInterval((DateTimeZone) uTCDateTimeZone0);
      Interval interval1 = interval0.withPeriodAfterStart((ReadablePeriod) null);
      Interval interval2 = interval1.withPeriodAfterStart((ReadablePeriod) null);
      assertEquals(1392336000000L, interval1.getStartMillis());
      assertSame(interval2, interval1);
      assertEquals(1392336000000L, interval2.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Interval interval0 = new Interval(0L, 0L, julianChronology0);
      Interval interval1 = interval0.withEndMillis(0L);
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      Chronology chronology0 = lenientChronology0.withUTC();
      Interval interval0 = new Interval((Object) null, chronology0);
      Interval interval1 = interval0.withChronology(lenientChronology0);
      assertNotSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2403), (-2403), (-2403));
      LocalDate localDate0 = LocalDate.fromDateFields(mockDate0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MutableInterval mutableInterval0 = new MutableInterval((Object) null, copticChronology0);
      boolean boolean0 = interval0.abuts(mutableInterval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Interval interval0 = new Interval(0L, 0L, dateTimeZone0);
      Duration duration0 = new Duration(0L, 1);
      Interval interval1 = interval0.withDurationBeforeEnd(duration0);
      boolean boolean0 = interval1.abuts(interval0);
      assertTrue(boolean0);
      assertEquals((-1L), interval1.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Interval interval0 = new Interval(3316L, 3316L);
      Interval interval1 = interval0.gap((ReadableInterval) null);
      assertNotNull(interval1);
      
      boolean boolean0 = interval1.abuts((ReadableInterval) null);
      assertTrue(boolean0);
      assertEquals(3316L, interval1.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableInstant) null);
      boolean boolean0 = interval0.abuts((ReadableInterval) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Interval interval0 = new Interval(0L, 0L, dateTimeZone0);
      boolean boolean0 = interval0.abuts(interval0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Interval interval0 = new Interval(0L, 0L, dateTimeZone0);
      Duration duration0 = new Duration(0L, 1);
      Interval interval1 = interval0.withDurationBeforeEnd(duration0);
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateTime0, dateTime0);
      Interval interval2 = interval1.withPeriodAfterStart(mutablePeriod0);
      Interval interval3 = interval2.gap(interval0);
      assertNotNull(interval3);
      assertTrue(interval3.equals((Object)interval1));
      assertEquals((-1L), interval3.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Interval interval0 = new Interval(0L, 0L, dateTimeZone0);
      Interval interval1 = interval0.gap(interval0);
      assertNull(interval1);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2403), (-2403), (-2403));
      LocalDate localDate0 = LocalDate.fromDateFields(mockDate0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      Duration duration0 = Duration.standardHours(0L);
      Interval interval1 = interval0.withDurationBeforeEnd(duration0);
      Interval interval2 = interval1.overlap(interval1);
      assertNull(interval2);
      assertEquals((-84567177748000L), interval1.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Interval interval0 = Interval.parseWithOffset("2014-02-14T15:21:21.320-05:00/2014-02-14T15:21:21.320-05:00");
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      // Undeclared exception!
      try { 
        Interval.parseWithOffset("/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format invalid: /
         //
         verifyException("org.joda.time.Interval", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      // Undeclared exception!
      try { 
        Interval.parseWithOffset("*06qA3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: *06qA3
         //
         verifyException("org.joda.time.Interval", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      Interval interval0 = new Interval(0L, 30962844000000L, dateTimeZone0);
      boolean boolean0 = interval0.abuts((ReadableInterval) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = (UTCDateTimeZone)UTCDateTimeZone.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime(1393650000000L, (DateTimeZone) uTCDateTimeZone0);
      Duration duration0 = Duration.standardMinutes((-2604L));
      Interval interval0 = null;
      try {
        interval0 = new Interval(mutableDateTime0, duration0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater than the start instant
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(iSOChronology0, uTCDateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2L), (Chronology) zonedChronology0);
      Interval interval0 = null;
      try {
        interval0 = new Interval((ReadableInstant) null, mutablePeriod0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater than the start instant
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Interval interval0 = new Interval((-84567177748000L), (-84567177748000L));
      Interval interval1 = interval0.withStartMillis((-84567177748000L));
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      Interval interval0 = new Interval((-1001L), (-1001L), buddhistChronology0);
      Interval interval1 = interval0.toInterval();
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Duration duration0 = Duration.standardHours(0L);
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      Interval interval0 = duration0.toIntervalTo(dateTime0);
      MutableInterval mutableInterval0 = new MutableInterval((-1L), 637L);
      Interval interval1 = interval0.gap(mutableInterval0);
      assertEquals(637L, interval1.getStartMillis());
      assertEquals(1392409281320L, interval1.getEndMillis());
      assertNotNull(interval1);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Duration duration0 = Duration.standardHours(0L);
      Period period0 = duration0.toPeriodFrom((ReadableInstant) null, (PeriodType) null);
      Interval interval0 = new Interval(period0, (ReadableInstant) null);
      Interval interval1 = interval0.withStartMillis((-75L));
      assertEquals((-75L), interval1.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Interval interval0 = Interval.parse((String) null);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2403), (-2403), (-2403));
      LocalDate localDate0 = LocalDate.fromDateFields(mockDate0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      Interval interval1 = interval0.withEnd((ReadableInstant) null);
      assertEquals(1392409281320L, interval1.getEndMillis());
  }
}
