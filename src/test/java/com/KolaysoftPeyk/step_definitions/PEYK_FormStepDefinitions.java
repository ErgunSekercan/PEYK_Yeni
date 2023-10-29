package com.KolaysoftPeyk.step_definitions;


import com.KolaysoftPeyk.pages.PEYK_Pages;
import com.KolaysoftPeyk.utility.BrowserUtils;
import com.KolaysoftPeyk.utility.ConfigurationReader;
import com.KolaysoftPeyk.utility.Driver;
import io.cucumber.java.tr.Eğerki;
import org.testng.Assert;

public class PEYK_FormStepDefinitions extends Driver{

    PEYK_Pages peyk_pages = new PEYK_Pages();

    @Eğerki(": Forma tıklarsanız Form Gönder ve Form İşlemlerini görürsünüz")
    public void forma_tıklarsanız_form_gönder_ve_form_i̇şlemlerini_görürsünüz() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("TcNo"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("sifre"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        peyk_pages.PEYK.click();
        BrowserUtils.waitFor(2);

        peyk_pages.Form.click();
        BrowserUtils.waitFor(2);
        String formGonder = peyk_pages.formGonder.getText();
        Assert.assertEquals(formGonder,"Form Gönder");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Form Göndere tıklarsanız Gönderim yapmak istediğiniz form için form şablonunu seçebilir Şablonsuz gönderim yapabilirsiniz")
    public void forma_göndere_tıklarsanız_gönderim_yapmak_istediğiniz_form_için_form_şablonunu_seçebilir_şablonsuz_gönderim_yapabilirsiniz() {
        peyk_pages.formGonder.click();
        BrowserUtils.waitFor(2);
        String formGon = peyk_pages.formGon.getText();
        Assert.assertEquals(formGon,"Form Gönder");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Form İşlemlerine tıklarsanız Form Gönder seçeneğine ulaşabilirsiniz")
    public void forma_i̇şlemlerine_tıklarsanız_form_gönder_seçeneğine_ulaşabilirsiniz() {
        peyk_pages.formIslemleri.click();
        BrowserUtils.waitFor(2);
        String topluformGonder = peyk_pages.topluFormGonder.getText();
        Assert.assertEquals(topluformGonder,"Toplu Form Gönder");
        BrowserUtils.waitFor(2);

        peyk_pages.kullanici.click();
        peyk_pages.cikis.click();
        closeDriver();
    }


    }





