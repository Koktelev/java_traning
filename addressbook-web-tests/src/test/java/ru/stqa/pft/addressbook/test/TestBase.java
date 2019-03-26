package ru.stqa.pft.addressbook.test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;
import org.openqa.selenium.NoAlertPresentException;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
       app.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();

    }

    private boolean isElementPresent(By by) {
      try {
        app.getContactHelper().wd.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    public ApplicationManager getApp() {
        return app;
    }
}
