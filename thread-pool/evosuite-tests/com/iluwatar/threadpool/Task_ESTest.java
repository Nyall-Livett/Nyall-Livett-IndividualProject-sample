/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 15:46:33 GMT 2024
 */

package com.iluwatar.threadpool;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.iluwatar.threadpool.CoffeeMakingTask;
import com.iluwatar.threadpool.PotatoPeelingTask;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Task_ESTest extends Task_ESTest_scaffolding {
@RegisterExtension
  static EvoRunnerJUnit5 runner = new EvoRunnerJUnit5(Task_ESTest.class);

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      PotatoPeelingTask potatoPeelingTask0 = new PotatoPeelingTask((-1083));
      potatoPeelingTask0.toString();
      assertEquals(29, potatoPeelingTask0.getId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      CoffeeMakingTask coffeeMakingTask0 = new CoffeeMakingTask(0);
      int int0 = coffeeMakingTask0.getTimeMs();
      assertEquals(22, coffeeMakingTask0.getId());
      assertEquals(0, int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      PotatoPeelingTask potatoPeelingTask0 = new PotatoPeelingTask(4283);
      int int0 = potatoPeelingTask0.getTimeMs();
      assertEquals(856600, int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test3()  throws Throwable  {
      CoffeeMakingTask coffeeMakingTask0 = new CoffeeMakingTask(0);
      int int0 = coffeeMakingTask0.getId();
      assertEquals(8, int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test4()  throws Throwable  {
      CoffeeMakingTask coffeeMakingTask0 = new CoffeeMakingTask((-1490));
      int int0 = coffeeMakingTask0.getTimeMs();
      assertEquals((-149000), int0);
  }
}
