/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 04:45:47 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicChronology_ESTest extends BasicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, true);
      dateTimeZone0.getOffsetFromLocal(31067872920000L);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      DateTimeZone.getProvider();
      dateTimeZone0.getNameKey(31067872920000L);
      islamicChronology0.calculateFirstDayOfYearMillis(571);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      gregorianChronology0.getMinYear();
      islamicChronology0.getDaysInMonthMaxForSet((-50617267200000L), (-2770));
      gregorianChronology0.add((long) 571, (long) (-14400000), 292271022);
      gregorianChronology0.getDayOfMonth((-919L), 1);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-4482), 571, (-292275054), 100);
      julianChronology0.get((ReadablePeriod) mutablePeriod0, 31556952000L, 1623L);
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      julianChronology0.assemble(assembledChronology_Fields0);
      islamicChronology0.getYearMonthDayMillis(366, 6, (-2543));
      long long0 = julianChronology0.getFirstWeekOfYearMillis((-4482));
      islamicChronology0.getLeapYearPatternType();
      long long1 = julianChronology0.getAverageMillisPerMonth();
      assertFalse(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(calendar0);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      islamicChronology0.assemble((AssembledChronology.Fields) null);
      assertEquals(4, islamicChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0, 1);
      long long0 = ethiopicChronology0.setYear(753718, (-2141347979));
      assertEquals(6211111396758960182L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = copticChronology0.setYear((-12219292800000L), (-1033));
      assertEquals((-85811616000000L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      boolean boolean0 = julianChronology0.isLeapYear((-576));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      boolean boolean0 = islamicChronology0.isLeapYear((-653));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = copticChronology0.getYearMonthMillis(2358, 2358);
      assertEquals(27306374400000L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      EthiopicChronology ethiopicChronology0 = new EthiopicChronology(copticChronology0, copticChronology0, 4);
      long long0 = ethiopicChronology0.getYearMonthDayMillis(0, 604800, 0);
      assertEquals(1505713276800000L, long0);
      assertEquals(4, ethiopicChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      long long0 = copticChronology0.getYearMillis(1023);
      assertEquals((-20932387200000L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      long long0 = gregorianChronology0.getYearDifference((-2865L), (-2865L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.getYearDifference((-644L), 31);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      int int0 = ethiopicChronology0.getYear((-348L));
      assertEquals(1962, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getWeeksInYear((-781));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getWeeksInYear(1199);
      assertEquals(51, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      int int0 = copticChronology0.getWeekOfWeekyear((-735L), 7593750);
      assertEquals(52, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      CopticChronology copticChronology0 = new CopticChronology(islamicChronology0, islamicChronology0, 1);
      int int0 = copticChronology0.getWeekOfWeekyear(1);
      assertEquals(1, copticChronology0.getMinimumDaysInFirstWeek());
      assertEquals(17, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      long long0 = copticChronology0.getTotalMillisByYearMonth(42, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      long long0 = copticChronology0.getTotalMillisByYearMonth(1023, 1023);
      assertEquals(2649024000000L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      long long0 = copticChronology0.getTotalMillisByYearMonth((-3291), (-3291));
      assertEquals((-8532864000000L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getMonthOfYear(0L, 366);
      assertEquals(16075, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      int int0 = ethiopicChronology0.getMonthOfYear((-12219292800000L), 12825000);
      assertEquals((-156125197), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      int int0 = gregorianChronology0.getMonthOfYear(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      int int0 = julianChronology0.getMinYear();
      assertEquals((-292269054), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      int int0 = gregorianChronology0.getMillisOfDay(1209600000L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getMillisOfDay(1000L);
      assertEquals(1000, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getMaxYear();
      assertEquals(292271022, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      int int0 = julianChronology0.getMaxMonth(1216);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      int int0 = gregorianChronology0.getMaxMonth();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      JulianChronology julianChronology0 = new JulianChronology(islamicChronology0, islamicChronology0, 4);
      long long0 = julianChronology0.getFirstWeekOfYearMillis(292271022);
      assertEquals(4, julianChronology0.getMinimumDaysInFirstWeek());
      assertEquals(9223309836259200000L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      int int0 = copticChronology0.getDaysInYearMonth(1, 1);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInMonthMax((-909));
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDayOfYear(1, 48);
      assertEquals(475494, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      int int0 = julianChronology0.getDayOfYear((-809L), 2094);
      assertEquals((-45303), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      int int0 = gregorianChronology0.getDayOfYear(422L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Object object0 = new Object();
      IslamicChronology islamicChronology0 = new IslamicChronology(copticChronology0, object0, (IslamicChronology.LeapYearPatternType) null);
      int int0 = islamicChronology0.getDayOfMonth(1338L, (-1033), (-1033));
      assertEquals(884106, int0);
      assertEquals(4, islamicChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      int int0 = copticChronology0.getDayOfMonth(9223372036854775807L, 59);
      assertEquals((-1244382468), int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      int int0 = julianChronology0.getDayOfMonth((-809L));
      assertEquals(18, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Object object0 = new Object();
      IslamicChronology islamicChronology0 = new IslamicChronology(copticChronology0, object0, (IslamicChronology.LeapYearPatternType) null);
      islamicChronology0.getAverageMillisPerYearDividedByTwo();
      assertEquals(4, islamicChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.getAverageMillisPerMonth();
      assertEquals(2629746000L, long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.getApproxMillisAtEpochDividedByTwo();
      assertEquals(21260793600000L, long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      long long0 = ethiopicChronology0.calculateFirstDayOfYearMillis(1);
      assertEquals((-61894108800000L), long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      // Undeclared exception!
      try { 
        julianChronology0.getYearMonthMillis(0, (-1055));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1056
         //
         verifyException("org.joda.time.chrono.BasicGJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      // Undeclared exception!
      try { 
        islamicChronology0.getYearMonthMillis(292278993, 1842);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too large: 292278993 > 292271022
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      // Undeclared exception!
      try { 
        gregorianChronology0.getYearMonthDayMillis(3768, 3768, (-343));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3767
         //
         verifyException("org.joda.time.chrono.BasicGJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      // Undeclared exception!
      try { 
        islamicChronology0.getYearMonthDayMillis(292278993, 292278993, 1094);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too large: 292278993 > 292271022
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      // Undeclared exception!
      try { 
        islamicChronology0.getYearMillis(292278993);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too large: 292278993 > 292271022
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Object object0 = new Object();
      IslamicChronology islamicChronology0 = new IslamicChronology(copticChronology0, object0, (IslamicChronology.LeapYearPatternType) null);
      // Undeclared exception!
      try { 
        islamicChronology0.getWeeksInYear(2075);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      IslamicChronology islamicChronology0 = new IslamicChronology(gregorianChronology0, dateTimeZone0, (IslamicChronology.LeapYearPatternType) null);
      // Undeclared exception!
      try { 
        islamicChronology0.getWeekOfWeekyear(709L, 1315);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      JulianChronology julianChronology0 = new JulianChronology(buddhistChronology0, buddhistChronology0, 1);
      // Undeclared exception!
      try { 
        julianChronology0.getTotalMillisByYearMonth(1, (-806));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -807
         //
         verifyException("org.joda.time.chrono.BasicGJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      // Undeclared exception!
      try { 
        islamicChronology0.getMonthOfYear((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -301245869 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        gregorianChronology0.getDaysInYearMonth(2279, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.joda.time.chrono.BasicGJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType(0, 0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null, islamicChronology_LeapYearPatternType0);
      // Undeclared exception!
      try { 
        islamicChronology0.getDaysInMonthMax((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -301245869 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      // Undeclared exception!
      try { 
        islamicChronology0.getDayOfYear(5569L, (-2147480649));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -2147480649 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Object object0 = new Object();
      IslamicChronology islamicChronology0 = new IslamicChronology(copticChronology0, object0, (IslamicChronology.LeapYearPatternType) null);
      // Undeclared exception!
      try { 
        islamicChronology0.getDayOfYear(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      // Undeclared exception!
      try { 
        gregorianChronology0.getDayOfMonth((-1758L), 888, 888);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 887
         //
         verifyException("org.joda.time.chrono.BasicGJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      IslamicChronology islamicChronology0 = new IslamicChronology((Chronology) null, (Object) null, (IslamicChronology.LeapYearPatternType) null);
      // Undeclared exception!
      try { 
        islamicChronology0.getDayOfMonth(30962844000000L, 1969);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        islamicChronology0.getDayOfMonth((-9223372036854775808L), 292278993);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too large: 292278993 > 292271022
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        islamicChronology0.getDateMidnightMillis(1, 0, 1321);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      // Undeclared exception!
      try { 
        islamicChronology0.calculateFirstDayOfYearMillis((-2147483645));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -2147483645 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        julianChronology0.assemble((AssembledChronology.Fields) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDayOfWeek((-18001585L));
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      try { 
        gregorianChronology0.getDateTimeMillis((-2141347979), (-2141347979), 1813, 17, 1813, 1813, (-2141567714));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1813 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      try { 
        gregorianChronology0.getDateTimeMillis((-670), (-670), (-670), (-997));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -997 for millisOfDay must be in the range [0,86399999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = copticChronology0.getZone();
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gregorianChronology0.getZone();
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      int int0 = julianChronology0.getMinimumDaysInFirstWeek();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      islamicChronology0.getDaysInYear((-1441));
      islamicChronology0.getWeekyear(2592000000L);
      long long0 = islamicChronology0.calculateFirstDayOfYearMillis(302);
      islamicChronology0.getMinYear();
      islamicChronology0.isLeapDay(2496L);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-15);
      byteArray0[1] = (byte)79;
      byteArray0[2] = (byte)117;
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      IslamicChronology.getInstance(dateTimeZone0);
      byteArray0[3] = (byte) (-71);
      islamicChronology0.getYearMillis(25650000);
      byteArray0[4] = (byte)5;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      islamicChronology0.getYearDifference(2496L, 354);
      long long1 = islamicChronology0.getAverageMillisPerYear();
      assertFalse(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.julianToGregorianByWeekyear((-1442));
      assertEquals((-1209601442L), long0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTime dateTime0 = null;
      try {
        dateTime0 = new DateTime(1024, 1024, 3832, 1024, 1024, 3832, buddhistChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1024 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getDaysInYear((-1));
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getDaysInYear(4);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      String string0 = islamicChronology0.toString();
      assertEquals("IslamicChronology[America/Toronto]", string0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      EthiopicChronology ethiopicChronology0 = new EthiopicChronology(islamicChronology0, islamicChronology0, 1);
      String string0 = ethiopicChronology0.toString();
      assertEquals("EthiopicChronology[UTC,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      boolean boolean0 = julianChronology0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      int[] intArray0 = new int[4];
      boolean boolean0 = gregorianChronology0.equals(intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      long long0 = julianChronology0.getDateTimeMillis(1, 4, 1, 0, 0, 1, 999);
      assertEquals((-62127974546001L), long0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.getDateTimeMillis(1, 1, 1, 0);
      assertEquals((-42521587200000L), long0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Object object0 = new Object();
      JulianChronology julianChronology0 = null;
      try {
        julianChronology0 = new JulianChronology(buddhistChronology0, object0, 10125000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 10125000
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      Object object0 = new Object();
      EthiopicChronology ethiopicChronology0 = null;
      try {
        ethiopicChronology0 = new EthiopicChronology(buddhistChronology0, object0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 0
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      copticChronology0.hashCode();
      assertEquals(4, copticChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      JulianChronology julianChronology0 = new JulianChronology(islamicChronology0, islamicChronology0, 4);
      int int0 = julianChronology0.getDaysInMonthMax();
      assertEquals(4, julianChronology0.getMinimumDaysInFirstWeek());
      assertEquals(31, int0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getWeekOfWeekyear((-110491776000000L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) null);
      int int0 = gregorianChronology0.getDaysInYearMax();
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      IslamicChronology islamicChronology0 = new IslamicChronology((Chronology) null, (Object) null, (IslamicChronology.LeapYearPatternType) null);
      int int0 = islamicChronology0.getDayOfMonth((-107673408000000L), (-1364), (-2145995439));
      assertEquals((-1117919636), int0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffset(26607895200715L);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, dateTimeZone0);
      gregorianChronology0.getWeekyear((-18000000));
      PeriodType periodType0 = PeriodType.time();
      gregorianChronology0.getDaysInMonthMax(26607895200715L);
      PeriodType periodType1 = periodType0.withYearsRemoved();
      Period period0 = new Period(localDateTime0, localDateTime0, periodType1);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(31);
      gregorianChronology0.getYearMillis(1970);
      JulianChronology.getInstance(dateTimeZone1);
      GregorianChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        gregorianChronology0.get((ReadablePeriod) period0, (long) (-18000000), 100000000000000008L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 27777777782
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = copticChronology0.getYearMonthMillis(0, 1);
      assertEquals((-53215747200000L), long0);
  }
}
