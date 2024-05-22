package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US24_TC004 {
    //Admin Kullanıcı, oluşturulan yeni İlacı
    // düzenleyebilmeli

    @Test
    public void yeniMedicinesDuzenleme(){


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        AdminDasboardPages adminDasboardPages = new AdminDasboardPages();

        adminDasboardPages.signInBtn.click();
        adminDasboardPages.emailTextBox.sendKeys("beyzanur@loyalfriendcare.com"+ Keys.ENTER);
        adminDasboardPages.passwordTextBox.sendKeys("Lfc.2604"+Keys.ENTER);
        adminDasboardPages.adminLogin.click();
        adminDasboardPages.officiaProfile.click();
        adminDasboardPages.sidebar.click();
        adminDasboardPages.menuMedicines.click();
        adminDasboardPages.altMenuMedicines.click();
        Driver.getDriver().findElement(By.xpath("//tbody/tr[6]")).click();
        adminDasboardPages.iconEdit.click();
        adminDasboardPages.rowTitle.sendKeys("Parol "+Keys.ENTER);
        adminDasboardPages.rowContent.sendKeys("Parol Tabletin aktif maddesi parasetamol, klinik olarak kanıtlanmıĢ, analjezik ve\n"
                +Keys.ENTER);
        // adminDasboardPages.imageProfileDropFilestoUpload;

        adminDasboardPages.buttonSave.click();

        String medicinesIsmi="Parol";

        String yeniMedicinesGoruntulenme=Driver.getDriver().findElement(By.xpath("(//div[@class='card-body'])[2]")).getText();

        Assert.assertTrue(yeniMedicinesGoruntulenme.contains(medicinesIsmi));
        //edit yaparken fotoğraf değiştirmedim listede fotoğrafı silmiş olarak verdi bug


        Driver.closeDriver();














    }
}
