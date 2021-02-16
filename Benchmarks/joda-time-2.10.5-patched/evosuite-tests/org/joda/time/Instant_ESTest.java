/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 07:47:40 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.Partial;
import org.joda.time.ReadableDuration;
import org.joda.time.UTCDateTimeZone;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Instant_ESTest extends Instant_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Instant instant0 = new Instant((Object) null);
      assertEquals(1392409281320L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Instant instant0 = Instant.ofEpochMilli(30672000000L);
      Instant instant1 = instant0.withMillis(197L);
      assertEquals(30672000000L, instant0.getMillis());
      assertEquals(197L, instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Instant instant0 = Instant.EPOCH;
      Duration duration0 = Duration.standardHours((-2551));
      Duration duration1 = duration0.dividedBy((long) (-2551));
      Instant instant1 = instant0.withDurationAdded((ReadableDuration) duration1, (-2551));
      assertEquals((-9183600000L), instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Instant instant0 = Instant.EPOCH;
      MutableDateTime mutableDateTime0 = instant0.toMutableDateTimeISO();
      assertEquals(3, MutableDateTime.ROUND_HALF_FLOOR);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Instant instant0 = Instant.ofEpochSecond((-3791L));
      MutableDateTime mutableDateTime0 = instant0.toMutableDateTimeISO();
      assertEquals((-3791000L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Instant instant0 = Instant.EPOCH;
      MutableDateTime mutableDateTime0 = instant0.toMutableDateTime();
      assertEquals(3, MutableDateTime.ROUND_HALF_FLOOR);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Instant instant0 = Instant.ofEpochMilli((-1L));
      MutableDateTime mutableDateTime0 = instant0.toMutableDateTime();
      assertEquals((-1L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Instant instant0 = Instant.EPOCH;
      Instant instant1 = instant0.toInstant();
      assertSame(instant1, instant0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Instant instant0 = new Instant((-1296L));
      Instant instant1 = instant0.toInstant();
      assertEquals((-1296L), instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Instant instant0 = Instant.EPOCH;
      DateTime dateTime0 = instant0.EPOCH.toDateTimeISO();
      assertEquals(0L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Instant instant0 = Instant.ofEpochMilli(1L);
      DateTime dateTime0 = instant0.toDateTimeISO();
      assertEquals(1L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Instant instant0 = Instant.now();
      DateTime dateTime0 = instant0.toDateTime();
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Instant instant0 = Instant.ofEpochSecond((-2949L));
      DateTime dateTime0 = instant0.toDateTime();
      assertEquals((-2949000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Instant instant0 = new Instant((-1087L));
      instant0.EPOCH.plus((ReadableDuration) null);
      assertEquals((-1087L), instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Instant instant0 = Instant.now();
      Instant instant1 = instant0.EPOCH.plus(0L);
      assertEquals(0L, instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Instant instant0 = Instant.ofEpochSecond((-1791L));
      Instant instant1 = instant0.plus(1413L);
      assertEquals((-1789587L), instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Instant instant0 = Instant.parse("", dateTimeFormatter0);
      assertEquals(18000000L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(2147480097).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3);
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZone(dateTimeZone0);
      Instant instant0 = Instant.parse("org.joda.time.Days", dateTimeFormatter1);
      assertEquals((-3L), instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Instant instant0 = Instant.parse("1970-01-01T00:00:00.000Z");
      assertEquals(0L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Instant instant0 = Instant.parse("1970-01-01T00:00:00.001Z");
      assertEquals(1L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Instant instant0 = Instant.ofEpochSecond(1912L);
      assertEquals(1912000L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeUtils.MillisProvider dateTimeUtils_MillisProvider0 = mock(DateTimeUtils.MillisProvider.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(dateTimeUtils_MillisProvider0).getMillis();
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_MillisProvider0);
      Instant instant0 = Instant.now();
      assertEquals(0L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeUtils.MillisProvider dateTimeUtils_MillisProvider0 = mock(DateTimeUtils.MillisProvider.class, new ViolatedAssumptionAnswer());
      doReturn(1397L, (-1214L)).when(dateTimeUtils_MillisProvider0).getMillis();
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_MillisProvider0);
      Instant instant0 = Instant.now();
      Instant instant1 = Instant.now();
      assertFalse(instant1.equals((Object)instant0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Instant instant0 = Instant.ofEpochMilli(1654L);
      Duration duration0 = Duration.standardMinutes(1654L);
      Instant instant1 = instant0.minus((ReadableDuration) duration0);
      assertEquals((-99238346L), instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Instant instant0 = Instant.now();
      Instant instant1 = instant0.minus(1964L);
      assertEquals(1392409279356L, instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Instant instant0 = Instant.EPOCH;
      Instant instant1 = instant0.minus(3985L);
      assertEquals((-3985L), instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Instant instant0 = Instant.EPOCH;
      long long0 = instant0.getMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Instant instant0 = new Instant((-1296L));
      long long0 = instant0.getMillis();
      assertEquals((-1296L), long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Instant instant0 = new Instant();
      Duration duration0 = Duration.standardHours((-2919L));
      // Undeclared exception!
      try { 
        instant0.withDurationAdded((ReadableDuration) duration0, 2146374410);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -10508400000 * 2146374410
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Instant instant0 = new Instant();
      // Undeclared exception!
      try { 
        instant0.withDurationAdded(15308640144L, (-2147483634));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 15308640144 * -2147483634
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Instant instant0 = Instant.ofEpochMilli(9223372036854775807L);
      // Undeclared exception!
      try { 
        instant0.plus((long) 1285);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 9223372036854775807 + 1285
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((-2147483646)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      try { 
        Instant.parse("", dateTimeFormatter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        Instant.parse("cQT", (DateTimeFormatter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.Instant", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) uTCDateTimeZone0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[2];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      Partial partial0 = new Partial(gregorianChronology0, dateTimeFieldTypeArray0, intArray0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      // Undeclared exception!
      try { 
        Instant.parse("", dateTimeFormatter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        Instant.parse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        Instant.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        Instant.ofEpochSecond(9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 9223372036854775807 * 1000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Instant instant0 = Instant.EPOCH;
      Duration duration0 = Duration.standardHours((-2551));
      Instant instant1 = instant0.withDurationAdded((ReadableDuration) duration0, (-2551));
      assertEquals(23427363600000L, instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Instant instant0 = new Instant();
      Instant instant1 = instant0.withDurationAdded((ReadableDuration) null, (-886));
      assertEquals(1392409281320L, instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Instant instant0 = Instant.EPOCH;
      Instant instant1 = instant0.withDurationAdded(3985L, (-2551));
      assertEquals((-10165735L), instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Instant instant0 = Instant.ofEpochSecond(0L);
      Instant instant1 = instant0.withDurationAdded((long) 0, 0);
      assertEquals(0L, instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Instant instant0 = Instant.now();
      Instant instant1 = instant0.withMillis((-864L));
      assertEquals((-864L), instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Instant instant0 = new Instant((-1296L));
      instant0.getChronology();
      assertEquals((-1296L), instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Instant instant0 = new Instant((-1296L));
      instant0.EPOCH.toDateTime();
      assertEquals((-1296L), instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Instant instant0 = Instant.ofEpochMilli(30672000000L);
      long long0 = instant0.getMillis();
      assertEquals(30672000000L, long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Instant instant0 = Instant.ofEpochMilli(30672000000L);
      MutableDateTime mutableDateTime0 = instant0.toMutableDateTime();
      assertEquals(30672000000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, (DateTimeParser) null);
      // Undeclared exception!
      try { 
        Instant.parse("org/joda/time/tz/data", dateTimeFormatter0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Parsing not supported
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Instant instant0 = Instant.ofEpochMilli(30672000000L);
      Instant instant1 = instant0.toInstant();
      assertEquals(30672000000L, instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Instant instant0 = Instant.ofEpochMilli(30672000000L);
      Duration duration0 = new Duration(30672000000L);
      Instant instant1 = instant0.EPOCH.withDurationAdded((ReadableDuration) duration0, 0);
      assertEquals(30672000000L, instant0.getMillis());
      assertEquals(0L, instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Instant instant0 = Instant.ofEpochMilli(566L);
      Instant instant1 = instant0.minus((ReadableDuration) null);
      assertEquals(566L, instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Instant instant0 = Instant.ofEpochMilli(30672000000L);
      Instant instant1 = instant0.withDurationAdded(30672000000L, 0);
      assertEquals(30672000000L, instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Instant instant0 = Instant.ofEpochSecond(0L);
      Instant instant1 = instant0.withMillis(0);
      assertSame(instant1, instant0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Instant instant0 = Instant.ofEpochMilli(30672000000L);
      Duration duration0 = new Duration(30672000000L);
      Instant instant1 = instant0.minus((ReadableDuration) duration0);
      assertEquals(0L, instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Instant instant0 = Instant.ofEpochSecond((-1791L));
      Duration duration0 = Duration.millis((-1791L));
      Duration duration1 = duration0.abs();
      Duration duration2 = duration1.plus((ReadableDuration) duration0);
      Duration duration3 = duration2.toDuration();
      Instant instant1 = instant0.plus((ReadableDuration) duration3);
      assertEquals((-1791000L), instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Instant instant0 = Instant.parse("1");
      assertEquals((-62135577748000L), instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Instant instant0 = new Instant((-1296L));
      Instant instant1 = instant0.minus((-1296L));
      assertEquals(0L, instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Instant instant0 = Instant.ofEpochMilli(0);
      assertEquals(0L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Instant instant0 = new Instant((-1296L));
      DateTime dateTime0 = instant0.toDateTimeISO();
      assertEquals((-1296L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Instant instant0 = null;
      try {
        instant0 = new Instant("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Instant instant0 = new Instant();
      Instant instant1 = instant0.EPOCH.plus(3252L);
      assertEquals(3252L, instant1.getMillis());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Instant instant0 = Instant.now();
      MutableDateTime mutableDateTime0 = instant0.toMutableDateTimeISO();
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Instant instant0 = new Instant();
      Duration duration0 = Duration.standardHours((-2919L));
      Instant instant1 = instant0.plus((ReadableDuration) duration0);
      assertEquals(1381900881320L, instant1.getMillis());
  }
}