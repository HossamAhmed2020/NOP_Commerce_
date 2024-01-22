package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.example.stepDefs.Hooks.driver;

import java.util.List;


public class D03_currencies {
    P03_HomePage select_euro=new P03_HomePage();
    @When("user call currencies dropdown list")
    public void call_list(){
        select_euro.Currency_list.click();
    }

    @And("user Select EURO currency")
    public void userSelectEUROCurrency() {
        Select Euro = new Select (select_euro.Currency_list);
        Euro.selectByIndex(1);
//        Select Euro_currency =new Select(select_euro.Euro);
//        Euro_currency.selectByIndex(1);

    }

    @Then("EURO currency is selected")
    public void euroCurrencyIsSelected() throws InterruptedException {

        List<WebElement> product = driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        StringBuilder output = new StringBuilder();


        for (int i=0;i<product.size();i++){
            String element_text =product.get(i).getText();
            output.append(element_text).append("\n");

        }
        assert output.toString().contains("€");
        System.out.println(output);


    }

}

