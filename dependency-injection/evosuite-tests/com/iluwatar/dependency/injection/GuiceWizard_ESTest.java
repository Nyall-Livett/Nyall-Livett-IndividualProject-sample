/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 15:24:59 GMT 2024
 */

package com.iluwatar.dependency.injection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.dependency.injection.GuiceWizard;
import com.iluwatar.dependency.injection.OldTobyTobacco;
import com.iluwatar.dependency.injection.Tobacco;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GuiceWizard_ESTest extends GuiceWizard_ESTest_scaffolding {
@RegisterExtension
  static EvoRunnerJUnit5 runner = new EvoRunnerJUnit5(GuiceWizard_ESTest.class);

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      OldTobyTobacco oldTobyTobacco0 = new OldTobyTobacco();
      GuiceWizard guiceWizard0 = new GuiceWizard(oldTobyTobacco0);
      guiceWizard0.smoke();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      GuiceWizard guiceWizard0 = new GuiceWizard((Tobacco) null);
      // Undeclared exception!
      try { 
        guiceWizard0.smoke();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.dependency.injection.GuiceWizard", e);
      }
  }
}
