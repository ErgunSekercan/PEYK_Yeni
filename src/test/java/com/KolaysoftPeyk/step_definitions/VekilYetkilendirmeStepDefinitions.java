package com.KolaysoftPeyk.step_definitions;


import com.KolaysoftPeyk.pages.PEYK_Pages;
import com.KolaysoftPeyk.utility.BrowserUtils;
import com.KolaysoftPeyk.utility.ConfigurationReader;
import com.KolaysoftPeyk.utility.Driver;
import io.cucumber.java.tr.Eğerki;
import org.testng.Assert;

public class VekilYetkilendirmeStepDefinitions extends Driver{

    PEYK_Pages peyk_pages = new PEYK_Pages();
    @Eğerki(": Vekil Yetkilendirmeye tıklarsanız mevcut Vekil Yetkilendirmeleri görüp Yeni Vekil Yetkilendirme oluşturabilirsiniz")
    public void vekil_yetkilendirmeye_tıklarsanız_mevcut_vekil_yetkilendirmeleri_görüp_yeni_vekil_yetkilendirme_oluşturabilirsiniz() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("TcNo"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("sifre"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(8);

        peyk_pages.vekilYetkilendirme.click();
        BrowserUtils.waitFor(2);
        String islemGecmisi = peyk_pages.vekilYet.getText();
        Assert.assertEquals(islemGecmisi,"Vekil Yetkilendirme");
        BrowserUtils.waitFor(2);

        peyk_pages.kullanici.click();
        peyk_pages.cikis.click();
        closeDriver();
    }

    }





