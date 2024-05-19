package page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class userHomePages {  public userHomePages(){
    PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(xpath = "(//*[@class='btn_add'])[1]") //Homepage>Sıgn In Button
    public WebElement SıgnInButton;

    @FindBy(xpath = "//*[@name='email']")  //Homepage>Sıgn In>Email Adres Text Box
    public WebElement TextBoxEmail;

    @FindBy(xpath = "//*[@name='password']") //Homepage>Sıgn In>Password Text Box
    public WebElement TextBoxPassword;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-cons m-t-10']") //Homepage>Sıgn In>Sıgn Up Button
    public WebElement sıgnupbutton;

    @FindBy(xpath = "(//*[text()='Medicines'])[3]") //Homepage>Header>Medicines Link
    public WebElement LinkMedicines;

    @FindBy(xpath = "(//div[@class='col-md-6'])[1]") //Homepage>Header>Medicines Link>Rimadyl (Carprofen)Row
    public WebElement RowRimadyMedicine;

    @FindBy(xpath = "(//div[@class='col-md-6'])[2]") //Homepage>Header>Medicines Link>Revolution (Selamectin)Row
    public WebElement RowRevolutionMedicine;
    @FindBy(xpath = "(//div[@class='col-md-6'])[3]") //Homepage>Header>Medicines Link>Baytril (Enrofloxacin)Row
    public WebElement RowBaytrilMedicine;
    @FindBy(xpath = "(//div[@class='col-md-6'])[4]") //Homepage>Header>Medicines Link>Apoquel (Oclacitinib)Row
    public WebElement RowApoquelMedicine;
    @FindBy(xpath = "(//div[@class='col-md-6'])[5]") //Homepage>Header>Medicines Link>Metacam (Meloxicam)Row
    public WebElement RowMetacamMedicine;

    @FindBy(xpath = "//div[@class='col-md-6'][6]") //Homepage>Header>Medicines Link>Viocid Row
    public WebElement RowViocidMedicine;

    @FindBy(xpath = "(//div[@class='col-md-6'])[1]") //Homepage>Header>Vaccinations Link>Rabies Vaccine Row
    public WebElement RowRabiesVaccine;

    @FindBy(xpath = "(//div[@class='col-md-6'])[2]") //Homepage>Header>Vaccinations Link>Dhpp Vaccine Row
    public WebElement RowDhppVaccine;
    @FindBy(xpath = "(//div[@class='col-md-6'])[3]") //Homepage>Header>Vaccinations Link>Feline Leukemia Vaccine Row
    public WebElement RowFelineleukimaVaccine;
    @FindBy(xpath = "(//div[@class='col-md-6'])[4]") //Homepage>Header>Vaccinations Link>Feline Immunodeficiency Virus (FIV) Vaccine Row
    public WebElement RowFıvVaccine;
    @FindBy(xpath = "(//div[@class='col-md-6'])[5]") //Homepage>Header>Vaccinations Link>Bordetella (Kennel Cough) Vaccine Row
    public WebElement RowBordetellaVaccine;


    @FindBy(xpath = "(//div[@class='col-md-6'])[6]") //Homepage>Header>Vaccinations Link>Feline Panleukopenia Vaccine Row
    public WebElement RowFelinePanlekuiaVaccine;
    @FindBy(xpath = "(//div[@class='col-md-6'])[7]") //Homepage>Header>Vaccinations Link>Feline Herpesvirus Vaccine Row
    public WebElement RowFelineHerpesvirusVaccine;
    @FindBy(xpath = "(//div[@class='col-md-6'])[8]") //Homepage>Header>Vaccinations Link>Surgical Procedure: Spaying (Ovariohysterectomy) Row
    public WebElement RowSurgicalProcedure;

    @FindBy(xpath = "(//*[@class='nice-select wide'])[1]") //Homepage>Header>Vaccinations Link>Any Row>Forum Text Box (3)
    public WebElement CheckBoxCategoryVaccions;

    @FindBy(xpath = "(//*[@class='option'])[2]") //Homepage>Header>Vaccinations Link>Any Row>Choose On Forum Text Box (3)
    public WebElement CheckBoxCategorySecenekVaccions;

    @FindBy(xpath = "(//*[@class='nice-select wide'])[2]") ////Homepage>Header>Vaccinations Link>Any Row>Forum Text Box (4)
    public WebElement CheckBoxDoctorVaccions;

    @FindBy(xpath = "(//*[@class='option'])[9]") //Homepage>Header>Vaccinations Link>Any Row>Choose On Forum Text Box (4)
    public WebElement CheckBoxDoctorSecenekVaccions;


    @FindBy(xpath = "//*[@id='Date']") //Homepage>Header>Vaccinations Link & Medicines Link>Any Row>Forum Text Box(1)
    public WebElement CheckBoxDate;            //Homepage>Body>Select Any Doctor Row>Forum Text Box(1)

    @FindBy(xpath = "(//*[@class='nice-select wide'])[1]") //Homepage>Header>Medicines Link>Any Row>Forum Text Box (3)
    public WebElement CheckBoxCategoryMedicine;

    @FindBy(xpath = "(//*[@class='option'])[1]") //Homepage>Header>Medicine Link>Any Row>Choose on Forum Text Box (3)
    public WebElement CheckBoxCategorySecenekMedicine;

    @FindBy(xpath = "(//*[@class='nice-select wide'])[2]") //Homepage>Header>Medicines Link>Any Row>Forum Text Box (4)
    public WebElement CheckBoxDoctorMedicine;

    @FindBy(xpath = "(//*[text()='Dr. Alejandro Martinez'])[3]") //Homepage>Header>Medicines Link>Any Row>Choose On Forum Textbox (4)
    public WebElement CheckBoxDoctorSecenekMedicine;

    @FindBy(xpath = "(//*[@class='form-control'])[3]") //Homepage>Header>Medicines Link & Vaccinations Link>Any Row>Forum Textbox (5)
    public WebElement CheckBoxMesajKutusu;                     //Homepage>Body>Select Any Doctor Row>Forum Text Box (5)

    @FindBy(xpath = "//*[@id='submit-contact-detail']") //Homepage>Header>Medicines Link & Vaccinations Link>Any Row>Rezervasyon button
    public WebElement Rezervasyonbutton;

    @FindBy(xpath = "//div[@class='alert alert-success']") //Homepage>Header>Medicines Link & Vaccinations Link>Any Row>Rezervasyon Yazı Text
    public WebElement TextRezervasyonYazı;

    @FindBy(xpath = "(//*[text()='Vaccinations'])[5]") //Homepage>Header>Vaccinations Link
    public WebElement LinkVaccinations;

    @FindBy(xpath = "//div[@class='ml-4 text-lg text-gray-500 uppercase tracking-wider']")//Homepage>Sıgn In>Email Address Text Box>Password Text Box>Sıgn Up Button>Url admin homepage
    public WebElement TextAdminGirisHataMesajı;

    @FindBy(xpath = "(//div[@class='col-lg-3 col-sm-6'])[9]") //Homepage>Body>Dr. Alejandro Martinez Row
    public WebElement RowDrAlejandroMartinez;

    @FindBy(xpath = "(//*[@class='nice-select wide'])[2]") //Homepage>Body>Select Any Doctor Row>Forum Text Box (3)
    public WebElement CheckBoxCategoryDoctor;

    @FindBy(xpath = "(//*[@class='option'])[7]") //Homepage>Body>Select Any Doctor Row>Choose on Forum Text Box (3)
    public WebElement CheckBoxCategorySecenekDoctor;

    @FindBy(xpath = "(//*[@class='nice-select wide'])[3]") //Homepage>Body>Select Any Doctor Row>Forum Text Box (4)
    public WebElement CheckBoxDoctor;

    @FindBy(xpath = "(//*[@class='option'])[14]") //Homepage>Body>Select Any Doctor Row>Choose on Forum Text Box (4)
    public WebElement CheckBoxDoctorSecenek;


    @FindBy(xpath = "//div[@class='alert alert-success']") //Homepage>Body>Select Any Doctor Row>Randevu Yazı Text
    public WebElement TextRandevuOlustuYazısı;

    @FindBy(xpath = "(//div[@class='nice-select wide'])[1]") //Homepage>Body>Select Any Doctor Row>Review Text Box (1)
    public WebElement CheckBoxRating;

    @FindBy(xpath = "(//*[@class='option'])[3]") //Homepage>Body>Select Any Doctor Row>Choose On Review Text Box (1)
    public WebElement CheckBoxRatingPuanlamaSecim;

    @FindBy(xpath = "//*[@id='Comment']") //Homepage>Body>Select Any Doctor Row>Review Text Box (2)
    public WebElement CheckBoxYorumKutusu;

    @FindBy(xpath = "(//*[@class='btn_1'])") //Homepage>Body>Select Any Doctor Row>Review Submit Button
    public WebElement SubmitButton;

    @FindBy(xpath = "(//div[@class='col-lg-3 col-sm-6'])[10]") //Homepage>Body>Dr. Marcus Rodriguez Row
    public WebElement RowDrMarcusRodriguez;

    @FindBy(xpath = "(//div[@class='col-lg-3 col-sm-6'])[11]") //Homepage>Body>Dr. Olivia Bennett Row
    public WebElement RowDrOliviaBennett;

    @FindBy(xpath = "(//div[@class='col-lg-3 col-sm-6'])[12]") //Homepage>Body>Dr. Emily Chang Row
    public WebElement RowDrEmilyChang;

    @FindBy(xpath = "(//div[@class='col-lg-3 col-sm-6'])[13]") //Homepage>Body>Dr. Nathan Patel Row
    public WebElement RowDrNathanPatel;

    @FindBy(xpath = "(//div[@class='col-lg-3 col-sm-6'])[14]") //Homepage>Body>Dr. Isabella Wong Row
    public WebElement RowDrIsabellaWong;

    @FindBy(xpath = "(//div[@class='col-lg-3 col-sm-6'])[15]") //Homepage>Body>Dr. Liam O'Connor Row
    public WebElement RowDrLıamConnor;

    @FindBy(xpath = "(//div[@class='col-lg-3 col-sm-6'])[16]") //Homepage>Body>Dr. Sophia Kim Row
    public WebElement RowDrSophıAkım;

    @FindBy(xpath = "(//*[text()='Home'])[2]")
    public WebElement LinkHome;

}
