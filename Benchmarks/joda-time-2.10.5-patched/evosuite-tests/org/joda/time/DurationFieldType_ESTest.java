/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 06:39:58 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Seconds;
import org.joda.time.UTCDateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DurationFieldType_ESTest extends DurationFieldType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      assertEquals("days", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      assertEquals("minutes", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      String string0 = durationFieldType0.getName();
      assertEquals("seconds", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalTime localTime0 = new LocalTime((Chronology) ethiopicChronology0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Hours hours0 = period0.toStandardHours();
      Seconds seconds0 = hours0.toStandardSeconds();
      Days days0 = seconds0.toStandardDays();
      DurationFieldType durationFieldType0 = days0.getFieldType();
      String string0 = durationFieldType0.toString();
      assertEquals("days", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      boolean boolean0 = durationFieldType0.isSupported(buddhistChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      DurationField durationField0 = durationFieldType0.getField(julianChronology0);
      assertEquals("hours", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalTime localTime0 = new LocalTime((Chronology) ethiopicChronology0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Hours hours0 = period0.toStandardHours();
      Seconds seconds0 = hours0.toStandardSeconds();
      Days days0 = seconds0.toStandardDays();
      DurationFieldType durationFieldType0 = days0.getFieldType();
      DurationField durationField0 = durationFieldType0.getField(ethiopicChronology0);
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      DurationField durationField0 = durationFieldType0.getField(buddhistChronology0);
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      DurationField durationField0 = durationFieldType0.getField(julianChronology0);
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      DurationField durationField0 = durationFieldType0.getField(julianChronology0);
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      LocalTime localTime0 = new LocalTime((Chronology) ethiopicChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      boolean boolean0 = localTime0.isSupported(dateTimeFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      UTCDateTimeZone uTCDateTimeZone0 = (UTCDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) uTCDateTimeZone0);
      boolean boolean0 = durationFieldType0.isSupported(buddhistChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      boolean boolean0 = durationFieldType0.isSupported(julianChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DurationField durationField0 = durationFieldType0.getField(iSOChronology0);
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[3];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      durationFieldTypeArray0[2] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [centuries, centuries, centuries]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DurationField durationField0 = durationFieldType0.getField(julianChronology0);
      assertEquals("halfdays", durationField0.getName());
  }
}