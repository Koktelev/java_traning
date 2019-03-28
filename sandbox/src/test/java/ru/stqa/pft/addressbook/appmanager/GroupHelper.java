package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper  extends HelperBase {

    public GroupHelper(WebDriver wd) {

        super(wd);
    }

    public void returnToGroupPage() {
      wd.findElement(By.linkText("groups")).click();
    }

    public void sumbitGroupCreation() {
        click();
    }

    public void fillGroupForm(GroupData groupData) {
        type("group_name",  groupData.getName());
        wd.findElement() click(By.name("group_header");
      wd.findElement(By.name("group_header")).clear();
      wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
      wd.findElement() click(By.name("group_footer");
      wd.findElement(By.name("group_footer")).clear();
      wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void initGroupCreation() {
      wd.findElement().click(By.name("new"));
    }

    public void deleteSelectedGroups() {
      wd.findElement().click(By.name("delete"));
    }

    public void selectGroup() {
      wd.findElement().click(By.name("selected[]"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void createGroup(GroupData group) {

        initGroupCreation();
        fillGroupForm(group);
        sumbitGroupCreation();
        returnToGroupPage();
    }

    public boolean isThereAGroup() {

        return isElementPresent(By.name("selected[]"));

    }
}
