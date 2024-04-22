/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 16 15:54:47 GMT 2024
 */

package com.iluwatar.queue.load.leveling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.iluwatar.queue.load.leveling.Message;
import com.iluwatar.queue.load.leveling.MessageQueue;
import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;

 
public class MessageQueue_ESTest  {


  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0()  throws Throwable  {
      MessageQueue messageQueue0 = new MessageQueue();
      Message message0 = new Message((String) null);
      messageQueue0.submitMsg(message0);
      Message message1 = messageQueue0.retrieveMsg();
      assertSame(message1, message0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1()  throws Throwable  {
      MessageQueue messageQueue0 = new MessageQueue();
      messageQueue0.submitMsg((Message) null);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2()  throws Throwable  {
      MessageQueue messageQueue0 = new MessageQueue();
      Message message0 = messageQueue0.retrieveMsg();
      assertNull(message0);
  }
}