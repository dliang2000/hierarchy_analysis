/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 06:58:57 GMT 2020
 */

package org.joda.time.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.convert.ReadableInstantConverter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReadableInstantConverter_ESTest extends ReadableInstantConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = ReadableInstantConverter.INSTANCE;
      Instant instant0 = Instant.EPOCH;
      long long0 = readableInstantConverter0.getInstantMillis(instant0, (Chronology) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = new ReadableInstantConverter();
      Instant instant0 = new Instant();
      long long0 = readableInstantConverter0.getInstantMillis(instant0, (Chronology) null);
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = new ReadableInstantConverter();
      // Undeclared exception!
      try { 
        readableInstantConverter0.getInstantMillis((Object) null, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadableInstantConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = ReadableInstantConverter.INSTANCE;
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      // Undeclared exception!
      try { 
        readableInstantConverter0.getInstantMillis(mockMinguoDate0, (Chronology) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate cannot be cast to org.joda.time.ReadableInstant
         //
         verifyException("org.joda.time.convert.ReadableInstantConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = new ReadableInstantConverter();
      // Undeclared exception!
      try { 
        readableInstantConverter0.getChronology((Object) null, (DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadableInstantConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = ReadableInstantConverter.INSTANCE;
      Instant instant0 = Instant.now();
      Chronology chronology0 = readableInstantConverter0.getChronology((Object) instant0, (DateTimeZone) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = ReadableInstantConverter.INSTANCE;
      Class<?> class0 = readableInstantConverter0.getSupportedType();
      // Undeclared exception!
      try { 
        readableInstantConverter0.getChronology((Object) class0, (DateTimeZone) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Class cannot be cast to org.joda.time.ReadableInstant
         //
         verifyException("org.joda.time.convert.ReadableInstantConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = new ReadableInstantConverter();
      // Undeclared exception!
      try { 
        readableInstantConverter0.getChronology((Object) null, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadableInstantConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = new ReadableInstantConverter();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        readableInstantConverter0.getChronology(object0, (Chronology) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.joda.time.ReadableInstant
         //
         verifyException("org.joda.time.convert.ReadableInstantConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = ReadableInstantConverter.INSTANCE;
      Instant instant0 = Instant.EPOCH;
      Chronology chronology0 = readableInstantConverter0.getChronology((Object) instant0, (Chronology) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ReadableInstantConverter readableInstantConverter0 = new ReadableInstantConverter();
      Instant instant0 = new Instant((-503L));
      long long0 = readableInstantConverter0.getInstantMillis(instant0, (Chronology) null);
      assertEquals((-503L), long0);
  }
}
