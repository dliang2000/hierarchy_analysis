/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 07:14:25 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationField;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.chrono.ZonedChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      long long0 = buddhistChronology0.add((-2521L), 274L, (-506));
      assertEquals((-141165L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(91L, (-42521587200000L), iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(ethiopicChronology0);
      DurationField durationField0 = lenientChronology0.years();
      assertEquals("years", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeField dateTimeField0 = ethiopicChronology0.yearOfEra();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = islamicChronology0.yearOfCentury();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(gJChronology0);
      DateTimeField dateTimeField0 = strictChronology0.year();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Chronology chronology0 = buddhistChronology0.withZone(dateTimeZone0);
      assertSame(chronology0, buddhistChronology0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      BuddhistChronology buddhistChronology1 = (BuddhistChronology)buddhistChronology0.withUTC();
      assertEquals(1, BuddhistChronology.BE);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DurationField durationField0 = gJChronology0.weekyears();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeField dateTimeField0 = islamicChronology0.weekyearOfCentury();
      assertEquals("weekyearOfCentury", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyear();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.weeks();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType(1, (-2076));
      IslamicChronology islamicChronology0 = new IslamicChronology(lenientChronology0, "JOs", islamicChronology_LeapYearPatternType0);
      DateTimeField dateTimeField0 = islamicChronology0.weekOfWeekyear();
      assertTrue(dateTimeField0.isLenient());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      String string0 = copticChronology0.toString();
      assertEquals("CopticChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      MockDate mockDate0 = new MockDate((-1L));
      YearMonth yearMonth0 = YearMonth.fromDateFields(mockDate0);
      long long0 = gJChronology0.set(yearMonth0, (-2283L));
      assertEquals((-2283L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = gregorianChronology0.seconds();
      assertTrue(durationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeField dateTimeField0 = ethiopicChronology0.secondOfMinute();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(15);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = gregorianChronology0.secondOfDay();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DurationField durationField0 = copticChronology0.months();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeField dateTimeField0 = islamicChronology0.monthOfYear();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.minutes();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeField dateTimeField0 = islamicChronology0.minuteOfHour();
      assertEquals("minuteOfHour", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfDay();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = islamicChronology0.millisOfDay();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.millis();
      assertEquals("millis", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0, 1);
      DurationField durationField0 = julianChronology0.hours();
      assertEquals("hours", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeField dateTimeField0 = gregorianChronology0.hourOfDay();
      assertEquals("hourOfDay", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DurationField durationField0 = gregorianChronology0.halfdays();
      assertEquals(43200000L, durationField0.getUnitMillis());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(ethiopicChronology0);
      long long0 = lenientChronology0.getDateTimeMillis(27, 1707, 27, 1365, 218, 4, 27);
      assertEquals((-56924618663973L), long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.eras();
      assertTrue(durationField0.isPrecise());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = julianChronology0.era();
      assertEquals(0, dateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DurationField durationField0 = iSOChronology0.days();
      assertEquals("days", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType((-1), (-2076));
      IslamicChronology islamicChronology0 = new IslamicChronology(lenientChronology0, "JOs", islamicChronology_LeapYearPatternType0);
      DateTimeField dateTimeField0 = islamicChronology0.dayOfYear();
      assertEquals("dayOfYear", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      DateTimeField dateTimeField0 = lenientChronology0.dayOfWeek();
      assertEquals("dayOfWeek", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfHalfday();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-19));
      DateTime dateTime0 = new DateTime(2169L, (Chronology) buddhistChronology0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateTime0, 1);
      DateTimeField dateTimeField0 = gJChronology0.clockhourOfDay();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeField dateTimeField0 = iSOChronology0.centuryOfEra();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.centuries();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      long long0 = iSOChronology0.add((ReadablePeriod) null, 1L, 2167);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        julianChronology0.validate((ReadablePartial) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-292275054), 0, 0, 0, (-292275054));
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        lenientChronology0.validate(localDateTime0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      LocalDate localDate1 = localDate0.withWeekyear(1);
      LocalDate localDate2 = localDate1.minusMonths(15);
      // Undeclared exception!
      try { 
        islamicChronology0.set(localDate2, (-832L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for year must be in the range [1,292271022]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      // Undeclared exception!
      try { 
        gregorianChronology0.set((ReadablePartial) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      try { 
        iSOChronology0.getDateTimeMillis(5097600000L, 4385, 4385, (-913), (-913));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 4385 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      try { 
        buddhistChronology0.getDateTimeMillis(3085, 3085, (-1293), (-1293), (-1), (-1), 999);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 3085 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      try { 
        copticChronology0.getDateTimeMillis((-272), (-272), (-452), (-2915));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2915 for millisOfDay must be in the range [0,86399999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      // Undeclared exception!
      try { 
        zonedChronology0.get((ReadablePeriod) null, (long) (-292269337), (long) 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      // Undeclared exception!
      try { 
        zonedChronology0.get((ReadablePeriod) null, (long) 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      MonthDay monthDay0 = new MonthDay();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Hours hours0 = period0.toStandardHours();
      // Undeclared exception!
      try { 
        zonedChronology0.get((ReadablePeriod) hours0, 6154683468111806464L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 1709634296697
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        buddhistChronology0.get((ReadablePartial) null, (-1453L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = copticChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      Period period0 = Period.days(623191204);
      // Undeclared exception!
      try { 
        gJChronology0.add((ReadablePeriod) period0, (-2847L), (-1393));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -868105347172 * 86400000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Period period0 = Period.seconds(1);
      int[] intArray0 = buddhistChronology0.get((ReadablePeriod) period0, 604800L);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 10, 4, 800}, intArray0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(1, 1, 0, (-3014), 1993, 0, 1, 1993, (PeriodType) null);
      int[] intArray0 = copticChronology0.get((ReadablePeriod) mutablePeriod0, 0L);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      MockDate mockDate0 = new MockDate((-292269337));
      LocalDate localDate0 = LocalDate.fromDateFields(mockDate0);
      int[] intArray0 = copticChronology0.get((ReadablePartial) localDate0, (-28L));
      assertArrayEquals(new int[] {1686, 4, 22}, intArray0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) iSOChronology0);
      int[] intArray0 = new int[3];
      intArray0[1] = 1;
      iSOChronology0.validate(yearMonth0, intArray0);
      assertEquals(2, yearMonth0.getMonthOfYear());
      assertEquals(2014, yearMonth0.getYear());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.add((long) 0, (long) 1, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      long long0 = zonedChronology0.add((long) 1, (-3282L), 1);
      assertEquals((-3281L), long0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      long long0 = copticChronology0.add(1L, 0L, (-912));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      Period period0 = Period.days((-5111));
      // Undeclared exception!
      try { 
        zonedChronology0.add((ReadablePeriod) period0, (-28L), 1889);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      Duration duration0 = Duration.millis(1);
      Seconds seconds0 = duration0.toStandardSeconds();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType(1, (-2076));
      IslamicChronology islamicChronology0 = new IslamicChronology(lenientChronology0, "JOs", islamicChronology_LeapYearPatternType0);
      long long0 = islamicChronology0.add((ReadablePeriod) seconds0, 0L, 18);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      long long0 = zonedChronology0.add((ReadablePeriod) null, (-1L), 1889);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Period period0 = Period.ZERO;
      long long0 = julianChronology0.add((ReadablePeriod) period0, (long) 0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Period period0 = Period.days((-5111));
      Period period1 = period0.normalizedStandard();
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      Duration duration0 = Duration.millis(1);
      Seconds seconds0 = duration0.toStandardSeconds();
      Hours hours0 = seconds0.toStandardHours();
      int[] intArray0 = lenientChronology0.get((ReadablePeriod) hours0, (long) 1, (long) 1);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      long long0 = islamicChronology0.set(localDate0, (-832L));
      assertEquals(19114786799168L, long0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime(1614L);
      int[] intArray0 = new int[9];
      intArray0[1] = 2261;
      // Undeclared exception!
      try { 
        julianChronology0.validate(localDateTime0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2261 for monthOfYear must not be larger than 12
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      MockDate mockDate0 = new MockDate((-292269337));
      LocalDate localDate0 = LocalDate.fromDateFields(mockDate0);
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(copticChronology0, dateTimeZone0);
      Period period0 = Period.days((-5111));
      int[] intArray0 = zonedChronology0.get((ReadablePeriod) period0, (long) (-292269337), (long) 1);
      // Undeclared exception!
      try { 
        zonedChronology0.validate(localDate0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must not be smaller than 1
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      long long0 = lenientChronology0.getDateTimeMillis((long) 1, 18, 10, 1, (-1));
      assertEquals(65400999L, long0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      long long0 = lenientChronology0.getDateTimeMillis(1, 4, 292272708, (-1393));
      assertEquals(25173098092798607L, long0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(ethiopicChronology0);
      DateTime dateTime0 = new DateTime(1, 1, 292272984, 1, 1, lenientChronology0);
      assertEquals(25190491644060000L, dateTime0.getMillis());
  }
}
