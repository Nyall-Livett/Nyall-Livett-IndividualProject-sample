/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 13:31:58 GMT 2024
 */

package com.iluwatar.roleobject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.iluwatar.roleobject.BorrowerRole;
import com.iluwatar.roleobject.Role;
import java.util.Optional;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Role_ESTest extends Role_ESTest_scaffolding {
@RegisterExtension
  static EvoRunnerJUnit5 runner = new EvoRunnerJUnit5(Role_ESTest.class);

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      Role[] roleArray0 = Role.values();
      assertEquals(2, roleArray0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      Role role0 = Role.valueOf("Investor");
      assertEquals(Role.Investor, role0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      Role role0 = Role.Investor;
      Optional<BorrowerRole> optional0 = role0.instance();
      assertNotNull(optional0);
  }
}
