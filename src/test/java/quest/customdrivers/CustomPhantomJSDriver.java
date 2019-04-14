package quest.customdrivers;

import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;


public class CustomPhantomJSDriver implements DriverSource {
    @Override
    public WebDriver newDriver() {
        PhantomJsDriverManager.getInstance().setup();
        return new PhantomJSDriver();
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
