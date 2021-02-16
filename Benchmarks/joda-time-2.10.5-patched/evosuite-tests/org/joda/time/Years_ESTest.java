/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 06:03:26 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Years;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Years_ESTest extends Years_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      Years years1 = years0.negated();
      Years years2 = years1.minus(0);
      Years years3 = years2.plus(years0);
      boolean boolean0 = years3.isLessThan(years2);
      assertFalse(boolean0);
      assertEquals((-2147483647), years2.getYears());
      assertEquals(0, years3.getYears());
      assertSame(years2, years1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Years years0 = Years.years(29);
      Years years1 = years0.dividedBy((-4298));
      boolean boolean0 = years1.isLessThan((Years) null);
      assertEquals(29, years0.getYears());
      assertFalse(boolean0);
      assertEquals(0, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Years years0 = Years.years(29);
      Years years1 = Years.yearsIn((ReadableInterval) null);
      boolean boolean0 = years1.isGreaterThan(years0);
      assertEquals(0, years1.getYears());
      assertFalse(boolean0);
      assertEquals(29, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      boolean boolean0 = years0.isGreaterThan((Years) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Instant instant0 = Instant.EPOCH;
      Instant instant1 = instant0.withMillis((-124642));
      Years years0 = Years.yearsBetween((ReadableInstant) instant1, (ReadableInstant) instant0);
      assertEquals(0, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Years years0 = Years.THREE;
      Years years1 = years0.negated();
      Years years2 = years0.ONE.plus(years1);
      assertEquals((-2), years2.getYears());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Years years0 = Years.ZERO;
      Years years1 = years0.plus(0);
      assertEquals(0, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      Years years1 = years0.plus(0);
      assertEquals(Integer.MIN_VALUE, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      Years years1 = years0.negated();
      Years years2 = years1.negated();
      assertSame(years2, years0);
      assertEquals((-2147483647), years1.getYears());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Years years0 = Years.THREE;
      Years years1 = years0.ZERO.multipliedBy(825639);
      assertEquals(0, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.multipliedBy(2);
      assertEquals(2, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Years years0 = Years.ZERO;
      Years years1 = years0.MIN_VALUE.minus(years0);
      assertEquals(Integer.MIN_VALUE, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.minus(years0);
      Years years2 = years1.minus(0);
      assertEquals(0, years2.getYears());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Years years0 = Years.TWO;
      Years years1 = years0.minus(0);
      assertEquals(2, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Years years0 = Years.ZERO;
      int int0 = years0.getYears();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Years years0 = Years.ONE;
      int int0 = years0.getYears();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      Years years1 = years0.dividedBy(337);
      assertEquals((-6372355), years1.getYears());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Years.yearsBetween((ReadableInstant) null, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      // Undeclared exception!
      try { 
        years0.plus(years0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2147483647 + 2147483647
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      // Undeclared exception!
      try { 
        years0.negated();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      // Undeclared exception!
      try { 
        years0.multipliedBy(43);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483647 * 43
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      // Undeclared exception!
      try { 
        years0.TWO.minus(years0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      // Undeclared exception!
      try { 
        years0.MIN_VALUE.dividedBy(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.Years", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      // Undeclared exception!
      try { 
        years0.plus(1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2147483647 + 1
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Years years0 = Years.years(0);
      years0.negated();
      assertEquals(0, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Years years0 = Years.years(1);
      assertEquals(1, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Years years0 = Years.THREE;
      Years years1 = years0.minus(2573);
      boolean boolean0 = years1.isLessThan(years0);
      assertEquals((-2570), years1.getYears());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Years years0 = Years.THREE;
      Years years1 = years0.minus(2573);
      boolean boolean0 = years1.isLessThan((Years) null);
      assertTrue(boolean0);
      assertEquals((-2570), years1.getYears());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Years years0 = Years.years(29);
      boolean boolean0 = years0.isLessThan((Years) null);
      assertFalse(boolean0);
      assertEquals(29, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      boolean boolean0 = years0.isLessThan(years0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Years years0 = Years.MAX_VALUE;
      Years years1 = Years.MIN_VALUE;
      boolean boolean0 = years0.isGreaterThan(years1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Years years0 = Years.TWO;
      boolean boolean0 = years0.isGreaterThan((Years) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Years years0 = Years.ZERO;
      boolean boolean0 = years0.isGreaterThan((Years) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Years years0 = Years.years(29);
      boolean boolean0 = years0.isGreaterThan(years0);
      assertEquals(29, years0.getYears());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.dividedBy(1);
      assertEquals(1, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.minus((Years) null);
      assertEquals(1, years1.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Years years0 = Years.THREE;
      Years years1 = years0.plus((Years) null);
      assertSame(years1, years0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Years years0 = Years.years(29);
      Years years1 = years0.plus(0);
      assertSame(years1, years0);
      assertEquals(29, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Years years0 = Years.parseYears((String) null);
      assertEquals(0, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        Years.parseYears("#jkh\"X}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"#jkh\"X}\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        Years.yearsBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Years years0 = Years.years(3);
      assertEquals(3, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Years years0 = Years.years(2);
      assertEquals(2, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Years years0 = Years.years(Integer.MAX_VALUE);
      Years years1 = years0.dividedBy(Integer.MAX_VALUE);
      assertEquals(1, years1.getYears());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Years years0 = Years.years(Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        years0.minus(Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Years years0 = Years.years(29);
      Years years1 = years0.multipliedBy((-4298));
      assertEquals((-124642), years1.getYears());
      assertEquals(29, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Years years0 = Years.MIN_VALUE;
      int int0 = years0.getYears();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Years years0 = Years.ONE;
      PeriodType periodType0 = years0.MAX_VALUE.getPeriodType();
      assertEquals("Years", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Years years0 = Years.ONE;
      DurationFieldType durationFieldType0 = years0.getFieldType();
      assertEquals("years", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Years years0 = Years.THREE;
      String string0 = years0.toString();
      assertEquals("P3Y", string0);
  }
}