package ru.stqa.pft.addressbook.test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactCreationTests extends TestBase {



  @Test
  public void testContactCreation() throws Exception {
    gotoAddNewContactPage();
    fillContactForm("name");
    submitContactCreation();
    returnToHomePage();
  }


}
