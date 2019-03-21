package ru.stqa.pft.addressbook.test;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class ContactCreationTests extends TestBase {



  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().gotoAddNewContactPage();
    app.getContactHelper().fillContactForm("name","test1");
    app.getContactHelper().submitContactCreation();
    app.returnToHomePage();
  }


}
