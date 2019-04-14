package quest.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import quest.pages.TestPage;

public class TestPageSteps extends ScenarioSteps {

    private TestPage testPage;

    @Step
    public void isTheHomePage() {
        testPage.open();
        testPage.checkCurrentUrl();
    }

    @Step
    public void startsGame(final String testData) {
        testPage.enterTestData(testData);
        testPage.clickButtonSpin();
    }

    @Step
    public void resultsOfGameInMatrix(final String points) {
//        testPage.verifyWinboxValue(points);
        testPage.verifyCombinationIsSet(points);
    }

    @Step
    public void resultsOfGameOnPage(final String points) {
        testPage.verifyWinboxValue(points);
    }

    @Step
    public void verifyMatrixData() {
        testPage.clickButtonSpin();
        Integer[] rowValuesInStateA = testPage.checkPersistenceOfMatrixValues();
        testPage.clickButtonSpin();
        Integer[] rowValuesInStateB = testPage.checkPersistenceOfMatrixValues();
        if (rowValuesInStateA == rowValuesInStateB) {
            Assert.assertFalse("Error numbers in matrix are not changing", true);
        }
    }
}
