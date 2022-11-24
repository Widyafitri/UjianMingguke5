package com.juaracoding.step_definitions;

import com.juaracoding.cucumber.pages.CheckoutProduct;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCheckoutProduct {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private CheckoutProduct checkoutProduct = new CheckoutProduct();

    public TestCheckoutProduct() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click button checkout")
    public void user_click_button_checkout() {
        checkoutProduct.clickBtnCheckout();
        extentTest.log(LogStatus.PASS,"User click buton checkout");
    }

    @And("User input firstname lastname")
    public void user_input_firstname_lastname() {
        checkoutProduct.name("Rinjani", "Rinjani");
        extentTest.log(LogStatus.PASS,"User input firstname lastname");
    }

    @And("User input company name just optional")
    public void user_input_company_name_just_optional() {
        checkoutProduct.companyName("PT.CITRA");
        extentTest.log(LogStatus.PASS,"User input company name just optional");
    }

    @And("User choose country")
    public void user_choose_country() {
        checkoutProduct.country(104);
        extentTest.log(LogStatus.PASS,"User choose country");
    }

    @And("User input address one")
    public void user_input_address_one() {
        checkoutProduct.addressOne("Jl.Tanjung Torowitan No 10");
        extentTest.log(LogStatus.PASS,"User input address one");
    }

    @And("User input address two just optional")
    public void user_input_address_two_just_optional() {
        checkoutProduct.addressTwo("Gedung 7A");
        extentTest.log(LogStatus.PASS,"User input address two");
    }

    @And("User input city")
    public void user_typing_city() {
        checkoutProduct.city("Pekanbaru");
        extentTest.log(LogStatus.PASS,"User input city");
    }

    @And("User choose province")
    public void user_choose_province() {
        checkoutProduct.province(5);
        extentTest.log(LogStatus.PASS,"User choose province");
    }

    @And("User input postcode")
    public void user_typing_postcode() {
        checkoutProduct.postcode("19233");
        extentTest.log(LogStatus.PASS,"User input postcode");
    }

    @And("User input phone number")
    public void user_typing_phone_number() {
        checkoutProduct.phoneNumber("082317652409");
        extentTest.log(LogStatus.PASS,"User input phone number");
    }

    @And("User enter notes just optional")
    public void user_enter_notes_just_optional() {
        checkoutProduct.notes("");
        extentTest.log(LogStatus.PASS,"User enter notes just optional");
    }

    @And("User click checkbox have read and agree")
    public void user_click_checkbox() {
        checkoutProduct.checkboxReadAgree();
        extentTest.log(LogStatus.PASS,"User click checkbox have read and agree");
    }

    @And("User click button place order")
    public void user_click_button_place_order() {
        checkoutProduct.clickBtnPlaceOrder();
        extentTest.log(LogStatus.PASS,"User click button place order");
   }

    @Then("Showing message Thank you. Your order has been received")
    public void showing_message_thank_you_your_order_has_been_received() {
        Assert.assertEquals(checkoutProduct.getTxtThankyou(),"Thank you. Your order has been received.");
        extentTest.log(LogStatus.PASS,"Showing message Thank you. Your order has been received");
    }
}
