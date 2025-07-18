import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.Message;
import org.testng.Assert;

import java.time.Duration;

public class LocatorsDemo {


    public static void main(String[] args) throws InterruptedException {
        String name="raju";
        System.setProperty("WebDriver.Chrome.Driver", "C:\\work\\chromedriver-win64.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys("Maneesha@123");
        driver.findElement(By.className("signInBtn")).click();
       String Data =driver.findElement(By.cssSelector("p.error")).getText();
       System.out.println(Data);
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("mani@gmal.com");
        driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9014599488");
        Thread.sleep(2000);
       driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        Thread.sleep(2000);
        String message = driver.findElement(By.cssSelector("form p")).getText();
        System.out.println(message);
        driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Thread.sleep(2000);
        String Message=driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText();
Assert.assertEquals(Message,"Hello " + name + ",");
System.out.println(Message);
    }
}
