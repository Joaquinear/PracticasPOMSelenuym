import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class e2e {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "D:\\DriversNavegators\\Gekodrive\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.spicejet.com");

        //driver.findElement(By.id("ct100_mainContent_ddl_originStation1_CTXT")).click();
        //driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).click();
        driver.findElement(By.xpath("//div[text()='AGR']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//div[text()='International']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//div[text()='BKK']")).click();

        driver.findElement(By.xpath("//div[text()='5']")).click();

        //driver.findElement(By.xpath("//input[@class=\"css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu\"] //div[@class=\"css-1dbjc4n r-18u37iz\"]")).click();
        //driver.findElement(By)

    }
}
