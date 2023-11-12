package com.kincarta.pages;

import com.kincarta.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class YavlenaBrokerPage {



    public YavlenaBrokerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//div[@class='language-dropdown']/span['dropdown-label']")
    public WebElement DropDownLan;

   @FindBy(xpath = "//a[@data-lang='en']")
  public WebElement EnglishLanguage;


    @FindBy(className = "load-more-results-list")
   public WebElement loadMoreButton;

@FindBy(xpath = "//head/title[1]")
public WebElement titleOfPage;

    @FindBy(xpath = "//*[@class='input-search']")
    public WebElement searchBox2;


   // @FindBy(className = "name")
    @FindBy(xpath = "//h3[@class='name']")
    public WebElement brokerName;

    //@FindBy(xpath = "//div[@class='tel-group']/span[@class='tel'][1]")
    @FindBy(xpath = "//a[.='+359 73 88 20 05']")
    public WebElement mobilePhone;


  //  @FindBy(xpath = "//div[@class='tel-group']/span[@class='tel'][2]")
    @FindBy(xpath = "//a[.='+359 886 880 290']")
    public WebElement landLinePhone;

    @FindBy(xpath = "//div[@class='office']")
    public WebElement addressOfBroker;

    @FindBy(xpath = "//a[.='(12 Properties)']")
    public WebElement propertiesLocator;

    @FindBy(xpath = "//article[@class='broker-card']")
    public List<WebElement> allBrokers;

    public String title(){

        return "Our team | Yavlena";
    }
    @FindBy(xpath = "//div[@class='broker-data']")
    public WebElement brokerData;

@FindBy(xpath = "//h3[@class='name']")
    public WebElement nameOfABroker;





}
