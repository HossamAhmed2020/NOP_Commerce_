package org.example.stepDefs;

import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Point;

import static org.example.stepDefs.Hooks.driver;

public class prac {

    WebDriver driver;

    @BeforeMethod
    public void open() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");


    }

    @Test
    public void test() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        //WebDriver driver;
/*
        driver.findElement(By.id("customerCurrency")).click();
        WebElement euro =driver.findElement(By.cssSelector("div>div>div>div>div>select"));

        Select Euro_currency =new Select(euro);
        Euro_currency.selectByIndex(1);
      // driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]/option[2]")).click();
        Thread.sleep(4000);
        List<WebElement> product = driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        StringBuilder output = new StringBuilder();


        for (int i=0;i<product.size();i++){
           String element_text =product.get(i).getText();
           output.append(element_text).append("\n");

        }
        assert output.toString().contains("€");
        System.out.println(output);


        WebElement Euro=driver.findElement(By.id("customerCurrency"));
        Select select_Euro = new Select (Euro);
        select_Euro.selectByIndex(1);
//        deselectByVisibleText("Euro");


        String current_url=driver.getCurrentUrl();
        System.out.println(current_url);


 */
        // (//div[@class="sublist-toggle"])[1]

//        WebElement ele = driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
//        Actions act = new Actions(driver);
//        act.moveToElement(ele).perform();




//        List<WebElement> Li = driver.findElements(By.cssSelector("div>ul>li>a"));
//
//        int min1 = 0; // Minimum value of range
//        int max1 = Li.size()-1; // Maximum value of range
//        int random_int1 = (int)Math.floor(Math.random() * (max1 - min1 + 1) + min1);
//
//        Li.get(random_int1).click();




//        StringBuilder output = new StringBuilder();
//
//
//        for (int i=0;i<products.size();i++){
//            String element_text =products.get(i).getText().toLowerCase();
//            output.append(element_text).append("\n");
//
//        }
//        System.out.println(output);


    }
    @Test
    public void test01(){
//        List<WebElement> products = new ArrayList<>();
//        products.add(driver.findElement(By.cssSelector("a[href=\"/computers\"]")));
//        products.add(driver.findElement(By.cssSelector("a[href=\"/electronics\"]")));
//        products.add(driver.findElement(By.cssSelector("a[href=\"/apparel\"]")));
//
//        Random random = new Random();
//        WebElement r_index = products.get(random.nextInt(products.size()));
//        System.out.println(r_index);
//        Actions act = new Actions(driver);
//        act.moveToElement(r_index).perform();
        /*
        List<WebElement> mainCategories = driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]"));
        StringBuilder output = new StringBuilder();
        int itemsToGet = Math.min(mainCategories.size(), 3);
        for (int i = 0; i < itemsToGet; i++) {
            String elementText = mainCategories.get(i).getText();
            output.append(elementText).append("\n");
        }
        System.out.println(output);

         */
//Hover for main and sub random
        /*
        List<WebElement> Li = driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li"));
        if (!Li.isEmpty()) {
            // Generate a random index within the range [0, 2]
            int randomIndex = new Random().nextInt(Math.min(3,Li.size()));
            Actions act = new Actions(driver);
            act.moveToElement(Li.get(randomIndex)).perform();
            // Click on the randomly selected item
            // Li.get(randomIndex).click();
        } else {
            System.out.println("No items found in the list.");
        }
        System.out.println();
        List<WebElement> Li2 = driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul>li>a"));
        if (!Li2.isEmpty()) {
            // Generate a random index for the sub-category
            int randomSubCategoryIndex = new Random().nextInt(Li2.size());

            // Click on the randomly selected sub-category
            Li2.get(randomSubCategoryIndex).click();
        } else {
            System.out.println("No sub-categories found in the selected main category.");
        }

         */

//
//        int min1 = 0; // Minimum value of range
//        int max1 = Li.size()-1; // Maximum value of range
//        int random_int1 = (int)Math.floor(Math.random() * (max1 - min1 + 1) + min1);

//        Li.get(random_int1).click();


        // Hover over the main category
            //actions.moveToElement(mainCategory).perform();

//        StringBuilder output = new StringBuilder();
//
//
//        for (int i=0;i<products.size();i++){
//            String element_text =products.get(i).getText().toLowerCase();
//            output.append(element_text).append("\n");
//
//        }
//        System.out.println(output);



    }

    @AfterMethod
    public void quit()throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }



}
