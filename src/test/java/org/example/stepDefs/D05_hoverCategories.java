package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;
import java.util.Random;
import static org.example.stepDefs.Hooks.driver;

public class D05_hoverCategories {
    P03_HomePage hover =new P03_HomePage();
    @When("user could hover on list")
    public void hover_on_list(){
        List<WebElement> Li = driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li"));
        if (!Li.isEmpty()) {
            // Generate a random index within the range [0, 2]
            int randomIndex = new Random().nextInt(Math.min(3,Li.size()));
            Actions act = new Actions(driver);
        act.moveToElement(Li.get(randomIndex)).perform();
            // Click on the randomly selected item
        } else {
            System.out.println("No items found in the list.");
        }
        System.out.println();
        List<WebElement> Li2 = driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul>li"));
        if (!Li2.isEmpty()) {
            // Generate a random index for the sub-category
            int randomSubCategoryIndex = new Random().nextInt(Li2.size());

            // Click on the randomly selected sub-category
            Li2.get(randomSubCategoryIndex).click();
        } else {
            System.out.println("No sub-categories found in the selected main category.");
        }
    }


    @And("user select item")
    public void userSelectItem() {
    }

    @Then("select item from list")
    public void selectItemFromList() {
    }
}
