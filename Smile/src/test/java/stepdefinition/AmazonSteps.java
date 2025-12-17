package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import reusablecode.UrlAccess;

import java.util.ArrayList;
import java.util.List;

public class AmazonSteps extends UrlAccess {
    //WebDriver driver;
    String prodname;
    String ActualErrorMsg;
    WebElement category;
    @Given("user navigates to the amazon home page")
        public void homePage(){
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        }

    @When("user gives the product name as {string} in search box")
    public void InputInSearchBox(String name)
    {
        prodname=name;
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(name);
    }

    @And("user clicks the search icon")
    public void searchIcon() {
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    }

    @Then("the user checks for the title of search result page")
    public void TitleOfSearchResultPage() {

        String actualValue= "Amazon.in : "+prodname;
        String ExpectedRes = driver.getTitle(); //expected
        System.out.println(ExpectedRes);
        if(actualValue.equals(ExpectedRes)){
            System.out.println("the given title are same");
        }
        else{
            System.out.println("the given title are not same");
        }
    }

    @Given("navigating to the learnmore website loginpage")
    public void navigatingToTheLearnmoreWebsiteLoginpage() {
        driver = new ChromeDriver();
        driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
    }

    @When("user enters the user name {string}and password {string}")
    public void userEntersTheUserNameAndPassword(String usname, String pass) {
        driver.findElement(By.id("username")).sendKeys(usname);
        driver.findElement(By.id("password")).sendKeys(pass);

    }

    @And("clicks on the login button")
    public void clicksOnTheLoginButton() {
        driver.findElement(By.xpath("//button[text()='Login']")).click();

    }

    @Then("user checks for the error message {string}")
    public void userChecksForTheErrorMessage(String ErrorMsg) {
        String ExpectedErrMsg = driver.findElement(By.id("errorMessage")).getText();
        ActualErrorMsg= ErrorMsg;
        if(ActualErrorMsg.equals(ExpectedErrMsg)){
            System.out.println("the given msg are same");
        }
        else{
            System.out.println("the given msg are not same");
        }
    }
    @When("user moves to the account and list node and holds on")
    public void listNodeHoldsOn() {
        WebElement element = driver.findElement(By.id("nav-link-accountList"));
        Actions a= new Actions(driver);
        a.clickAndHold(element).build().perform();


    }

    @Then("the user can see the list of details available under accounts and lists")
    public void accountsAndLists() {
        driver.findElement(By.linkText("Baby Wishlist")).click();
    }


    @When("user clicks the dropdown the list of static values are displayed")
    public void dropDown() {
        category = driver.findElement(By.id("searchDropdownBox"));
        Select categoryElement = new Select(category);
        categoryElement.selectByValue("search-alias=amazon-devices");
    }

    @Then("user extracts the dropdown values")
    public void userExtractsTheDropdownValues() {
//        int catSize = category.findElements(By.tagName("option")).size();
//        List<String> dropdown=new ArrayList<String>();
//        for(int i=0;i<catSize;i++){
//            String catList = category.findElements(By.tagName("option")).get(i).getText();
//            //System.out.println(catList);
//            dropdown.add(catList);
        List<WebElement> dropdown= category.findElements(By.tagName("option"));
        List<String> values=new ArrayList<String>();
        for(WebElement dropvalue:dropdown){
           values.add(dropvalue.getText());
        }
        System.out.println(values);
        Boolean flag=false;
        int a=0;
        for(String compare:values){
            if(compare.equals("Bookss")){
                flag=true;
                a++;
                break;
            }
        }
        Assert.assertTrue(flag);
        if(a==1)
        {
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }

    }

    @Given("user navigates to the jquery webpage")
    public void userNavigatesToTheJqueryWebpage() {
        driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

    }

    @When("user performs drag and drop option")
    public void userPerformsDragAndDropOption() {
        WebElement frame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frame);
        WebElement dragElement = driver.findElement(By.id("draggable"));
        WebElement dropElement = driver.findElement(By.id("droppable"));
        Actions dragdrop= new Actions(driver);
        dragdrop.dragAndDrop(dragElement,dropElement).build().perform();
    }

    @Given("user extracts row and column value")
    public void RowAndColumnValue() {
        int columnName = driver.findElements(By.xpath("//table[@class='infobox ib-company vcard']/descendant::th")).size();
        for(int i=0;i<columnName;i++)
        {
            String clmName = driver.findElements(By.xpath("//table[@class='infobox ib-company vcard']/descendant::th")).get(i).getText();
            System.out.println(clmName);
            //       //table[@class='wikitable']//descendant::td[2] to access the enetire column
            //  

        }
    }
}
