/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 16:58:10 GMT 2024
 */

package com.iluwatar.interpreter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.interpreter.Expression;
import com.iluwatar.interpreter.MinusExpression;
import com.iluwatar.interpreter.MultiplyExpression;
import com.iluwatar.interpreter.NumberExpression;
import com.iluwatar.interpreter.PlusExpression;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

 
public class MinusExpression_ESTest  {


  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      NumberExpression numberExpression0 = new NumberExpression(0);
      MultiplyExpression multiplyExpression0 = new MultiplyExpression(numberExpression0, numberExpression0);
      MinusExpression minusExpression0 = new MinusExpression(multiplyExpression0, numberExpression0);
      int int0 = minusExpression0.interpret();
      assertEquals(0, int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      NumberExpression numberExpression0 = new NumberExpression(3392);
      PlusExpression plusExpression0 = new PlusExpression(numberExpression0, numberExpression0);
      MinusExpression minusExpression0 = new MinusExpression(plusExpression0, numberExpression0);
      int int0 = minusExpression0.interpret();
      assertEquals(3392, int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      NumberExpression numberExpression0 = new NumberExpression(261);
      PlusExpression plusExpression0 = new PlusExpression(numberExpression0, numberExpression0);
      MinusExpression minusExpression0 = new MinusExpression(numberExpression0, plusExpression0);
      int int0 = minusExpression0.interpret();
      assertEquals((-261), int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test3()  throws Throwable  {
      MinusExpression minusExpression0 = new MinusExpression((Expression) null, (Expression) null);
      // Undeclared exception!
      try { 
        minusExpression0.interpret();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.interpreter.MinusExpression", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test4()  throws Throwable  {
      MinusExpression minusExpression0 = new MinusExpression((Expression) null, (Expression) null);
      String string0 = minusExpression0.toString();
      assertEquals("-", string0);
  }
}
