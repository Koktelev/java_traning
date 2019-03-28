package ru.stqa.pft.addressbook.test;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoAlertPresentException;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests  extends TestBase {

    @Test

    public  void  testGroupModification() {

        app.getNavigationHelper().gotoGroupPage();
        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1" , null , null);
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm("test1", "test2",);
       app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();


    }
}
