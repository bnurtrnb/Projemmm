package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US23_TC005 {
    //Admin Kullanıcı, oluşturulan yeni Doktoru
    //  silebilmeli
    @Test
    public void yeniDoctorSilme(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        AdminDasboardPages adminDasboardPages = new AdminDasboardPages();

        adminDasboardPages.signInBtn.click();
        adminDasboardPages.emailTextBox.sendKeys("beyzanur@loyalfriendcare.com"+ Keys.ENTER);
        adminDasboardPages.passwordTextBox.sendKeys("Lfc.2604"+Keys.ENTER);
        adminDasboardPages.adminLogin.click();
        adminDasboardPages.officiaProfile.click();
        adminDasboardPages.sidebar.click();
        adminDasboardPages.menuDoctors.click();
        adminDasboardPages.altMenuDoctors.click();
        Driver.getDriver().findElement(By.xpath("//tbody/tr[1]")).click();
        adminDasboardPages.doctorsDelete.click();


        WebElement yeniDoctorsSilmeYazi=Driver.getDriver().findElement(By.xpath("//span[text()='Doctors deleted successfully']"));

        Assert.assertTrue(yeniDoctorsSilmeYazi.isDisplayed());
        Driver.closeDriver();








    }
}
