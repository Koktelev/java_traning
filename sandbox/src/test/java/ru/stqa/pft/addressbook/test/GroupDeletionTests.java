package ru.stqa.pft.addressbook.test;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class UntitledTestCase  extends TestBase {




  @Test
  public void testGroupDeletion() throws Exception {

    app.app.getNavigationHelper().gotoGroupPage();
    app.app.getGroupHelper().selectGroup();
    app.app.getGroupHelper().deleteSelectedGroups();
    app.app.getGroupHelper().returnToGroupPage();
  }






}



