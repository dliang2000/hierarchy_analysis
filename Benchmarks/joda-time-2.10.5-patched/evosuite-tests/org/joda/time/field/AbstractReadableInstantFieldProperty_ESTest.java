/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 07:37:14 GMT 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractReadableInstantFieldProperty_ESTest extends AbstractReadableInstantFieldProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      YearMonth yearMonth0 = new YearMonth(623L, (Chronology) islamicChronology0);
      LocalDate localDate0 = yearMonth0.toLocalDate(1);
      LocalDate localDate1 = LocalDate.now(dateTimeZone0);
      LocalDate.Property localDate_Property0 = localDate1.monthOfYear();
      LocalDate.Property localDate_Property1 = localDate0.dayOfWeek();
      boolean boolean0 = localDate_Property0.equals(localDate_Property1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay(0L, (Chronology) null);
      LocalTime.Property localTime_Property0 = localTime0.minuteOfHour();
      Interval interval0 = localTime_Property0.toInterval();
      assertEquals(0L, interval0.getStartMillis());
      assertEquals(60000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((-1659L));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      LocalTime.Property localTime_Property0 = localTime0.property(dateTimeFieldType0);
      Interval interval0 = localTime_Property0.toInterval();
      assertEquals(68398000L, interval0.getStartMillis());
      assertEquals(68399000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Interval interval0 = new Interval(655L, 655L);
      DateTime dateTime0 = interval0.getEnd();
      DateTime dateTime1 = dateTime0.minusWeeks(1442);
      DateTime.Property dateTime_Property0 = dateTime1.yearOfCentury();
      Interval interval1 = dateTime_Property0.toInterval();
      assertEquals((-883598400000L), interval1.getStartMillis());
      assertEquals((-852062400000L), interval1.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.yearOfCentury();
      long long0 = localDate_Property0.remainder();
      assertEquals(3801600000L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(9L);
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      DurationField durationField0 = localTime_Property0.getRangeDurationField();
      assertEquals("seconds", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.centuryOfEra();
      int int0 = mutableDateTime_Property0.getMinimumValueOverall();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      DateTime dateTime0 = new DateTime(0L, (Chronology) lenientChronology0);
      MutableDateTime mutableDateTime0 = dateTime0.toMutableDateTimeISO();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.property(dateTimeFieldType0);
      int int0 = mutableDateTime_Property0.getMinimumValueOverall();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      DateTime dateTime0 = new DateTime((long) (-2292), dateTimeZone0);
      DateTime.Property dateTime_Property0 = dateTime0.dayOfWeek();
      int int0 = dateTime_Property0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.year();
      int int0 = localDate_Property0.getMinimumValue();
      assertEquals((-292275054), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekyear();
      DurationField durationField0 = mutableDateTime_Property0.getLeapDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      YearMonth yearMonth0 = new YearMonth(623L, (Chronology) islamicChronology0);
      LocalDate localDate0 = yearMonth0.toLocalDate(1);
      LocalDate.Property localDate_Property0 = localDate0.monthOfYear();
      DateTimeField dateTimeField0 = localDate_Property0.getField();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.centuryOfEra();
      long long0 = mutableDateTime_Property0.getDifferenceAsLong(mutableDateTime0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(3801600000L);
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      DateTime dateTime0 = new DateTime((long) 0, dateTimeZone0);
      long long0 = localTime_Property0.getDifferenceAsLong(dateTime0);
      assertEquals(68400L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusWeeks(2209);
      DateTime.Property dateTime_Property0 = dateTime1.yearOfEra();
      int int0 = dateTime_Property0.getDifference(dateTime0);
      assertEquals((-42), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = new MutableDateTime(0L, (Chronology) julianChronology0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.minuteOfDay();
      int int0 = mutableDateTime_Property0.get();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      YearMonth yearMonth0 = new YearMonth(623L, (Chronology) islamicChronology0);
      LocalDate localDate0 = yearMonth0.toLocalDate(1);
      LocalDate localDate1 = localDate0.minusDays((-2304));
      LocalDate.Property localDate_Property0 = localDate1.era();
      // Undeclared exception!
      try { 
        localDate_Property0.remainder();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (IslamicChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Instant instant0 = Instant.now();
      DateTime dateTime0 = instant0.toDateTime();
      DateTime.Property dateTime_Property0 = dateTime0.era();
      // Undeclared exception!
      try { 
        dateTime_Property0.getDifference(instant0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) lenientChronology0);
      Period period0 = Period.minutes(2014);
      Period period1 = period0.minusDays(905);
      LocalDateTime localDateTime1 = localDateTime0.plus((ReadablePeriod) period1);
      LocalDateTime.Property localDateTime_Property0 = localDateTime1.millisOfDay();
      Instant instant0 = new Instant();
      DateTime dateTime0 = instant0.toDateTime();
      // Undeclared exception!
      try { 
        localDateTime_Property0.getDifference(dateTime0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -78071160000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.yearOfCentury();
      int int0 = localDate_Property0.getMinimumValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      LocalDate localDate0 = yearMonth0.toLocalDate(1);
      LocalDate.Property localDate_Property0 = localDate0.monthOfYear();
      DateTimeFieldType dateTimeFieldType0 = localDate_Property0.getFieldType();
      assertEquals("monthOfYear", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((-1659L));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      LocalTime.Property localTime_Property0 = localTime0.property(dateTimeFieldType0);
      int int0 = localTime_Property0.getMaximumValue();
      assertEquals(86399, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.monthOfYear();
      Locale locale0 = Locale.CHINESE;
      String string0 = localDateTime_Property0.getAsText(locale0);
      assertEquals("\u4E8C\u6708", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      String string0 = localTime_Property0.getAsShortText(locale0);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Interval interval0 = new Interval(655L, 655L);
      DateTime dateTime0 = interval0.getEnd();
      DateTime.Property dateTime_Property0 = dateTime0.yearOfCentury();
      int int0 = dateTime_Property0.get();
      assertEquals(69, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTime dateTime0 = new DateTime(0L);
      DateTime.Property dateTime_Property0 = dateTime0.yearOfCentury();
      String string0 = dateTime_Property0.getName();
      assertEquals("yearOfCentury", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      LocalDate localDate0 = yearMonth0.toLocalDate(1);
      LocalDate localDate1 = localDate0.minusDays(14);
      LocalDate.Property localDate_Property0 = localDate1.monthOfYear();
      LocalDate.Property localDate_Property1 = localDate0.era();
      boolean boolean0 = localDate_Property0.equals(localDate_Property1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      YearMonth yearMonth0 = new YearMonth(623L, (Chronology) islamicChronology0);
      LocalDate localDate0 = yearMonth0.toLocalDate(1);
      LocalDate.Property localDate_Property0 = localDate0.monthOfYear();
      LocalDate.Property localDate_Property1 = localDate0.era();
      boolean boolean0 = localDate_Property0.equals(localDate_Property1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      YearMonth yearMonth0 = new YearMonth(623L, (Chronology) islamicChronology0);
      LocalDate localDate0 = yearMonth0.toLocalDate(1);
      LocalDate.Property localDate_Property0 = localDate0.monthOfYear();
      boolean boolean0 = localDate_Property0.equals(localDate_Property0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      DateTime dateTime0 = new DateTime(0L, (Chronology) lenientChronology0);
      DateTime.Property dateTime_Property0 = dateTime0.weekOfWeekyear();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      boolean boolean0 = dateTime_Property0.equals(mockThaiBuddhistDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((Object) null, (DateTimeZone) null);
      LocalDate.Property localDate_Property0 = localDate0.era();
      LocalDate localDate1 = localDate_Property0.roundHalfFloorCopy();
      Instant instant0 = Instant.now();
      DateTime dateTime0 = instant0.toDateTime();
      DateTime.Property dateTime_Property0 = dateTime0.centuryOfEra();
      int int0 = dateTime_Property0.compareTo((ReadablePartial) localDate1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTime dateTime0 = new DateTime((-2417L));
      DateTime.Property dateTime_Property0 = dateTime0.weekyear();
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      int int0 = dateTime_Property0.compareTo((ReadablePartial) localDateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfWeek();
      // Undeclared exception!
      try { 
        mutableDateTime_Property0.compareTo((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The partial must not be null
         //
         verifyException("org.joda.time.field.AbstractReadableInstantFieldProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DateTime dateTime0 = localTime0.toDateTimeToday();
      DateTime dateTime1 = dateTime0.withDurationAdded(11L, 9);
      DateTime.Property dateTime_Property0 = dateTime1.millisOfDay();
      int int0 = dateTime_Property0.compareTo((ReadableInstant) dateTime0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusHours(17);
      DateTime.Property dateTime_Property0 = dateTime1.millisOfDay();
      int int0 = dateTime_Property0.compareTo((ReadableInstant) dateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.year();
      // Undeclared exception!
      try { 
        localDate_Property0.compareTo((ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant must not be null
         //
         verifyException("org.joda.time.field.AbstractReadableInstantFieldProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.millisOfDay();
      int int0 = dateTime_Property0.compareTo((ReadableInstant) dateTime0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime0 = new DateTime(1994L, dateTimeZone0);
      DateTime.Property dateTime_Property0 = dateTime0.dayOfMonth();
      long long0 = dateTime_Property0.getDifferenceAsLong((ReadableInstant) null);
      assertEquals((-16115L), long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.era();
      // Undeclared exception!
      try { 
        mutableDateTime_Property0.getDifferenceAsLong(mutableDateTime0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Instant instant0 = Instant.now();
      DateTime dateTime0 = instant0.toDateTime();
      DateTime.Property dateTime_Property0 = dateTime0.centuryOfEra();
      int int0 = dateTime_Property0.getDifference((ReadableInstant) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTime dateTime0 = new DateTime((-2417L));
      DateTime.Property dateTime_Property0 = dateTime0.weekyear();
      DateTime dateTime1 = dateTime_Property0.withMinimumValue();
      int int0 = dateTime_Property0.getDifference(dateTime1);
      assertEquals(292277024, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.year();
      DurationField durationField0 = localDate_Property0.getRangeDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      YearMonth yearMonth0 = new YearMonth(623L, (Chronology) islamicChronology0);
      LocalDate localDate0 = yearMonth0.toLocalDate(1);
      LocalDate.Property localDate_Property0 = localDate0.monthOfYear();
      long long0 = localDate_Property0.remainder();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.monthOfYear();
      localDateTime_Property0.hashCode();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Instant instant0 = Instant.now();
      DateTime dateTime0 = instant0.toDateTime();
      DateTime.Property dateTime_Property0 = dateTime0.centuryOfEra();
      DurationField durationField0 = dateTime_Property0.getLeapDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-2693L));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      LocalTime.Property localTime_Property0 = localTime0.property(dateTimeFieldType0);
      int int0 = localTime_Property0.getMaximumValueOverall();
      assertEquals(86399, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.property(dateTimeFieldType0);
      String string0 = localDateTime_Property0.getAsString();
      assertEquals("14", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.year();
      String string0 = localDate_Property0.getAsShortText();
      assertEquals("2014", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.monthOfYear();
      Locale locale0 = Locale.CHINESE;
      int int0 = localDateTime_Property0.getMaximumShortTextLength(locale0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      DateTime dateTime0 = new DateTime(0L, (Chronology) lenientChronology0);
      DateTime.Property dateTime_Property0 = dateTime0.weekOfWeekyear();
      String string0 = dateTime_Property0.getAsText();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.year();
      int int0 = localDate_Property0.getMinimumValueOverall();
      assertEquals((-292275054), int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.era();
      DurationField durationField0 = mutableDateTime_Property0.getDurationField();
      assertEquals("eras", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.era();
      Locale locale0 = Locale.CANADA;
      int int0 = mutableDateTime_Property0.getMaximumTextLength(locale0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime0 = new DateTime(1994L, dateTimeZone0);
      DateTime.Property dateTime_Property0 = dateTime0.dayOfMonth();
      int int0 = dateTime_Property0.getLeapAmount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTime dateTime0 = new DateTime((-2417L));
      DateTime.Property dateTime_Property0 = dateTime0.weekyear();
      String string0 = dateTime_Property0.toString();
      assertEquals("Property[weekyear]", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.monthOfYear();
      int int0 = localDateTime_Property0.compareTo((ReadablePartial) localDateTime0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.yearOfEra();
      boolean boolean0 = dateTime_Property0.isLeap();
      assertFalse(boolean0);
  }
}
