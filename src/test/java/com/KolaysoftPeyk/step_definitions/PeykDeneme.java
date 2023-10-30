package com.KolaysoftPeyk.step_definitions;

import com.KolaysoftPeyk.pages.PEYK_Pages;
import com.KolaysoftPeyk.utility.BrowserUtils;
import com.KolaysoftPeyk.utility.ConfigurationReader;
import com.KolaysoftPeyk.utility.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PeykDeneme extends Driver {

    PEYK_Pages peyk_pages = new PEYK_Pages();

    @Test
    public void bordro(){

        Driver.getDriver().get("https://peyktest.kolaysoft.com.tr/accounting/login");
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("87197540786"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("Aa,12345"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        peyk_pages.PEYK.click();
        BrowserUtils.waitFor(2);

        peyk_pages.ucretBordrosu.click();
        BrowserUtils.waitFor(3);
        //String ucretBordrosu = peyk_pages.ucretBordrosuYukle.getText();
        Assert.assertEquals(peyk_pages.ucretBordrosuYukle.getText(),"Ücret Bordrosu Yükle");
        BrowserUtils.waitFor(2);
    }
}
