package com.KolaysoftPeyk.pages.others;

import com.KolaysoftPeyk.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EczaciAktivasyonPage {


    public EczaciAktivasyonPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement kullaniciAdi;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement parola;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement oturumAc;

    @FindBy(xpath = "(//span[contains(text(), \"Eczacı Pos Aktivasyon\")])[1]")
    public WebElement kullaniciMail;

    @FindBy(xpath = "//a[contains(text(), \"Giriş Yap\")]")
    public WebElement girisYap;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement sifre;

    @FindBy(xpath = "//input[@id='re-password']")
    public WebElement sifreTekrar;

    @FindBy(xpath = "//strong[contains(text(), \"Şifre Belirle\")]")
    public WebElement sifreBelirle;

    @FindBy(xpath = "//td[@id='zb__CLV-main__DELETE_title']")
    public WebElement delete;




}
