/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 16:44:21 GMT 2024
 */

package com.iluwatar.partialresponse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.partialresponse.FieldJsonMapper;
import com.iluwatar.partialresponse.Video;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

 
public class FieldJsonMapper_ESTest  {


  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      FieldJsonMapper fieldJsonMapper0 = new FieldJsonMapper();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        fieldJsonMapper0.toJson((Video) null, stringArray0);
        fail("Expecting exception: NoSuchFieldException");
      
      } catch(NoSuchFieldException e) {
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      FieldJsonMapper fieldJsonMapper0 = new FieldJsonMapper();
      String[] stringArray0 = new String[1];
      try { 
        fieldJsonMapper0.toJson((Video) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      FieldJsonMapper fieldJsonMapper0 = new FieldJsonMapper();
      String[] stringArray0 = new String[0];
      String string0 = fieldJsonMapper0.toJson((Video) null, stringArray0);
      assertEquals("{}", string0);
  }
}
