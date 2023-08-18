package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.OnlineSlotsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class HomePageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @And("^User accepts cookies$")
    public void userAcceptsCookies() {
        new HomePage().clickOnCookies();
    }

    @When("^I click on Online Slots link$")
    public void iClickOnOnlineSlotsLink() {
        new HomePage().clickOnOnlineSlotsLink();
    }

    @Then("^I should navigate to Online Slots page successfully$")
    public void iShouldNavigateToOnlineSlotsPageSuccessfully() {
        String expectedMessage = "Play Online Slots at Virgin Games";
        String actualMessage = new OnlineSlotsPage().getOnlineSlotsText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

}
