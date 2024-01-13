package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_reg;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D01_Register {

    P01_reg reg = new P01_reg();


    @When("user go to register page")
    public void user_reg(){
        reg.register.click();

    }

    @And("user choose gender")
    public void userChooseGender() {
        reg.gender.click();
    }

    @And("user select the date of birth")
    public void userSelectTheDateOfBirth() {

        Select select01= new Select(reg.selectDay);
        select01.selectByValue("2");
        Select select02=new Select(reg.selectMonth);
        select02.selectByValue("8");
        Select select03=new Select(reg.selectYear);
        select03.selectByValue("1974");
    }

    @And("user entre Email")
    public void userEntreEmail() {
        reg.Email.sendKeys("Hos123@gmail.com");

//
//        Faker fakemail = new Faker();
//        String mail = fakemail.internet().emailAddress();
//        reg.Email.sendKeys(mail);
//        System.out.println(mail);

    }

    @And("user entre company name")
    public void userEntreCompanyName() {
        reg.Company.sendKeys("MGO");


    }

    @And("user check Newsletter")
    public void userCheckNewsletter() {
        if (reg.News.isSelected()!= true){
            reg.News.click();
        }
    }
    @And("user entre password and confirm")
    public void userEntrePasswordAndConfirm() {
        reg.password.sendKeys("Hos555666");
        reg.confirmPassword.sendKeys("Hos555666");
    }

    @And("user click on the register button")
    public void userClickOnTheRegisterButton() {
        reg.registerButton.click();
    }

    @Then("The account is created successfully")
    public void theAccountIsCreatedSuccessfully() {

        SoftAssert soft = new SoftAssert();

        String CurrentText = driver.findElement(By.className("result")).getText();

            soft.assertEquals(CurrentText.toLowerCase(), "your registration completed");

            String CurrentColor = driver.findElement(By.className("result")).getCssValue("color");
            soft.assertEquals(CurrentColor, "rgba(76, 177, 124, 1)");

        soft.assertAll();
    }

    @And("user entre last name{string}")
    public void userEntreLastName(String arg0) {
        reg.LastName.sendKeys("ahmed");
    }

    @And("user entre first name{string}")
    public void userEntreFirstName(String arg0) {
        reg.FirstName.sendKeys("Hossam");
    }


    }

