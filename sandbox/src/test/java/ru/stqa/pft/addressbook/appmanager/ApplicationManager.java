package ru.stqa.pft.addressbook.appmanager;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {


    protected WebDriver wd;

    private final GroupHelper groupHelper = new GroupHelper();

    protected void init() {
        groupHelper.wd = new FirefoxDriver();
        groupHelper.wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        groupHelper.wd.get("http://localhost/addressbook/");
        GroupHelper groupHelper = new GroupHelper(wd);
        login("admin", "secret");

    }

    private void login(String username, String password  String) {
      groupHelper.wd.findElement(By.name("user")).click();
      groupHelper.wd.findElement(By.name("user")).clear();
      groupHelper.wd.findElement(By.name("user")).sendKeys(username);
      groupHelper.wd.findElement(By.name("pass")).click();
      groupHelper.wd.findElement(By.name("pass")).clear();
      groupHelper.wd.findElement(By.name("pass")).sendKeys(password);
      groupHelper.wd.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void gotoGroupPage() {
      groupHelper.wd.findElement(By.linkText("groups")).click();
    }

    public void stop() {
        groupHelper.wd.quit();
    }

    private boolean isElementPresent(By by) {
      try {
        groupHelper.wd.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        groupHelper.wd.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
}
