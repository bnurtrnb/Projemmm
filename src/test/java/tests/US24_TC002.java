package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US24_TC002 {
    //Admin Kullanıcı olarak Sidebar'dan
    // Dashboard'u görüntüleyebilmeli ,
    //Dashboard'dan "Medicines" menüsü ve
    // alt menülerine ulaşabilmeli,
    //Mevcut İlaç Sayısına ve
    //Listesine ulaşabilmeli

    @Test
    public void adminMedicinesListeUlasma(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        AdminDasboardPages adminDasboardPages = new AdminDasboardPages();

        adminDasboardPages.signInBtn.click();
        adminDasboardPages.emailTextBox.sendKeys("beyzanur@loyalfriendcare.com"+ Keys.ENTER);
        adminDasboardPages.passwordTextBox.sendKeys("Lfc.2604"+Keys.ENTER);
        adminDasboardPages.adminLogin.click();
        adminDasboardPages.officiaProfile.click();
        adminDasboardPages.sidebar.click();
        adminDasboardPages.menuMedicines.click();



        Assert.assertTrue(adminDasboardPages.altMenuMedicines.isDisplayed());
        Assert.assertTrue(adminDasboardPages.altMenuCreateMedicines.isDisplayed());


        adminDasboardPages.altMenuMedicines.click();
        List<WebElement> medicinesListe = Driver.getDriver().findElements(By.xpath("//tbody/tr/td[2]"));
        Assert.assertTrue(medicinesListe.size()>0);
        Driver.closeDriver();












    }
}
