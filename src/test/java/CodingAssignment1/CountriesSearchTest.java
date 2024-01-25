package CodingAssignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountriesSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qasearchpage.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement element1=driver.findElement(By.xpath("//input[@id='searchInput']"));
        element1.sendKeys("India");
        WebElement element2=driver.findElement(By.xpath("//input[@id='searchInput']"));
        element2.clear();
        WebElement element3=driver.findElement(By.xpath("//input[@id='searchInput']"));
        element2.sendKeys("United States");
        WebElement element4=driver.findElement(By.xpath("//input[@id='searchInput']"));
        element2.clear();
        driver.quit();
    }
}
