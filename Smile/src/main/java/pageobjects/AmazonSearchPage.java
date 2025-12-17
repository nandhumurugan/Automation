package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSearchPage {
    WebDriver driver;
    public void selectProductName(int index){
        driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-"+index+"']")).click();

    }
}
