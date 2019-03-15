package ru.stqa.pft.addressbook.test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        app.app.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        app.app.stop();

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
