package quest.customdrivers;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomChromeDriver implements DriverSource{


    @Override
    public WebDriver newDriver() {
        ChromeDriverManager.getInstance().setup();
        return new ChromeDriver();
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
