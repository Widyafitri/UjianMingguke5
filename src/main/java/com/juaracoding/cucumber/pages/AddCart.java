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
    WebElement txtDressItem;

    @FindBy(xpath = "//a[contains(text(),'playboy x missguided plus size grey lips print fro')]")
    WebElement txtTShirtItem;

    public void clickDressItem() {
        clickDressItem.click();
    }

    public void clickTShirtItem() {
        clickTShirtItem.click();
    }

    public void chooseColor(String color) {
        Select selectColorOptions = new Select(this.color);

        selectColorOptions.selectByValue(color);
    }

    public void chooseSize(String size) {
        Select selectSizeOptions = new Select(this.size);
        selectSizeOptions.selectByValue(size);
    }

    public void clickBtnAddCart() {

        btnAddCart.click();
    }

    public void clickIconCart() {
        btnViewCart.click();
    }

    public String getTxtDressItem() {
        return txtDressItem.getText();
    }

    public String getTxtTShirtItem() {
        return txtTShirtItem.getText();
    }
}
