package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData


public class ContactHelper extends HelperBase{


    public ContactHelper(WebDriver wd) {
        super(wd);

    }

    public void submitContactCreation() {
      wd.findElement(By.xpath("submit")).click();
    }

    public void fillContactForm(ru.stqa.pft.addressbook.ContactData contactData) {
        firstName(contactData);
        middleName(contactData);
        telefon(contactData, "home", "home", "home");
        email(contactData);
    }

    private void email {
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
    }

    private void telefon( String telefon, String telefon, String telefon) {
        wd.findElement(By.name(telefon)).click();
        wd.findElement(By.name(telefon)).clear();
        wd.findElement(By.name(telefon)).sendKeys(contactData.getTelephon());
    }

    private void middleName {
        wd.findElement(By.name("middlename")).click();
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys(contactData.getMiddle_name());
    }

    private void firstName {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(contactData.getName());
    }

    public void gotoAddNewContactPage() {
      wd.findElement(By.linkText("add new")).click();
    }

    public void selectContact() {
        click(By.name("id"));
    }

    public void DeleteSelectedContact() {
        wd.findElement(By.name("delete")).click();
    }

    public void initContactModification() {click(By.linkText("add new"));
    }

    public void returnToHomePage() {click(By.linkText("home page"));
    }

    public void submitContactModification() {click(By.name("update") );
    }

    public void sumbitContactDeletion() {click();By.wd.switchTo().alert().accept();
    }
}
