package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AdminDasboardPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US23_TC003 {
    //Admin Kullanıcı olarak "Medicines" listesine
    //Yeni İlaç ekleyebilmeli

    @Test
    public void yeniDoctorsEkleme(){

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
        adminDasboardPages.rowTitle.sendKeys("Dr.Betty "+Keys.ENTER);
        adminDasboardPages.rowContent.sendKeys("Profession: Veterinarian  Years of Experience: 11 years  Specialization: Oncology"+Keys.ENTER);
       adminDasboardPages.imageProfileDropFilestoUpload.click();


        String filePath = "C:\\Users\\PC\\Desktop\\-doktor.jpg";//benim bilisarımdaki dosyayolu
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(adminDasboardPages.imageProfileDropFilestoUpload).perform();






        adminDasboardPages.buttonSave.click();
        Actions actionss=new Actions(Driver.getDriver());

        actionss.sendKeys(Keys.END).perform();

        String doktorIsmi="Dr.Betty";

        String yeniDoktorGoruntuleme=Driver.getDriver().findElement(By.xpath("(//div[@class='card-body'])[2]")).getText();

        Assert.assertTrue(yeniDoktorGoruntuleme.contains(doktorIsmi));


        Driver.closeDriver();










    }
}
