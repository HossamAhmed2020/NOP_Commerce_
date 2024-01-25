package org.example.stepDefs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.testng.asserts.SoftAssert;

public class D08_Wishlist {
    P03_HomePage W_Botton=new P03_HomePage();
    @When("click on wishlist button")
    public void wishlist_button(){
        W_Botton.wishlist_B.click();
    }

    @Then("verify The product has been added to your wishlist")
    public void verifyTheProductHasBeenAddedToYourWishlist() {
        SoftAssert soft=new SoftAssert();
        String Act_text_msg =W_Botton.msg_appear.getText().toLowerCase();
        String Exp_text_msg="the product has been added to your wishlist";
        soft.assertEquals(Act_text_msg,Exp_text_msg);
        String Act_color=W_Botton.msg_appear.getCssValue("color");
        String Exp_color ="rgba(255, 255, 255, 1)";
        soft.assertEquals(Act_color,Exp_color);
        soft.assertAll();

    }
}
