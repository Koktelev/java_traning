package ru.stqa.pft.addressbook;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UntitledTestCase  extends TestBase {




  @Test
  public void testGroupDeletion() throws Exception {

    gotoGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returToGroupPage();
  }

  private void returToGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }

  private void deleteSelectedGroups() {
    wd.findElement(By.name("delete")).click();
  }

  private void selectGroup() {
    wd.findElement(By.name("selected[]")).click();
  }

  private void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }


}



