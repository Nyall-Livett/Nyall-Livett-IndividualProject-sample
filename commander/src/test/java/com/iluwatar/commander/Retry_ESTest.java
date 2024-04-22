/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 13:41:11 GMT 2024
 */

package com.iluwatar.commander;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.commander.Retry;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.jupiter.api.extension.RegisterExtension;

 
public class Retry_ESTest  {


  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      Retry.Operation retry_Operation0 = mock(Retry.Operation.class, new ViolatedAssumptionAnswer());
      Retry.HandleErrorIssue<Object> retry_HandleErrorIssue0 = (Retry.HandleErrorIssue<Object>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Predicate<Exception>[] predicateArray0 = (Predicate<Exception>[]) Array.newInstance(Predicate.class, 0);
      Retry<Object> retry0 = new Retry<Object>(retry_Operation0, retry_HandleErrorIssue0, 0, 0L, predicateArray0);
      Retry.Operation retry_Operation1 = mock(Retry.Operation.class, new ViolatedAssumptionAnswer());
      Retry.HandleErrorIssue<Predicate<Object>> retry_HandleErrorIssue1 = (Retry.HandleErrorIssue<Predicate<Object>>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Retry<Predicate<Object>> retry1 = new Retry<Predicate<Object>>(retry_Operation1, retry_HandleErrorIssue1, 3598, 0L, predicateArray0);
      LinkedList<Exception> linkedList0 = new LinkedList<Exception>();
      Object object0 = new Object();
      Predicate<Object> predicate0 = Predicate.isEqual(object0);
      retry1.perform(linkedList0, predicate0);
      Retry.Operation retry_Operation2 = null;
      long long0 = 1577L;
      Retry<Exception> retry2 = new Retry<Exception>((Retry.Operation) null, (Retry.HandleErrorIssue<Exception>) null, 495, 1577L, predicateArray0);
      MockThrowable mockThrowable0 = new MockThrowable();
      MockException mockException0 = new MockException((String) null, mockThrowable0);
      MockException mockException1 = new MockException("+qzY)N\"pGG");
      List<Exception> list0 = List.of((Exception) mockException0, (Exception) mockException0, (Exception) mockException0, (Exception) mockException0, (Exception) mockException1, (Exception) mockException0, (Exception) mockException0);
      // Undeclared exception!
      try { 
        retry2.perform(list0, mockException1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.commander.Retry", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      Retry.Operation retry_Operation0 = mock(Retry.Operation.class, new ViolatedAssumptionAnswer());
      Retry.HandleErrorIssue<Object> retry_HandleErrorIssue0 = (Retry.HandleErrorIssue<Object>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Predicate<Exception>[] predicateArray0 = (Predicate<Exception>[]) Array.newInstance(Predicate.class, 3);
      Object object0 = new Object();
      Predicate<Exception> predicate0 = Predicate.isEqual(object0);
      Predicate<Exception> predicate1 = predicate0.negate();
      Predicate<Exception> predicate2 = predicate1.or(predicate0);
      Predicate<Exception> predicate3 = Predicate.not((Predicate<? super Exception>) predicate2);
      Predicate<Exception> predicate4 = predicate3.and(predicate1);
      predicateArray0[0] = predicate4;
      MockThrowable mockThrowable0 = new MockThrowable();
      MockException mockException0 = new MockException(mockThrowable0);
      Predicate<Exception> predicate5 = Predicate.isEqual((Object) mockException0);
      predicateArray0[1] = predicate5;
      Predicate<Exception> predicate6 = predicate1.and(predicate0);
      predicateArray0[2] = predicate6;
      Retry<Object> retry0 = new Retry<Object>(retry_Operation0, retry_HandleErrorIssue0, (-573), 531L, predicateArray0);
      LinkedList<Exception> linkedList0 = new LinkedList<Exception>();
      retry0.perform(linkedList0, predicate1);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      Retry.HandleErrorIssue<Object> retry_HandleErrorIssue0 = (Retry.HandleErrorIssue<Object>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Predicate<Exception>[] predicateArray0 = (Predicate<Exception>[]) Array.newInstance(Predicate.class, 1);
      MockException mockException0 = new MockException("Xv/s");
      Predicate<Object> predicate0 = Predicate.isEqual((Object) mockException0);
      Predicate<Exception> predicate1 = Predicate.not((Predicate<? super Exception>) predicate0);
      mockException0.getStackTrace();
      predicateArray0[0] = predicate1;
      Retry<Object> retry0 = new Retry<Object>((Retry.Operation) null, retry_HandleErrorIssue0, 1, 1, predicateArray0);
      Retry.HandleErrorIssue<Predicate<Object>> retry_HandleErrorIssue1 = (Retry.HandleErrorIssue<Predicate<Object>>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Retry<Predicate<Object>> retry1 = new Retry<Predicate<Object>>((Retry.Operation) null, retry_HandleErrorIssue1, 1, 1, predicateArray0);
      LinkedList<Exception> linkedList0 = new LinkedList<Exception>();
      retry1.perform(linkedList0, predicate0);
      Predicate<Object> predicate2 = predicate0.negate();
      predicate0.and(predicate2);
      Predicate<Object> predicate3 = Predicate.isEqual((Object) predicate1);
      predicate1.or(predicate3);
      Predicate.not((Predicate<? super Exception>) predicate0);
      Retry.HandleErrorIssue<Exception> retry_HandleErrorIssue2 = (Retry.HandleErrorIssue<Exception>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Retry<Exception> retry2 = new Retry<Exception>((Retry.Operation) null, retry_HandleErrorIssue2, (-249), 682L, predicateArray0);
      LinkedList<Exception> linkedList1 = new LinkedList<Exception>();
      retry2.perform(linkedList1, mockException0);
      Retry.HandleErrorIssue<Exception> retry_HandleErrorIssue3 = (Retry.HandleErrorIssue<Exception>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Retry<Exception> retry3 = new Retry<Exception>((Retry.Operation) null, retry_HandleErrorIssue3, 1, 0L, predicateArray0);
      Retry.HandleErrorIssue<Exception> retry_HandleErrorIssue4 = (Retry.HandleErrorIssue<Exception>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Retry<Exception> retry4 = new Retry<Exception>((Retry.Operation) null, retry_HandleErrorIssue4, (-249), 0L, predicateArray0);
      retry4.perform(linkedList0, mockException0);
      Retry.HandleErrorIssue<Predicate<Exception>> retry_HandleErrorIssue5 = (Retry.HandleErrorIssue<Predicate<Exception>>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Retry<Predicate<Exception>> retry5 = new Retry<Predicate<Exception>>((Retry.Operation) null, retry_HandleErrorIssue5, 2712, 2712, predicateArray0);
      // Undeclared exception!
      try { 
        retry5.perform(linkedList1, predicate1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout value is negative
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test3()  throws Throwable  {
      Retry.HandleErrorIssue<Object> retry_HandleErrorIssue0 = (Retry.HandleErrorIssue<Object>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Predicate<Exception>[] predicateArray0 = (Predicate<Exception>[]) Array.newInstance(Predicate.class, 1);
      MockException mockException0 = new MockException("Xv/s");
      Predicate<Object> predicate0 = Predicate.isEqual((Object) mockException0);
      Predicate<Exception> predicate1 = Predicate.not((Predicate<? super Exception>) predicate0);
      mockException0.getStackTrace();
      predicateArray0[0] = predicate1;
      Retry<Object> retry0 = new Retry<Object>((Retry.Operation) null, retry_HandleErrorIssue0, 1, 1, predicateArray0);
      Retry<Object> retry1 = new Retry<Object>((Retry.Operation) null, (Retry.HandleErrorIssue<Object>) null, 1, 1, predicateArray0);
      Retry.HandleErrorIssue<Predicate<Object>> retry_HandleErrorIssue1 = (Retry.HandleErrorIssue<Predicate<Object>>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Retry<Predicate<Object>> retry2 = new Retry<Predicate<Object>>((Retry.Operation) null, retry_HandleErrorIssue1, 2712, 1, predicateArray0);
      LinkedList<Exception> linkedList0 = new LinkedList<Exception>();
      Predicate.not((Predicate<? super Exception>) predicate0);
      Predicate<Exception> predicate2 = predicate1.and(predicate1);
      Predicate<Exception> predicate3 = predicate1.or(predicate1);
      predicate2.or(predicate3);
      Predicate.not((Predicate<? super Exception>) predicate1);
      Retry<Exception> retry3 = new Retry<Exception>((Retry.Operation) null, (Retry.HandleErrorIssue<Exception>) null, 225, 225, predicateArray0);
      LinkedList<Exception> linkedList1 = new LinkedList<Exception>();
      List<Exception> list0 = List.of((Exception) mockException0, (Exception) mockException0, (Exception) mockException0);
      // Undeclared exception!
      try { 
        retry3.perform(list0, mockException0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout value is negative
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test4()  throws Throwable  {
      Retry.HandleErrorIssue<Object> retry_HandleErrorIssue0 = (Retry.HandleErrorIssue<Object>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Predicate<Exception>[] predicateArray0 = (Predicate<Exception>[]) Array.newInstance(Predicate.class, 9);
      Predicate<Object> predicate0 = Predicate.isEqual((Object) null);
      Predicate<Object> predicate1 = predicate0.negate();
      Predicate<Exception> predicate2 = Predicate.not((Predicate<? super Exception>) predicate1);
      Predicate<Exception> predicate3 = predicate2.or(predicate1);
      predicateArray0[0] = predicate3;
      Predicate<Exception> predicate4 = predicate2.or(predicate3);
      predicateArray0[1] = predicate4;
      Predicate<Object> predicate5 = predicate0.negate();
      Predicate<Exception> predicate6 = predicate3.and(predicate5);
      predicateArray0[2] = predicate6;
      Predicate<Exception> predicate7 = predicate6.and(predicate6);
      predicateArray0[3] = predicate7;
      Predicate<Exception> predicate8 = predicate6.and(predicate4);
      predicateArray0[4] = predicate8;
      Predicate<Exception> predicate9 = Predicate.not((Predicate<? super Exception>) predicate6);
      predicateArray0[5] = predicate9;
      Predicate<Exception> predicate10 = Predicate.not((Predicate<? super Exception>) predicate2);
      predicateArray0[6] = predicate10;
      Predicate<Exception> predicate11 = Predicate.not((Predicate<? super Exception>) predicate2);
      predicateArray0[7] = predicate11;
      Object object0 = new Object();
      Predicate<Exception> predicate12 = Predicate.isEqual(object0);
      predicateArray0[8] = predicate12;
      Retry<Object> retry0 = new Retry<Object>((Retry.Operation) null, retry_HandleErrorIssue0, 0, 0L, predicateArray0);
      LinkedList<Exception> linkedList0 = new LinkedList<Exception>();
      MockThrowable mockThrowable0 = new MockThrowable((String) null);
      MockException mockException0 = new MockException(mockThrowable0);
      MockException mockException1 = new MockException((String) null, mockException0);
      retry0.perform(linkedList0, mockException1);
      assertEquals(0, linkedList0.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test5()  throws Throwable  {
      Retry.HandleErrorIssue<Exception> retry_HandleErrorIssue0 = (Retry.HandleErrorIssue<Exception>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Retry.HandleErrorIssue<Object> retry_HandleErrorIssue1 = (Retry.HandleErrorIssue<Object>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Predicate<Exception>[] predicateArray0 = (Predicate<Exception>[]) Array.newInstance(Predicate.class, 3);
      Object object0 = new Object();
      Predicate<Exception> predicate0 = Predicate.isEqual(object0);
      Predicate<Exception> predicate1 = predicate0.negate();
      predicateArray0[0] = predicate1;
      Predicate<Exception> predicate2 = Predicate.not((Predicate<? super Exception>) predicate1);
      Predicate<Exception> predicate3 = predicate2.and(predicate1);
      predicateArray0[1] = predicate3;
      Predicate<Exception> predicate4 = Predicate.isEqual(object0);
      predicateArray0[2] = predicate4;
      Retry<Exception> retry0 = new Retry<Exception>((Retry.Operation) null, retry_HandleErrorIssue0, 0, (-2306L), predicateArray0);
      LinkedList<Exception> linkedList0 = new LinkedList<Exception>();
      MockException mockException0 = new MockException((String) null);
      retry0.perform(linkedList0, mockException0);
      assertEquals(0, linkedList0.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test6()  throws Throwable  {
      Retry.Operation retry_Operation0 = mock(Retry.Operation.class, new ViolatedAssumptionAnswer());
      Retry.HandleErrorIssue<Predicate<Object>> retry_HandleErrorIssue0 = (Retry.HandleErrorIssue<Predicate<Object>>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Predicate<Exception>[] predicateArray0 = (Predicate<Exception>[]) Array.newInstance(Predicate.class, 7);
      Predicate<Exception> predicate0 = Predicate.isEqual((Object) retry_Operation0);
      Predicate<Exception> predicate1 = predicate0.and(predicate0);
      Predicate<Exception> predicate2 = predicate1.or(predicate0);
      Predicate<Exception> predicate3 = Predicate.not((Predicate<? super Exception>) predicate2);
      Predicate<Exception> predicate4 = predicate3.negate();
      predicateArray0[0] = predicate4;
      Predicate<Exception> predicate5 = predicate3.negate();
      predicateArray0[1] = predicate5;
      Predicate<Exception> predicate6 = predicate4.or(predicate2);
      predicateArray0[2] = predicate6;
      Predicate<Exception> predicate7 = Predicate.not((Predicate<? super Exception>) predicate4);
      Predicate<Exception> predicate8 = predicate7.and(predicate6);
      predicateArray0[3] = predicate8;
      Predicate<Exception> predicate9 = Predicate.isEqual((Object) predicate7);
      predicateArray0[4] = predicate9;
      Predicate<Exception> predicate10 = predicate2.and(predicate0);
      predicateArray0[5] = predicate10;
      Object object0 = new Object();
      Predicate<Exception> predicate11 = Predicate.isEqual(object0);
      predicateArray0[6] = predicate11;
      Retry<Predicate<Object>> retry0 = new Retry<Predicate<Object>>(retry_Operation0, retry_HandleErrorIssue0, (-4715), 0L, predicateArray0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test7()  throws Throwable  {
      Retry.Operation retry_Operation0 = mock(Retry.Operation.class, new ViolatedAssumptionAnswer());
      Retry.HandleErrorIssue<Object> retry_HandleErrorIssue0 = (Retry.HandleErrorIssue<Object>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Retry<Object> retry0 = null;
      try {
        retry0 = new Retry<Object>(retry_Operation0, retry_HandleErrorIssue0, 0, 4548L, (Predicate<Exception>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test8()  throws Throwable  {
      Predicate<Exception>[] predicateArray0 = (Predicate<Exception>[]) Array.newInstance(Predicate.class, 2);
      Predicate<Exception> predicate0 = Predicate.isEqual((Object) null);
      Predicate<Exception> predicate1 = predicate0.negate();
      Predicate<Exception> predicate2 = predicate1.or(predicate0);
      Predicate<Exception> predicate3 = predicate0.and(predicate2);
      predicateArray0[0] = predicate3;
      Predicate<Exception> predicate4 = predicate0.and(predicate3);
      predicateArray0[1] = predicate4;
      Retry<Object> retry0 = new Retry<Object>((Retry.Operation) null, (Retry.HandleErrorIssue<Object>) null, 44, 0L, predicateArray0);
      List<Exception> list0 = List.of();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        retry0.perform(list0, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.commander.Retry", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test9()  throws Throwable  {
      Retry.Operation retry_Operation0 = mock(Retry.Operation.class, new ViolatedAssumptionAnswer());
      Retry.HandleErrorIssue<Object> retry_HandleErrorIssue0 = (Retry.HandleErrorIssue<Object>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      int int0 = 0;
      Predicate<Exception>[] predicateArray0 = null;
      Retry<Object> retry0 = null;
      try {
        retry0 = new Retry<Object>(retry_Operation0, retry_HandleErrorIssue0, 0, 0, (Predicate<Exception>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }
}
