import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Web_test1 {
        public static void main (String[]args) throws FindFailed, InterruptedException {
//            WebDriver driver = new FirefoxDriver();
//            driver.get(image.url);
            Screen s = new Screen();
            Pattern username = new Pattern(image.StackName);
            Pattern email = new Pattern(image.StackEmail);
            Pattern password = new Pattern(image.StackPass);
            s.find(username);
            s.click(username);
            s.type(image.username_type);
            s.click(email);
            s.type(image.email_type);
            s.find(password);
            s.click(password);
            s.type(image.password_type);
        }
    }
