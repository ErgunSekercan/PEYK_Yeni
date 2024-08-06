package com.KolaysoftPeyk.step_definitions;


import com.KolaysoftPeyk.pages.PEYK_Pages;
import com.KolaysoftPeyk.utility.BrowserUtils;
import com.KolaysoftPeyk.utility.ConfigurationReader;
import com.KolaysoftPeyk.utility.Driver;
import io.cucumber.java.tr.Eğerki;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class PEYK_RolislemleriStepDefinitions extends Driver{

    PEYK_Pages peyk_pages = new PEYK_Pages();
    @Eğerki(": Rol Islemlerine tıklarsanız Rol Oluşturma ve Rol Atamaya ulaşabilirsiniz")
    public void rol_islemlerine_tıklarsanız_rol_oluşturma_ve_rol_atamaya_ulaşabilirsiniz() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("TcNo"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("sifre"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        peyk_pages.PEYK.click();
        BrowserUtils.waitFor(2);

        peyk_pages.rolIslemleri.click();
        BrowserUtils.waitFor(2);
        peyk_pages.rolOlusturma.click();
        String rolIslemleri = peyk_pages.rolOlustur.getText();
        Assert.assertEquals(rolIslemleri,"Rol Oluştur");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Rol Oluşturmaya tıklarsanız Rol Listesine ulaşip yeni Rol Oluşturabilirsiniz")
    public void rol_oluşturmaya_tıklarsanız_rol_listesine_ulaşip_yeni_rol_oluşturabilirsiniz() {
        peyk_pages.rolOlusturma.click();
        BrowserUtils.waitFor(2);
        String rolListesi = peyk_pages.rolListesi.getText();
        Assert.assertEquals(rolListesi,"Rol Listesi");
        BrowserUtils.waitFor(2);
        peyk_pages.rolOlustur.click();
        BrowserUtils.waitFor(1);
        peyk_pages.rolAdi.sendKeys("Peyk");
        BrowserUtils.waitFor(1);
        peyk_pages.kaydet4.click();
        BrowserUtils.waitFor(1);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(2);
        String rolPeyk = peyk_pages.rolPeyk.getText();
        Assert.assertEquals(rolPeyk,"Peyk");
        BrowserUtils.waitFor(2);
        peyk_pages.sil.click();
        BrowserUtils.waitFor(1);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(1);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(3);
    }
    @Eğerki(": Rol Atamaya tıklarsanız Personel Listesine ulaşıp Personele Rol Ekleyip Organizasyonel ve Masraf Yeri Yetki Atamaları yapabilirsiniz")
    public void rol_atamaya_tıklarsanız_personel_listesine_ulaşıp_personele_rol_ekleyip_organizasyonel_ve_masraf_yeri_yetki_atamaları_yapabilirsiniz() {
        peyk_pages.rolAtama.click();
        BrowserUtils.waitFor(2);
        String personelListesi = peyk_pages.personelListesi.getText();
        Assert.assertEquals(personelListesi,"Personel Listesi");
        BrowserUtils.waitFor(2);
        peyk_pages.personeleRolEkle.click();
        BrowserUtils.waitFor(1);
        peyk_pages.rolSec.sendKeys("Admin");
        peyk_pages.rolSec.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(2);


        peyk_pages.kullanici.click();
        peyk_pages.cikis.click();
        closeDriver();
    }

    }





