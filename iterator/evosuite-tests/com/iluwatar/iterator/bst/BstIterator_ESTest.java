/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 15:02:29 GMT 2024
 */

package com.iluwatar.iterator.bst;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.iterator.bst.BstIterator;
import com.iluwatar.iterator.bst.TreeNode;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BstIterator_ESTest extends BstIterator_ESTest_scaffolding {
@RegisterExtension
  static EvoRunnerJUnit5 runner = new EvoRunnerJUnit5(BstIterator_ESTest.class);

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer((-468));
      TreeNode<Integer> treeNode0 = new TreeNode<Integer>(integer0);
      BstIterator<Integer> bstIterator0 = new BstIterator<Integer>(treeNode0);
      boolean boolean0 = bstIterator0.hasNext();
      assertTrue(boolean0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer((-468));
      TreeNode<Integer> treeNode0 = new TreeNode<Integer>(integer0);
      BstIterator<Integer> bstIterator0 = new BstIterator<Integer>(treeNode0);
      assertTrue(bstIterator0.hasNext());
      
      bstIterator0.next();
      boolean boolean0 = bstIterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      BstIterator<Integer> bstIterator0 = new BstIterator<Integer>((TreeNode<Integer>) null);
      try { 
        bstIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.iterator.bst.BstIterator", e);
      }
  }
}