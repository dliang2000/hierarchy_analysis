/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 07:46:03 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.MonthDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.InternalParser;
import org.joda.time.format.InternalParserDateTimeParser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InternalParserDateTimeParser_ESTest extends InternalParserDateTimeParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay(2921L, (Chronology) buddhistChronology0);
      DateTimeFieldType dateTimeFieldType0 = monthDay0.getFieldType(1);
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 0, true);
      DateTimeParser dateTimeParser0 = InternalParserDateTimeParser.of(dateTimeFormatterBuilder_TwoDigitYear0);
      assertEquals(4, dateTimeParser0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, (-271), true, 3645);
      DateTimeParser dateTimeParser0 = InternalParserDateTimeParser.of(dateTimeFormatterBuilder_PaddedNumber0);
      assertEquals((-271), dateTimeParser0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeParser dateTimeParser0 = InternalParserDateTimeParser.of((InternalParser) null);
      assertNull(dateTimeParser0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      DateTimeFormatterBuilder.Composite dateTimeFormatterBuilder_Composite0 = new DateTimeFormatterBuilder.Composite(linkedList0);
      DateTimeParser dateTimeParser0 = InternalParserDateTimeParser.of(dateTimeFormatterBuilder_Composite0);
      assertEquals(0, dateTimeParser0.estimateParsedLength());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        MonthDay.parse("org.joda.time.tz.UTCProvider");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.tz.UTCProvider\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }
}