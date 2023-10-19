package StepDefinitions;

import PageObjectModels.DialogContent;
import PageObjectModels.LeftNav;
import Utilities.Events;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.Even;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SchoolSetupLocationSteps extends Events {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    @Given("Click on the elements in LefNav")
    public void clickOnTheElementsInLefNav(DataTable dt) {

        List<String> list = dt.asList();
        for (int i = 0; i <list.size() ; i++) {
            WebElement element = ln.getWebElement(list.get(i));
            Events.click(element);

        }
    }

    @And("Click on the elements in Dialog")
    public void clickOnTheElementsInDialog(DataTable dt) {
        List<String> list = dt.asList();
        for (int i = 0; i <list.size() ; i++) {
            WebElement element = dc.getWebElement(list.get(i));
            Events.click(element);

        }
    }

    @And("The admin user sending the informations in Dialog and choose the location type")
    public void theAdminUserSendingTheInformationsInDialogAndChooseTheLocationType(DataTable dt) {
        List<List<String>> lists = dt.asLists();
        for (int i = 0; i <lists.size() ; i++) {
            WebElement element = dc.getWebElement(lists.get(i).get(0));
            Events.sendKeys(element,lists.get(i).get(1));
        }

    }

    @And("Click on the save element in Dialog")
    public void clickOnTheSaveElementInDialog(DataTable dt) {
        List<String> list = dt.asList();
        for (int i = 0; i <list.size() ; i++) {

            WebElement element = dc.getWebElement(list.get(i));
            Events.click(element);
        }
    }

    @Then("Success message should be display")
    public void successMessageShouldBeDisplay() {

        Events.verifyContainsText(dc.successMsg,"successfully");
    }

    @When("The admin click on the edit element Dialog")
    public void theAdminClickOnTheEditElementDialog(DataTable dt) {

        List<String> list = dt.asList();
        for (int i = 0; i <list.size() ; i++) {

            WebElement element = dc.getWebElement(list.get(i));
            Events.click(element);
        }
    }

    @Then("The admin user sending new locations information in Dialog")
    public void theAdminUserSendingNewLocationsInformationInDialog(DataTable dt) {
        List<List<String>> lists = dt.asLists();
        for (int i = 0; i <lists.size() ; i++) {
            WebElement element = dc.getWebElement(lists.get(i).get(0));
            Events.sendKeys(element,lists.get(i).get(1));

        }


    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable dt) {


        List<String> list = dt.asList();
        for (int i = 0; i <list.size() ; i++) {

            WebElement element = dc.getWebElement(list.get(i));
            Events.click(element);
        }


    }


    @And("Click on the element in Dialog for deleting")
    public void clickOnTheElementInDialogForDeleting(DataTable dt) {

        List<String> list = dt.asList();
        for (int i = 0; i <list.size() ; i++) {

            WebElement element = dc.getWebElement(list.get(i));
            Events.click(element);
        }

    }
}
