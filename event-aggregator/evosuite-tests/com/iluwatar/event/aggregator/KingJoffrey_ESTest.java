/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 15:34:24 GMT 2024
 */

package com.iluwatar.event.aggregator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.iluwatar.event.aggregator.Event;
import com.iluwatar.event.aggregator.KingJoffrey;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class KingJoffrey_ESTest extends KingJoffrey_ESTest_scaffolding {
@RegisterExtension
  static EvoRunnerJUnit5 runner = new EvoRunnerJUnit5(KingJoffrey_ESTest.class);

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      KingJoffrey kingJoffrey0 = new KingJoffrey();
      Event event0 = Event.WHITE_WALKERS_SIGHTED;
      kingJoffrey0.onEvent(event0);
  }
}
