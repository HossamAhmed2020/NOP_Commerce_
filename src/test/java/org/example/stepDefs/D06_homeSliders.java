package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;

public class D06_homeSliders {
    P03_HomePage soldir=new P03_HomePage();
    @When("user search for  Nokia Lumia 1020")
    public void search_item(){
        soldir.search_field.sendKeys("Nokia Lumia 1020");
        soldir.search_botton.click();

    }




    @Then("check current url")
    public void checkCurrentUrl() {
    }

    @And("user select  {string}")
    public void userSelect(String arg0) {
    }
}
