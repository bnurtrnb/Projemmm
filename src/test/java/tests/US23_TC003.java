package tests;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US23_TC003 {
    //Admin Kullanıcı olarak "Doctors" listesine
    //Yeni Doktor ekleyebilmeli

    @Test
    public void yeniDoctorEkleme(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        AdminDasboardPages adminDasboardPages = new AdminDasboardPages();

        adminDasboardPages.signInBtn.click();
        adminDasboardPages.emailTextBox.sendKeys("beyzanur@loyalfriendcare.com"+ Keys.ENTER);
        adminDasboardPages.passwordTextBox.sendKeys("Lfc.2604"+Keys.ENTER);
        adminDasboardPages.adminLogin.click();
        adminDasboardPages.officiaProfile.click();
        adminDasboardPages.sidebar.click();
        adminDasboardPages.menuDoctors.click();
        adminDasboardPages.altMenuCreateDoctors.click();
        adminDasboardPages.doctorsTitle.sendKeys("Dr.Betty "+Keys.ENTER);
        adminDasboardPages.doctorsContentEnglish.sendKeys("Profession: Veterinarian  Years of Experience: 11 years  Specialization: Oncology"+Keys.ENTER);
        //adminDasboardPages.dropFilestoUpload;
        adminDasboardPages.doctorsSave.click();

        String doktorIsmi="Dr.Betty";

        String yeniDoktorGoruntuleme=Driver.getDriver().findElement(By.xpath("(//div[@class='card-body'])[2]")).getText();

        Assert.assertTrue(yeniDoktorGoruntuleme.contains(doktorIsmi));












    }
}
