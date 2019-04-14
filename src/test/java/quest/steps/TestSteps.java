package quest.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import quest.steps.serenity.TestPageSteps;

public class TestSteps {

    @Steps
    private TestPageSteps testPageSteps;

    @Given("the user is on TEST home page")
    public void givenTheUserIsOnTestHomePage() {
        testPageSteps.isTheHomePage();
    }

    @When("the user starts the game with '(.*)'")
    public void whenTheUserStartsTheGame(final String testData) {
        testPageSteps.startsGame(testData);
    }

    @Then("the user win the game with '(.*)'")
    public void thenTheUserWinTheGame(final String points) {
        testPageSteps.resultsOfGameInMatrix(points);
    }

    @Then("the user win the points of '(.*)'")
    public void thenTheUserWinThePointsOf(final String points) {
        testPageSteps.resultsOfGameOnPage(points);
    }

    @Then("the user verify values are changing")
    public void thenTheUserVerifyValuesAreChanging() {
        testPageSteps.verifyMatrixData();
    }

}
