package com.kincarta.step_definitions;

import com.google.common.base.Verify;
import com.kincarta.pages.YavlenaBrokerPage;
import com.kincarta.utilities.BrowserUtils;
import com.kincarta.utilities.ConfigurationReader;
import com.kincarta.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Yavlena_StepDefinitions {

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
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//div[@class='load-more-brokers']/a")).click();

    }
    @Then("for each broker on the page, search by the broker's name")
    public void for_each_broker_on_the_page_search_by_the_broker_s_name() throws InterruptedException {
        Thread.sleep(2000);

        List<WebElement> allBrokers= Driver.getDriver().findElements(By.xpath("//article[@class='broker-card']"));
        System.out.println(allBrokers.size());

        for (WebElement eachBroker : allBrokers) {
            String brokerName=eachBroker.findElement(By.className("name")).getText();
            System.out.println(brokerName);
            //System.out.println(eachBroker.getText());
            //System.out.println(eachBroker.getAttribute("href"));



        }



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






    }
    @Then("verify that the searched broker is the only one displayed")
    public void verify_that_the_searched_broker_is_the_only_one_displayed() {

    }
    /*
    @Then("verify the address, landline phone, mobile phone, and number of properties for the broker")
    public void verify_the_address_landline_phone_mobile_phone_and_number_of_properties_for_the_broker() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    */


}
