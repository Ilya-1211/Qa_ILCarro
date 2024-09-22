package pages;

import dto.UserDto;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }
    @FindBy(id = "email" )
    WebElement inputEmail;

    @FindBy(id = "password" )
    WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnYalla;

    @FindBy(xpath = "//h2[@class='message']")
    WebElement textPopUp_LoginSuccess;

    @FindBy(xpath = "//input[@id='email']/..//div[@class='error']/div")
    WebElement errorMessageInputEmail;


    public LoginPage typeLoginForm(String mail, String password) {
        inputEmail.sendKeys(mail);
        inputPassword.sendKeys(password);
        return this;
    }

    public LoginPage typeLoginForm(UserDto user) {
        inputEmail.sendKeys(user.getEmail());
        inputPassword.sendKeys(user.getPassword());
        return this;
    }


    public LoginPage clickBtnYalla() {
        pause(3);
        btnYalla.click();
        return this;
    }

    public boolean isTestInElementPresents_LoginSuccss(){
        return isTextElementPresents(textPopUp_LoginSuccess, "Logged in success");
    }

    public boolean isTestInElementPresents_ErrorEmail(String text){
        return isTextElementPresents(errorMessageInputEmail,text);
    }
}
