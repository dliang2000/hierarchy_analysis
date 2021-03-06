/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 04:20:14 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BasicChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJEraDateTimeField;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.GJYearOfEraDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.ISOYearOfEraDateTimeField;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GJYearOfEraDateTimeField_ESTest extends GJYearOfEraDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      DateTimeField dateTimeField0 = LenientDateTimeField.getInstance(gJMonthOfYearDateTimeField0, copticChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, (-5));
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(offsetDateTimeField0, copticChronology0);
      int int0 = gJYearOfEraDateTimeField0.get(1);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.secondOfMinute();
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dateTimeField0, copticChronology0);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField1, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.set(1656L, 1);
      assertEquals(1656L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.minuteOfDay();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.set((long) 1, 1);
      assertEquals((-68339999L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.secondOfMinute();
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dateTimeField0, copticChronology0);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField1, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.roundFloor(1656L);
      assertEquals(1000L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.year();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.roundFloor(1);
      assertEquals((-9662400000L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.roundCeiling((-1376L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.minuteOfDay();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.roundCeiling((-68339999L));
      assertEquals((-68280000L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(iSOYearOfEraDateTimeField0, ethiopicChronology0);
      long long0 = gJYearOfEraDateTimeField0.remainder(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(iSOYearOfEraDateTimeField0, (BasicChronology) null);
      long long0 = gJYearOfEraDateTimeField0.remainder(31557600000L);
      assertEquals(21600000L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.centuryOfEra();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.remainder(1);
      assertEquals((-17999999L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.millisOfSecond();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.getDifferenceAsLong(1, 0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.millisOfSecond();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.getDifferenceAsLong((-903), 1);
      assertEquals((-904L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.year();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      int int0 = gJYearOfEraDateTimeField0.getDifference(21859200000L, 1924L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(iSOYearOfEraDateTimeField0, (BasicChronology) null);
      int int0 = gJYearOfEraDateTimeField0.getDifference(85929660000000L, 31557600000L);
      assertEquals(2722, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(iSOYearOfEraDateTimeField0, (BasicChronology) null);
      int int0 = gJYearOfEraDateTimeField0.getDifference(1, 31557600000L);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.year();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      YearMonth yearMonth0 = YearMonth.now((Chronology) copticChronology0);
      int[] intArray0 = new int[7];
      int[] intArray1 = gJYearOfEraDateTimeField0.addWrapField((ReadablePartial) yearMonth0, 0, intArray0, (-1533));
      assertArrayEquals(new int[] {(-1533), 1, 0, 0, 0, 0, 0}, intArray1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.addWrapField(0L, (-2084));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.addWrapField(0L, (-2084));
      assertEquals(14400000L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.addWrapField(0L, (-2084));
      assertEquals((-21171600000L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.add((long) 1, (long) 1);
      assertEquals(3600001L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.yearOfCentury();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.add((long) 543, (-112L));
      assertEquals((-3534450147457L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType((-61), (-1));
      IslamicChronology islamicChronology0 = new IslamicChronology(copticChronology0, copticChronology0, islamicChronology_LeapYearPatternType0);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, islamicChronology0);
      long long0 = gJYearOfEraDateTimeField0.add(0L, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.add((long) (byte) (-34), 1613);
      assertEquals(5806799966L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyear();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.add((-1L), (-1));
      assertEquals((-31449600001L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.era();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.set((long) 1, (-350));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -350 for yearOfEra must be in the range [1,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(iSOYearOfEraDateTimeField0, (BasicChronology) null);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.set((long) 292278993, 365);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJYearOfEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.era();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.roundFloor(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(iSOYearOfEraDateTimeField0, (BasicChronology) null);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.getRangeDurationField();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJYearOfEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(ethiopicChronology0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 1);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(gJEraDateTimeField0, gregorianChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.getDifferenceAsLong(1, 1801L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.era();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.getDifference(0, (-131636188800000L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The subtrahend instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField((BasicChronology) null);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(gJEraDateTimeField0, julianChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.get((-773));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.minuteOfDay();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.get((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.millisOfSecond();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      YearMonth yearMonth0 = YearMonth.now();
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.addWrapField((ReadablePartial) yearMonth0, 0, (int[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.centuryOfEra();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.addWrapField((ReadablePartial) partial0, 604800, intArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 604800
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.year();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.add(0L, (-4133L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.era();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.add(0L, 0L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.add((long) (-2084), (-4294967296L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: -4294967296
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.year();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.add((-1316L), 100000000000000000L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 100000000000000000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyear();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.add((-115L), (-3529));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = null;
      try {
        gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField((DateTimeField) null, ethiopicChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.joda.time.field.DecoratedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.era();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.set(0L, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      int int0 = gJYearOfEraDateTimeField0.get((byte)0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.era();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      int int0 = gJYearOfEraDateTimeField0.get(0L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.era();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.addWrapField((-525L), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MIN > MAX
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.minuteOfDay();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.roundCeiling(1);
      assertEquals(60000L, long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.era();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      int int0 = gJYearOfEraDateTimeField0.getMaximumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(islamicChronology0);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(gJEraDateTimeField0, islamicChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.getDifference(1, 1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      DurationField durationField0 = gJYearOfEraDateTimeField0.getRangeDurationField();
      assertFalse(durationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.era();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.addWrapField((ReadablePartial) null, 1, intArray0, 1942);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MIN > MAX
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.add((long) (byte)0, (long) (byte)0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      Object object0 = new Object();
      CopticChronology copticChronology0 = new CopticChronology(ethiopicChronology0, object0, 1);
      DateTimeField dateTimeField0 = copticChronology0.era();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, ethiopicChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.remainder(1840L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (EthiopicChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.era();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      int int0 = gJYearOfEraDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.minuteOfDay();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.roundFloor(1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.yearOfCentury();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.getDifferenceAsLong((-112L), 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.era();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.add((long) 1, 584);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }
}
