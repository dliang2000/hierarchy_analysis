/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 06:12:02 GMT 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.RoundingMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.FieldUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FieldUtils.verifyValueBounds("&Cg=VY U3", 0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      FieldUtils.verifyValueBounds(dateTimeFieldType0, 993, 993, 993);
      assertEquals("yearOfCentury", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = FieldUtils.safeToInt((-2147483648L));
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-9223372036854775808L), (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * -9223372036854775808
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply(999999999999998896L, 2154);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 999999999999998896 * 2154
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract(2420, 0L);
      assertEquals(2420L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeAdd((-9223372036854775072L), (-9223372036854775072L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -9223372036854775072 + -9223372036854775072
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeAdd((-251), Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -251 + -2147483648
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = FieldUtils.safeToInt(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract(5L, 2629800000L);
      assertEquals((-2629799995L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = FieldUtils.safeNegate(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = FieldUtils.safeNegate((-1));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = FieldUtils.safeMultiplyToInt(0L, 0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = FieldUtils.safeMultiplyToInt(1L, 1L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = FieldUtils.safeMultiplyToInt(2147483647L, (-1));
      assertEquals((-2147483647), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((-2147483648L), 17887500);
      assertEquals((-38413113753600000L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = FieldUtils.safeMultiply((-4358), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = FieldUtils.safeMultiply(1, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.CEILING;
      long long0 = FieldUtils.safeDivide((-9223372036854775808L), (-1356L), roundingMode0);
      assertEquals(6801896782341281L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long long0 = FieldUtils.safeDivide((long) 168, (-947L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      long long0 = FieldUtils.safeDivide((-1076L), 3L);
      assertEquals((-358L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      long long0 = FieldUtils.safeAdd(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = FieldUtils.safeAdd(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = FieldUtils.safeAdd(1, 1);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(0, Integer.MIN_VALUE, (-1), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(543, 257, (-355), 1627);
      assertEquals(800, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue((-1817), (-1817), (-334));
      assertEquals((-1817), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds((DateTimeField) null, 0, 2330, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.UP;
      // Undeclared exception!
      try { 
        FieldUtils.safeDivide((-1356L), 0L, roundingMode0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeDivide((-9223372036854775808L), (long) 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(1033, (-1), 1033);
      assertEquals(1033, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.getWrappedValue(543, 1244, 543);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MIN > MAX
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FieldUtils.verifyValueBounds((DateTimeField) null, 14, 1, 14);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeToInt(100000000000000027L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 100000000000000027
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((-2630424033L), (-2630424033L));
      assertEquals(6919130593383985089L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      boolean boolean0 = FieldUtils.equals((Object) mockHijrahDate0, (Object) mockThaiBuddhistDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      boolean boolean0 = FieldUtils.equals((Object) "J", (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      boolean boolean0 = FieldUtils.equals((Object) mockMinguoDate0, (Object) mockMinguoDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      boolean boolean0 = FieldUtils.equals((Object) null, (Object) " * ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue((-4364), 0, 3);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(1, 2, 1322);
      assertEquals(1322, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(2047, (-6768), (-6768), 2047);
      assertEquals((-4721), int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.getWrappedValue(Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds("&84X_Z@i", 692, (-2381), (-833));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 692 for &84X_Z@i must be in the range [-2381,-833]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FieldUtils.verifyValueBounds("=_fDU<eRq", 0, 0, 1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds("4", (-935), 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -935 for 4 must be in the range [0,0]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds((DateTimeFieldType) null, 207, 153, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.IllegalFieldValueException", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      FieldUtils.verifyValueBounds(dateTimeFieldType0, 1, 1, 17887500);
      assertEquals("clockhourOfDay", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(dateTimeFieldType0, 2, 1043, (-292269337));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2 for clockhourOfHalfday must be in the range [1043,-292269337]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.era();
      // Undeclared exception!
      try { 
        FieldUtils.verifyValueBounds(dateTimeField0, 999, 1, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 999 for era must be in the range [1,0]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      int int0 = FieldUtils.safeToInt(2147483647L);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeToInt((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -9223372036854775808
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.HALF_UP;
      long long0 = FieldUtils.safeDivide((-9223372036854775808L), 1721L, roundingMode0);
      assertEquals((-5359309725075407L), long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.HALF_UP;
      long long0 = FieldUtils.safeDivide((-432L), 138518912L, roundingMode0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      long long0 = FieldUtils.safeDivide((-9223372036854775808L), (-4676L));
      assertEquals(1972491881277753L, long0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply(2503L, (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 2503 * -9223372036854775808
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(2147483647L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) 0, (long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(1L, (-2836L));
      assertEquals((-2836L), long0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) 1627, 1L);
      assertEquals(1627L, long0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply((-9223372036854775808L), 912);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * 912
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(2147483647L, 100);
      assertEquals(214748364700L, long0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(1677L, 1);
      assertEquals(1677L, long0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((-4L), 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(0L, (-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply(Integer.MIN_VALUE, (-2737));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: -2147483648 * -2737
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      int int0 = FieldUtils.safeMultiply(Integer.MIN_VALUE, 1);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiply(9, (-292269337));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 9 * -292269337
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeSubtract((-9223372036854775808L), 4171L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -9223372036854775808 - 4171
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract((-1932), (-1932L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract(30672000000L, 2);
      assertEquals(30671999998L, long0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      long long0 = FieldUtils.safeAdd(4L, (-1122L));
      assertEquals((-1118L), long0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeAdd(9223372036854775803L, 736L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 9223372036854775803 + 736
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      long long0 = FieldUtils.safeAdd(1L, 1L);
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeAdd((-2146076383), (-2146076383));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2146076383 + -2146076383
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      int int0 = FieldUtils.safeAdd(0, (-4358));
      assertEquals((-4358), int0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeNegate(Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      int int0 = FieldUtils.safeNegate(1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.getWrappedValue(0, 0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MIN > MAX
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      // Undeclared exception!
      try { 
        FieldUtils.safeMultiplyToInt(21600000L, 21600000L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 466560000000000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
