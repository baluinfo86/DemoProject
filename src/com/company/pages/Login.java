package com.company.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends Base {
    private By userName = By.name("uid");
    private By password = By.name("password");
    private By login = By.name("btnLogin");

    public Login(WebDriver driver) {
        super(driver);
    }

    public By getuserName(){
        return this.userName;
    }
    public By getpassword(){
        return this.password;
    }
    public By getLogin(){
        return this.login;
    }

}
