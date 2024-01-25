package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import static org.example.stepDefs.Hooks.driver;
public class D02_login {
    P02_login login01=new P02_login();
        @When("user go to valid_login page")
        public void login_p(){
            login01.login_page.click();
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

    @Then("user navigate to home page")
    public void userNavigateToHomePage() {
        SoftAssert soft = new SoftAssert();

        String Cur_url = driver.getCurrentUrl();
        String Exp_url ="https://demo.nopcommerce.com/";
        soft.assertEquals(Cur_url,Exp_url);
        String Act_tab=login01.my_account.getText();
        soft.assertEquals(Act_tab,"My account");

            soft.assertAll();
    }


    // negative scenario
    @When("user go to login page")
    public void userGoToLoginPage() {
            login01.login_page.click();
    }

    @And("user login with invalid email {string}")
    public void userLoginWithInvalidEmail(String arg0) {
            login01.email.sendKeys(arg0);
    }

    @And("user fill invalid password")
    public void userFillInvalidPassword() {
            login01.password.sendKeys("hjs875@");
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
            login01.login_button.click();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert soft = new SoftAssert();

        String CurrentText = login01.login_error_msg.getText().toLowerCase();
        soft.assertTrue(CurrentText.contains("login was unsuccessful"));

        String CurrentColor = login01.login_error_msg.getCssValue("color");
        soft.assertEquals(CurrentColor, "rgba(228, 67, 75, 1)");

        System.out.println(CurrentText);
        soft.assertAll();


    }




}

