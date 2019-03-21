package ru.stqa.pft.addressbook.test;

import org.junit.jupiter.api.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends  TestBase {

    @Test
    public  void  testContactModification() {
        app.getNavigationHelper().gotoGroupPage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData( "name " , 'middle name'));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }
}
