package com.mobile.xcart.testsuite;

import com.mobile.xcart.pages.*;
import com.mobile.xcart.testbase.TestBase;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {

    BestSellersPage bestSellersPage = new BestSellersPage();
    HomePage homePage = new HomePage();
    SalePage salePage = new SalePage();

    @Test
    public void verifySaleProductsAreArrangedAlphabetically() throws InterruptedException{
        homePage.hoverOnHotDealsLinkAndThenSaleLinkAndClick();
        salePage.doVerifyWelcomeTextFromSalePage();
        salePage.verifyProductsAreSortedAlphabeticallyFromAToZ();
    }

    @Test
    public void verifySaleProductsPriceArrangedLowToHigh() throws InterruptedException{

        homePage.hoverOnHotDealsLinkAndThenSaleLinkAndClick();
        salePage.doVerifyWelcomeTextFromSalePage();
        salePage.verifyProductsAreSortedAccordingToPriceLowToHigh();
    }

    @Test
    public void verifySalesProductsArrangedByRates() throws InterruptedException {

       homePage.hoverOnHotDealsLinkAndThenSaleLinkAndClick();
       salePage.doVerifyWelcomeTextFromSalePage();
       salePage.verifyProductsAreSortedAccordingToRatingHighToLow();
    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        homePage.clickOnBestSellersSubPage();
        bestSellersPage.verifyWelcomeTextFromBestSellersPage();
        bestSellersPage.verifyProductsAreSortedFromZtoA();

    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        homePage.clickOnBestSellersSubPage();
        bestSellersPage.verifyWelcomeTextFromBestSellersPage();
        bestSellersPage.verifyIfProductsAreSortedByPriceHighToLow();
    }

    @Test
    public void verifyBestSellersProductsAreArrangedByRates() throws InterruptedException {

        homePage.hoverOnHotDealsLinkAndClickOnBestSellers();
        bestSellersPage.verifyWelcomeTextFromBestSellersPage();
        bestSellersPage.verifyProductsAreSortedAccordingToRating();
    }

}
