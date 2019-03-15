package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper {
    private   WebDriver wd;

    public ContactHelper(WebDriver wd) {
        this.wd = wd;

    }

    public void submitContactCreation() {
      wd.findElement(By.xpath("submit")).click();
    }

    public void fillContactForm(ru.stqa.pft.addressbook.ContactData contactData) {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(contactData.getName());
      wd.findElement(By.name("middlename")).click();
      wd.findElement(By.name("middlename")).clear();
      wd.findElement(By.name("middlename")).sendKeys(contactData.getMiddle_name());
      wd.findElement(By.name("home")).click();
      wd.findElement(By.name("home")).clear();
      wd.findElement(By.name("home")).sendKeys(contactData.getTelephon());
      wd.findElement(By.name("email")).click();
      wd.findElement(By.name("email")).clear();
      wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
    }

    public void gotoAddNewContactPage() {
      wd.findElement(By.linkText("add new")).click();
    }
}
