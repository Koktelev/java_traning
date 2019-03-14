package ru.stqa.pft.addressbook.appmanager;

public class HelperBase {
    protected WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    protected void click() {
        wd.findElement(By.name("submit")).click();
    }

    protected void type(String locator, String locator, String locator, String text) {
        wd.findElement(By.name(locator)).click();
        wd.findElement(By.name(locator)).clear();
        wd.findElement(By.name(locator)).sendKeys(text);
}
    public  boolean isAlertPresent() {
        try {
            groupHelper.wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
