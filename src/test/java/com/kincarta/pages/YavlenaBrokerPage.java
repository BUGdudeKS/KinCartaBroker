package com.kincarta.pages;

import com.kincarta.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class YavlenaBrokerPage {
    public String[] agentNames;

    public YavlenaBrokerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
   // @FindBy(xpath = "//div[@class='language-dropdown']")
   // public WebElement LanguageSelector;

    @FindBy(xpath = "//div[@class='language-dropdown']/span['dropdown-label']")
    public WebElement DropDownLan;

   @FindBy(xpath = "//a[@data-lang='en']")
  public WebElement EnglishLanguage;

//@FindBy(partialLinkText = )
//public WebElement LoadMore;
    @FindBy(className = "load-more-results-list")
   public WebElement LoadMoreButton;



    @FindBy(xpath = "(//input[@id='searchBox'])[2]")
    public WebElement searchBox2;

    public List<WebElement> agentElements;






}
