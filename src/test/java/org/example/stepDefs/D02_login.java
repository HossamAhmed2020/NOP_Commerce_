package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;
import org.example.stepDefs.D01_Register;

public class D02_login {
//D01_Register Femail = new D01_Register();

        P02_login login01=new P02_login();
        @When("user go to valid_login page")
        public void login_p(){
            login01.login_page.click();
        }

           // login01.email.sendKeys();


//        driver.findElement(By.id("Email")).sendKeys("Hos@gmail.com");
//        driver.findElement(By.id("Password")).sendKeys("hos555");
//        driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]")).click();



        @Then("user navigate to home page")
        public void userNavigateToHomePage() {
           // SoftAssert soft = new SoftAssert();

//        String CurrentText = driver.findElement(By.className("result")).getText();
//
//        soft.assertEquals(CurrentText.toLowerCase(), "your registration completed");

//            String CurrentColor = driver.findElement(By.className("result")).getCssValue("color");
//            soft.assertEquals(CurrentColor, "rgba(76, 177, 124, 1)");

         //   soft.assertAll();

        }

    @And("user fill password")
    public void userFillPassword() {
        login01.password.sendKeys("Hos555666");
    }

    @And("user click login")
    public void userClickLogin() {
        login01.login_button.click();

    }

    @And("user fill email{string}")
    public void userFillEmail(String arg0) {
        login01.email.sendKeys(arg0);

    }


    // negative scenario

//    @When("user go to invalid_login page")
//    public void userGoToInvalid_loginPage() {
//            login01.login_page.click();
//    }
//
//    @And("user fill invalid_email")
//    public void userFillInvalid_email() {
//            login01.email.sendKeys("hos");
//    }
}

