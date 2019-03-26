package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoAlertPresentException;

public class HelperBase {
    protected WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    protected void click() {
        wd.findElement(By.name("submit")).click();
    }

    protected void type(String locator, String text) {
        click(locator);
        if (text != null) {
            String existingText = wd.findElement(By.name(locator).getAttribute("value");
            if (! text.equals(existingText) {
               wd.findElement(By.name(locator)).clear();
            }  wd.findElement(By.name(locator)).sendKeys(text);



        }

}
    public  boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    protected boolean isElementPresent(By locator) {
       try  {
           wd.findElement(locator);

           return true;
       } catch (NoSuchElementException ex)  {
           return  false;


       }



    }
}
