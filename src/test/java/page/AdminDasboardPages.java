package page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDasboardPages {public AdminDasboardPages() {
    PageFactory.initElements(Driver.getDriver(), this);
}


    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(xpath = "(//*[@*='dropdown-item'])[2]")
    public WebElement editProfile;

    @FindBy(xpath = "//*[text()='Beyza Nur Turunc']")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "(//*[@class='btn_add'])[1]")
    public WebElement signInBtn;

    @FindBy(xpath = "(//*[@class='btn_add'])[1]")
    public WebElement adminLogin;

    @FindBy(xpath = "//*[@class='thumbnail-wrapper d32 border-5  inline']")
    public WebElement officiaProfile;

    @FindBy(xpath = "(//*[@*='dropdown-item'])[1]")
    public WebElement settingsBtn;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logout;

    @FindBy(xpath = "//*[text()='404']")
    public WebElement mainSorry;
    @FindBy(xpath = "//div[@class='sidebar-header']")
    public WebElement sidebar;


    @FindBy(xpath = "(//*[text()='Users'])[1]")
    public WebElement menuUsers;


    @FindBy(xpath = "(//*[text()='Users'])[2]")
    public WebElement altMenuUsers;

    @FindBy(xpath = "//*[text()='Create User']")
    public WebElement altMenuCreateUser;

    @FindBy(xpath = "//*[@id='tableWithSearch']")
    public  WebElement tabloUsers1;

    //////////////////////////

    @FindBy(xpath = "(//*[text()='Doctors'])[1]")
    public WebElement menuDoctors;

    @FindBy(xpath = "(//*[text()='Doctors'])[2]")
    public WebElement altMenuDoctors;

    @FindBy(xpath = "(//*[text()='Create Doctors'])")
    public WebElement altMenuCreateDoctors;

    @FindBy(xpath = "//*[text()='Dashboard']")
    public WebElement dashboardBaslik;

    @FindBy(xpath = "(//*[@*='Title_en'])[2]")
    public WebElement rowTitle;

    @FindBy(xpath = "(//*[@*='body_en'])[2]")
    public WebElement rowContent;

    @FindBy(xpath = "(//div[@class='dz-default dz-message'])")
    public WebElement imageProfileDropFilestoUpload;



    @FindBy(xpath = "(//*[@type='submit'])")
    public WebElement buttonSave;

    @FindBy(xpath = "(//*[text()='Edit'])[2]")
    public WebElement iconEdit;

    @FindBy(xpath = "(//*[text()='Delete'])[2]")
    public WebElement iconMedicinesDeletee;
    @FindBy(xpath = "(//*[text()='Delete'])")
    public WebElement iconDoctorDeletee;

    @FindBy(xpath = "(//*[text()='Medicines'])[1]")
    public WebElement menuMedicines;

    @FindBy(xpath = "(//*[text()='Medicines'])[2]")
    public WebElement altMenuMedicines;

    @FindBy(xpath = "(//*[text()='Create Medicines'])")
    public WebElement altMenuCreateMedicines;













}
