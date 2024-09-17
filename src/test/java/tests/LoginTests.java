package tests;

import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTests extends ApplicationManager {

    @Test
    public void loginPositiveTest(){
        Assert.assertTrue(new HomePage(getDriver()).clickBtnLogin()
                .typeLoginForm("mio0931211@gmail.com","Ilya1983!")
                .clickBtnYalla()
                .isTestInElementPresents_LoginSuccss());

    }
}
