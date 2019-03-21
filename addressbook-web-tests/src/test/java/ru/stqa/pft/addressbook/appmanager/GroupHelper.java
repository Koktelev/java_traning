package ru.stqa.pft.addressbook.appmanager;

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
        type("group_name", "group_name", "group_name", groupData.getName());
        wd.findElement(By.name("group_header")).click();
      wd.findElement(By.name("group_header")).clear();
      wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
      wd.findElement(By.name("group_footer")).click();
      wd.findElement(By.name("group_footer")).clear();
      wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void initGroupCreation() {
      wd.findElement(By.name("new")).click();
    }

    public void deleteSelectedGroups() {
      wd.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
      wd.findElement(By.name("selected[]")).click();
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }
}
