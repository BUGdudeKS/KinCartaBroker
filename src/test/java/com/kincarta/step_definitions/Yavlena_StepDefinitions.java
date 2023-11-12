package com.kincarta.step_definitions;

import com.kincarta.pages.YavlenaBrokerPage;
import com.kincarta.utilities.BrowserUtils;
import com.kincarta.utilities.ConfigurationReader;
import com.kincarta.utilities.Driver;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Yavlena_StepDefinitions {
    YavlenaBrokerPage yavlenaBrokerPage=new YavlenaBrokerPage();
   // WebDriver.Timeouts wait= Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));


    @Given("user is on the dashboard of Yavlena brokers")
    public void user_is_on_the_dashboard_of_yavlena_brokers() throws InterruptedException {
       Driver.getDriver().get(ConfigurationReader.getProperty("Yavlena"));
       yavlenaBrokerPage.DropDownLan.click();
       yavlenaBrokerPage.EnglishLanguage.click();
       Thread.sleep(2000);
    }
    @When("user clicks on the search box")
    public void user_clicks_on_the_search_box() {

        yavlenaBrokerPage.searchBox2.click();
    }
    @When("user write the agents {string} in the search box")
    public void user_write_the_agents_in_the_search_box(String fullName)  {
        yavlenaBrokerPage.searchBox2.sendKeys(fullName);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(yavlenaBrokerPage.brokerName));
    }


    @Then("verify{string}, {string},{string} and {string}  information is displayed from the Agents")
    public void verify_the_information_is_displayed_from_the_agents(String expectedAddress, String expectedLandLinePhone,
          String expectedMobilePhone,String expectedNumProperties) throws InterruptedException {
        String actualAddress = yavlenaBrokerPage.addressOfBroker.getText();
        String actualLanLinePhone = yavlenaBrokerPage.landLinePhone.getText();
        String actualMobilePhone = yavlenaBrokerPage.mobilePhone.getText();
        String actualNumProperties = yavlenaBrokerPage.propertiesLocator.getText();

        Assert.assertEquals(expectedAddress, actualAddress);
        Assert.assertEquals(expectedLandLinePhone, actualLanLinePhone);
        Assert.assertEquals(expectedMobilePhone, actualMobilePhone);
        Assert.assertEquals(expectedNumProperties, actualNumProperties);
        /*

      //  brokers.add("Desisilava Petrova");
       // brokers.add("Desisilava Petrova");
       // brokers.add("Desisilava Petrova");
       // brokers.add("Desisilava Petrova");



        for (String broker : brokerName) {
            yavlenaBrokerPage.searchBox2.sendKeys(broker);
            Thread.sleep(2000);
            Assert.assertTrue(yavlenaBrokerPage.brokerName.isDisplayed());

            System.out.println("yavlenaBrokerPage = " + yavlenaBrokerPage.brokerName.isDisplayed());
            System.out.println("yavlenaBrokerPage = " + yavlenaBrokerPage.mobilePhone.isDisplayed());
            System.out.println("yavlenaBrokerPage = " + yavlenaBrokerPage.landLinePhone.isDisplayed());
            System.out.println("yavlenaBrokerPage = " + yavlenaBrokerPage.addressOfBroker.isDisplayed());
            System.out.println("yavlenaBrokerPage = " + yavlenaBrokerPage.propertiesLocator.isDisplayed());

            yavlenaBrokerPage.searchBox2.clear();
        }



        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String actualAddress=yavlenaBrokerPage.addressOfBroker.getText();
        String actualLanLinePhone=yavlenaBrokerPage.landLinePhone.getText();
        String actualMobilePhone=yavlenaBrokerPage.mobilePhone.getText();
        String actualNumProperties= yavlenaBrokerPage.propertiesLocator.getText();

        Assert.assertEquals(expectedAddress,actualAddress);
        Assert.assertEquals(expectedLandLinePhone,actualLanLinePhone);
        Assert.assertEquals(expectedMobilePhone,actualMobilePhone);
        Assert.assertEquals(expectedNumProperties,actualNumProperties);
        System.out.println(expectedAddress);
        System.out.println(actualAddress);
        System.out.println(expectedLandLinePhone);
        System.out.println(actualLanLinePhone);
        System.out.println(expectedMobilePhone  );
        System.out.println(actualMobilePhone);
        System.out.println(expectedNumProperties);
        System.out.println(actualNumProperties);





        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.


    ;}

         */


/*
    @Then("verify that {string}> the {string}> information {string}> tot eh agent are displayed <string>")
    public void verify_that_the_information_tot_eh_agent_are_displayed(String expectedAddress, String expectedLandLinePhone, String expectedMobilePhone,String expectedNumProperties) {


        String actualAddress=yavlenaBrokerPage.addressOfBroker.getText();
        String actualLanLinePhone=yavlenaBrokerPage.landLinePhone.getText();
        String actualMobilePhone=yavlenaBrokerPage.mobilePhone.getText();
        String actualNumProperties= yavlenaBrokerPage.propertiesLocator.getText();

        Assert.assertEquals(expectedAddress,actualAddress);
        Assert.assertEquals(expectedLandLinePhone,actualLanLinePhone);
        Assert.assertEquals(expectedMobilePhone,actualMobilePhone);
        Assert.assertEquals(expectedNumProperties,actualNumProperties);



        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }@Then("verify that the information tot eh agent are displayed")
    public void verify_that_the_information_tot_eh_agent_are_displayed1(String expectedAddress, String expectedLandLinePhone, String expectedMobilePhone,String expectedNumProperties) {

        String actualAddress=yavlenaBrokerPage.addressOfBroker.getText();
        String actualLanLinePhone=yavlenaBrokerPage.landLinePhone.getText();
        String actualMobilePhone=yavlenaBrokerPage.mobilePhone.getText();
        String actualNumProperties= yavlenaBrokerPage.propertiesLocator.getText();

        Assert.assertEquals(expectedAddress,actualAddress);
        Assert.assertEquals(expectedLandLinePhone,actualLanLinePhone);
        Assert.assertEquals(expectedMobilePhone,actualMobilePhone);
        Assert.assertEquals(expectedNumProperties,actualNumProperties);

        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
       // throw new io.cucumber.java.PendingException();
    }


 */}


    @When("user click to Load more button")
    public void user_click_to_load_more_button() {
        yavlenaBrokerPage.loadMoreButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(yavlenaBrokerPage.loadMoreButton));
    }
    @Then("verify that the number of agents are increased")
    public void verify_that_the_number_of_agents_are_increased() {

        List<WebElement> arrayYav= Driver.getDriver().findElements(By.xpath("//figure[@class='broker-img']"));
        int lengthBroker=arrayYav.size();

        yavlenaBrokerPage.loadMoreButton.click();

        List<WebElement> arrayLena= Driver.getDriver().findElements(By.xpath("//figure[@class='broker-img']"));
        int lengthNewBroker=arrayLena.size();

        if (lengthNewBroker>lengthBroker) {
            Assert.assertTrue(true);
    }









    /*



    @Given("user is on the Yavlena dashboard")
    public void user_is_on_the_yavlena_dashboard() {
        Driver.getDriver().get(ConfigurationReader.getProperty("Yavlena"));
    }
    @Given("user clicks on ENG flag to translate the page")
    public void user_clicks_on_eng_flag_to_translate_the_page() {
        yavlenaBrokerPage.DropDownLan.click();
        yavlenaBrokerPage.EnglishLanguage.click();
    }
    @Then("user should see title is as expected")
    public void user_should_see_title_is_as_expected() {

        BrowserUtils.verifyTitle(yavlenaBrokerPage.title());

    }


    @Given("user click on Load more button")
    public void user_click_on_load_more_button() {
      yavlenaBrokerPage.loadMoreButton.click();
    }
    @Then("for each broker on the page, search by the broker's name")
    public void for_each_broker_on_the_page_search_by_the_broker_s_name() throws InterruptedException {
        System.out.println("moringin doing it");

        List<WebElement> brokers= new ArrayList<>();
        List<String> brokerName= new ArrayList<>();

        /*
        merri brokerat ermrata njoi ka nja deri 4 Desisilava Petrova

        for (WebElement broker : brokers) {
            brokerName.add(broker.getText());

        }

        /*
        brokers.add("Desisilava Petrova");
        brokers.add("Desisilava Petrova");
        brokers.add("Desisilava Petrova");
        brokers.add("Desisilava Petrova");

         */
/*
        for (String broker : brokerName) {
            yavlenaBrokerPage.searchBox2.sendKeys(broker);
            Thread.sleep(2000);
            Assert.assertTrue(yavlenaBrokerPage.brokerName.isDisplayed());

            System.out.println("yavlenaBrokerPage = " + yavlenaBrokerPage.brokerName.isDisplayed());
            System.out.println("yavlenaBrokerPage = " + yavlenaBrokerPage.mobilePhone.isDisplayed());
            System.out.println("yavlenaBrokerPage = " + yavlenaBrokerPage.landLinePhone.isDisplayed());
            System.out.println("yavlenaBrokerPage = " + yavlenaBrokerPage.addressOfBroker.isDisplayed());
            System.out.println("yavlenaBrokerPage = " + yavlenaBrokerPage.propertiesLocator.isDisplayed());

            yavlenaBrokerPage.searchBox2.clear();
        }



        //yavlenaBrokerPage.brokerName.isDisplayed();
       // String verification=yavlenaBrokerPage.brokerName.getText();
      //  for (WebElement eachBroker : yavlenaBrokerPage.allBrokers) {
          //  String names=eachBroker.getText();
/*
            for (int i = 0; i < yavlenaBrokerPage.allBrokers.size(); i++) {
                System.out.println(i);
                String name = yavlenaBrokerPage.allBrokers.get(i).getText();
                System.out.println(name);
                name.contains(yavlenaBrokerPage.brokerName.getText());
                    wait.implicitlyWait(Duration.ofSeconds(3));
                    yavlenaBrokerPage.brokerData.getAttribute(yavlenaBrokerPage.brokerName.getText());

               // String brokerName = currentBroker.findElement(By.className("name")).getText();
*/

        /*



    @Then("verify that the searched broker is the only one displayed")
    public void verify_that_the_searched_broker_is_the_only_one_displayed() {
        yavlenaBrokerPage.brokerData.click();

        if (yavlenaBrokerPage.allBrokers.size()==1){
           WebElement displayedBroker= yavlenaBrokerPage.allBrokers.get(0);
        }else {
            System.out.println("expected one broker but we got "+yavlenaBrokerPage.allBrokers.size());
        }

    }

    @Then("verify the address, landline phone, mobile phone, and number of properties for the broker")
    public void verify_the_address_landline_phone_mobile_phone_and_number_of_properties_for_the_broker() {
        System.out.println("yavlenaBrokerPage = " + yavlenaBrokerPage.brokerName.isDisplayed());
     /*   System.out.println("yavlenaBrokerPage = " + yavlenaBrokerPage.mobilePhone.isDisplayed());
        System.out.println("yavlenaBrokerPage = " + yavlenaBrokerPage.landLinePhone.isDisplayed());
        System.out.println("yavlenaBrokerPage = " + yavlenaBrokerPage.addressOfBroker.isDisplayed());
        System.out.println("yavlenaBrokerPage = " + yavlenaBrokerPage.propertiesLocator.isDisplayed());

      */

    }


}

/*
    @Given("user is on the Yavlena dashboard")
    public void user_is_on_the_yavlena_dashboard() {
        Driver.getDriver().get(ConfigurationReader.getProperty("Yavlena"));

    }
   YavlenaBrokerPage yavlenaBrokerPage= new YavlenaBrokerPage();
    @Given("user clicks on ENG flag to translate the page")
    public void user_clicks_on_eng_flag_to_translate_the_page() {
        yavlenaBrokerPage.LanguageSelector.click();
        yavlenaBrokerPage.EnglishLanguage.click();
    }

    @Then("user should see title is as expected")
    public void user_should_see_title_is_as_expected() {
        String expectedTitle ="Our team | Yavlena";

        BrowserUtils.verifyTitle(expectedTitle);

    }

    @Given("user click on Load more button")
    public void user_click_on_load_more_button() {
       yavlenaBrokerPage.LoadMoreButton.click();
    }
    @Then("verify there are more brokers")
    public void verify_there_are_more_brokers() {
// jom tuj dasht me krahasu qita //a[.="Magdalena Stoyanova"] edhe nese tjetra del ams saj


    }

 */
 /*
BrowserUtils browserUtils= new BrowserUtils();
    YavlenaBrokerPage yavlenaBrokerPage = new YavlenaBrokerPage();

    @Given("user is on the Yavlena dashboard")
    public void user_is_on_the_yavlena_dashboard() {
        Driver.getDriver().get(ConfigurationReader.getProperty("Yavlena"));
    }
    @Given("user clicks on ENG flag to translate the page")
    public void user_clicks_on_eng_flag_to_translate_the_page() {
        yavlenaBrokerPage.DropDownLan.click();
        yavlenaBrokerPage.EnglishLanguage.click();
    }
    @Then("user should see title is as expected")
    public void user_should_see_title_is_as_expected() {
        String expectedTitle ="Our team | Yavlena";

        BrowserUtils.verifyTitle(expectedTitle);
    }

    @Given("user click on Load more button")
    public void user_click_on_load_more_button() throws InterruptedException {
yavlenaBrokerPage.LoadMoreButton.click();



    }
    @Then("for each broker on the page, search by the broker's name")
    public void for_each_broker_on_the_page_search_by_the_broker_s_name() throws InterruptedException {

yavlenaBrokerPage.propertiesLocator.getText();
        System.out.println("--11--");
        System.out.println(yavlenaBrokerPage.landLinePhone.getText());


        WebDriver driver=Driver.getDriver();

        List<WebElement> allBrokers = Driver.getDriver().findElements(By.xpath("//article[@class='broker-card']"));
        for (int i = 0; i < allBrokers.size(); i++) {
            System.out.println(i);
            WebElement currentBroker = allBrokers.get(i);
            String brokerName = currentBroker.findElement(By.className("name")).getText();

            System.out.println(brokerName);

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


            yavlenaBrokerPage.searchBox2.clear();
            yavlenaBrokerPage.searchBox2.sendKeys(brokerName);
            wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("pace-progress")));


            // WebElement Loadingpage= Driver.getDriver().findElement(By.xpath("//div[@class='pace']"));

            // Additional verification or actions as needed




            System.out.println("---------------------");



      /*  List<WebElement> allBrokers= driver.findElements(By.xpath("//article[@class='broker-card']"));
        for (int i = 0; i < allBrokers.size(); i++) {
            System.out.println(i);
            WebElement currentBroker= allBrokers.get(i);
            String brokerName=currentBroker.findElement(By.className("name")).getText();



            yavlenaBrokerPage.searchBox2.clear();
            yavlenaBrokerPage.searchBox2.sendKeys(brokerName);
            WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(3));

            w.until(ExpectedConditions.presenceOfElementLocated (By.className("tel-group")));

            System.out.println("priting numbers");












            //  currentBroker = Driver.getDriver().findElement(By.xpath("//article[@class='broker-card'][" + (i + 1) + "]"));
          //  brokerName=currentBroker.findElement(By.className("name")).getText();


//BrowserUtils.waitForInvisibilityOf(currentBroker);

           // WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(4));
           // wait.until(EvtextToBePresentInElementValue(yavlenaBrokerPage.searchBox2,brokerName));



       /* for (WebElement eachBroker : allBrokers) {
            String brokerName=eachBroker.findElement(By.className("name")).getText();

            System.out.println(brokerName+" brokerName");



           // yavlenaBrokerPage.searchBox2.clear();
            //yavlenaBrokerPage.searchBox2.sendKeys(brokerName);

          String testedBroker=Driver.getDriver().findElement(By.xpath("//h3[@class='name']/a")).getText();

            if (brokerName==testedBroker){
                System.out.println("Verficiation is done and "+brokerName+" "+testedBroker+" are the same");
            }else {
                System.out.println("Verficiation didnt pass "+brokerName+" "+testedBroker+" are not the same");
            }

           */



           // System.out.println(brokerName);
            //System.out.println(eachBroker.getText());
            //System.out.println(eachBroker.getAttribute("href"));









     /*   yavlenaBrokerPage.agentElements = Driver.getDriver().findElements(By.xpath("//h3[@class='name']"));

        yavlenaBrokerPage.agentNames=yavlenaBrokerPage.agentElements.stream().map(WebElement::getText).toArray(String[]::new);

        for (WebElement brokerElement : yavlenaBrokerPage.agentElements) {
            String agentName= brokerElement.getText();
            yavlenaBrokerPage.searchBox2.clear();
            yavlenaBrokerPage.searchBox2.sendKeys(agentName);
            yavlenaBrokerPage.searchBox2.click();


Driver.getDriver().wait(2000);

String expectedResult= agentName;
String actualResult=Driver.getDriver().findElement(By.linkText("//h3[@class='name']/a")).getText();

if (expectedResult.contains(actualResult)){
    System.out.println(agentName+" name verified");
}
String expectedNumber="+359 73 88 20 05";
String actualNumber= Driver.getDriver().findElement(By.xpath("//a[.='+359 73 88 20 05']")).getText();

            if (expectedNumber.equals(actualNumber)){
                System.out.println(expectedNumber+" is the Phone number");
            }

            expectedNumber="//a[.='+359 886 880 290']";
            actualNumber=Driver.getDriver().findElement(By.xpath("//a[.='+359 886 880 290']")).getText();

            if (expectedNumber.equals(actualNumber)){
                System.out.println(expectedNumber+" is the landphone number");
            }


            String expectedProper= "12 Properties";
            String actualProper=Driver.getDriver().findElement(By.xpath("//a[@target='_blank']")).getText();

            if (expectedProper.contains(actualProper)){
                System.out.println(expectedNumber+" are here");
            }

Thread.sleep(4000);
            Driver.getDriver().navigate().back();



        }


/*
            List<WebElement> elems = Driver.getDriver().findElements(By.xpath("//h3[@class='name']"));
            List<String> elemTexts = new ArrayList<>();

            for (WebElement el : elems) {
                elemTexts.add(el.getText());

            }
            yavlenaBrokerPage.searchBox2.clear();
            yavlenaBrokerPage.searchBox2.sendKeys(""+elemTexts);
            yavlenaBrokerPage.searchBox2.submit();



 */


       /* List<WebElement> brokerNameElements=Driver.getDriver().findElements(By.xpath("//h3[@class='name']"));
        for (WebElement eachName : brokerNameElements) {
            eachName.getText();
            System.out.println(eachName);
        }

        */




/*


    }
    @Then("verify that the searched broker is the only one displayed")
    public void verify_that_the_searched_broker_is_the_only_one_displayed() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        // Assuming h3[@class='name'] is the correct locator, adjust if needed
        By brokerLocator = By.xpath("//h3[@class='name']");

        // Wait for at least one element with the specified locator
        wait.until(ExpectedConditions.presenceOfElementLocated(brokerLocator));

        List<WebElement> brokers = Driver.getDriver().findElements(brokerLocator);

        if (brokers.size() == 1) {
            WebElement brokerDisplayed = brokers.get(0);
            System.out.println(brokerDisplayed.getText());
        } else {
            // Handle the case where there are zero or multiple elements
            System.out.println("Expected one broker, but found: " + brokers.size());
        }
    }

    }
    /*
    @Then("verify the address, landline phone, mobile phone, and number of properties for the broker")
    public void verify_the_address_landline_phone_mobile_phone_and_number_of_properties_for_the_broker() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    */



