/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 07:08:41 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.TimeOfDay;
import org.joda.time.UTCDateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.LenientChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeOfDay_ESTest extends TimeOfDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(copticChronology0);
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(0L, (Chronology) lenientChronology0);
      TimeOfDay timeOfDay1 = timeOfDay0.minusHours(0);
      assertSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      TimeOfDay timeOfDay0 = new TimeOfDay((Chronology) buddhistChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null);
      TimeOfDay timeOfDay1 = timeOfDay0.plus(mutablePeriod0);
      assertNotSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-2008L));
      Period period0 = new Period(0, 10L);
      TimeOfDay timeOfDay1 = timeOfDay0.plus(period0);
      assertEquals(2, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-483L), (Chronology) null);
      TimeOfDay timeOfDay1 = timeOfDay0.minusSeconds(67);
      assertEquals(52, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0, 0);
      TimeOfDay timeOfDay1 = timeOfDay0.withSecondOfMinute(0);
      assertEquals(0, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(3607L);
      Duration duration0 = Duration.standardHours(2);
      Period period0 = new Period((ReadableInstant) null, duration0);
      TimeOfDay timeOfDay1 = timeOfDay0.withPeriodAdded(period0, 3);
      assertEquals(1, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(1, 1);
      TimeOfDay timeOfDay1 = timeOfDay0.withMillisOfSecond(2);
      assertEquals(2, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = (UTCDateTimeZone)UTCDateTimeZone.INSTANCE;
      TimeOfDay timeOfDay0 = new TimeOfDay((DateTimeZone) uTCDateTimeZone0);
      TimeOfDay timeOfDay1 = timeOfDay0.withHourOfDay(2);
      assertEquals(2, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(copticChronology0);
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(0L, (Chronology) lenientChronology0);
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withHourOfDay(2);
      assertEquals(2, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(1089L);
      int int0 = timeOfDay0.getHourOfDay();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime((-2086L));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0);
      TimeOfDay timeOfDay0 = new TimeOfDay((Chronology) gJChronology0);
      int int0 = timeOfDay0.getHourOfDay();
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-1637L));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = timeOfDay0.getField(1, (Chronology) buddhistChronology0);
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 3, 87, 3, 87);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(date0);
      assertEquals(0, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Duration duration0 = Duration.standardHours(0L);
      Instant instant0 = Instant.ofEpochMilli(0L);
      Interval interval0 = duration0.toIntervalTo(instant0);
      DateTime dateTime0 = interval0.getStart();
      GregorianCalendar gregorianCalendar0 = dateTime0.toGregorianCalendar();
      TimeOfDay timeOfDay0 = TimeOfDay.fromCalendarFields(gregorianCalendar0);
      int int0 = timeOfDay0.getMillisOfSecond();
      assertEquals(0, int0);
      assertEquals(0, timeOfDay0.getSecondOfMinute());
      assertEquals(0, timeOfDay0.getHourOfDay());
      assertEquals(0, timeOfDay0.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(14, 14);
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0, (int[]) null);
      // Undeclared exception!
      try { 
        timeOfDay1.withMinuteOfHour((-311));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.BasePartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(0L);
      // Undeclared exception!
      try { 
        timeOfDay0.withMillisOfSecond((-1600));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1600 for millisOfSecond must be in the range [0,999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-2008L));
      // Undeclared exception!
      try { 
        timeOfDay0.withFieldAdded((DurationFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'null' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(0L);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      // Undeclared exception!
      try { 
        timeOfDay0.MIDNIGHT.withField(dateTimeFieldType0, 1961);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1961 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      TimeOfDay timeOfDay0 = new TimeOfDay((Chronology) buddhistChronology0);
      TimeOfDay timeOfDay1 = timeOfDay0.plusSeconds(3);
      assertEquals(24, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-4294967296L));
      TimeOfDay timeOfDay1 = timeOfDay0.plusMinutes(2447);
      assertEquals(44, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(0L, (Chronology) islamicChronology0);
      TimeOfDay timeOfDay1 = timeOfDay0.plusMillis(311);
      assertEquals(311, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((DateTimeZone) null);
      assertEquals(21, timeOfDay0.getSecondOfMinute());
      
      TimeOfDay timeOfDay1 = timeOfDay0.minusMillis((-1));
      assertEquals(321, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay((TimeOfDay) null, (Chronology) gJChronology0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.BasePartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(mockJapaneseDate0, (Chronology) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(2, 76, lenientChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 76 for minuteOfHour must not be larger than 59
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(418, 418, 8, 8, iSOChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 418 for hourOfDay must not be larger than 23
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(0, (-1116), 0, 1000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1116 for minuteOfHour must not be smaller than 0
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay((-1600), 31, (-1600));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1600 for hourOfDay must not be smaller than 0
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(1, (-738));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -738 for minuteOfHour must not be smaller than 0
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(2465L);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      TimeOfDay timeOfDay1 = timeOfDay0.withChronologyRetainFields(ethiopicChronology0);
      assertEquals(2, timeOfDay1.getSecondOfMinute());
      assertNotSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Instant instant0 = new Instant();
      DateTime dateTime0 = instant0.toDateTime();
      Date date0 = dateTime0.toDate();
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(date0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      // Undeclared exception!
      try { 
        timeOfDay0.withField(dateTimeFieldType0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'dayOfYear' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(86399999L, (Chronology) null);
      timeOfDay0.size();
      assertEquals(999, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      TimeOfDay timeOfDay0 = new TimeOfDay(dateTimeZone0);
      // Undeclared exception!
      timeOfDay0.MIDNIGHT.minusMinutes(292272992);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((Object) null);
      assertEquals(21, timeOfDay0.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(2, 2, 2, 2);
      TimeOfDay timeOfDay1 = timeOfDay0.withMinuteOfHour(2);
      assertEquals(2, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay(2, 2, 2, 2, islamicChronology0);
      Duration duration0 = new Duration((long) 1);
      Instant instant0 = Instant.ofEpochSecond(1);
      Period period0 = new Period(duration0, instant0);
      TimeOfDay timeOfDay1 = timeOfDay0.minus(period0);
      assertEquals(1, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay(2190L, (Chronology) iSOChronology0);
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0, (Chronology) iSOChronology0);
      assertEquals(2, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      TimeOfDay timeOfDay0 = new TimeOfDay((-1899L), (Chronology) gregorianChronology0);
      int[] intArray0 = new int[1];
      TimeOfDay timeOfDay1 = new TimeOfDay(timeOfDay0, intArray0);
      // Undeclared exception!
      try { 
        timeOfDay1.withHourOfDay(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      TimeOfDay timeOfDay0 = new TimeOfDay((Chronology) buddhistChronology0);
      DateTime dateTime0 = timeOfDay0.toDateTimeToday();
      Duration duration0 = Duration.standardMinutes(1);
      Period period0 = new Period(duration0, dateTime0);
      TimeOfDay timeOfDay1 = timeOfDay0.withPeriodAdded(period0, 0);
      assertSame(timeOfDay1, timeOfDay0);
      assertEquals(1392427281323L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeOfDay.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.TimeOfDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(14, 14);
      TimeOfDay timeOfDay1 = timeOfDay0.withPeriodAdded((ReadablePeriod) null, 14);
      assertEquals(14, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1221));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      TimeOfDay timeOfDay0 = new TimeOfDay(12, 12, gJChronology0);
      // Undeclared exception!
      try { 
        timeOfDay0.getField(12, (Chronology) gJChronology0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 12
         //
         verifyException("org.joda.time.TimeOfDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      TimeOfDay timeOfDay0 = new TimeOfDay(dateTimeZone0);
      timeOfDay0.getFieldTypes();
      assertEquals(21, timeOfDay0.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object object0 = new Object();
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: java.lang.Object
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay(2190L, (Chronology) iSOChronology0);
      TimeOfDay timeOfDay1 = timeOfDay0.minusHours(1);
      assertEquals(0, timeOfDay1.getMinuteOfHour());
      assertEquals(18, timeOfDay1.getHourOfDay());
      assertEquals(190, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      TimeOfDay timeOfDay0 = new TimeOfDay(1, 1, 1, copticChronology0);
      DateTime dateTime0 = timeOfDay0.toDateTimeToday(dateTimeZone0);
      assertEquals(1392357661000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      TimeOfDay timeOfDay0 = new TimeOfDay((Chronology) buddhistChronology0);
      assertEquals(4, timeOfDay0.size());
      
      TimeOfDay timeOfDay1 = timeOfDay0.withMillisOfSecond(3);
      assertEquals(3, timeOfDay1.getMillisOfSecond());
      assertEquals(21, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Instant instant0 = Instant.now();
      Chronology chronology0 = instant0.getChronology();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(chronology0);
      TimeOfDay timeOfDay0 = new TimeOfDay((Object) null, lenientChronology0);
      assertEquals(4, timeOfDay0.size());
      assertEquals(320, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      TimeOfDay timeOfDay0 = new TimeOfDay(1, 1, 1, copticChronology0);
      TimeOfDay timeOfDay1 = timeOfDay0.plusHours(1);
      assertEquals(2, timeOfDay1.getHourOfDay());
      assertEquals(4, timeOfDay0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      assertEquals(4, timeOfDay0.size());
      assertEquals(21, timeOfDay0.getMinuteOfHour());
      assertEquals(320, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime((-2086L));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0);
      TimeOfDay timeOfDay0 = new TimeOfDay((Chronology) gJChronology0);
      // Undeclared exception!
      try { 
        timeOfDay0.withMinuteOfHour((-1236));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1236 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
