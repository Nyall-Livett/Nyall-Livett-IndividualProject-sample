/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 13:25:03 GMT 2024
 */

package com.iluwatar.intercepting.filter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.iluwatar.intercepting.filter.Order;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

 
public class Order_ESTest  {


  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test00()  throws Throwable  {
      Order order0 = new Order("iW@UZl}e#h", (String) null, "", "CvI]]zCI}c", "");
      assertEquals("", order0.getOrderItem());
      
      order0.setOrderItem((String) null);
      order0.getOrderItem();
      assertEquals("", order0.getAddress());
      assertEquals("CvI]]zCI}c", order0.getDepositNumber());
      assertEquals("iW@UZl}e#h", order0.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test01()  throws Throwable  {
      Order order0 = new Order("", "", "", "", "");
      String string0 = order0.getOrderItem();
      assertEquals("", string0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test02()  throws Throwable  {
      Order order0 = new Order();
      String string0 = order0.getName();
      assertNull(string0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test03()  throws Throwable  {
      Order order0 = new Order("", "", "", "", "");
      String string0 = order0.getName();
      assertEquals("", string0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test04()  throws Throwable  {
      Order order0 = new Order();
      String string0 = order0.getDepositNumber();
      assertNull(string0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test05()  throws Throwable  {
      Order order0 = new Order();
      order0.setDepositNumber("");
      String string0 = order0.getDepositNumber();
      assertEquals("", string0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test06()  throws Throwable  {
      Order order0 = new Order();
      order0.setContactNumber("ag7>j=zV6\"n}G{`\"");
      String string0 = order0.getContactNumber();
      assertEquals("ag7>j=zV6\"n}G{`\"", string0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test07()  throws Throwable  {
      Order order0 = new Order("iW@UZl}e#h", (String) null, "", "CvI]]zCI}c", "");
      order0.setContactNumber("");
      order0.getContactNumber();
      assertEquals("", order0.getAddress());
      assertEquals("iW@UZl}e#h", order0.getName());
      assertEquals("CvI]]zCI}c", order0.getDepositNumber());
      assertEquals("", order0.getOrderItem());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test08()  throws Throwable  {
      Order order0 = new Order((String) null, "", "", "]4WryB|!L?&a5", (String) null);
      assertEquals("", order0.getAddress());
      
      order0.setAddress("j6(b");
      order0.getAddress();
      assertEquals("", order0.getContactNumber());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test09()  throws Throwable  {
      Order order0 = new Order("iW@UZl}e#h", (String) null, "", "CvI]]zCI}c", "");
      assertEquals("iW@UZl}e#h", order0.getName());
      
      order0.setName("iW@UZl}e#h");
      assertEquals("CvI]]zCI}c", order0.getDepositNumber());
      assertEquals("", order0.getAddress());
      assertEquals("", order0.getOrderItem());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test10()  throws Throwable  {
      Order order0 = new Order("1~zs~PAu{LirF", "1~zs~PAu{LirF", "1~zs~PAu{LirF", "1~zs~PAu{LirF", "d+AOlf@.B5aX");
      String string0 = order0.getDepositNumber();
      assertEquals("d+AOlf@.B5aX", order0.getOrderItem());
      assertEquals("1~zs~PAu{LirF", string0);
      assertEquals("1~zs~PAu{LirF", order0.getAddress());
      assertEquals("1~zs~PAu{LirF", order0.getContactNumber());
      assertEquals("1~zs~PAu{LirF", order0.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test11()  throws Throwable  {
      Order order0 = new Order("iW@UZl}e#h", (String) null, "", "CvI]]zCI}c", "");
      String string0 = order0.getContactNumber();
      assertEquals("iW@UZl}e#h", order0.getName());
      assertEquals("CvI]]zCI}c", order0.getDepositNumber());
      assertEquals("", order0.getAddress());
      assertEquals("", order0.getOrderItem());
      assertNull(string0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test12()  throws Throwable  {
      Order order0 = new Order("1~zs~PAu{LirF", "1~zs~PAu{LirF", "1~zs~PAu{LirF", "1~zs~PAu{LirF", "d+AOlf@.B5aX");
      String string0 = order0.getName();
      assertEquals("1~zs~PAu{LirF", order0.getContactNumber());
      assertEquals("1~zs~PAu{LirF", string0);
      assertEquals("1~zs~PAu{LirF", order0.getDepositNumber());
      assertEquals("1~zs~PAu{LirF", order0.getAddress());
      assertEquals("d+AOlf@.B5aX", order0.getOrderItem());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test13()  throws Throwable  {
      Order order0 = new Order();
      String string0 = order0.getAddress();
      assertNull(string0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test14()  throws Throwable  {
      Order order0 = new Order((String) null, "", "", "]4WryB|!L?&a5", (String) null);
      String string0 = order0.getAddress();
      assertEquals("]4WryB|!L?&a5", order0.getDepositNumber());
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals("", order0.getContactNumber());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test15()  throws Throwable  {
      Order order0 = new Order((String) null, "", "", "", "Y9%CTlXDj");
      String string0 = order0.getOrderItem();
      assertEquals("", order0.getDepositNumber());
      assertEquals("", order0.getAddress());
      assertEquals("Y9%CTlXDj", string0);
      assertNotNull(string0);
      assertEquals("", order0.getContactNumber());
  }
}