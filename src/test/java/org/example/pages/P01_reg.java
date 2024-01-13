package org.example.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P01_reg {
    public P01_reg() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(className = "ico-register")
    public WebElement register;

    @FindBy(id = "gender-male")
    public WebElement gender;

    @FindBy(id = "FirstName")
    public WebElement FirstName;

    @FindBy(id = "LastName")
    public WebElement LastName;

    @FindBy(css = "select[name=\"DateOfBirthDay\"]")
    public WebElement selectDay;

    @FindBy(css = "select[name=\"DateOfBirthMonth\"]")
    public WebElement selectMonth;

    @FindBy(css = "select[name=\"DateOfBirthYear\"]")
    public WebElement selectYear;

    @FindBy(id = "Email")
    public WebElement Email;

    @FindBy(id = "Company")
    public WebElement Company;

    @FindBy(id = "Newsletter")
    public WebElement News;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy(id = "register-button")
    public WebElement registerButton;
}