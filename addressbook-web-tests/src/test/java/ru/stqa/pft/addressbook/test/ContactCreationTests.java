package ru.stqa.pft.addressbook.test;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;
import static org.testng.Assert.*;

public class ContactCreationTests extends TestBase {



  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().gotoAddNewContactPage();
    app.getContactHelper().fillContactForm(new ContactData("name") , true );
    app.getContactHelper().submitContactCreation();
    app.returnToHomePage();
  }


}
