package com.juaracoding.cucumber.pages;


import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='woocommerce-store-notice__dismiss-link']")
    WebElement clickDismiss;

    @FindBy(xpath = "//a[normalize-space()='My Account']")
    WebElement clickMenuMyAccount;

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[2]/span/span")
    WebElement visiblePassword;


    @FindBy(id = "rememberme")
    WebElement checklistRememberme;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
    WebElement btnLogin;

    @FindBy(xpath = "//strong[normalize-space()='ERROR']")
    WebElement txtError;

    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/div/p[1]/strong[1]")
    WebElement txtMyAccount;

    public void loginPage() {
        clickDismiss.click();
        clickMenuMyAccount.click();
    }

    public void loginForm(String email, String password) {
        this.username.sendKeys(email);
        this.password.sendKeys(password);
        visiblePassword.click();
        checklistRememberme.click();
    }

    public void clickBtnLogin() {

        btnLogin.click();
    }

    public String getTxtError() {

        return txtError.getText();
    }

    public String getTxtMyAccount() {
        return txtMyAccount.getText();
    }


}