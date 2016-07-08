package admin;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class adminLogin {

PhantomJSDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
    	File src=new File ("C:\\Users\\jay\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
        System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
    			wd = new PhantomJSDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void admintestng() {
        wd.get("https://test.launchpadrecruitsapp.com/login");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("jay.espinosa@launchpadrecruits.com");
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("N40m1r1n04h22");
        wd.findElement(By.name("commit")).click();
        wd.findElement(By.id("contact_request_emails")).click();
        wd.findElement(By.id("contact_request_emails")).clear();
        wd.findElement(By.id("contact_request_emails")).sendKeys("matt@launchpadrecruits.com\nmarvs@launchpadrecruits.com\nsteve@launchpadrecruits.com\nakshay@launchpadrecruits.com\njay.espinosa@launchpadrecruits.com\n");
        wd.findElement(By.id("grab_n_go_notification_emails")).click();
        wd.findElement(By.id("grab_n_go_notification_emails")).clear();
        wd.findElement(By.id("grab_n_go_notification_emails")).sendKeys("mickey@launchpadrecruits.com\ngino@launchpadrecruits.com\njay.espinosa@launchpadrecruits.com");
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
