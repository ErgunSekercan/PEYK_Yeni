package com.KolaysoftPeyk.step_definitions;


import com.KolaysoftPeyk.pages.PEYK_Pages;
import com.KolaysoftPeyk.utility.BrowserUtils;
import com.KolaysoftPeyk.utility.ConfigurationReader;
import com.KolaysoftPeyk.utility.Driver;
import io.cucumber.java.tr.Eğerki;
import org.testng.Assert;

public class PEYK_OzlukIslemleriStepDefinitions extends Driver{

    PEYK_Pages peyk_pages = new PEYK_Pages();

    @Eğerki(": Özlük İşlemlerine tıklarsanız Özlük Form Onay ve Özlük Dosyalarına ulaşabilirsiniz")
    public void özlük_i̇şlemlerine_tıklarsanız_özlük_form_onay_ve_özlük_dosyalarına_ulaşabilirsiniz() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("TcNo"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("sifre"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        peyk_pages.PEYK.click();
        BrowserUtils.waitFor(2);

        peyk_pages.OzlukIslemleri.click();
        BrowserUtils.waitFor(2);
        String ozlukFormOnay = peyk_pages.ozlukFormOnay.getText();
        Assert.assertEquals(ozlukFormOnay,"Özlük Form Onay");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Özlük Form Onayına tıklarsanız Özlük Form Onayı işlemine ulaşabilirsiniz")
    public void özlük_form_onayına_tıklarsanız_özlük_form_onayı_işlemine_ulaşabilirsiniz() {
        peyk_pages.ozlukFormOnay.click();
        BrowserUtils.waitFor(2);
        String ozlukArsiv = peyk_pages.ozlukArsiv.getText();
        Assert.assertEquals(ozlukArsiv,"Özlük Arşiv");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Özlük Dosyalarına tıklarsanız Genel Durum Raporu İndire ve Özlük İndire ulaşabilirsiniz")
    public void özlük_dosyalarına_tıklarsanız_genel_durum_raporu_i̇ndire_ve_özlük_i̇ndire_ulaşabilirsiniz() {
        peyk_pages.ozlukDosyalari.click();
        BrowserUtils.waitFor(2);
        String ozlukIndir = peyk_pages.ozlukIndir.getText();
        Assert.assertEquals(ozlukIndir,"Özlük İndir");
        BrowserUtils.waitFor(2);
        closeDriver();
    }


    }





