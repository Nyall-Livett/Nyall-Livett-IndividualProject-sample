/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 15:52:59 GMT 2024
 */

package com.iluwatar.acyclicvisitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.iluwatar.acyclicvisitor.ConfigureForDosVisitor;
import com.iluwatar.acyclicvisitor.ConfigureForUnixVisitor;
import com.iluwatar.acyclicvisitor.Hayes;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

 
public class Hayes_ESTest  {


  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      Hayes hayes0 = new Hayes();
      ConfigureForDosVisitor configureForDosVisitor0 = new ConfigureForDosVisitor();
      hayes0.accept(configureForDosVisitor0);
      assertEquals("Hayes modem", hayes0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      Hayes hayes0 = new Hayes();
      ConfigureForUnixVisitor configureForUnixVisitor0 = new ConfigureForUnixVisitor();
      hayes0.accept(configureForUnixVisitor0);
      assertEquals("Hayes modem", hayes0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      Hayes hayes0 = new Hayes();
      String string0 = hayes0.toString();
      assertEquals("Hayes modem", string0);
  }
}
