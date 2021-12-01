package com.mobile.xcart.testsuite;

import com.mobile.xcart.pages.*;
import com.mobile.xcart.testbase.TestBase;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {

    BestSellersPage bestSellersPage = new BestSellersPage();
    ComingSoonPage comingSoonPage = new ComingSoonPage();
    ContactUsPage contactUsPage = new ContactUsPage();
    HomePage homePage = new HomePage();
    NewMenuPage newMenuPage = new NewMenuPage();
    SalePage salePage = new SalePage();
    ShippingPage shippingPage = new ShippingPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    SecureCheckoutPage secureCheckoutPage = new SecureCheckoutPage();
    OrderSuccessfulPage orderSuccessfulPage = new OrderSuccessfulPage();
    VinylIdolzGhosBustersPage vinylIdolzGhosBustersPage = new VinylIdolzGhosBustersPage();

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForAvengersProduct() throws InterruptedException {
        homePage.hoverOnHotDealsLinkAndThenSaleLinkAndClick();
        salePage.doVerifyWelcomeTextFromSalePage();
        salePage.mouseHoverOnSortByAndClick();
        salePage.mouseHoverOnAToZAndClick();
        salePage.clickOnAddToCartButton();
        salePage.doVerifyAddToCartConfirmationMessage();
        salePage.clickOnCloseMessageButton();
        salePage.clickOnYourCartAndClickOnViewCart();

        shoppingCartPage.verifyShoppingCartPageText();
        Thread.sleep(3000);
        shoppingCartPage.clearQuantityField();
        Thread.sleep(3000);
        shoppingCartPage.sendUpdatedQuantityToTheQuantityField("2");
        Thread.sleep(3000);
        shoppingCartPage.verifyTheTextYourShoppingCart2Items();
        Thread.sleep(3000);
        shoppingCartPage.verifyTheSubtotalAmount();
        Thread.sleep(3000);
        shoppingCartPage.verifyTheTotalAmount();
        shoppingCartPage.clickOnTheGoToCheckoutButton();

        checkoutPage.verifyCheckoutPageWelcomeText();
        checkoutPage.enterEmailAddressInTheEmailField();
        checkoutPage.clickOnTheContinueButton();

        secureCheckoutPage.doVerifySecureCheckoutWelcomeText();
        secureCheckoutPage.fillMandatoryNameField("Jolly");
        secureCheckoutPage.fillMandatoryLastNameField("James");
        secureCheckoutPage.fillMandatoryAddressField("999 Prime Road");
        secureCheckoutPage.fillMandatoryStateField("England");
        secureCheckoutPage.clickOnCreateProfileBox();
        secureCheckoutPage.fillMandatoryPasswordField("1234567");
        secureCheckoutPage.selectDeliveryMethodAsLocalShipping();
        secureCheckoutPage.selectPaymentMethodAsCOD();
        Thread.sleep(2000);
        secureCheckoutPage.verifyTheTotalAmount();
        secureCheckoutPage.clickOnThePlaceOrderButton();
        orderSuccessfulPage.verifyTheSuccessfulPageWelcomeMessage();
    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException{
        homePage.hoverOnHotDealsLinkAndClickOnBestSellers();

        bestSellersPage.verifyWelcomeTextFromBestSellersPage();
        bestSellersPage.mouseHoverOnSortBy();
        Thread.sleep(3000);
        bestSellersPage.clickOnNameAtoZ();
        Thread.sleep(3000);
        bestSellersPage.clickOnAddToCartButtonOfVinylIdolGhostBusters();

        vinylIdolzGhosBustersPage.clickOnAddToCartButton();
        vinylIdolzGhosBustersPage.verifyProductHasBeenAddedToYourCartMessage();
        vinylIdolzGhosBustersPage.closeTheProductHasBeenAddedToYourCartMessage();
        Thread.sleep(2000);
        vinylIdolzGhosBustersPage.clickOnYourCartAndClickOnViewCart();

        shoppingCartPage.verifyShoppingCartPageText();
        shoppingCartPage.clickOnEmptyYourCartLink();
        Thread.sleep(2500);
        shoppingCartPage.verifyTheTextAreYouSureYouWantToClearTheCartFromAlert();
        shoppingCartPage.clickOKOnAlert();
        shoppingCartPage.verifyTheItemDeletedFromYourCartMessage();
        Thread.sleep(2000);
        shoppingCartPage.verifyYourCartIsEmptyMessage();
    }
}
