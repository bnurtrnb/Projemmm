package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US23_TC004 {
    //Admin Kullanıcı, oluşturulan yeni
    //Doktoru düzenleyebilmeli

    @Test
    public void yeniDoctorDuzenleme(){

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
        Driver.getDriver().findElement(By.xpath("//tbody/tr[9]")).click();
        adminDasboardPages.doctorsEdit.click();
        adminDasboardPages.doctorsTitle.sendKeys("Dr.Betty "+Keys.ENTER);
        adminDasboardPages.doctorsContentEnglish.sendKeys("Profession: Veterinarian ODTÜ veterinerlik"+Keys.ENTER);
        //adminDasboardPages.dropFilestoUpload;

        adminDasboardPages.doctorsSave.click();

        String doktorIsmi="Dr.Betty";

        String yeniDoktorGoruntuleme=Driver.getDriver().findElement(By.xpath("(//div[@class='card-body'])[2]")).getText();

        Assert.assertTrue(yeniDoktorGoruntuleme.contains(doktorIsmi));


        //edit yaparken fotoğraf değiştirmedim listede fotoğrafı silmiş olarak verdi bug


        Driver.closeDriver();














    }
}
