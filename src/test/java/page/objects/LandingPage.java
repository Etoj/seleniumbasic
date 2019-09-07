package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    @FindBy(css = "#header > div.header__inner > div > div > div.header__actions > a.header__action.header__login.js-header-login")
    private WebElement logInLink;

    public void clickOnLogInLink(){
        logInLink.click();
    }
}
