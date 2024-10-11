package tests;

import dto.CarDto;
import manager.ApplicationManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LetTheCarWorkPage;
import utils.Fuel;
import utils.HeaderMenuItem;

import java.util.Random;

import static pages.BasePage.clickButtonsOnHeader;

public class AddNewCarTest extends ApplicationManager {

    LetTheCarWorkPage letTheCarWorkPage;
    @BeforeMethod
    public void startAddCar(){
        new HomePage(getDriver());
        letTheCarWorkPage = clickButtonsOnHeader(HeaderMenuItem.LET_THE_CAR_WORK);
    }

    @Test
    public void addNewCarPositiveTest(){
        CarDto car = CarDto.builder()
                .city("Haifa")
                .manufacture("Toyota")
                .model("Prius")
                .year("2019")
                .fuel(Fuel.DISEL.getLocator())
                .seats(5)
                .carClass("C-class")
                .serialNumber("12222-"+new Random().nextInt(1000))
                .pricePerDay(1000)
                .about("text")
                .image("backiee-61239.jpg")
                .build();
        letTheCarWorkPage.typeAddNewCarForm(car);

    }

}
