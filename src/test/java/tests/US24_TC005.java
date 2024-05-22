package tests;

import net.bytebuddy.build.ToStringPlugin;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US24_TC005 {
    //Admin Kullanıcı, oluşturulan yeni İlacı
    // silebilmeli
    @Test
    public void yeniMedicinesSilme(){

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
        Driver.getDriver().findElement(By.xpath("//tbody/tr[1]")).click();
        adminDasboardPages.iconMedicinesDeletee.click();


        WebElement yeniMedicinesSilmeYazi=Driver.getDriver().findElement(By.xpath("//span[text()='Medicines deleted successfully']"));

        Assert.assertTrue(yeniMedicinesSilmeYazi.isDisplayed());
        Driver.closeDriver();









    }
}
