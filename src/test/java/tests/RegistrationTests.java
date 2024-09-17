package tests;

import manager.ApplicationManager;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.Random;

public class RegistrationTests extends ApplicationManager {
    @Test
    public void registrationPositiveTest(){
        int i=new Random().nextInt(1000);
        String mail ="frodo_bagins"+i+"@gmail.com";
        new HomePage(getDriver()).clickBtnRegistration()
                .tapyRegistrationForm("Alex","Met",mail,"Ilya1984!");

    }
}
