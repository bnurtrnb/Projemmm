package tests;

import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.ConfigReader;
import utilities.Driver;


public class US23_TC001 {
  //Admin siteye doğru kullanıcı adı
    //ve parola ile giriş yapabilmeli ,
    //Dashboard bölümüne ulaşabilmeli

    @Test
    public void adminDashbordUlaşma(
            Driver.getDriver().get(ConfigReader.getProperty("url"));
            AdminDasboardPages adminDasboardPages = new AdminDasboardPages();

            adminDasboardPages.

}
