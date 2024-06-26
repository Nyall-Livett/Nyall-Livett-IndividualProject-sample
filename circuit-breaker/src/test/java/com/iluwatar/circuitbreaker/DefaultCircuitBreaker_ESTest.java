/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 17:11:02 GMT 2024
 */

package com.iluwatar.circuitbreaker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.circuitbreaker.DefaultCircuitBreaker;
import com.iluwatar.circuitbreaker.DelayedRemoteService;
import com.iluwatar.circuitbreaker.QuickRemoteService;
import com.iluwatar.circuitbreaker.RemoteService;
import com.iluwatar.circuitbreaker.State;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

 
public class DefaultCircuitBreaker_ESTest  {


  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test00()  throws Throwable  {
      DefaultCircuitBreaker defaultCircuitBreaker0 = new DefaultCircuitBreaker((RemoteService) null, 1990L, (-466), (-3682L));
      State state0 = State.HALF_OPEN;
      defaultCircuitBreaker0.setState(state0);
      String string0 = defaultCircuitBreaker0.attemptRequest();
      assertNull(string0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test01()  throws Throwable  {
      DelayedRemoteService delayedRemoteService0 = new DelayedRemoteService((-1748L), (-4534));
      DefaultCircuitBreaker defaultCircuitBreaker0 = new DefaultCircuitBreaker(delayedRemoteService0, (-249L), (-4534), (-1L));
      defaultCircuitBreaker0.failureCount = (-4534);
      String string0 = defaultCircuitBreaker0.attemptRequest();
      assertNull(string0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test02()  throws Throwable  {
      DelayedRemoteService delayedRemoteService0 = new DelayedRemoteService((-1748L), (-4534));
      DefaultCircuitBreaker defaultCircuitBreaker0 = new DefaultCircuitBreaker(delayedRemoteService0, (-249L), (-4534), (-1L));
      defaultCircuitBreaker0.evaluateState();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test03()  throws Throwable  {
      DelayedRemoteService delayedRemoteService0 = new DelayedRemoteService((-1748L), (-4534));
      DefaultCircuitBreaker defaultCircuitBreaker0 = new DefaultCircuitBreaker(delayedRemoteService0, (-249L), (-4534), (-1L));
      defaultCircuitBreaker0.recordFailure("");
      String string0 = defaultCircuitBreaker0.attemptRequest();
      assertEquals("Delayed service is working", string0);
      
      String string1 = defaultCircuitBreaker0.attemptRequest();
      assertEquals("", string1);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test04()  throws Throwable  {
      QuickRemoteService quickRemoteService0 = new QuickRemoteService();
      DefaultCircuitBreaker defaultCircuitBreaker0 = new DefaultCircuitBreaker(quickRemoteService0, 2257L, 0, 2257L);
      // Undeclared exception!
      try { 
        defaultCircuitBreaker0.setState((State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.circuitbreaker.DefaultCircuitBreaker", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test05()  throws Throwable  {
      DelayedRemoteService delayedRemoteService0 = new DelayedRemoteService();
      DefaultCircuitBreaker defaultCircuitBreaker0 = new DefaultCircuitBreaker(delayedRemoteService0, 186L, 0, (-1730L));
      defaultCircuitBreaker0.recordFailure("OPEN");
      try { 
        defaultCircuitBreaker0.attemptRequest();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Delayed service is down
         //
         verifyException("com.iluwatar.circuitbreaker.DelayedRemoteService", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test06()  throws Throwable  {
      DefaultCircuitBreaker defaultCircuitBreaker0 = new DefaultCircuitBreaker((RemoteService) null, 20, 20, 20);
      // Undeclared exception!
      try { 
        defaultCircuitBreaker0.attemptRequest();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.circuitbreaker.DefaultCircuitBreaker", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test07()  throws Throwable  {
      DelayedRemoteService delayedRemoteService0 = new DelayedRemoteService((-1748L), (-4534));
      DefaultCircuitBreaker defaultCircuitBreaker0 = new DefaultCircuitBreaker(delayedRemoteService0, (-249L), (-4534), (-1L));
      defaultCircuitBreaker0.recordSuccess();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test08()  throws Throwable  {
      DelayedRemoteService delayedRemoteService0 = new DelayedRemoteService();
      DefaultCircuitBreaker defaultCircuitBreaker0 = new DefaultCircuitBreaker(delayedRemoteService0, 186L, 0, (-1730L));
      State state0 = State.CLOSED;
      defaultCircuitBreaker0.setState(state0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test09()  throws Throwable  {
      DelayedRemoteService delayedRemoteService0 = new DelayedRemoteService((-3046L), 845);
      DefaultCircuitBreaker defaultCircuitBreaker0 = new DefaultCircuitBreaker(delayedRemoteService0, (-1L), 845, (-3046L));
      State state0 = State.OPEN;
      defaultCircuitBreaker0.setState(state0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test10()  throws Throwable  {
      QuickRemoteService quickRemoteService0 = new QuickRemoteService();
      DefaultCircuitBreaker defaultCircuitBreaker0 = new DefaultCircuitBreaker(quickRemoteService0, (-1507), (-1507), (-1507));
      String string0 = defaultCircuitBreaker0.getState();
      assertEquals("OPEN", string0);
  }
}
