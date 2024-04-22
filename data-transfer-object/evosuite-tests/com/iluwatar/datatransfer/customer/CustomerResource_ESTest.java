/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 16:10:03 GMT 2024
 */

package com.iluwatar.datatransfer.customer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.datatransfer.customer.CustomerDto;
import com.iluwatar.datatransfer.customer.CustomerResource;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CustomerResource_ESTest extends CustomerResource_ESTest_scaffolding {
@RegisterExtension
  static EvoRunnerJUnit5 runner = new EvoRunnerJUnit5(CustomerResource_ESTest.class);

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      LinkedList<CustomerDto> linkedList0 = new LinkedList<CustomerDto>();
      CustomerResource customerResource0 = new CustomerResource(linkedList0);
      List<CustomerDto> list0 = customerResource0.getAllCustomers();
      assertEquals(0, list0.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      LinkedList<CustomerDto> linkedList0 = new LinkedList<CustomerDto>();
      List<CustomerDto> list0 = linkedList0.subList(0, 0);
      CustomerDto customerDto0 = new CustomerDto("com.iluwatar.datatransfer.customer.CustomerResource", "com.iluwatar.datatransfer.customer.CustomerResource", "com.iluwatar.datatransfer.customer.CustomerResource");
      linkedList0.offerLast(customerDto0);
      CustomerResource customerResource0 = new CustomerResource(list0);
      // Undeclared exception!
      try { 
        customerResource0.save(customerDto0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractList$SubList", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      List<CustomerDto> list0 = List.of();
      CustomerResource customerResource0 = new CustomerResource(list0);
      // Undeclared exception!
      try { 
        customerResource0.save((CustomerDto) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ImmutableCollections", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test3()  throws Throwable  {
      CustomerResource customerResource0 = new CustomerResource((List<CustomerDto>) null);
      // Undeclared exception!
      try { 
        customerResource0.save((CustomerDto) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.datatransfer.customer.CustomerResource", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test4()  throws Throwable  {
      LinkedList<CustomerDto> linkedList0 = new LinkedList<CustomerDto>();
      List<CustomerDto> list0 = linkedList0.subList(0, 0);
      CustomerDto customerDto0 = new CustomerDto("com.iluwatar.datatransfer.customer.CustomerResource", "com.iluwatar.datatransfer.customer.CustomerResource", "com.iluwatar.datatransfer.customer.CustomerResource");
      linkedList0.offerLast(customerDto0);
      CustomerResource customerResource0 = new CustomerResource(list0);
      // Undeclared exception!
      try { 
        customerResource0.delete("com.iluwatar.datatransfer.customer.CustomerResource");
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractList$SubList", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test5()  throws Throwable  {
      CustomerDto customerDto0 = new CustomerDto("4&", "4&", "4&");
      List<CustomerDto> list0 = List.of(customerDto0, customerDto0);
      CustomerResource customerResource0 = new CustomerResource(list0);
      // Undeclared exception!
      try { 
        customerResource0.delete("4&");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ImmutableCollections", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test6()  throws Throwable  {
      CustomerResource customerResource0 = new CustomerResource((List<CustomerDto>) null);
      // Undeclared exception!
      try { 
        customerResource0.delete("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.datatransfer.customer.CustomerResource", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test7()  throws Throwable  {
      LinkedList<CustomerDto> linkedList0 = new LinkedList<CustomerDto>();
      CustomerResource customerResource0 = new CustomerResource(linkedList0);
      CustomerDto customerDto0 = new CustomerDto("?g~q8o~D<jR", "C($c", "!l:w\"$e6&>^c/3e");
      customerResource0.save(customerDto0);
      List<CustomerDto> list0 = customerResource0.getAllCustomers();
      assertEquals(1, list0.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test8()  throws Throwable  {
      CustomerResource customerResource0 = new CustomerResource((List<CustomerDto>) null);
      List<CustomerDto> list0 = customerResource0.getAllCustomers();
      assertNull(list0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test9()  throws Throwable  {
      LinkedList<CustomerDto> linkedList0 = new LinkedList<CustomerDto>();
      CustomerResource customerResource0 = new CustomerResource(linkedList0);
      customerResource0.delete("com.iluwatar.datatransfer.customer.CustomerResource");
  }
}
