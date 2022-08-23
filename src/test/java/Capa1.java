import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Capa1 {


    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "D:\\DriversNavegators\\Gekodrive\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("Joaquin");
        driver.findElement(By.name("email")).sendKeys("joaquin21@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("9876");
        driver.findElement(By.id("exampleCheck1")).click();
        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select abc = new Select(dropdown);
        abc.selectByVisibleText("Male");
        driver.findElement(By.cssSelector("input[value='option2']")).click();
        //driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.name("bday")).sendKeys("03/12/1969");
        driver.findElement(By.cssSelector(".btn-success")).click();
        System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
    }

}

