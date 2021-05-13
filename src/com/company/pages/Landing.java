package com.company.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Landing extends Base {
    public Landing(WebDriver driver){
        super(driver);
    }

    By mangerlink = By.linkText("Manager");

    public By getMangerlink(){
        return this.mangerlink;
    }
}
