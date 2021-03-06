/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 07:48:53 GMT 2020
 */

package org.joda.time.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Clock;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.convert.CalendarConverter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CalendarConverter_ESTest extends CalendarConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      long long0 = calendarConverter0.getInstantMillis(mockGregorianCalendar0, (Chronology) null);
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockDate mockDate0 = new MockDate((-9223372036854775808L));
      mockGregorianCalendar0.setTime(mockDate0);
      long long0 = calendarConverter0.getInstantMillis(mockGregorianCalendar0, (Chronology) null);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      // Undeclared exception!
      try { 
        calendarConverter0.getInstantMillis((Object) null, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.CalendarConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        calendarConverter0.getInstantMillis(object0, (Chronology) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Calendar
         //
         verifyException("org.joda.time.convert.CalendarConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CalendarConverter calendarConverter0 = CalendarConverter.INSTANCE;
      // Undeclared exception!
      try { 
        calendarConverter0.getChronology((Object) null, (DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.CalendarConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CalendarConverter calendarConverter0 = CalendarConverter.INSTANCE;
      // Undeclared exception!
      try { 
        calendarConverter0.getChronology((Object) null, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.CalendarConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      // Undeclared exception!
      try { 
        calendarConverter0.getChronology((Object) mockHijrahDate0, (Chronology) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate cannot be cast to java.util.Calendar
         //
         verifyException("org.joda.time.convert.CalendarConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalendarConverter calendarConverter0 = CalendarConverter.INSTANCE;
      GJChronology gJChronology0 = (GJChronology)calendarConverter0.getChronology((Object) mockGregorianCalendar0, dateTimeZone0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CalendarConverter calendarConverter0 = CalendarConverter.INSTANCE;
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now((ZoneId) zoneOffset0);
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      GregorianChronology gregorianChronology0 = (GregorianChronology)calendarConverter0.getChronology((Object) gregorianCalendar0, (DateTimeZone) null);
      assertEquals(4, gregorianChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      GJChronology gJChronology0 = (GJChronology)calendarConverter0.getChronology((Object) mockGregorianCalendar0, (Chronology) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertNotNull(gJChronology0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      Chronology chronology0 = calendarConverter0.getChronology((Object) "Nonw_uDWs", (DateTimeZone) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CalendarConverter calendarConverter0 = CalendarConverter.INSTANCE;
      Class<?> class0 = calendarConverter0.getSupportedType();
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CalendarConverter calendarConverter0 = CalendarConverter.INSTANCE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1462, (-1929), 1462, 1462, (-532));
      long long0 = calendarConverter0.getInstantMillis(mockGregorianCalendar0, (Chronology) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      Clock clock0 = MockClock.systemUTC();
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now(clock0);
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      GregorianChronology gregorianChronology0 = (GregorianChronology)calendarConverter0.getChronology((Object) gregorianCalendar0, (Chronology) null);
      assertEquals(4, gregorianChronology0.getMinimumDaysInFirstWeek());
  }
}
