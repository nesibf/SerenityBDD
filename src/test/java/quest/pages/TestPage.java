package quest.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

@DefaultUrl("file:///C:/QA_Task/Test_Task.html")
public class TestPage extends PageObject {

    private static final int LOADELEMENT = 5;

    @FindBy(css = "#reel1 > div.notch.notch1")
    private WebElementFacade valueA11;

    @FindBy(css = "#reel2 > div.notch.notch1")
    private WebElementFacade valueA12;

    @FindBy(css = "#reel3 > div.notch.notch1")
    private WebElementFacade valueA13;

    @FindBy(css = "#reel4 > div.notch.notch1")
    private WebElementFacade valueA14;

    @FindBy(css = "#reel5 > div.notch.notch1")
    private WebElementFacade valueA15;

    @FindBy(css = "#reel1 > div.notch.notch2")
    private WebElementFacade valueA21;

    @FindBy(css = "#reel2 > div.notch.notch2")
    private WebElementFacade valueA22;

    @FindBy(css = "#reel3 > div.notch.notch2")
    private WebElementFacade valueA23;

    @FindBy(css = "#reel4 > div.notch.notch2")
    private WebElementFacade valueA24;

    @FindBy(css = "#reel5 > div.notch.notch2")
    private WebElementFacade valueA25;

    @FindBy(css = "#reel1 > div.notch.notch2.blinkme")
    private WebElementFacade valueA21Blink;

    @FindBy(css = "#reel2 > div.notch.notch2.blinkme")
    private WebElementFacade valueA22Blink;

    @FindBy(css = "#reel3 > div.notch.notch2.blinkme")
    private WebElementFacade valueA23Blink;

    @FindBy(css = "#reel4 > div.notch.notch2.blinkme")
    private WebElementFacade valueA24Blink;

    @FindBy(css = "#reel5 > div.notch.notch2.blinkme")
    private WebElementFacade valueA25Blink;

    @FindBy(css = "#reel1 > div.notch.notch3")
    private WebElementFacade valueA31;

    @FindBy(css = "#reel2 > div.notch.notch3")
    private WebElementFacade valueA32;

    @FindBy(css = "#reel3 > div.notch.notch3")
    private WebElementFacade valueA33;

    @FindBy(css = "#reel4 > div.notch.notch3")
    private WebElementFacade valueA34;

    @FindBy(css = "#reel5 > div.notch.notch3")
    private WebElementFacade valueA35;

    @FindBy(id = "balance-value")
    private WebElementFacade inputBalanceValue;

    @FindBy(id = "testdata")
    private WebElementFacade inputTestData;

    @FindBy(id = "spinButton")
    private WebElementFacade buttonSpin;

    @FindBy(id = "winbox")
    private WebElementFacade winboxValue;


    public void clickButtonSpin() {
        buttonSpin.withTimeoutOf(LOADELEMENT, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void enterTestData(final String testData) {
        inputTestData.withTimeoutOf(LOADELEMENT, TimeUnit.SECONDS).type(testData);
    }

    public void verifyWinboxValue(final String expectedPoints) {
        if (Integer.parseInt(expectedPoints) != 0) {
            String elementName = "Win " + expectedPoints + " coins";
            WebElementFacade selectElement = find(By.linkText(elementName));
            selectElement.withTimeoutOf(LOADELEMENT, TimeUnit.SECONDS).waitUntilVisible().isVisible();
            Assert.assertEquals("Value is not OK",
                    selectElement,
                    elementName);
        }
    }

    public Integer[] checkPersistenceOfMatrixValues() {
        Integer[] values = {
                Integer.parseInt(valueA11.getTextValue()) +
                        Integer.parseInt(valueA12.getTextValue()) +
                        Integer.parseInt(valueA13.getTextValue()) +
                        Integer.parseInt(valueA14.getTextValue()) +
                        Integer.parseInt(valueA15.getTextValue()),
                Integer.parseInt(valueA21.getTextValue()) +
                        Integer.parseInt(valueA22.getTextValue()) +
                        Integer.parseInt(valueA23.getTextValue()) +
                        Integer.parseInt(valueA24.getTextValue()) +
                        Integer.parseInt(valueA25.getTextValue()),
                Integer.parseInt(valueA31.getTextValue()) +
                        Integer.parseInt(valueA32.getTextValue()) +
                        Integer.parseInt(valueA33.getTextValue()) +
                        Integer.parseInt(valueA34.getTextValue()) +
                        Integer.parseInt(valueA35.getTextValue())};
        return values;
    }

    public void verifyCombinationIsSet(final String expectedPoints) {
        if (Integer.parseInt(expectedPoints) == 60 ||
                Integer.parseInt(expectedPoints) == 120 ||
                Integer.parseInt(expectedPoints) == 180 ||
                Integer.parseInt(expectedPoints) == 240 ||
                Integer.parseInt(expectedPoints) == 300) {
            valueA21Blink.withTimeoutOf(LOADELEMENT, TimeUnit.SECONDS).waitUntilVisible().isVisible();
            valueA22Blink.withTimeoutOf(LOADELEMENT, TimeUnit.SECONDS).waitUntilVisible().isVisible();
            valueA23Blink.withTimeoutOf(LOADELEMENT, TimeUnit.SECONDS).waitUntilVisible().isVisible();
        }
        if (Integer.parseInt(expectedPoints) == 80 ||
                Integer.parseInt(expectedPoints) == 160 ||
                Integer.parseInt(expectedPoints) == 240 ||
                Integer.parseInt(expectedPoints) == 320 ||
                Integer.parseInt(expectedPoints) == 400) {
            valueA21Blink.withTimeoutOf(LOADELEMENT, TimeUnit.SECONDS).waitUntilVisible().isVisible();
            valueA22Blink.withTimeoutOf(LOADELEMENT, TimeUnit.SECONDS).waitUntilVisible().isVisible();
            valueA23Blink.withTimeoutOf(LOADELEMENT, TimeUnit.SECONDS).waitUntilVisible().isVisible();
            valueA24Blink.withTimeoutOf(LOADELEMENT, TimeUnit.SECONDS).waitUntilVisible().isVisible();
        }
        if (Integer.parseInt(expectedPoints) == 100 ||
                Integer.parseInt(expectedPoints) == 200 ||
                Integer.parseInt(expectedPoints) == 300 ||
                Integer.parseInt(expectedPoints) == 400 ||
                Integer.parseInt(expectedPoints) == 500) {
            valueA21Blink.withTimeoutOf(LOADELEMENT, TimeUnit.SECONDS).waitUntilVisible().isVisible();
            valueA22Blink.withTimeoutOf(LOADELEMENT, TimeUnit.SECONDS).waitUntilVisible().isVisible();
            valueA23Blink.withTimeoutOf(LOADELEMENT, TimeUnit.SECONDS).waitUntilVisible().isVisible();
            valueA24Blink.withTimeoutOf(LOADELEMENT, TimeUnit.SECONDS).waitUntilVisible().isVisible();
            valueA25Blink.withTimeoutOf(LOADELEMENT, TimeUnit.SECONDS).waitUntilVisible().isVisible();
        }
    }

    public void checkCurrentUrl() {
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals("file:///C:/QA_Task/Test_Task.html", currentUrl);
    }

}
