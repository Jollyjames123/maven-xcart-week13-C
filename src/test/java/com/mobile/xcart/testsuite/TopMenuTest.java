package com.mobile.xcart.testsuite;

import com.mobile.xcart.pages.*;
import com.mobile.xcart.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {


    ComingSoonPage comingSoonPage = new ComingSoonPage();
    ContactUsPage contactUsPage = new ContactUsPage();
    HomePage homePage = new HomePage();
    NewMenuPage newMenuPage = new NewMenuPage();
    ShippingPage shippingPage = new ShippingPage();

    @Test
    public void userShouldBeAbleToNavigateToShippingPageSuccessfully() throws InterruptedException {
        homePage.navigateToAPageSuccessfully("Shipping");
        shippingPage.doVerifyWelcomeTextFromShippingPage();
    }

    @Test
    public void userShouldBeAbleToNavigateToNewPageSuccessfully() throws InterruptedException {
        homePage.navigateToAPageSuccessfully("New!");
        newMenuPage.doVerifyWelcomeTextFromNewPage();
    }

    @Test
    public void userShouldBeAbleToNavigateToComingSoonPageSuccessfully() throws InterruptedException {
        homePage.navigateToAPageSuccessfully("Coming soon");
        comingSoonPage.doVerifyWelcomeTextFromComingSoonPage();
    }

    @Test
    public void userShouldBeAbleToNavigateToContactUsPageSuccessfully() throws InterruptedException {
        homePage.navigateToAPageSuccessfully("Contact us");
        contactUsPage.doVerifyWelcomeTextFromContactUsPage();
    }
}
