/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 05:17:53 GMT 2020
 */

package org.joda.time.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.joda.time.Chronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.convert.LongConverter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LongConverter_ESTest extends LongConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LongConverter longConverter0 = LongConverter.INSTANCE;
      Long long0 = new Long(0L);
      long long1 = longConverter0.getInstantMillis(long0, (Chronology) null);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LongConverter longConverter0 = LongConverter.INSTANCE;
      Long long0 = new Long((-873L));
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      long long1 = longConverter0.getInstantMillis(long0, iSOChronology0);
      assertEquals((-873L), long1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LongConverter longConverter0 = LongConverter.INSTANCE;
      Long long0 = new Long(0L);
      long long1 = longConverter0.getDurationMillis(long0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LongConverter longConverter0 = new LongConverter();
      Long long0 = new Long(3766L);
      long long1 = longConverter0.getDurationMillis(long0);
      assertEquals(3766L, long1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LongConverter longConverter0 = new LongConverter();
      // Undeclared exception!
      try { 
        longConverter0.getInstantMillis((Object) null, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.LongConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LongConverter longConverter0 = LongConverter.INSTANCE;
      Object object0 = new Object();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      // Undeclared exception!
      try { 
        longConverter0.getInstantMillis(object0, islamicChronology0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Long
         //
         verifyException("org.joda.time.convert.LongConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LongConverter longConverter0 = LongConverter.INSTANCE;
      // Undeclared exception!
      try { 
        longConverter0.getDurationMillis((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.LongConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LongConverter longConverter0 = LongConverter.INSTANCE;
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      // Undeclared exception!
      try { 
        longConverter0.getDurationMillis(mockHijrahDate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate cannot be cast to java.lang.Long
         //
         verifyException("org.joda.time.convert.LongConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LongConverter longConverter0 = LongConverter.INSTANCE;
      Class<?> class0 = longConverter0.getSupportedType();
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LongConverter longConverter0 = new LongConverter();
      Long long0 = new Long(1579L);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long1 = longConverter0.getInstantMillis(long0, islamicChronology0);
      assertEquals(1579L, long1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LongConverter longConverter0 = new LongConverter();
      Long long0 = new Long((-1L));
      long long1 = longConverter0.getDurationMillis(long0);
      assertEquals((-1L), long1);
  }
}
