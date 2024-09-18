package tests;

import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.Random;

public class RegistrationTests extends ApplicationManager {
    @Test
    public void registrationPositiveTest(){
        int i=new Random().nextInt(1000);
        String mail ="frodo_bagins"+i+"@gmail.com";
        Assert.assertTrue(new HomePage(getDriver()).clickBtnRegistration()
                .typeRegistrationForm("Alex","Mel",mail,"Qwert123!")
                .clickCheckBox().clickBtnYalla().isTextInElementPresent_regSuccess());

    }
}
