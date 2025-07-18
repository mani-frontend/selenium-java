import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownClass {

    public static void main(String[] args) {
        System.setProperty("WebDriver.Chrome.Driver", "C:\\work\\chromedriver-win64.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");




        // Close the browser
        driver.quit();
    }
}
