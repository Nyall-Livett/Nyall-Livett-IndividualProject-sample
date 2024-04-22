/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 15:40:54 GMT 2024
 */

package com.iluwatar.bytecode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.bytecode.VirtualMachine;
import com.iluwatar.bytecode.Wizard;
import java.util.EmptyStackException;
import java.util.Stack;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

 
import org.junit.jupiter.api.Disabled;
public class VirtualMachine_ESTest  {


  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test00()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      intArray0[1] = 1;
      intArray0[2] = 1;
      intArray0[4] = 2;
      virtualMachine0.execute(intArray0);
      assertArrayEquals(new int[] {1, 1, 1, 0, 2}, intArray0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test01()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      int[] intArray0 = new int[7];
      intArray0[0] = 1;
      intArray0[2] = 1;
      intArray0[3] = 1;
      intArray0[4] = 1;
      intArray0[6] = 3;
      virtualMachine0.execute(intArray0);
      assertEquals(7, intArray0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test02()  throws Throwable  {
      Wizard wizard0 = new Wizard((-969), 5, 5, 5, (-969));
      Wizard wizard1 = new Wizard((-1253), 3191, 1778, 10, 2602);
      VirtualMachine virtualMachine0 = new VirtualMachine(wizard0, wizard1);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test03()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      virtualMachine0.setHealth(0, 8);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test04()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      virtualMachine0.execute(intArray0);
      virtualMachine0.execute(intArray0);
      int[] intArray1 = new int[1];
      intArray1[0] = 10;
      virtualMachine0.execute(intArray1);
      assertEquals(1, intArray1.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test05()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      int[] intArray0 = new int[6];
      intArray0[0] = 1;
      intArray0[2] = 10;
      // Undeclared exception!
      try { 
        virtualMachine0.execute(intArray0);
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test06()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      int[] intArray0 = new int[8];
      intArray0[0] = 1;
      intArray0[2] = 8;
      // Undeclared exception!
      try { 
        virtualMachine0.execute(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid instruction value
         //
         verifyException("com.iluwatar.bytecode.Instruction", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test07()  throws Throwable  {
      Wizard wizard0 = new Wizard(1949, 11, 14, 0, 0);
      VirtualMachine virtualMachine0 = new VirtualMachine(wizard0, wizard0);
      int int0 = virtualMachine0.getWisdom(1);
      assertEquals(14, int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test08()  throws Throwable  {
      Wizard wizard0 = new Wizard((-1551), 14, (-1551), 0, 0);
      VirtualMachine virtualMachine0 = new VirtualMachine(wizard0, wizard0);
      int int0 = virtualMachine0.getWisdom(0);
      assertEquals((-1551), int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test09()  throws Throwable  {
      Wizard wizard0 = new Wizard(0, 3, 0, 10, 3);
      VirtualMachine virtualMachine0 = new VirtualMachine(wizard0, wizard0);
      int int0 = virtualMachine0.getHealth(0);
      assertEquals(0, int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test10()  throws Throwable  {
      Wizard wizard0 = new Wizard((-1109), (-1316), (-1109), 0, (-2552));
      VirtualMachine virtualMachine0 = new VirtualMachine(wizard0, wizard0);
      int int0 = virtualMachine0.getHealth(0);
      assertEquals((-1109), int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test11()  throws Throwable  {
      Wizard wizard0 = new Wizard(0, 0, 0, (-406), 0);
      VirtualMachine virtualMachine0 = new VirtualMachine(wizard0, wizard0);
      int int0 = virtualMachine0.getAgility(0);
      assertEquals(0, int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  @Disabled
    public void test12()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      int int0 = virtualMachine0.getAgility(0);
      assertEquals(16, int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test13()  throws Throwable  {
      Wizard wizard0 = new Wizard((-1158), (-1158), 1, 571, (-1158));
      VirtualMachine virtualMachine0 = new VirtualMachine(wizard0, wizard0);
      int int0 = virtualMachine0.getAgility(1);
      assertEquals((-1158), int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test14()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine((Wizard) null, (Wizard) null);
      // Undeclared exception!
      try { 
        virtualMachine0.setWisdom(0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.bytecode.VirtualMachine", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test15()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      // Undeclared exception!
      try { 
        virtualMachine0.setWisdom(7, 7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 7 out of bounds for length 2
         //
         verifyException("com.iluwatar.bytecode.VirtualMachine", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test16()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine((Wizard) null, (Wizard) null);
      // Undeclared exception!
      try { 
        virtualMachine0.setHealth(1, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.bytecode.VirtualMachine", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test17()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine((Wizard) null, (Wizard) null);
      // Undeclared exception!
      try { 
        virtualMachine0.setAgility(0, 2045);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.bytecode.VirtualMachine", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test18()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      // Undeclared exception!
      try { 
        virtualMachine0.setAgility(3114, 3114);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 3114 out of bounds for length 2
         //
         verifyException("com.iluwatar.bytecode.VirtualMachine", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test19()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine((Wizard) null, (Wizard) null);
      // Undeclared exception!
      try { 
        virtualMachine0.getWisdom(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.bytecode.VirtualMachine", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test20()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine((Wizard) null, (Wizard) null);
      // Undeclared exception!
      try { 
        virtualMachine0.getHealth(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.bytecode.VirtualMachine", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test21()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      // Undeclared exception!
      try { 
        virtualMachine0.getHealth(11);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 11 out of bounds for length 2
         //
         verifyException("com.iluwatar.bytecode.VirtualMachine", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test22()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine((Wizard) null, (Wizard) null);
      // Undeclared exception!
      try { 
        virtualMachine0.getAgility(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.bytecode.VirtualMachine", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test23()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      // Undeclared exception!
      try { 
        virtualMachine0.execute((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.bytecode.VirtualMachine", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test24()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      int[] intArray0 = new int[1];
      intArray0[0] = 1;
      // Undeclared exception!
      try { 
        virtualMachine0.execute(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("com.iluwatar.bytecode.VirtualMachine", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test25()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      Wizard[] wizardArray0 = virtualMachine0.getWizards();
      assertEquals(2, wizardArray0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test26()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      // Undeclared exception!
      try { 
        virtualMachine0.setHealth(2208, 2208);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 2208 out of bounds for length 2
         //
         verifyException("com.iluwatar.bytecode.VirtualMachine", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test27()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      virtualMachine0.setWisdom(0, 0);
      int int0 = virtualMachine0.getWisdom(0);
      assertEquals(0, int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test28()  throws Throwable  {
      Wizard wizard0 = new Wizard(6, 6, 22, 17, 1);
      VirtualMachine virtualMachine0 = new VirtualMachine(wizard0, wizard0);
      int int0 = virtualMachine0.getHealth(1);
      assertEquals(6, int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test29()  throws Throwable  {
      Wizard wizard0 = new Wizard(0, 3, 0, 10, 3);
      VirtualMachine virtualMachine0 = new VirtualMachine(wizard0, wizard0);
      Stack<Integer> stack0 = virtualMachine0.getStack();
      assertEquals(0, stack0.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test30()  throws Throwable  {
      Wizard wizard0 = new Wizard(6, 6, 22, 17, 1);
      VirtualMachine virtualMachine0 = new VirtualMachine(wizard0, wizard0);
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      intArray0[2] = 1;
      intArray0[4] = 6;
      virtualMachine0.execute(intArray0);
      Stack<Integer> stack0 = virtualMachine0.getStack();
      assertEquals(2, wizard0.getNumberOfSpawnedParticles());
      assertEquals("[0]", stack0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test31()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      int[] intArray0 = new int[6];
      intArray0[0] = 1;
      intArray0[2] = 11;
      // Undeclared exception!
      try { 
        virtualMachine0.execute(intArray0);
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test32()  throws Throwable  {
      Wizard wizard0 = new Wizard(9, 9, 22, 17, 1);
      VirtualMachine virtualMachine0 = new VirtualMachine(wizard0, wizard0);
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      intArray0[2] = 1;
      intArray0[4] = 9;
      virtualMachine0.execute(intArray0);
      assertEquals(5, intArray0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test33()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      int[] intArray0 = new int[3];
      intArray0[0] = 1;
      intArray0[2] = 4;
      // Undeclared exception!
      try { 
        virtualMachine0.execute(intArray0);
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test34()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      // Undeclared exception!
      try { 
        virtualMachine0.getAgility(34);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 34 out of bounds for length 2
         //
         verifyException("com.iluwatar.bytecode.VirtualMachine", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test35()  throws Throwable  {
      Wizard wizard0 = new Wizard(0, 3, 0, 10, 3);
      VirtualMachine virtualMachine0 = new VirtualMachine(wizard0, wizard0);
      virtualMachine0.setAgility(0, 3);
      assertEquals(3, wizard0.getAgility());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test36()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      int[] intArray0 = new int[23];
      intArray0[0] = 1;
      intArray0[2] = 5;
      // Undeclared exception!
      try { 
        virtualMachine0.execute(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid instruction value
         //
         verifyException("com.iluwatar.bytecode.Instruction", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test37()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      int[] intArray0 = new int[18];
      intArray0[0] = 1;
      intArray0[2] = 7;
      // Undeclared exception!
      try { 
        virtualMachine0.execute(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid instruction value
         //
         verifyException("com.iluwatar.bytecode.Instruction", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test38()  throws Throwable  {
      VirtualMachine virtualMachine0 = new VirtualMachine();
      // Undeclared exception!
      try { 
        virtualMachine0.getWisdom(9);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 9 out of bounds for length 2
         //
         verifyException("com.iluwatar.bytecode.VirtualMachine", e);
      }
  }
}
