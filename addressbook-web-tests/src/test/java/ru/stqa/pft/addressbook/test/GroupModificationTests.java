package ru.stqa.pft.addressbook.test;

import org.junit.jupiter.api.Test;

public class GroupModificationTests  extends TestBase {

    @Test

    public  void  testGroupModification() {

        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm("test1");
       app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();


    }
}
