/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 16:06:08 GMT 2024
 */

package com.iluwatar.identitymap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.identitymap.Person;
import com.iluwatar.identitymap.PersonDbSimulatorImplementation;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

 
public class PersonDbSimulatorImplementation_ESTest  {


  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test00()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      Person person0 = new Person(1, "", 0L);
      personDbSimulatorImplementation0.insert(person0);
      try { 
        personDbSimulatorImplementation0.delete(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ID : 0 not in DataBase
         //
         verifyException("com.iluwatar.identitymap.PersonDbSimulatorImplementation", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test01()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      Person person0 = new Person(0, "", (-1L));
      personDbSimulatorImplementation0.insert(person0);
      Person person1 = new Person(1214, "", (-1L));
      try { 
        personDbSimulatorImplementation0.update(person1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ID : 1214 not in DataBase
         //
         verifyException("com.iluwatar.identitymap.PersonDbSimulatorImplementation", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test02()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      Person person0 = new Person(0, "Z<f<V%$", 0);
      personDbSimulatorImplementation0.insert(person0);
      Person person1 = new Person(1924, "", 118L);
      personDbSimulatorImplementation0.insert(person1);
      assertEquals(2, personDbSimulatorImplementation0.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test03()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      Person person0 = new Person((-1), "Z<f<V%$", 272L);
      personDbSimulatorImplementation0.insert(person0);
      try { 
        personDbSimulatorImplementation0.find(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ID : 0 not in DataBase
         //
         verifyException("com.iluwatar.identitymap.PersonDbSimulatorImplementation", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test04()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      Person person0 = new Person(0, "Record already exists.", 0);
      personDbSimulatorImplementation0.insert(person0);
      int int0 = personDbSimulatorImplementation0.size();
      assertEquals(1, int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test05()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      Person person0 = new Person(0, "", 1L);
      personDbSimulatorImplementation0.insert(person0);
      Person person1 = personDbSimulatorImplementation0.find(0);
      assertEquals(1L, person1.getPhoneNum());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test06()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      Person person0 = new Person((-1), "", (-1));
      personDbSimulatorImplementation0.insert(person0);
      Person person1 = personDbSimulatorImplementation0.find((-1));
      assertSame(person1, person0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test07()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      // Undeclared exception!
      try { 
        personDbSimulatorImplementation0.update((Person) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.identitymap.PersonDbSimulatorImplementation", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test08()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      personDbSimulatorImplementation0.insert((Person) null);
      // Undeclared exception!
      try { 
        personDbSimulatorImplementation0.insert((Person) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.identitymap.PersonDbSimulatorImplementation", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test09()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      personDbSimulatorImplementation0.insert((Person) null);
      // Undeclared exception!
      try { 
        personDbSimulatorImplementation0.find(2102);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.identitymap.PersonDbSimulatorImplementation", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test10()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      personDbSimulatorImplementation0.insert((Person) null);
      // Undeclared exception!
      try { 
        personDbSimulatorImplementation0.delete(1821);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.identitymap.PersonDbSimulatorImplementation", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test11()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      int int0 = personDbSimulatorImplementation0.size();
      assertEquals(0, int0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test12()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      Person person0 = new Person(0, "I4W'V|%Flj {Z0Q&L^", 0);
      personDbSimulatorImplementation0.insert(person0);
      personDbSimulatorImplementation0.delete(0);
      assertEquals(0, personDbSimulatorImplementation0.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test13()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      Person person0 = new Person(0, "Z<f<V%$", 0);
      personDbSimulatorImplementation0.insert(person0);
      try { 
        personDbSimulatorImplementation0.delete(28);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ID : 28 not in DataBase
         //
         verifyException("com.iluwatar.identitymap.PersonDbSimulatorImplementation", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test14()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      Person person0 = new Person(0, "Record already exists.", 0);
      personDbSimulatorImplementation0.insert(person0);
      personDbSimulatorImplementation0.update(person0);
      assertEquals("Person ID is : 0 ; Person Name is : Record already exists. ; Phone Number is :0", person0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test15()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      Person person0 = new Person(0, "Record already exists.", 0);
      Person person1 = new Person(59, "", 790L);
      personDbSimulatorImplementation0.insert(person1);
      try { 
        personDbSimulatorImplementation0.update(person0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ID : 0 not in DataBase
         //
         verifyException("com.iluwatar.identitymap.PersonDbSimulatorImplementation", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test16()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      Person person0 = new Person(1, "", 0L);
      personDbSimulatorImplementation0.insert(person0);
      personDbSimulatorImplementation0.insert(person0);
      assertEquals(1, personDbSimulatorImplementation0.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test17()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      Person person0 = new Person(0, "Record already exists.", 0);
      Person person1 = new Person(59, "", 790L);
      personDbSimulatorImplementation0.insert(person1);
      personDbSimulatorImplementation0.insert(person0);
      assertEquals(2, personDbSimulatorImplementation0.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test18()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      Person person0 = new Person(1, "", 0L);
      personDbSimulatorImplementation0.insert(person0);
      Person person1 = personDbSimulatorImplementation0.find(1);
      assertSame(person1, person0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test19()  throws Throwable  {
      PersonDbSimulatorImplementation personDbSimulatorImplementation0 = new PersonDbSimulatorImplementation();
      Person person0 = new Person(0, "Record already exists.", 0);
      personDbSimulatorImplementation0.insert(person0);
      try { 
        personDbSimulatorImplementation0.find((-361));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ID : -361 not in DataBase
         //
         verifyException("com.iluwatar.identitymap.PersonDbSimulatorImplementation", e);
      }
  }
}
