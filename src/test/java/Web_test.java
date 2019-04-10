import junit.framework.Test;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.awt.*;

public class Web_test {
    public static Test suite(){
        return new TestSuite(Web_test.class);
    }
public void testWeb()throws AWTException, InterruptedException {

    WebDriver driver = new FirefoxDriver();
    driver.get("http://home.mitrais.com/");
}
}
