package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class D04_search {
    P03_HomePage search=new P03_HomePage();
    @When("user could search about product {string}")
    public void userCouldSearchAboutProduct(String arg0) {
        search.search_field.sendKeys(arg0);
    }


    @And("click search button")
    public void clickSearchButton() {
        search.search_botton.click();
    }


    @Then("items is appeared")
    public void iteamsIsAppeared() {
//        String ActUrl=driver.getCurrentUrl();
//        String ExpUrl ="https://demo.nopcommerce.com/search?q=";
//        Assert.assertTrue(ActUrl.contains(ExpUrl));

        List<WebElement> products = driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
        StringBuilder output = new StringBuilder();


        for (int i=0;i<products.size();i++){
            String element_text =products.get(i).getText().toLowerCase();
            output.append(element_text).append("\n");

        }
        System.out.println(output);
        assert output.toString().contains("apple");




    }



    @And("user click on product")
    public void userClickOnProduct() {
        search.product.click();

    }

    @Then("SKU is appeared")
    public void skuIsAppeared() {
        String Act_text =search.SKU.getText();
        String Exp_text = "APPLE_CAM";
        Assert.assertEquals(Act_text,Exp_text);
        System.out.println(Act_text);

    }

    @When("user could search about product using SKU {string}")
    public void userCouldSearchAboutProductUsingSKU(String arg0) {
        search.search_field.sendKeys(arg0);
    }
}
