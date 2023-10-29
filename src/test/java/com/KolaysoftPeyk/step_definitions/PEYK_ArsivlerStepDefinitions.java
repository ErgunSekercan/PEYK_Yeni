package com.KolaysoftPeyk.step_definitions;


import com.KolaysoftPeyk.pages.PEYK_Pages;
import com.KolaysoftPeyk.utility.BrowserUtils;
import com.KolaysoftPeyk.utility.ConfigurationReader;
import com.KolaysoftPeyk.utility.Driver;
import io.cucumber.java.tr.Eğerki;
import org.testng.Assert;

public class PEYK_ArsivlerStepDefinitions extends Driver{

    PEYK_Pages peyk_pages = new PEYK_Pages();

    @Eğerki(": Arşivlere tıklarsanız Ücret Bordroları Arşivine ve Formlar Arşivine ulaşabilirsiniz")
    public void özlük_arşivlere_tıklarsanız_ücret_bordroları_arşivine_ve_formlar_arşivine_ulaşabilirsiniz() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("TcNo"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("sifre"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        peyk_pages.PEYK.click();
        BrowserUtils.waitFor(2);

        peyk_pages.arsivler.click();
        BrowserUtils.waitFor(2);
        String ucretBordrolarıArsiv = peyk_pages.ucretBordrolariArsiv.getText();
        Assert.assertEquals(ucretBordrolarıArsiv,"Ücret Bordroları Arşiv");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Ücret Bordroları Arşivine tıklarsanız geçmiş Ücret Bordroları Arşivine ulaşabilirsiniz")
    public void ücret_bordroları_arşivine_tıklarsanız_geçmiş_ücret_bordroları_arşivine_ulaşabilirsiniz() {
        peyk_pages.ucretBordrolariArsiv.click();
        BrowserUtils.waitFor(2);
        String ucretBordArs = peyk_pages.ucretBordArs.getText();
        Assert.assertEquals(ucretBordArs,"Ücret Bordroları Arşiv");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Formlar Arşivine tıklarsanız geçmiş Formlar Arşivine ulaşabilirsiniz")
    public void formlar_arşivine_tıklarsanız_geçmiş_formlar_arşivine_ulaşabilirsiniz() {
        peyk_pages.formlarArs.click();
        BrowserUtils.waitFor(2);
        String formArs = peyk_pages.formArs.getText();
        Assert.assertEquals(formArs,"Formlar Arşiv");
        BrowserUtils.waitFor(2);

        peyk_pages.kullanici.click();
        peyk_pages.cikis.click();
        closeDriver();
    }

    }





