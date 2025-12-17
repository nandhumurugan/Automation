package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage {
    WebDriver driver;
    public void searchBox(String name){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(name);
    }
    public void searchIcon() {

        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    }

}
