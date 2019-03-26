package ru.stqa.pft.addressbook.test;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoAlertPresentException;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactModificationTests extends  TestBase {

    @Test
    public  void  testContactModification() {
        app.getNavigationHelper().gotoGroupPage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData( "name " , 'middle name',null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }
}
