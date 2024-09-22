package tests;

import dto.UserDto;
import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.HeaderMenuItem;

import static utils.RandomUtils.*;
import static pages.BasePage.clickButtonsOnHeader;

public class LoginTests extends ApplicationManager {

    @Test
    public void loginPositiveTest(){
        Assert.assertTrue(new HomePage(getDriver()).clickBtnLogin()
                .typeLoginForm("mio0931211@gmail.com","Ilya1983!")
                .clickBtnYalla()
                .isTestInElementPresents_LoginSuccss());

    }

    @Test
    public void loginNegativeTest_WrongEmailWOAt(){
        UserDto user = new UserDto(generateString(5),generateString(7),generateString(10)
                ,"Qwert125!");
        Assert.assertTrue(new HomePage(getDriver()).clickBtnLogin()
                .typeLoginForm(user)
                .clickBtnYalla()
                .isTestInElementPresents_ErrorEmail("It'snot look like email"));

    }

    @Test
    public void loginNegativeTest_WrongEmailWOAt_Enum(){
        UserDto user = new UserDto(generateString(5),generateString(7),generateString(10)
                ,"Qwert125!");
        new HomePage(getDriver());
        LoginPage loginPage = clickButtonsOnHeader(HeaderMenuItem.LOGIN);
        loginPage.typeLoginForm(user)
                .clickBtnYalla()
                .isTestInElementPresents_ErrorEmail("It'snot look like email");

    }


}
