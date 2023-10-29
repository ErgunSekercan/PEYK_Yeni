package com.KolaysoftPeyk.step_definitions;

import com.KolaysoftPeyk.pages.PEYK_Pages;
import com.KolaysoftPeyk.utility.BrowserUtils;
import com.KolaysoftPeyk.utility.ConfigurationReader;
import com.KolaysoftPeyk.utility.Driver;
import io.cucumber.java.tr.Eğerki;
import org.testng.Assert;

public class OnayBekleyenlerStepDefinitions extends Driver{

    PEYK_Pages peyk_pages = new PEYK_Pages();

    @Eğerki(": Onay Bekleyenlere tıklarsanız Onay Bekleyen Dokümanları görürsünüz")
    public void onay_bekleyenlere_tıklarsanız_onay_bekleyen_dokümanları_görürsünüz() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("TcNo"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("sifre"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        peyk_pages.onayBekleyenler.click();
        String onayBek = peyk_pages.onayBekleyenler.getText();
        Assert.assertEquals(onayBek,"Onay Bekleyenler");
        BrowserUtils.waitFor(3);

        peyk_pages.kullanici.click();
        peyk_pages.cikis.click();
        closeDriver();

    }


    }





