/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 14:38:33 GMT 2024
 */

package com.iluwatar.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.factory.Coin;
import com.iluwatar.factory.CoinFactory;
import com.iluwatar.factory.CoinType;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

 
public class CoinFactory_ESTest  {


  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        CoinFactory.getCoin((CoinType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.factory.CoinFactory", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      CoinFactory coinFactory0 = new CoinFactory();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      CoinType coinType0 = CoinType.COPPER;
      Coin coin0 = CoinFactory.getCoin(coinType0);
      assertEquals("This is a copper coin.", coin0.getDescription());
  }
}
