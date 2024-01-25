package CodingAssignment1;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;

public class NxtWatchLoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qanxtwatch.ccbp.tech/login");
        driver.manage().window().maximize();
        WebElement el1=driver.findElement(By.xpath("//input[@id='userNameInput']"));
        el1.sendKeys("rahul");
        WebElement webElement = driver.findElement(By.xpath("//input[@id='passwordInput']"));
        webElement.sendKeys("rahul@2021");
        WebElement el2=driver.findElement(By.xpath("//button[@id='loginButton']"));
        el2.submit();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='nxt watch logo']")));
        String CondtionUrl="https://qanxtwatch.ccbp.tech/";
        String currenturl=driver.getCurrentUrl();
        System.out.println(currenturl);
        if(currenturl.equals(CondtionUrl)){
            System.out.println("Logged is Successfully");
        }else{
            System.out.println("Logged is Failed");
        }
        WebElement element=driver.findElement(By.xpath("//button[@id='desktopLogoutButton']"));
        element.click();
        WebElement lr=driver.findElement(By.xpath("//button[@id='desktopConfirmButton']"));
        lr.click();
        String lt="https://qanxtwatch.ccbp.tech/login";
        String CurrentUrl1=driver.getCurrentUrl();
        WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userNameInput']")));
        if(CurrentUrl1.equals(lt)){
            System.out.println("Logout is Successfully");

        }
    }
}
