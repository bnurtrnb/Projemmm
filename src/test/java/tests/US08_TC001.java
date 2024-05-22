package tests;

import org.testng.annotations.Test;
import page.userHomePages;
import utilities.Driver;

public class US08_TC001 {
    //Kayıtlı Kullanıcı sistemden
    //başarılı şekilde çıkış yapmalıdır

    @Test
    public void kullanıcıgirs(){
        //beyzadeneme@gmail.com    Beyza32.

        Driver.getDriver().get("https://qa.loyalfriendcare.com/en");

        userHomePages userHomePages=new userHomePages();
        userHomePages.SıgnInButton.click();
        userHomePages.TextBoxEmail.sendKeys("beyzadeneme@gmail.com");
        userHomePages.TextBoxPassword.sendKeys("Beyza32.");
        userHomePages.sıgnupbutton.click();
        userHomePages.SignOut.click();


        Driver.closeDriver();










    }
}
