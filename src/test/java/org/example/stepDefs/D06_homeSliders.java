package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import static org.example.stepDefs.Hooks.driver;

public class D06_homeSliders {
    P03_HomePage soldir=new P03_HomePage();
    SoftAssert soft =new SoftAssert();

      //first scenario
    @When("user select first slider item")
    public void userSelectFirstSliderItem() {
        soldir.icon1.click();
        soldir.first_slider.click();

    }
    @Then("check current first url")
    public void checkCurrentUrl() {
        String Act_url=driver.getCurrentUrl();
        String Exp_url="https://demo.nopcommerce.com/nokia-lumia-1020";
        soft.assertEquals(Act_url,Exp_url);
        soft.assertAll();
    }


     //second scenario
    @When("user select  second slider item")
    public void userSelectSecondSliderItem() {
        soldir.icon2.click();
        soldir.second_slider.click();
    }

    @Then("check current second url")
    public void checkCurrentUrl_() {
        String Act_url=driver.getCurrentUrl();
        String Exp_url="https://demo.nopcommerce.com/nokia-lumia-1020";
        soft.assertEquals(Act_url,Exp_url);
        soft.assertAll();

    }
}
