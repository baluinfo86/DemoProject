package com.company.action;
import com.company.pages.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait extends Base {
    public wait(WebDriver driver){
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(this.driver, 20);
    public void waitforelementpresent(By element) {
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

}
