package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;


public class D03_currencies {
    SoftAssert soft = new SoftAssert();
    P03_homePage select_euro=new P03_homePage();
    @When("user call currencies dropdown list")
    public void call_list(){}

    @And("user Select EURO currency")
    public void userSelectEUROCurrency() {
        select_euro.Currency_list.click();

    }

    @Then("EURO currency is selected")
    public void euroCurrencyIsSelected() throws InterruptedException {
       boolean Euro_isSelected= select_euro.Euro.findElements(By.xpath("\"//*[@id=\\\"customerCurrency\\\"]/option[2]\"")).get(1).isSelected();
        soft.assertTrue(Euro_isSelected);
        Thread.sleep(2000);

    }
}
