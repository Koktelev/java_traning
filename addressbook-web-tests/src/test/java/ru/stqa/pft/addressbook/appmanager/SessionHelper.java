package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoAlertPresentException;

public class SessionHelper extends  HelperBase{


    public SessionHelper(WebDriver wd) {

        super(wd);
    }

    public void login(String username, String password  String) {
        type(By.name("user"),username);
        type(By.name("pass"),password));
       click(By.xpath("//input[@value='Login']"));
    }
}
