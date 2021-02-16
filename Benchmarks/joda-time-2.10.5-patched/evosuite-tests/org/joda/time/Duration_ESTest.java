/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 05:04:30 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.RoundingMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.Seconds;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Duration_ESTest extends Duration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Duration duration0 = Duration.standardDays(60L);
      Duration duration1 = duration0.withMillis(1000000000000L);
      assertEquals(5184000000L, duration0.getMillis());
      assertEquals(16666666L, duration1.getStandardMinutes());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = duration0.withMillis(543);
      assertEquals(543L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Duration duration0 = Duration.standardDays(4L);
      Duration duration1 = duration0.withDurationAdded((ReadableDuration) duration0, 0);
      assertEquals(345600000L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Duration duration0 = Duration.millis(1168L);
      Duration duration1 = duration0.ZERO.withDurationAdded((ReadableDuration) duration0, 1);
      assertEquals(1L, duration1.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Duration duration0 = Duration.standardDays(604800000L);
      Duration duration1 = duration0.withDurationAdded(604800000L, 1);
      assertEquals(870912010080L, duration1.getStandardMinutes());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-1726L));
      Duration duration1 = duration0.ZERO.withDurationAdded((-3302L), (-2662));
      assertEquals((-149126400L), duration0.getStandardSeconds());
      assertEquals(8789924L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Seconds seconds0 = duration0.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Duration duration0 = Duration.millis((-3334L));
      Seconds seconds0 = duration0.toStandardSeconds();
      assertEquals((-3), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Duration duration0 = Duration.standardDays(4L);
      Minutes minutes0 = duration0.toStandardMinutes();
      assertEquals(345600000L, duration0.getMillis());
      assertEquals(5760, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-1350L));
      Minutes minutes0 = duration0.toStandardMinutes();
      assertEquals((-22), minutes0.getMinutes());
      assertEquals((-22L), duration0.getStandardMinutes());
      assertEquals((-1350L), duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-5603L));
      Duration duration1 = duration0.negated();
      Hours hours0 = duration1.toStandardHours();
      assertEquals(20170800L, duration1.getStandardSeconds());
      assertEquals(5603, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-1726L));
      Hours hours0 = duration0.toStandardHours();
      assertEquals((-41424L), duration0.getStandardHours());
      assertEquals((-149126400000L), duration0.getMillis());
      assertEquals((-41424), hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = duration0.withMillis((-9223372036854775808L));
      Duration duration2 = duration1.dividedBy(31557600000L);
      Days days0 = duration2.toStandardDays();
      assertEquals((-106751991167L), duration1.getStandardDays());
      assertEquals((-3), days0.getDays());
      assertEquals((-292271L), duration2.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = duration0.toDuration();
      assertEquals(0L, duration1.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-240L));
      Duration duration1 = duration0.toDuration();
      assertEquals((-20736000000L), duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(63072000000L);
      assertEquals(63072000000L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-20174400L));
      assertEquals((-20174400000L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-5820L));
      Duration duration1 = duration0.plus((ReadableDuration) duration0);
      assertEquals((-41904000000L), duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = Duration.standardHours(60000L);
      Duration duration2 = duration1.plus((ReadableDuration) duration0);
      assertSame(duration2, duration1);
      assertEquals(3600000L, duration2.getStandardMinutes());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-1726L));
      Duration duration1 = duration0.plus(1898L);
      assertEquals((-149126398102L), duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Duration duration0 = Duration.millis((-3334L));
      Duration duration1 = duration0.ZERO.plus(0L);
      assertEquals((-3L), duration0.getStandardSeconds());
      assertNotSame(duration0, duration1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Duration duration0 = Duration.parse((String) null);
      assertEquals(0L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = duration0.ZERO.negated();
      assertNotSame(duration0, duration1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = Period.hours((-2077));
      Duration duration0 = period0.toStandardDuration();
      Duration duration1 = duration0.multipliedBy((-2077));
      Duration duration2 = duration1.negated();
      assertEquals((-258835740L), duration2.getStandardMinutes());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(2139L);
      Duration duration1 = duration0.negated();
      Duration duration2 = duration1.multipliedBy(2139L);
      assertEquals((-4575321L), duration2.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Duration duration0 = Duration.standardDays(3599979L);
      Duration duration1 = duration0.minus((ReadableDuration) null);
      assertEquals(311038185600L, duration1.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Duration duration0 = Duration.standardDays(15778476000L);
      Duration duration1 = duration0.minus(15778476000L);
      assertEquals(22721005177025L, duration1.getStandardMinutes());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Duration duration0 = Duration.millis(1191L);
      Duration duration1 = duration0.minus(3L);
      assertEquals(1188L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = duration0.withMillis((-9223372036854775808L));
      Duration duration2 = duration1.minus(0L);
      assertSame(duration2, duration1);
      assertEquals((-2562047788015L), duration2.getStandardHours());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Duration duration0 = Duration.millis(31557600000L);
      assertEquals(525960L, duration0.getStandardMinutes());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(0L);
      long long0 = duration0.getStandardSeconds();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes((-3920L));
      Duration duration1 = duration0.dividedBy((-3920L));
      long long0 = duration1.getStandardSeconds();
      assertEquals((-235200L), duration0.getStandardSeconds());
      assertEquals(60L, long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Duration duration0 = new Duration((Object) null);
      long long0 = duration0.getStandardMinutes();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-1726L));
      long long0 = duration0.getStandardMinutes();
      assertEquals((-2485440L), long0);
      assertEquals((-149126400L), duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = Duration.standardDays(1917L);
      Duration duration2 = duration0.minus((ReadableDuration) duration1);
      long long0 = duration2.getStandardHours();
      assertEquals((-46008L), long0);
      assertEquals(165628800000L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-4997L));
      long long0 = duration0.getStandardDays();
      assertEquals(0L, long0);
      assertEquals((-4997000L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Duration duration0 = Duration.standardDays(604800000L);
      long long0 = duration0.getStandardDays();
      assertEquals(604800000L, long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(31557600000L);
      RoundingMode roundingMode0 = RoundingMode.DOWN;
      Duration duration1 = duration0.dividedBy(1000L, roundingMode0);
      assertEquals(1893456000000L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Duration duration0 = Duration.standardDays(3599979L);
      RoundingMode roundingMode0 = RoundingMode.UP;
      Duration duration1 = duration0.dividedBy((-1267L), roundingMode0);
      assertEquals((-245491859L), duration1.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-240L));
      Duration duration1 = duration0.dividedBy((-240L));
      assertEquals(86400000L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Duration duration0 = Duration.millis((-1823L));
      Duration duration1 = duration0.dividedBy((-151L));
      assertEquals(12L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-2734L));
      Duration duration1 = duration0.abs();
      assertEquals(9842400000L, duration1.getMillis());
      assertEquals((-9842400000L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(0L);
      Duration duration1 = duration0.abs();
      assertSame(duration1, duration0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Duration duration0 = Duration.standardDays(3599979L);
      // Undeclared exception!
      try { 
        duration0.withDurationAdded((ReadableDuration) duration0, (-2135282035));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 311038185600000 * -2135282035
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(31557600000L);
      // Undeclared exception!
      try { 
        duration0.withDurationAdded(31557600000L, (-1073741823));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 31557600000 * -1073741823
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Duration duration0 = Duration.standardDays(604800000L);
      // Undeclared exception!
      try { 
        duration0.toStandardSeconds();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 52254720000000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes((-42521587200000L));
      // Undeclared exception!
      try { 
        duration0.toStandardMinutes();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -42521587200000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Duration duration0 = Duration.millis(1191L);
      Duration duration1 = Duration.standardHours(3L);
      Duration duration2 = duration0.withDurationAdded((ReadableDuration) duration1, (-1073741823));
      // Undeclared exception!
      try { 
        duration2.toStandardHours();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -3221225468
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Duration duration0 = Duration.standardDays(15778476000L);
      // Undeclared exception!
      try { 
        duration0.toStandardDays();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 15778476000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        Duration.standardSeconds((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * 1000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        Duration.standardMinutes((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * 60000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        Duration.standardHours((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * 3600000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      // Undeclared exception!
      try { 
        Duration.standardDays((-12219292800000L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -12219292800000 * 86400000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Duration duration0 = Duration.millis((-9223372036854775808L));
      // Undeclared exception!
      try { 
        duration0.plus((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -9223372036854775808 + -9223372036854775808
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Duration duration0 = Duration.millis((-12219292800000L));
      // Undeclared exception!
      try { 
        duration0.multipliedBy((-12219292800000L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -12219292800000 * -12219292800000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Duration duration0 = Duration.standardHours(10080L);
      // Undeclared exception!
      try { 
        duration0.minus((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * -1
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Duration duration0 = new Duration(0L);
      // Undeclared exception!
      try { 
        duration0.dividedBy((-1350L), (RoundingMode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Duration duration0 = new Duration(0L);
      // Undeclared exception!
      try { 
        duration0.dividedBy(0L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = duration0.withMillis((-9223372036854775808L));
      // Undeclared exception!
      try { 
        duration1.dividedBy((-1L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 / -1
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Object object0 = new Object();
      Duration duration0 = null;
      try {
        duration0 = new Duration(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No duration converter found for type: java.lang.Object
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = duration0.ZERO.withDurationAdded(60000L, (-2126008810));
      assertEquals((-2126008810L), duration1.getStandardMinutes());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-1350L));
      Duration duration1 = duration0.withDurationAdded(0L, (-1));
      assertEquals((-1350L), duration1.getStandardSeconds());
      assertSame(duration1, duration0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-1726L));
      long long0 = duration0.getStandardDays();
      assertEquals((-1726L), long0);
      assertEquals((-149126400000L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Duration duration0 = Duration.standardDays(3599979L);
      long long0 = duration0.getStandardMinutes();
      assertEquals(5183969760L, long0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Duration duration0 = Duration.standardDays(3599979L);
      long long0 = duration0.getStandardHours();
      assertEquals(86399496L, long0);
      assertEquals(311038185600L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-5603L));
      long long0 = duration0.getStandardSeconds();
      assertEquals((-20170800L), long0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Duration duration0 = Duration.millis(1191L);
      Duration duration1 = duration0.abs();
      assertEquals(1L, duration0.getStandardSeconds());
      assertEquals(1191L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Duration duration0 = new Duration(2592000000L, 31557600000L);
      Duration duration1 = duration0.withMillis((-9223372036854775808L));
      // Undeclared exception!
      try { 
        duration1.abs();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Negation of this duration would overflow
         //
         verifyException("org.joda.time.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Duration duration0 = Duration.millis(1168L);
      RoundingMode roundingMode0 = RoundingMode.CEILING;
      Duration duration1 = duration0.dividedBy(1L, roundingMode0);
      assertEquals(1168L, duration1.getMillis());
      assertSame(duration1, duration0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      RoundingMode roundingMode0 = RoundingMode.CEILING;
      Duration duration1 = duration0.dividedBy(1824L, roundingMode0);
      assertNotSame(duration1, duration0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-2734L));
      Duration duration1 = duration0.dividedBy((long) 1);
      assertSame(duration1, duration0);
      assertEquals((-9842400000L), duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = duration0.dividedBy(31557600000L);
      assertNotSame(duration1, duration0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Duration duration0 = Duration.millis(1191L);
      Duration duration1 = duration0.multipliedBy(1);
      assertSame(duration1, duration0);
      assertEquals(1L, duration1.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-1726L));
      Duration duration1 = duration0.ZERO.multipliedBy(3600000L);
      assertEquals((-149126400L), duration0.getStandardSeconds());
      assertFalse(duration1.equals((Object)duration0));
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = duration0.ZERO.minus((ReadableDuration) null);
      assertEquals(0L, duration1.getStandardDays());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = duration0.plus((ReadableDuration) null);
      assertEquals(0L, duration1.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = duration0.withDurationAdded((ReadableDuration) duration0, 543);
      assertSame(duration1, duration0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Duration duration0 = Duration.millis((-3334L));
      Duration duration1 = duration0.withDurationAdded((ReadableDuration) null, (-2282));
      assertEquals((-3L), duration1.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Duration duration0 = new Duration(0L);
      Duration duration1 = duration0.withDurationAdded((-1804L), 0);
      assertSame(duration1, duration0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Duration duration0 = new Duration((Object) null);
      Duration duration1 = duration0.withMillis(0L);
      assertSame(duration1, duration0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Duration duration0 = Duration.millis(0L);
      assertEquals(0L, duration0.getStandardMinutes());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(0L);
      RoundingMode roundingMode0 = RoundingMode.CEILING;
      // Undeclared exception!
      try { 
        duration0.ZERO.dividedBy(0L, roundingMode0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(0L);
      assertEquals(0L, duration0.getStandardDays());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Duration duration0 = Duration.standardHours(0L);
      assertEquals(0L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Duration duration0 = Duration.standardHours(365L);
      Days days0 = duration0.toStandardDays();
      assertEquals(1314000000L, duration0.getMillis());
      assertEquals(15, days0.getDays());
      assertEquals(15L, duration0.getStandardDays());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Duration duration0 = Duration.standardDays(0L);
      assertEquals(0L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Minutes minutes0 = duration0.ZERO.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Duration duration0 = new Duration((ReadableInstant) null, (ReadableInstant) null);
      long long0 = duration0.getStandardHours();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = duration0.minus(0L);
      assertSame(duration1, duration0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Duration duration0 = Duration.standardDays(3599979L);
      Duration duration1 = duration0.plus(60000L);
      assertEquals(311038185660000L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Days days0 = duration0.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      Duration duration0 = Duration.standardDays(3599979L);
      Duration duration1 = duration0.toDuration();
      assertEquals(311038185600L, duration1.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      Duration duration0 = null;
      try {
        duration0 = new Duration((-9223372036854775808L), 1098L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 1098 - -9223372036854775808
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Duration duration0 = Duration.parse("PT1000S");
      assertEquals(0L, duration0.getStandardDays());
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(1000L);
      duration0.toStandardHours();
      assertEquals(1000000L, duration0.getMillis());
      assertEquals(0L, duration0.getStandardHours());
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      Duration duration0 = Duration.millis(1191L);
      Seconds seconds0 = duration0.toStandardSeconds();
      assertEquals(1, seconds0.getSeconds());
  }
}