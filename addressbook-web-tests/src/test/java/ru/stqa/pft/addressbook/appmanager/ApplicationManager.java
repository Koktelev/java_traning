package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    protected WebDriver wd;

    private SessionHelper sessionHelper;
    private  NavigationHelper navigationHelper ;
    private  GroupHelper groupHelper ;

    protected void init() {
       wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(navigationHelper.wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);

        sessionHelper.login("admin", "secret");

    }



    public void stop() {
        wd.quit();
    }

    private boolean isElementPresent(By by) {
      try {
        groupHelper.wd.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }



    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}