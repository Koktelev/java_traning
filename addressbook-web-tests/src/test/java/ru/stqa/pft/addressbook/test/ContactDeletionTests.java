package ru.stqa.pft.addressbook.test;

import org.junit.jupiter.api.Test;

public class ContactDeletionTests extends  TestBase {


    @Test

    public  void testContactDeletion() {

        app.getContactHelper().selectContact();
        app.getContactHelper().DeleteSelectedContact();
        app.getContactHelper().sumbitContactDeletion();




    }
}
