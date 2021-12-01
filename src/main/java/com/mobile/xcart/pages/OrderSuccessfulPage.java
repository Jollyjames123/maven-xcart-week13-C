package com.mobile.xcart.pages;

import com.mobile.xcart.utility.Utility;
import org.openqa.selenium.By;

public class OrderSuccessfulPage extends Utility {

    By welcomeText = By.cssSelector("#page-title");

    public String getTextFromOrderSuccessfulPageWelcomeMessage(){
        return doGetTextFromElement(welcomeText);
    }

    public void verifyTheSuccessfulPageWelcomeMessage(){
        String expectedMessage = "Thank you for your order";
        String actualMessage = getTextFromOrderSuccessfulPageWelcomeMessage();
        doVerifyElements(expectedMessage, actualMessage, "Display message is incorrect");
    }
}
