import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsDemo2 {
    public static void main(String[] args) throws InterruptedException {
        String name = "raju";
        System.setProperty("web driver.chrome.driver", "C:\\work\\chromedriver-win64.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        String password=getPassword(driver);
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        Thread.sleep(20000);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());


    }
    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(20000);
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        Thread.sleep(2000);
        String Password = driver.findElement(By.cssSelector("form p")).getText();
        //Please use temporary password 'rahulshettyacademy' to Login.
        String[] passwordArray=Password.split("'");
        //passwordArray[0]----please use temporary password
        //passwordArray[1]----'rahulshettyacademy
        String[] PasswordArray2 = passwordArray[1].split("'");
        //PasswordArray2[0]----rahulshettyacademy
        //PasswordArray2[1]----to login.
        String RealPassword = PasswordArray2[0];
        return RealPassword;


    }
}
