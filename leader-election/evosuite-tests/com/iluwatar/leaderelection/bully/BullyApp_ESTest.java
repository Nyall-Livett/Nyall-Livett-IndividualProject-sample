/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 16:11:41 GMT 2024
 */

package com.iluwatar.leaderelection.bully;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.iluwatar.leaderelection.bully.BullyApp;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BullyApp_ESTest extends BullyApp_ESTest_scaffolding {
@RegisterExtension
  static EvoRunnerJUnit5 runner = new EvoRunnerJUnit5(BullyApp_ESTest.class);

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[4];
      BullyApp.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      BullyApp bullyApp0 = new BullyApp();
  }
}
