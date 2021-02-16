/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 04:35:41 GMT 2020
 */

package org.joda.time.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.convert.CalendarConverter;
import org.joda.time.convert.DateConverter;
import org.joda.time.convert.LongConverter;
import org.joda.time.convert.NullConverter;
import org.joda.time.convert.ReadableDurationConverter;
import org.joda.time.convert.ReadableInstantConverter;
import org.joda.time.convert.ReadableIntervalConverter;
import org.joda.time.convert.ReadablePeriodConverter;
import org.joda.time.convert.StringConverter;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractConverter_ESTest extends AbstractConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      ReadableIntervalConverter readableIntervalConverter0 = ReadableIntervalConverter.INSTANCE;
      boolean boolean0 = readableIntervalConverter0.isReadableInterval(mockThaiBuddhistDate0, (Chronology) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ReadablePeriodConverter readablePeriodConverter0 = ReadablePeriodConverter.INSTANCE;
      // Undeclared exception!
      try { 
        readablePeriodConverter0.getPeriodType((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadablePeriodConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ReadablePeriodConverter readablePeriodConverter0 = new ReadablePeriodConverter();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      // Undeclared exception!
      try { 
        readablePeriodConverter0.getPeriodType(mockMinguoDate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate cannot be cast to org.joda.time.ReadablePeriod
         //
         verifyException("org.joda.time.convert.ReadablePeriodConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NullConverter nullConverter0 = new NullConverter();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      // Undeclared exception!
      try { 
        nullConverter0.getPartialValues((ReadablePartial) null, (Object) mockHijrahDate0, (Chronology) null, dateTimeFormatter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.AbstractConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateConverter dateConverter0 = DateConverter.INSTANCE;
      // Undeclared exception!
      try { 
        dateConverter0.getPartialValues((ReadablePartial) null, (Object) "The datetime zone must not be null", (Chronology) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Date
         //
         verifyException("org.joda.time.convert.DateConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CalendarConverter calendarConverter0 = CalendarConverter.INSTANCE;
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
  public void test06()  throws Throwable  {
      StringConverter stringConverter0 = new StringConverter();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      // Undeclared exception!
      try { 
        stringConverter0.getInstantMillis(mockMinguoDate0, (Chronology) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate cannot be cast to java.lang.String
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = new ReadableInstantConverter();
      // Undeclared exception!
      try { 
        readableInstantConverter0.getChronology((Object) null, (DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadableInstantConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = new ReadableInstantConverter();
      Integer integer0 = new Integer(578);
      // Undeclared exception!
      try { 
        readableInstantConverter0.getChronology((Object) integer0, (DateTimeZone) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to org.joda.time.ReadableInstant
         //
         verifyException("org.joda.time.convert.ReadableInstantConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = ReadableInstantConverter.INSTANCE;
      // Undeclared exception!
      try { 
        readableInstantConverter0.getChronology((Object) null, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadableInstantConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NullConverter nullConverter0 = new NullConverter();
      ReadableDurationConverter readableDurationConverter0 = new ReadableDurationConverter();
      // Undeclared exception!
      try { 
        readableDurationConverter0.getPartialValues((ReadablePartial) null, (Object) nullConverter0, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.AbstractConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NullConverter nullConverter0 = new NullConverter();
      String string0 = nullConverter0.toString();
      assertEquals("Converter[null]", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      String string0 = calendarConverter0.toString();
      assertEquals("Converter[java.util.Calendar]", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NullConverter nullConverter0 = NullConverter.INSTANCE;
      Object object0 = new Object();
      long long0 = nullConverter0.getInstantMillis(object0, (Chronology) null);
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = ReadableInstantConverter.INSTANCE;
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      boolean boolean0 = readableInstantConverter0.isReadableInterval(mockThaiBuddhistDate0, (Chronology) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LongConverter longConverter0 = LongConverter.INSTANCE;
      Chronology chronology0 = longConverter0.getChronology((Object) null, (DateTimeZone) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ReadablePeriodConverter readablePeriodConverter0 = new ReadablePeriodConverter();
      Object object0 = new Object();
      Chronology chronology0 = readablePeriodConverter0.getChronology(object0, (Chronology) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = ReadableInstantConverter.INSTANCE;
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      PeriodType periodType0 = readableInstantConverter0.getPeriodType(mockThaiBuddhistDate0);
      // Undeclared exception!
      try { 
        readableInstantConverter0.getChronology((Object) periodType0, (Chronology) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.joda.time.PeriodType cannot be cast to org.joda.time.ReadableInstant
         //
         verifyException("org.joda.time.convert.ReadableInstantConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CalendarConverter calendarConverter0 = new CalendarConverter();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      // Undeclared exception!
      try { 
        calendarConverter0.getPartialValues((ReadablePartial) null, (Object) mockMinguoDate0, (Chronology) null, dateTimeFormatter0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate cannot be cast to java.util.Calendar
         //
         verifyException("org.joda.time.convert.CalendarConverter", e);
      }
  }
}
