package com.company.action;
import com.company.pages.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class action extends Base {
    public action(WebDriver driver){
        super(driver);
    }
    public void set(String strUserName,By element){
        driver.findElement(element).sendKeys(strUserName);
    }
    public void click(By element){
        driver.findElement(element).click();
    }
    public String gettitle(){
        return driver.getTitle();
    }

}
