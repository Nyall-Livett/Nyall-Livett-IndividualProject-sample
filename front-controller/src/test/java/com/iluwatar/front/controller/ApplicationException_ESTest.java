/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 16:04:08 GMT 2024
 */

package com.iluwatar.front.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.iluwatar.front.controller.ApplicationException;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.jupiter.api.extension.RegisterExtension;

 
public class ApplicationException_ESTest  {


  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable((Throwable) null);
      ApplicationException applicationException0 = new ApplicationException(mockThrowable0);
  }
}