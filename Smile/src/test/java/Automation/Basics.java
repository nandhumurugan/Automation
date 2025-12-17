package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basics {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        //driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        //driver.findElement(By.xpath("//label[@for='twotabsearchtextbox']/following-sibling::input")).sendKeys("iphone");
        driver.findElement(By.xpath("//div[@class='nav-search-field ']/child::input")).sendKeys("iphone");




    }
}
