package reusablecode;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UrlAccess {
    public static WebDriver driver;
    public static void launchUrl() throws IOException {
        File file = new File("src/main/resources/configuration/framework.properties");
        FileInputStream ip = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(ip);
        switch(prop.getProperty("browser").toLowerCase()) {
            case "edge":
                driver = new EdgeDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            default:
                throw new InvalidArgumentException("enter the proper value");
        }
//        if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
//            driver = new ChromeDriver();
//        }
//        else if(prop.getProperty("browser").equalsIgnoreCase("edge")){
//            driver = new EdgeDriver();
//        }
//        else{
//            System.out.println("this is my error msg");
//            throw new InvalidArgumentException("enter the proper value");
//        }
       driver.get(prop.getProperty("url"));
    }
}
