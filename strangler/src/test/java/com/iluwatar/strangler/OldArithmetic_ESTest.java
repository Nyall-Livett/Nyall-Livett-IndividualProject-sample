/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 14:37:22 GMT 2024
 */

package com.iluwatar.strangler;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.strangler.OldArithmetic;
import com.iluwatar.strangler.OldSource;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

 
public class OldArithmetic_ESTest  {


  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      OldArithmetic oldArithmetic0 = new OldArithmetic(oldSource0);
      int[] intArray0 = new int[1];
      intArray0[0] = 380;
      int int0 = oldArithmetic0.sum(intArray0);
      assertEquals(380, int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      OldArithmetic oldArithmetic0 = new OldArithmetic(oldSource0);
      int[] intArray0 = new int[7];
      intArray0[0] = (-3353);
      int int0 = oldArithmetic0.sum(intArray0);
      assertEquals((-3353), int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      int[] intArray0 = new int[0];
      OldArithmetic oldArithmetic0 = new OldArithmetic(oldSource0);
      int int0 = oldArithmetic0.mul(intArray0);
      assertEquals(1, int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test3()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      int[] intArray0 = new int[1];
      intArray0[0] = (-1);
      OldArithmetic oldArithmetic0 = new OldArithmetic(oldSource0);
      int int0 = oldArithmetic0.mul(intArray0);
      assertEquals((-1), int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test4()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      OldArithmetic oldArithmetic0 = new OldArithmetic(oldSource0);
      // Undeclared exception!
      try { 
        oldArithmetic0.sum((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.strangler.OldSource", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test5()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      OldArithmetic oldArithmetic0 = new OldArithmetic(oldSource0);
      // Undeclared exception!
      try { 
        oldArithmetic0.mul((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.strangler.OldSource", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test6()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      int[] intArray0 = new int[8];
      OldArithmetic oldArithmetic0 = new OldArithmetic(oldSource0);
      int int0 = oldArithmetic0.mul(intArray0);
      assertEquals(0, int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test7()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      OldArithmetic oldArithmetic0 = new OldArithmetic(oldSource0);
      int[] intArray0 = new int[4];
      int int0 = oldArithmetic0.sum(intArray0);
      assertEquals(0, int0);
  }
}
