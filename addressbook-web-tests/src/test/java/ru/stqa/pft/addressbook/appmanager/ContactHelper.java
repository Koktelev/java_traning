package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContactData


public class ContactHelper extends HelperBase{


    public ContactHelper(WebDriver wd) {
        super(wd);

    }

    public void submitContactCreation ()     {
        wd.findElement(By.xpath("submit")).click();
    }

    public void fillContactForm () { ContactData, contactData , boolean creation )
        firstName(contactData);
        middleName(contactData);
        telefon(contactData, "home");
        email(contactData);

        if (creation) {

            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup())
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }



    }

    private void email ( String  email) {
        wd.findElement(By.name("email")).click(By.name("email"));
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
    }

    private void telefon( String telefon) {
        wd.findElement(By.name(telefon)).click(By.name(telefon));
        wd.findElement(By.name(telefon)).clear();
        wd.findElement(By.name(telefon)).sendKeys(contactData.getTelephon());
    }

    private void middleName ( String middlename) {
        wd.findElement(By.name("middlename")).click(By.name("middlename"));
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys(contactData.getMiddle_name());
    }

    private void firstName ( String firstname) {
        wd.findElement(By.name("firstname")).click(By.name("firstname"));
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

    public void initContactModification() {click(By.linkText("add new"))};
    }

    public void returnToHomePage() {click(By.linkText("home page"))}

    public void sumbitContactDeletion() { click();By.wd.switchTo().alert().accept()
    };


    public void submitContactModification() {click(By.name("update") )};
    }


    }
}
