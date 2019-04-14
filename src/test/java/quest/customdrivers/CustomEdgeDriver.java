package quest.customdrivers;

import io.github.bonigarcia.wdm.EdgeDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class CustomEdgeDriver implements DriverSource {
    @Override
    public WebDriver newDriver() {
        EdgeDriverManager.getInstance().setup();
        return new EdgeDriver();
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
