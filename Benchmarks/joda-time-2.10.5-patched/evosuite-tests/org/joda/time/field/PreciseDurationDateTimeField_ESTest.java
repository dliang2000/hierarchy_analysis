/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 05:35:07 GMT 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.PreciseDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PreciseDurationDateTimeField_ESTest extends PreciseDurationDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      long long0 = dateTimeField0.remainder(1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      long long0 = dateTimeField0.roundCeiling((-389L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      long long0 = dateTimeField0.roundHalfFloor(1);
      assertEquals((-259200000L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      long long0 = dateTimeField0.set((long) 1, 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      long long0 = dateTimeField0.set((-5168L), 1);
      assertEquals((-86399999L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      long long0 = dateTimeField0.roundFloor(3972L);
      assertEquals(3972L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      long long0 = dateTimeField0.roundCeiling(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      int int0 = dateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      // Undeclared exception!
      try { 
        dateTimeField0.set((long) 1, 4783);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      // Undeclared exception!
      try { 
        dateTimeField0.roundCeiling(1);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      // Undeclared exception!
      try { 
        dateTimeField0.remainder((-389L));
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      // Undeclared exception!
      try { 
        dateTimeField0.isLenient();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      // Undeclared exception!
      try { 
        dateTimeField0.getMinimumValue();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      // Undeclared exception!
      try { 
        dateTimeField0.getDurationField();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      long long0 = dateTimeField0.roundCeiling((-389L));
      assertEquals((-389L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      long long0 = dateTimeField0.roundCeiling(1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      long long0 = dateTimeField0.roundFloor(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      long long0 = dateTimeField0.roundFloor((-389L));
      assertEquals((-389L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      PreciseDateTimeField preciseDateTimeField0 = (PreciseDateTimeField)dateTimeFieldType0.getField(iSOChronology0);
      long long0 = preciseDateTimeField0.getUnitMillis();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      int int0 = dateTimeField0.getMinimumValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      boolean boolean0 = dateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      long long0 = dateTimeField0.remainder(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      long long0 = dateTimeField0.remainder((-1583L));
      assertEquals(43198417L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      long long0 = dateTimeField0.roundHalfFloor(2070L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1923);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.seconds();
      PreciseDateTimeField preciseDateTimeField0 = null;
      try {
        preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The effective range must be at least 2
         //
         verifyException("org.joda.time.field.PreciseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.weekyears();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      PreciseDateTimeField preciseDateTimeField0 = null;
      try {
        preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unit duration field must be precise
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.eras();
      PreciseDateTimeField preciseDateTimeField0 = null;
      try {
        preciseDateTimeField0 = new PreciseDateTimeField(dateTimeFieldType0, durationField0, durationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The unit milliseconds must be at least 1
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      // Undeclared exception!
      try { 
        dateTimeField0.set(345600000L, (-2145710332));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2145710332 for weekOfWeekyear must be in the range [1,52]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      DurationField durationField0 = dateTimeField0.getDurationField();
      assertTrue(durationField0.isPrecise());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      PreciseDateTimeField preciseDateTimeField0 = (PreciseDateTimeField)dateTimeFieldType0.getField(iSOChronology0);
      int int0 = preciseDateTimeField0.getMaximumValueForSet(1, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      PreciseDateTimeField preciseDateTimeField0 = (PreciseDateTimeField)dateTimeFieldType0.getField(iSOChronology0);
      assertEquals(0, preciseDateTimeField0.getMinimumValue());
      
      preciseDateTimeField0.set(0L, 0);
      assertEquals(1L, preciseDateTimeField0.getUnitMillis());
  }
}
