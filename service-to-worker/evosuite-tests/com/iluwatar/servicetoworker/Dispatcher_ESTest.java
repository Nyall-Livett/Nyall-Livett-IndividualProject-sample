/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 14:11:38 GMT 2024
 */

package com.iluwatar.servicetoworker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.servicetoworker.Action;
import com.iluwatar.servicetoworker.Command;
import com.iluwatar.servicetoworker.Dispatcher;
import com.iluwatar.servicetoworker.GiantModel;
import com.iluwatar.servicetoworker.GiantView;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Dispatcher_ESTest extends Dispatcher_ESTest_scaffolding {
@RegisterExtension
  static EvoRunnerJUnit5 runner = new EvoRunnerJUnit5(Dispatcher_ESTest.class);

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      GiantView giantView0 = new GiantView();
      Dispatcher dispatcher0 = new Dispatcher(giantView0);
      GiantView giantView1 = dispatcher0.getGiantView();
      assertSame(giantView1, giantView0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      Dispatcher dispatcher0 = new Dispatcher((GiantView) null);
      dispatcher0.addAction((Action) null);
      // Undeclared exception!
      try { 
        dispatcher0.performAction((Command) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.servicetoworker.Dispatcher", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      Dispatcher dispatcher0 = new Dispatcher((GiantView) null);
      GiantView giantView0 = dispatcher0.getGiantView();
      assertNull(giantView0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test3()  throws Throwable  {
      GiantView giantView0 = new GiantView();
      Dispatcher dispatcher0 = new Dispatcher(giantView0);
      // Undeclared exception!
      try { 
        dispatcher0.updateView((GiantModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.servicetoworker.GiantView", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test4()  throws Throwable  {
      Dispatcher dispatcher0 = new Dispatcher((GiantView) null);
      // Undeclared exception!
      try { 
        dispatcher0.performAction((Command) null, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }
}