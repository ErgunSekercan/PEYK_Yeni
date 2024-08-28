package com.KolaysoftPeyk.step_definitions;

import com.KolaysoftPeyk.pages.others.PeykGirisPage;
import com.KolaysoftPeyk.utility.BrowserUtils;
import com.KolaysoftPeyk.utility.ConfigurationReader;
import com.KolaysoftPeyk.utility.Driver;
import io.cucumber.java.tr.Eğerki;
import io.cucumber.java.tr.Ozaman;
import org.testng.Assert;

public class PeykGirisStepDefinitions extends Driver{

    PeykGirisPage peykGirisPage = new PeykGirisPage();

    @Eğerki(": PeykKolaysoft ana sayfasına gidip")
    public void peyk_kolaysoft_ana_sayfasına_gidip() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @Eğerki(": TC Kimlik numaranızı girip")
    public void tc_kimlik_numaranızı_girip() {
        peykGirisPage.TcNo.sendKeys(ConfigurationReader.getProperty("TcNo"));
    }
    @Eğerki(": Şifrenizi girip")
    public void şifrenizi_girip() {
        peykGirisPage.sifre.sendKeys(ConfigurationReader.getProperty("sifre"));
    }
    @Eğerki(": Giriş düğmesine basarsanız")
    public void giriş_düğmesine_basarsanız() {
        peykGirisPage.giris.click();
    }
    @Ozaman(": PeykKolaySoft portalına girmiş olursunuz")
    public void peyk_kolay_soft_portalına_girmiş_olursunuz() {
        String anaSayfa = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(anaSayfa,"https://peyktest.kolaysoft.com.tr/accounting/login");
        BrowserUtils.waitFor(15);
        peykGirisPage.kullanici.click();
        peykGirisPage.cikis.click();
        closeDriver();
    }




  }


