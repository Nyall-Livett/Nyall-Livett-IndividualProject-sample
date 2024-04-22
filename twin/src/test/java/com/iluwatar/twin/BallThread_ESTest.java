/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 14:41:59 GMT 2024
 */

package com.iluwatar.twin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.twin.BallItem;
import com.iluwatar.twin.BallThread;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

 
public class BallThread_ESTest  {


  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      BallThread ballThread0 = new BallThread();
      // Undeclared exception!
      try { 
        ballThread0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.twin.BallThread", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      BallThread ballThread0 = new BallThread();
      BallItem ballItem0 = new BallItem();
      ballThread0.setTwin(ballItem0);
      assertEquals(0, ballThread0.countStackFrames());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      BallThread ballThread0 = new BallThread();
      ballThread0.resumeMe();
      assertEquals(0, ballThread0.countStackFrames());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test3()  throws Throwable  {
      BallThread ballThread0 = new BallThread();
      ballThread0.stopMe();
      ballThread0.run();
      assertEquals(0, ballThread0.countStackFrames());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test4()  throws Throwable  {
      BallThread ballThread0 = new BallThread();
      ballThread0.suspendMe();
      assertFalse(ballThread0.isInterrupted());
  }
}