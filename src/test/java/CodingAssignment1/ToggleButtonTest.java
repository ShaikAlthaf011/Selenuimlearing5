package CodingAssignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToggleButtonTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qashowhide.ccbp.tech/");
        driver.manage().window().maximize();
       WebElement element1=driver.findElement(By.xpath("//button[@id='firstname']"));
       element1.click();
       WebElement element=driver.findElement(By.xpath("//button[@id='lastname']"));
       element.click();
       WebElement element2=driver.findElement(By.xpath("//button[@id='firstname']"));
       element2.click();
       WebElement element3=driver.findElement(By.xpath("//button[@id='lastname']"));
       element3.click();
       driver.quit();
    }
}
