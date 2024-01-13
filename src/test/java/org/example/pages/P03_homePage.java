package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;
public class P03_homePage {
    public P03_homePage(){PageFactory.initElements(driver,this);}
    @FindBy(id = "customerCurrency")
    public WebElement Currency_list;
    @FindBy (xpath = "//*[@id=\"customerCurrency\"]/option[2]")
    public WebElement Euro;
    @FindBy (id = "small-searchterms")
    public WebElement search_field;
    @FindBy (className = "button-1 search-box-button")
    public WebElement search_botton;




}
