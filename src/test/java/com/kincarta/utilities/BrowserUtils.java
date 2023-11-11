package com.kincarta.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(expectedTitle , Driver.getDriver().getTitle() );
    }


    public static void verifyTitleContains( String expectedInTitle){
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedInTitle));
    }


}
