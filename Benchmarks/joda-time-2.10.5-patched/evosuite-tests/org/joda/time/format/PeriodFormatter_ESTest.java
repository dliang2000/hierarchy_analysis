/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 05:11:20 GMT 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.format.PeriodFormat;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PeriodFormatter_ESTest extends PeriodFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, (PeriodParser) null);
      PeriodType periodType0 = PeriodType.yearWeekDay();
      PeriodFormatter periodFormatter1 = periodFormatter0.withParseType(periodType0);
      assertNotSame(periodFormatter1, periodFormatter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("");
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      MutablePeriod mutablePeriod0 = periodFormatter0.parseMutablePeriod("");
      String string0 = periodFormatter0.print(mutablePeriod0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("}iSIQ6K=");
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      Period period0 = periodFormatter0.parsePeriod("}iSIQ6K=");
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("9");
      Locale locale0 = Locale.FRENCH;
      PeriodType periodType0 = PeriodType.minutes();
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, locale0, periodType0);
      MutablePeriod mutablePeriod0 = periodFormatter0.parseMutablePeriod("9");
      int int0 = periodFormatter0.parseInto(mutablePeriod0, "9", 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("9");
      Locale locale0 = Locale.FRENCH;
      PeriodType periodType0 = PeriodType.minutes();
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, locale0, periodType0);
      MutablePeriod mutablePeriod0 = periodFormatter0.parseMutablePeriod("9");
      int int0 = periodFormatter0.parseInto(mutablePeriod0, "9", 12);
      assertEquals((-13), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      Locale locale0 = Locale.CHINA;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, locale0, (PeriodType) null);
      PeriodPrinter periodPrinter0 = periodFormatter0.getPrinter();
      assertSame(periodFormatterBuilder_Literal0, periodPrinter0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      PeriodParser periodParser0 = periodFormatter0.getParser();
      assertSame(periodParser0, periodFormatterBuilder_Literal0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "G;nMI!`ad-U";
      stringArray0[1] = "HbOOQ#(6-v$cLr9b1";
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatterBuilder.Separator periodFormatterBuilder_Separator0 = new PeriodFormatterBuilder.Separator("HbOOQ#(6-v$cLr9b1", "G;nMI!`ad-U", stringArray0, periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, false, false);
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Separator0, periodFormatterBuilder_Literal0);
      Locale locale0 = Locale.JAPANESE;
      PeriodFormat.DynamicWordBased periodFormat_DynamicWordBased0 = new PeriodFormat.DynamicWordBased(periodFormatter0);
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[1];
      Period period0 = Period.hours(255);
      Days days0 = period0.toStandardDays();
      Seconds seconds0 = days0.toStandardSeconds();
      DurationFieldType durationFieldType0 = seconds0.getFieldType();
      durationFieldTypeArray0[0] = durationFieldType0;
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      PeriodType periodType1 = periodType0.withSecondsRemoved();
      PeriodFormatter periodFormatter1 = new PeriodFormatter(periodFormat_DynamicWordBased0, periodFormatterBuilder_Literal0, locale0, periodType1);
      PeriodType periodType2 = periodFormatter1.getParseType();
      assertEquals(0, periodType2.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("");
      Locale locale0 = Locale.FRENCH;
      PeriodType periodType0 = PeriodType.hours();
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, locale0, periodType0);
      PeriodType periodType1 = periodFormatter0.getParseType();
      assertSame(periodType1, periodType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("");
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      Locale locale0 = periodFormatter0.getLocale();
      assertNull(locale0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, (PeriodParser) null);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        periodFormatter0.printTo(stringBuffer0, (ReadablePeriod) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PeriodFormatterBuilder.Composite periodFormatterBuilder_Composite0 = new PeriodFormatterBuilder.Composite(linkedList0);
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Composite0, periodFormatterBuilder_Composite0);
      Period period0 = new Period(0, 0, 0, (-14));
      Weeks weeks0 = period0.toStandardWeeks();
      // Undeclared exception!
      try { 
        periodFormatter0.printTo((StringBuffer) null, (ReadablePeriod) weeks0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.PeriodFormatterBuilder$Composite", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PeriodFormatterBuilder.Composite periodFormatterBuilder_Composite0 = new PeriodFormatterBuilder.Composite(linkedList0);
      Locale locale0 = Locale.FRANCE;
      PeriodType periodType0 = PeriodType.time();
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Composite0, periodFormatterBuilder_Composite0, locale0, periodType0);
      StringWriter stringWriter0 = new StringWriter();
      MutablePeriod mutablePeriod0 = new MutablePeriod(100000000000000L, 100000000000000L);
      // Undeclared exception!
      try { 
        periodFormatter0.printTo((Writer) stringWriter0, (ReadablePeriod) mutablePeriod0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.PeriodFormatterBuilder$Composite", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      Locale locale0 = Locale.ENGLISH;
      PeriodType periodType0 = PeriodType.hours();
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, locale0, periodType0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("Y ");
      // Undeclared exception!
      try { 
        periodFormatter0.printTo((Writer) mockPrintWriter0, (ReadablePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period must not be null
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("q;");
      Locale locale0 = Locale.CHINESE;
      PeriodType periodType0 = PeriodType.seconds();
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, locale0, periodType0);
      MockFileWriter mockFileWriter0 = new MockFileWriter("q;");
      mockFileWriter0.close();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 1341, (-523), 1341);
      try { 
        periodFormatter0.printTo((Writer) mockFileWriter0, (ReadablePeriod) mutablePeriod0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PeriodType periodType0 = PeriodType.time();
      Locale locale0 = Locale.forLanguageTag("");
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, (PeriodParser) null, locale0, periodType0);
      // Undeclared exception!
      try { 
        periodFormatter0.print((ReadablePeriod) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PeriodFormatterBuilder.Composite periodFormatterBuilder_Composite0 = new PeriodFormatterBuilder.Composite(linkedList0);
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Composite0, periodFormatterBuilder_Composite0);
      Period period0 = Period.days(2491);
      // Undeclared exception!
      try { 
        periodFormatter0.print(period0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.PeriodFormatterBuilder$Composite", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "NoSeconds";
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatterBuilder.Separator periodFormatterBuilder_Separator0 = new PeriodFormatterBuilder.Separator("NoSeconds", "NoSeconds", stringArray0, periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, true, true);
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Separator0, periodFormatterBuilder_Literal0);
      // Undeclared exception!
      try { 
        periodFormatter0.print((ReadablePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period must not be null
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      PeriodType periodType0 = PeriodType.minutes();
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, (PeriodParser) null, locale0, periodType0);
      // Undeclared exception!
      try { 
        periodFormatter0.parsePeriod("Tb3]P$@6@OT");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Parsing not supported
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      // Undeclared exception!
      try { 
        periodFormatter0.parseMutablePeriod((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.PeriodFormatterBuilder$Literal", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Period must not be null";
      stringArray0[1] = "Period must not be null";
      stringArray0[2] = "Period must not be null";
      stringArray0[3] = "Period must not be null";
      stringArray0[4] = "";
      stringArray0[5] = "Period must not be null";
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PeriodFormatterBuilder.Composite periodFormatterBuilder_Composite0 = new PeriodFormatterBuilder.Composite(linkedList0);
      PeriodFormatterBuilder.Separator periodFormatterBuilder_Separator0 = new PeriodFormatterBuilder.Separator("Period must not be null", "Period must not be null", stringArray0, periodFormatterBuilder_Composite0, periodFormatterBuilder_Composite0, false, true);
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Separator0, periodFormatterBuilder_Composite0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(1601L, 430L);
      // Undeclared exception!
      try { 
        periodFormatter0.parseInto(mutablePeriod0, "", 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.PeriodFormatterBuilder$Composite", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      // Undeclared exception!
      try { 
        periodFormatter0.parseMutablePeriod("Paysingenotksupported");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Paysingenotksupported\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PeriodFormatterBuilder.Composite periodFormatterBuilder_Composite0 = new PeriodFormatterBuilder.Composite(linkedList0);
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodFormatterBuilder_Composite0);
      PeriodPrinter periodPrinter0 = periodFormatter0.getPrinter();
      assertNull(periodPrinter0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, (PeriodParser) null);
      PeriodParser periodParser0 = periodFormatter0.getParser();
      assertNull(periodParser0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      Locale locale0 = Locale.ROOT;
      PeriodType periodType0 = PeriodType.yearWeekDay();
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, locale0, periodType0);
      Locale locale1 = periodFormatter0.getLocale();
      assertEquals("", locale1.getISO3Country());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, (PeriodParser) null);
      // Undeclared exception!
      try { 
        periodFormatter0.parseMutablePeriod("+NMX}");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Parsing not supported
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodType periodType0 = PeriodType.dayTime();
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, locale0, periodType0);
      // Undeclared exception!
      try { 
        periodFormatter0.parsePeriod("Parsing not supported");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Parsing not supported\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("");
      Locale locale0 = Locale.FRENCH;
      PeriodType periodType0 = PeriodType.hours();
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, locale0, periodType0);
      MutablePeriod mutablePeriod0 = periodFormatter0.parseMutablePeriod("");
      // Undeclared exception!
      try { 
        periodFormatter0.parseInto(mutablePeriod0, (String) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.PeriodFormatterBuilder$Literal", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("F`h3");
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      // Undeclared exception!
      try { 
        periodFormatter0.parseMutablePeriod("nvC\"XY0u7Uh1'\"opNh");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"nvC\"XY0u7Uh1'\"opNh\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      PeriodFormatterBuilder.Composite periodFormatterBuilder_Composite0 = new PeriodFormatterBuilder.Composite(linkedList0);
      Locale locale0 = Locale.US;
      PeriodType periodType0 = PeriodType.weeks();
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Composite0, periodFormatterBuilder_Composite0, locale0, periodType0);
      // Undeclared exception!
      try { 
        periodFormatter0.parseInto((ReadWritablePeriod) null, "BASE_GROUPED_IDS", 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period must not be null
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("CYpszK+>S");
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodFormatterBuilder_Literal0);
      // Undeclared exception!
      try { 
        periodFormatter0.printTo((Writer) charArrayWriter0, (ReadablePeriod) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      Locale locale0 = Locale.ROOT;
      PeriodType periodType0 = PeriodType.yearWeekDay();
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, locale0, periodType0);
      PeriodFormatter periodFormatter1 = periodFormatter0.withParseType(periodType0);
      assertSame(periodFormatter1, periodFormatter0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PeriodType periodType0 = PeriodType.time();
      Locale locale0 = Locale.forLanguageTag("");
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, (PeriodParser) null, locale0, periodType0);
      Locale locale1 = new Locale("");
      PeriodFormatter periodFormatter1 = periodFormatter0.withLocale(locale1);
      assertSame(periodFormatter1, periodFormatter0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("");
      Locale locale0 = Locale.JAPANESE;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0);
      PeriodFormatter periodFormatter1 = periodFormatter0.withLocale(locale0);
      periodFormatter1.withLocale((Locale) null);
      assertNotSame(periodFormatter1, periodFormatter0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      Locale locale0 = Locale.ROOT;
      PeriodType periodType0 = PeriodType.yearWeekDay();
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, locale0, periodType0);
      boolean boolean0 = periodFormatter0.isParser();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PeriodType periodType0 = PeriodType.time();
      Locale locale0 = Locale.forLanguageTag("");
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, (PeriodParser) null, locale0, periodType0);
      boolean boolean0 = periodFormatter0.isParser();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      Locale locale0 = Locale.ROOT;
      PeriodType periodType0 = PeriodType.yearWeekDay();
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, locale0, periodType0);
      boolean boolean0 = periodFormatter0.isPrinter();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodFormatterBuilder_Literal0);
      boolean boolean0 = periodFormatter0.isPrinter();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("q;");
      Locale locale0 = Locale.CHINESE;
      PeriodType periodType0 = PeriodType.seconds();
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, locale0, periodType0);
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
      String string0 = periodFormatter0.print(period0);
      assertEquals("q;", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatterBuilder.Separator periodFormatterBuilder_Separator0 = new PeriodFormatterBuilder.Separator("", "", (String[]) null, (PeriodPrinter) null, periodFormatterBuilder_Literal0, false, true);
      Locale locale0 = Locale.CHINESE;
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodFormatterBuilder_Separator0, locale0, periodType0);
      // Undeclared exception!
      try { 
        periodFormatter0.parsePeriod("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.PeriodFormatterBuilder$Separator", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      Locale locale0 = Locale.ROOT;
      PeriodType periodType0 = PeriodType.yearWeekDay();
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, locale0, periodType0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1042L));
      int int0 = periodFormatter0.parseInto(mutablePeriod0, "!N=", (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "G;nMI!`ad-U";
      stringArray0[1] = "HbOOQ#(6-v$cLr9b1";
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatterBuilder.Separator periodFormatterBuilder_Separator0 = new PeriodFormatterBuilder.Separator("HbOOQ#(6-v$cLr9b1", "G;nMI!`ad-U", stringArray0, periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, false, false);
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Separator0, periodFormatterBuilder_Literal0);
      PeriodType periodType0 = periodFormatter0.getParseType();
      assertNull(periodType0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = new PeriodFormatterBuilder.Literal("q;");
      Locale locale0 = Locale.CHINESE;
      PeriodType periodType0 = PeriodType.seconds();
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, locale0, periodType0);
      MockFileWriter mockFileWriter0 = new MockFileWriter("q;");
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 1341, (-523), 1341);
      periodFormatter0.printTo((Writer) mockFileWriter0, (ReadablePeriod) mutablePeriod0);
      assertTrue(periodFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      Locale locale0 = Locale.ROOT;
      PeriodType periodType0 = PeriodType.yearWeekDay();
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, locale0, periodType0);
      StringBuffer stringBuffer0 = new StringBuffer();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1042L));
      periodFormatter0.printTo(stringBuffer0, (ReadablePeriod) mutablePeriod0);
      assertEquals("", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "(@_~3gp3";
      PeriodFormatterBuilder.Literal periodFormatterBuilder_Literal0 = PeriodFormatterBuilder.Literal.EMPTY;
      PeriodFormatterBuilder.Separator periodFormatterBuilder_Separator0 = new PeriodFormatterBuilder.Separator("NoSeconds", "(@_~3gp3", stringArray0, periodFormatterBuilder_Literal0, periodFormatterBuilder_Literal0, true, true);
      PeriodType periodType0 = PeriodType.dayTime();
      Locale locale0 = Locale.GERMANY;
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodFormatterBuilder_Literal0, periodFormatterBuilder_Separator0, locale0, periodType0);
      StringBuffer stringBuffer0 = new StringBuffer(17);
      // Undeclared exception!
      try { 
        periodFormatter0.printTo(stringBuffer0, (ReadablePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period must not be null
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }
}