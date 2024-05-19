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

    @FindBy(xpath = "//*[text()='Raşit Çelik']")
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

}
