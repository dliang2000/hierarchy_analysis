/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 05:42:49 GMT 2020
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FixedDateTimeZone_ESTest extends FixedDateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("'$=,:o", "'$=,:o", (-2842), (-2842));
      FixedDateTimeZone fixedDateTimeZone1 = new FixedDateTimeZone("'$=,:o", "org/joda/time/tz/data", 3, (-2842));
      boolean boolean0 = fixedDateTimeZone0.equals(fixedDateTimeZone1);
      assertFalse(boolean0);
      assertFalse(fixedDateTimeZone1.equals((Object)fixedDateTimeZone0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("'MnH,c:R#/gL7r8a", "'MnH,c:R#/gL7r8a", 5, 5);
      FixedDateTimeZone fixedDateTimeZone1 = new FixedDateTimeZone("'MnH,c:R#/gL7r8a", "org/joda/time/tz/data", 5, (-88516351));
      boolean boolean0 = fixedDateTimeZone0.equals(fixedDateTimeZone1);
      assertFalse(fixedDateTimeZone1.equals((Object)fixedDateTimeZone0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("", "", 0, 0);
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      assertEquals("java.util.SimpleTimeZone[id=,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", timeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("6f%!`m*V\"", "6f%!`m*V\"", (-546), 0);
      long long0 = fixedDateTimeZone0.previousTransition(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("'$=,:o", "'$=,:o", (-2842), (-2842));
      long long0 = fixedDateTimeZone0.previousTransition((-2842));
      assertEquals((-2842L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("P*[;z", "P*[;z", 0, 0);
      long long0 = fixedDateTimeZone0.nextTransition(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("dX|Y*Sa~1|AT$+y", "dX|Y*Sa~1|AT$+y", 30, 30);
      long long0 = fixedDateTimeZone0.nextTransition(30);
      assertEquals(30L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("", (String) null, 0, 0);
      int int0 = fixedDateTimeZone0.getStandardOffset(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("", "", 0, 2145);
      int int0 = fixedDateTimeZone0.getStandardOffset(0);
      assertEquals(2145, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("+", "+", 0, 0);
      int int0 = fixedDateTimeZone0.getOffsetFromLocal((-1589L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("Ndp;]n9", "", (-1397), (-1363));
      int int0 = fixedDateTimeZone0.getOffsetFromLocal((-1397));
      assertEquals((-1397), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("GMT", (String) null, 0, 511);
      int int0 = fixedDateTimeZone0.getOffset((long) 511);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("-L43j{G1002>\"y;G", "-L43j{G1002>\"y;G", 37, (-1595));
      int int0 = fixedDateTimeZone0.getOffset((-222L));
      assertEquals(37, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("CT+L&qBfO,/%G?3@c", "CT+L&qBfO,/%G?3@c", 236548278, 236548278);
      String string0 = fixedDateTimeZone0.getNameKey(236548278);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("", "", 0, 2145);
      String string0 = fixedDateTimeZone0.getNameKey((-5L));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = null;
      try {
        fixedDateTimeZone0 = new FixedDateTimeZone((String) null, (String) null, 31, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Id must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("+)ebGV.", "QVG|-iMRA8V-q", (-3687), (-3687));
      FixedDateTimeZone fixedDateTimeZone1 = new FixedDateTimeZone("+)ebGV.", "-aI37PH", (-1), (-1));
      boolean boolean0 = fixedDateTimeZone0.equals(fixedDateTimeZone1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("+", "+", (-12437164), (-12437164));
      FixedDateTimeZone fixedDateTimeZone1 = new FixedDateTimeZone("-", "org/joda/time/tz/data", (-12437164), (-2786));
      boolean boolean0 = fixedDateTimeZone0.equals(fixedDateTimeZone1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("3'$=,!:o", "3'$=,!:o", (-2842), (-203));
      FixedDateTimeZone fixedDateTimeZone1 = new FixedDateTimeZone("3'$=,!:o", "org/joda/time/tz/data", (-2842), (-203));
      boolean boolean0 = fixedDateTimeZone0.equals(fixedDateTimeZone1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("3'$=,!:o", "3'$=,!:o", (-2842), (-203));
      boolean boolean0 = fixedDateTimeZone0.equals(fixedDateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("3'$=,!:o", "3'$=,!:o", (-2842), (-203));
      boolean boolean0 = fixedDateTimeZone0.equals("3'$=,!:o");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("/R)*o2", "/R)*o2", 64, 64);
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      assertEquals("java.util.SimpleTimeZone[id=/R)*o2,offset=64,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", timeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("-*Tp=s", "-*Tp=s", 28, 28);
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      assertEquals("GMT", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("+*Tp=s", "+*Tp=s", 1000, 1000);
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      assertEquals("GMT", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("3'$=,!:o", "3'$=,!:o", (-2842), (-203));
      TimeZone timeZone0 = fixedDateTimeZone0.toTimeZone();
      assertEquals((-2842), timeZone0.getRawOffset());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("3'$=,!:o", "3'$=,!:o", (-2842), (-203));
      long long0 = fixedDateTimeZone0.previousTransition(205L);
      assertEquals(205L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("3'$=,!:o", "3'$=,!:o", (-2842), (-203));
      fixedDateTimeZone0.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("org.joda.time.tz.FixedDateTimeZone", (String) null, 14, 14);
      boolean boolean0 = fixedDateTimeZone0.isFixed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("org.joda.time.tz.FixedDateTimeZone", (String) null, 14, 14);
      String string0 = fixedDateTimeZone0.getNameKey(0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("3'$=,!:o", "3'$=,!:o", (-2842), (-203));
      int int0 = fixedDateTimeZone0.getStandardOffset((-203));
      assertEquals((-203), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("org.joda.time.tz.FixedDateTimeZone", (String) null, 14, 14);
      int int0 = fixedDateTimeZone0.getOffsetFromLocal(0L);
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("<@GtQ2@2:GR/_K", "<@GtQ2@2:GR/_K", 0, 0);
      long long0 = fixedDateTimeZone0.nextTransition((-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("3'$=,!:o", "3'$=,!:o", (-2842), (-203));
      int int0 = fixedDateTimeZone0.getOffset((long) (-203));
      assertEquals((-2842), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = new FixedDateTimeZone("3'$=,!:o", "3'$=,!:o", 6, 6);
      FixedDateTimeZone fixedDateTimeZone1 = new FixedDateTimeZone("3'$=,!:o", "org/joda/time/tz/data", 3, 6);
      boolean boolean0 = fixedDateTimeZone0.equals(fixedDateTimeZone1);
      assertFalse(boolean0);
      assertFalse(fixedDateTimeZone1.equals((Object)fixedDateTimeZone0));
  }
}