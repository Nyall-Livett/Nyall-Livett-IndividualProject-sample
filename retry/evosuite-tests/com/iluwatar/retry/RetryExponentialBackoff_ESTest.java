/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 13:46:05 GMT 2024
 */

package com.iluwatar.retry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.retry.BusinessOperation;
import com.iluwatar.retry.RetryExponentialBackoff;
import java.lang.reflect.Array;
import java.util.List;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RetryExponentialBackoff_ESTest extends RetryExponentialBackoff_ESTest_scaffolding {
@RegisterExtension
  static EvoRunnerJUnit5 runner = new EvoRunnerJUnit5(RetryExponentialBackoff_ESTest.class);

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      Predicate<Exception>[] predicateArray0 = (Predicate<Exception>[]) Array.newInstance(Predicate.class, 0);
      RetryExponentialBackoff<Object> retryExponentialBackoff0 = new RetryExponentialBackoff<Object>((BusinessOperation<Object>) null, (-2823), (-2823), predicateArray0);
      // Undeclared exception!
      try { 
        retryExponentialBackoff0.perform();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.retry.RetryExponentialBackoff", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      Predicate<Exception>[] predicateArray0 = (Predicate<Exception>[]) Array.newInstance(Predicate.class, 0);
      RetryExponentialBackoff<Object> retryExponentialBackoff0 = new RetryExponentialBackoff<Object>((BusinessOperation<Object>) null, 1335, 1335, predicateArray0);
      List<Exception> list0 = retryExponentialBackoff0.errors();
      assertTrue(list0.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      Predicate<Exception>[] predicateArray0 = (Predicate<Exception>[]) Array.newInstance(Predicate.class, 0);
      RetryExponentialBackoff<Predicate<Object>> retryExponentialBackoff0 = new RetryExponentialBackoff<Predicate<Object>>((BusinessOperation<Predicate<Object>>) null, 0, 0, predicateArray0);
      int int0 = retryExponentialBackoff0.attempts();
      assertEquals(0, int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test3()  throws Throwable  {
      RetryExponentialBackoff<Object> retryExponentialBackoff0 = null;
      try {
        retryExponentialBackoff0 = new RetryExponentialBackoff<Object>((BusinessOperation<Object>) null, 0, 0, (Predicate<Exception>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }
}
