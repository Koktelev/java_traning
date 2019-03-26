package ru.stqa.pft.addressbook.test;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoAlertPresentException;

public class ContactDeletionTests extends  TestBase {


    @Test

    public  void testContactDeletion() {

        app.getContactHelper().selectContact();
        app.getContactHelper().DeleteSelectedContact();
        app.getContactHelper().sumbitContactDeletion();




    }
}
