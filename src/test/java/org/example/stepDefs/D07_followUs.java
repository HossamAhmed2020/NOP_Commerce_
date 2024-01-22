package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.example.stepDefs.Hooks.driver;

public class D07_followUs {
    P03_HomePage icon = new P03_HomePage();
    @When("user opens facebook link")
    public void facebook(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        icon.facebook.click();
    }

    @Then("the link open in new tap{string}")
    public void theLinkOpenInNewTap(String arg0) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String face_url= driver.getCurrentUrl();
        System.out.println(face_url);
        Assert.assertEquals(face_url,arg0);
        Thread.sleep(3000);
        driver.navigate().back();


    }
}
