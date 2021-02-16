/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 15 05:01:31 GMT 2020
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseInterval_ESTest extends BaseInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((ReadablePeriod) null, (ReadableInstant) null);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Instant instant0 = new Instant();
      Interval interval0 = new Interval(instant0, (ReadablePeriod) null);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableInstant) null);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Instant instant0 = Instant.now();
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, instant0);
      assertEquals(1392409281320L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Instant instant0 = Instant.now();
      MutableInterval mutableInterval0 = new MutableInterval(instant0, instant0);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Duration duration0 = new Duration((ReadableInstant) null, (ReadableInstant) null);
      Interval interval0 = new Interval((ReadableInstant) null, duration0);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        Interval.parse("Amerca/Sao_Paulo");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Amerca\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Interval interval0 = new Interval(duration0, (ReadableInstant) null);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((Object) null);
      assertEquals(1392409281320L, mutableInterval0.getEndMillis());
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }
}