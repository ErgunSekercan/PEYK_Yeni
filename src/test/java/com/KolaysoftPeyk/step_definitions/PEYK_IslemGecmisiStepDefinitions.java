package com.KolaysoftPeyk.step_definitions;


import com.KolaysoftPeyk.pages.PEYK_Pages;
import com.KolaysoftPeyk.utility.BrowserUtils;
import com.KolaysoftPeyk.utility.ConfigurationReader;
import com.KolaysoftPeyk.utility.Driver;
import io.cucumber.java.tr.Eğerki;
import org.testng.Assert;

public class PEYK_IslemGecmisiStepDefinitions extends Driver{

    PEYK_Pages peyk_pages = new PEYK_Pages();
    @Eğerki(": İşlem Geçmişine tıklarsanız Tüm İşlem Geçmişi ve Çalışan İşlem Kaydına ulaşabilirsiniz")
    public void i̇şlem_geçmişine_tıklarsanız_tüm_i̇şlem_geçmişi_ve_çalışan_i̇şlem_kaydına_ulaşabilirsiniz() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("TcNo"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("sifre"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        peyk_pages.PEYK.click();
        BrowserUtils.waitFor(2);

        peyk_pages.islemGecmisi.click();
        BrowserUtils.waitFor(2);
        String islemGecmisi = peyk_pages.isGec.getText();
        Assert.assertEquals(islemGecmisi,"İşlem Geçmişi");
        BrowserUtils.waitFor(2);

        peyk_pages.kullanici.click();
        peyk_pages.cikis.click();
        closeDriver();
    }


    }





