import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeSelenium {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","D:\\DriversNavegators\\Gekodrive\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        //expected
        String[] productWaiting = {"Cucumber","Brocolli"};
        List<WebElement> producto = driver.findElements(By.cssSelector("h4.product-name"));
        int j = 0;
        for(int i =0;i<producto.size();i++){

            String[] nameProduct = producto.get(i).getText().split("-");
            String formatName = nameProduct[0].trim();
            //Format for actuality vegetable name

            //Check if the name is existed in array
            //Conver a string array in a array list for research
            List listProducts = Arrays.asList(productWaiting );
            if(listProducts.contains(formatName)){
                //click on Add to card
                for(int inte = 1;inte <= 2;inte++){
                    driver.findElements(By.cssSelector("a.increment")).get(i).click();
                    //System.out.println("esto es la intereacion"+inte);
                }
                //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                j++;
                if(j == 2){
                    break;
                }
            }
        }


    }

}
