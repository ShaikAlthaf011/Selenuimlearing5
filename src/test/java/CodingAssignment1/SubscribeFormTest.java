package CodingAssignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubscribeFormTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qasubscribe.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement element= driver.findElement(By.xpath("//input[@id='name']"));
        element.sendKeys("Althaf");
        WebElement element1= driver.findElement(By.xpath("//input[@id='email']"));
        element1.sendKeys("ShaikAlthaf@gmail.com");
        WebElement element3=driver.findElement(By.xpath("//button[@type='submit']"));
        element3.click();
        driver.quit();
    }
}
