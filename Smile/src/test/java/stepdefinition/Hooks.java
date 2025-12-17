package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import reusablecode.UrlAccess;

import java.io.IOException;



public class Hooks extends UrlAccess{
    @Before()
    public void preCondition() throws IOException {
        System.out.println("execution started");
        /*UrlAccess access=new UrlAccess();
        access.launchUrl();*/
        UrlAccess.launchUrl();
    }
    @After()
    public void postCondition(){
        System.out.println("execution ends");
    }

    @AfterStep()
    public void afterStep(Scenario sc){
       byte[] byteData = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
       sc.attach(byteData,"image/png", sc.getName());
    }
    }

