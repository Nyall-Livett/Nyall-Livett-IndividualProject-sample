/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 14:07:14 GMT 2024
 */

package com.iluwatar.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.iluwatar.singleton.BillPughImplementation;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

 
public class BillPughImplementation_ESTest  {


  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      BillPughImplementation billPughImplementation0 = BillPughImplementation.getInstance();
      assertNotNull(billPughImplementation0);
  }
}
