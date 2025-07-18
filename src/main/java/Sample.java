import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
    public static void main(String[] args) {
        System.setProperty("WebDriver.Chrome.Driver", "C:\\work\\chromedriver-win64.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com");
        String title = driver.getTitle();
        System.out.println("the title is "+title);
        if(title.contains("Rahul Shetty Academy")) {
            System.out.println("Title is correct");
        } else {
            System.out.println("Title is incorrect");
        }
        driver.findElement(By.linkText("VIEW ALL COURSES")).click();
        System.out.println("Clicked on VIEW ALL COURSES link");
        String coursesTitle = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Courses page title: " + coursesTitle);
        System.out.println("Current URL: " + currentUrl);
        driver.quit();
    }
}
