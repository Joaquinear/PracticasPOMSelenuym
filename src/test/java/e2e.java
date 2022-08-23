import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class e2e {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "D:\\DriversNavegators\\Gekodrive\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.spicejet.com");

        driver.findElement(By.id("ct100_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(2000);

        //driver.findElement(By)

    }
}
