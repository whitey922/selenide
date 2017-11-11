import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.SelenidePageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Username: dummy_user
 * Date: 11/11/2017
 * Time: 8:56 PM
 */
public class GitHubPage {

    @FindBy(how= How.XPATH, using = "/html/body/div[1]/header/div/div[2]/div/span/div/a[1]")
    private SelenideElement loginButton;


    @FindBy(id = "login_field")
    private SelenideElement loginField;


    @FindBy(id = "password")
    private SelenideElement passwordField;


    @FindBy(xpath= "//*[@id=\"login\"]/form/div[4]/input[3]")
    private SelenideElement signInButton;


    public void login() {
        loginButton.pressEnter();

//        loginField.setValue("whitey922");
//
//        passwordField.setValue("password");
    }

    public GitHubPage(WebDriver webDriver) {
        SelenidePageFactory.initElements(webDriver, GitHubPage.class);

    }
}
