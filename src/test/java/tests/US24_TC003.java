package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US24_TC003 {
    //Admin Kullanıcı olarak "Doctors" listesine
    //Yeni Doktor ekleyebilmeli

    @Test
    public void yeniMedicinesEkleme(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        AdminDasboardPages adminDasboardPages = new AdminDasboardPages();

        adminDasboardPages.signInBtn.click();
        adminDasboardPages.emailTextBox.sendKeys("beyzanur@loyalfriendcare.com"+ Keys.ENTER);
        adminDasboardPages.passwordTextBox.sendKeys("Lfc.2604"+Keys.ENTER);
        adminDasboardPages.adminLogin.click();
        adminDasboardPages.officiaProfile.click();
        adminDasboardPages.sidebar.click();
        adminDasboardPages.menuMedicines.click();
        adminDasboardPages.altMenuCreateMedicines.click();
        adminDasboardPages.rowTitle.sendKeys("Parol "+Keys.ENTER);
        adminDasboardPages.rowContent.sendKeys("Parol Tabletin aktif maddesi parasetamol, klinik olarak kanıtlanmıĢ, analjezik ve\n" +
                "antipiretik etkili bir ilaçtır. Hipotalamustaki termoregülasyon merkezi üzerindeki etkisi\n" +
                "ile antipiretik etki gösterir."+Keys.ENTER);
       // adminDasboardPages.imageProfileDropFilestoUpload;

        adminDasboardPages.buttonSave.click();

        String medicinesIsmi="Parol";

        String yeniMedicinesGoruntulenme=Driver.getDriver().findElement(By.xpath("(//div[@class='card-body'])[2]")).getText();

        Assert.assertTrue(yeniMedicinesGoruntulenme.contains(medicinesIsmi));


        Driver.closeDriver();









    }
}
