package com.juaracoding.cucumber.pages;


import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCart {
    private WebDriver driver;

    public AddCart() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Black Cross Back Maxi Dress']")
    WebElement clickDressItem;

    //a[normalize-space()='Tokyo Talkies']

    @FindBy(xpath = "//a[contains(text(),'playboy x missguided plus size grey lips print fro')]")
    WebElement clickTShirtItem;

    @FindBy(id = "pa_color")
    WebElement color;

    @FindBy(id = "pa_size")
    WebElement size;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement btnAddCart;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div/div/div[1]/div/a")
    WebElement btnViewCart;

    @FindBy(xpath = "//a[normalize-space()='Black Cross Back Maxi Dress - Black']")
    WebElement txtDressProductItem;

    @FindBy(xpath = "//a[contains(text(),'playboy x missguided plus size grey lips print fro')]")
    WebElement txtTShirtProductItem;

    public void clickDressItem() {
        clickDressItem.click();
    }

    public void clickTShirtItem() {
        clickTShirtItem.click();
    }

    public void chooseColor(String color) {
        Select selectMenuColor = new Select(this.color);

        selectMenuColor.selectByValue(color);
    }

    public void chooseSize(String size) {
        Select selectMenuSize = new Select(this.size);
        selectMenuSize.selectByValue(size);
    }

    public void clickBtnAddCart() {

        btnAddCart.click();
    }

    public void clickIconCart() {
        btnViewCart.click();
    }

    public String getTxtDressProductItem() {
        return txtDressProductItem.getText();
    }

    public String getTxtTShirtProductItem() {
        return txtTShirtProductItem.getText();
    }
}
