package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US23_TC001 {
//Admin siteye doğru kullanıcı adı
//ve parola ile giriş yapabilmeli ,
//Dashboard bölümüne ulaşabilmeli
    @Test
    public void adminDashbordUlaşma() {
     Driver.getDriver().get(ConfigReader.getProperty("url"));
    AdminDasboardPages adminDasboardPages = new AdminDasboardPages();

        adminDasboardPages.signInBtn.click();
        adminDasboardPages.emailTextBox.sendKeys("beyzanur@loyalfriendcare.com"+ Keys.ENTER);
        adminDasboardPages.passwordTextBox.sendKeys("Lfc.2604"+Keys.ENTER);
        adminDasboardPages.adminLogin.click();
        adminDasboardPages.officiaProfile.click();
        adminDasboardPages.sidebar.click();


        Assert.assertTrue(adminDasboardPages.dashboardBaslik.isDisplayed());





        Driver.closeDriver();
}
}
