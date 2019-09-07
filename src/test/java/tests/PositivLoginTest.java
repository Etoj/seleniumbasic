package tests;

import org.testng.annotations.Test;
import page.objects.BasePage;
import page.objects.LandingPage;

public class PositivLoginTest extends BasePage {
    @Test
    public void asUserLoginUsingValidCrudencial(){
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnLogInLink();
    }
}
