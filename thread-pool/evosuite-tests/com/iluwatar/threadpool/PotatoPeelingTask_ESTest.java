/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 19:40:20 GMT 2024
 */

package com.iluwatar.threadpool;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.iluwatar.threadpool.PotatoPeelingTask;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PotatoPeelingTask_ESTest extends PotatoPeelingTask_ESTest_scaffolding {
@RegisterExtension
  static EvoRunnerJUnit5 runner = new EvoRunnerJUnit5(PotatoPeelingTask_ESTest.class);

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      PotatoPeelingTask potatoPeelingTask0 = new PotatoPeelingTask(2);
      potatoPeelingTask0.toString();
      assertEquals(1, potatoPeelingTask0.getId());
  }
}