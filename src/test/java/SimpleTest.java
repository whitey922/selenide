import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Username: dummy_user
 * Date: 11/11/2017
 * Time: 8:36 PM
 */
public class SimpleTest {


    @Test
    public void loginGitHub() {
        ChromeDriverManager.getInstance().setup();

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://github.com/");

        new GitHubPage(chromeDriver).login();
    }

//    @After

}
