package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page.userHomePages;
import utilities.Driver;

public class US08_TC002 {
    //Kayıtlı kullanıcın body
    //bölümündeki video,yazı ve arama
    // butonunun görünürlüğünü ve fonksiyonlarının
    //aktifliğini test etmesi

    @Test
    public void badyBolumu(){

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");

        userHomePages userHomePages=new userHomePages();
        userHomePages.SıgnInButton.click();
        userHomePages.TextBoxEmail.sendKeys("beyzadeneme@gmail.com");
        userHomePages.TextBoxPassword.sendKeys("Beyza32.");
        userHomePages.sıgnupbutton.click();
        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        userHomePages.videoBady.isDisplayed();




















    }




}
