
package com.iluwatar.proxy.utils;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.iluwatar.proxy.WizardTowerProxy;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.security.auth.Subject;


class WizardTowerProxyTest {

  private final ByteArrayInputStream testIn = new ByteArrayInputStream("Test".getBytes());

  private Scanner scanner;

  private final List<String> testList = new ArrayList<>();

  private void setScanner() {
    this.scanner = new Scanner(this.testIn);
  }

  @BeforeEach
  void setScannerSystemIn() {
    System.setIn(this.testIn);
  }

  @AfterEach
  void closeScanner() {
    this.scanner.close();
  }

  @Test
  void testWizardTowerProxy() {
    setScanner();
    var wizard = new WizardTowerProxyTestMock().new Wizard("test");
    Assertions.assertTrue(this.testList.contains("test enters the tower."));
  }

  class WizardTowerProxyTestMock extends WizardTowerProxy {

    WizardTowerProxyTestMock() {
      super(new WizardTowerImpl());
    }

    @Override
    void enter(Subject subject) {
      testList.add("test enters the tower.");
    }

    class Wizard extends PartyMember {

      public Wizard(String name) {
        super(name);
      }

      @Override
      public void joinedParty(Subject subject) {
        // empty method
      }

      @Override
      public void partyAction(Subject subject) {
        // empty method
      }

      @Override
      public void leftParty(Subject subject) {
        // empty method
      }

    }
  }
}
