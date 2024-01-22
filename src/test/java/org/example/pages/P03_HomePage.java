package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;
public class P03_HomePage {
    public P03_HomePage(){PageFactory.initElements(driver,this);}
    @FindBy(id = "customerCurrency")
    public WebElement Currency_list;
    @FindBy (css = "input[id=\"small-searchterms\"]")
    public WebElement search_field;
    @FindBy (css = "button[class=\"button-1 search-box-button\"]")
    public WebElement search_botton;
  @FindBy (css = "div[class=\"details\"]>h2>a")
    public WebElement product;
  @FindBy(id ="sku-17")
    public WebElement SKU;




}
