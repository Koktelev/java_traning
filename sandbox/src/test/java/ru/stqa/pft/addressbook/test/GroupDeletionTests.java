package ru.stqa.pft.addressbook.test;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class UntitledTestCase  extends TestBase {




  @Test
  public void testGroupDeletion() throws Exception {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }






}



