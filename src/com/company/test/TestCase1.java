package com.company.test;
import com.company.action.wait;
import com.company.pages.Landing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.company.pages.Login;
import com.company.action.action;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class TestCase1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\itsyo\\Documents\\Selenium\\Driver\\Firefox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.demo.guru99.com/V4/index.php";
        String expectedTitle = "Guru99 Bank Manager HomePage";
        String actualTitle = "";
        driver.get(baseUrl);
        Login log = new Login(driver);
        action act = new action(driver);
        act.set("mngr326346", log.getuserName());
        act.set("rEguvej", log.getpassword());
        act.click(log.getLogin());
        wait w1 = new wait(driver);
        Landing l1 = new Landing(driver);
        w1.waitforelementpresent(l1.getMangerlink());
        actualTitle = act.gettitle();
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Login Sucessful!");
        } else {
            System.out.println("Login Failed");
        }

        driver.close();

    }
}