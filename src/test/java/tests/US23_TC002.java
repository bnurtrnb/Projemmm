package tests;

import org.checkerframework.framework.qual.EnsuresQualifierIf;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.ConfigReader;
import utilities.Driver;

import java.awt.*;
import java.util.List;


public class US23_TC002 {
  //Admin Kullanıcı olarak Sidebar'dan
    // Dashboard'u görüntüleyebilmeli ,
    //Dashboard'dan "Doctors" menüsü ve
    // alt menülerine ulaşabilmeli,
    //Mevcut Doktor Sayısına ve
    // Listesine ulaşabilmeli

    @Test
    public void adminDoctorsListesineUlasma() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        AdminDasboardPages adminDasboardPages = new AdminDasboardPages();

        adminDasboardPages.signInBtn.click();
        adminDasboardPages.emailTextBox.sendKeys("beyzanur@loyalfriendcare.com"+ Keys.ENTER);
        adminDasboardPages.passwordTextBox.sendKeys("Lfc.2604"+Keys.ENTER);
        adminDasboardPages.adminLogin.click();
        adminDasboardPages.officiaProfile.click();
        adminDasboardPages.sidebar.click();
        adminDasboardPages.menuDoctors.click();



        Assert.assertTrue(adminDasboardPages.altMenuDoctors.isDisplayed());
        Assert.assertTrue(adminDasboardPages.altMenuCreateDoctors.isDisplayed());


        adminDasboardPages.altMenuDoctors.click();
        List<WebElement> doctorsListe = Driver.getDriver().findElements(By.xpath("//tbody/tr/td[2]"));
        Assert.assertTrue(doctorsListe.size()>0);
        Driver.closeDriver();



    }

}
