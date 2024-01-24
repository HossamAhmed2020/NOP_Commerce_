package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.example.stepDefs.Hooks.driver;

public class D07_followUs {
    P03_HomePage icon = new P03_HomePage();

    //facebook
    @When("user opens facebook link")
    public void facebook(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        icon.facebook.click();
//        ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
    }

    @Then("the link of facebook will open in new tap{string}")
    public void theLinkOpenInNewTap(String arg0) throws InterruptedException {
        ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String face_url=driver.getCurrentUrl();
        Assert.assertEquals(face_url,arg0);



    }

    //twitter
    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        icon.twitter.click();
    }

    @Then("the link of twitter will open in new tap{string}")
    public void theLinkOfTwitterWillOpenInNewTap(String arg0) {
        ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String face_url=driver.getCurrentUrl();
        Assert.assertEquals(face_url,arg0);
    }

    //rss
    @When("user opens rss link")
    public void userOpensRssLink() {
        icon.rss.click();
    }

    @Then("the link of rss will open in new tap{string}")
    public void theLinkOfRssWillOpenInNewTap(String arg0) {
        ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String face_url=driver.getCurrentUrl();
        Assert.assertEquals(face_url,arg0);
    }

    //youtube
    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        icon.youtube.click();
    }

    @Then("the link of youtube will open in new tap{string}")
    public void theLinkOfYoutubeWillOpeneInNewTap(String arg0) {
        ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String face_url=driver.getCurrentUrl();
        Assert.assertEquals(face_url,arg0);
    }
}
