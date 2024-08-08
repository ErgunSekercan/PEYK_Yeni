package com.KolaysoftPeyk.step_definitions;

import com.KolaysoftPeyk.pages.PEYK_Pages;
import com.KolaysoftPeyk.utility.BrowserUtils;
import com.KolaysoftPeyk.utility.ConfigurationReader;
import com.KolaysoftPeyk.utility.Driver;
import io.cucumber.java.tr.Eğerki;
import org.testng.Assert;

public class AnaSayfaStepDefinitions extends Driver{

    PEYK_Pages peyk_pages = new PEYK_Pages();

    @Eğerki(": Ana Sayfaya tıklarsanız ana ekrandaki tüm uygulamaları görürsünüz")
    public void ana_sayfaya_tıklarsanız_ana_ekrandaki_tüm_uygulamaları_görürsünüz() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("TcNo"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("sifre"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        peyk_pages.anaSayfa.click();
        String anaSayfa = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(anaSayfa,"https://peyktest2.kolaysoft.com.tr/accounting/peyk/hr-dashboard");
        BrowserUtils.waitFor(3);
    }
    @Eğerki(": Bordro Göndere tıklarsanız Ücret Bordrosu Yükle ekranına geçersiniz")
    public void bordro_göndere_tıklarsanız_ücret_bordrosu_yükle_ekranına_geçersiniz() {
        peyk_pages.bordroGonder.click();
        BrowserUtils.waitFor(3);
        String bordroYukle = peyk_pages.ucretBordrosuYukle.getText();
        Assert.assertEquals(bordroYukle,"Ücret Bordrosu Yükle");
        BrowserUtils.waitFor(3);
    }
    @Eğerki(": Form Göndere tıklarsanız Gönderim yapmak istediğiniz form için form şablonunu seçebilirsiniz")
    public void form_göndere_tıklarsanız_gönderim_yapmak_istediğiniz_form_için_form_şablonunu_seçebilirsiniz() {
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(3);
        peyk_pages.formGonder.click();
        String formSablon = peyk_pages.sablonsuzGonderim.getText();
        Assert.assertEquals(formSablon,"Şablonsuz Gönderim");
        BrowserUtils.waitFor(3);
    }
    @Eğerki(": Taslak Hazırlaya tıklarsanız Form Şablonu Oluşturabilirsiniz")
    public void taslak_hazırlaya_tıklarsanız_form_şablonu_oluşturabilirsiniz() {
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(3);
        peyk_pages.taslakHazırla.click();
        String form = peyk_pages.formuOnizle.getText();
        Assert.assertEquals(form,"Formu Önizle");
        BrowserUtils.waitFor(3);

    }
    @Eğerki(": Özlük Form Onayına tıklarsanız Özlük Form Onay ve Özlük Arşiv ekranına geçersiniz")
    public void özlük_form_onayına_tıklarsanız_özlük_form_onay_ve_özlük_arşiv_ekranına_geçersiniz() {
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(3);
        peyk_pages.ozlukFormOnayi.click();
        String ozluk = peyk_pages.ozlukIslemleri.getText();
        Assert.assertEquals(ozluk, "Özlük İşlemleri");
        BrowserUtils.waitFor(3);
    }

    @Eğerki(": Aylık Bildirimler tablosundan Bordroya tıklarsanız Ücret Bordroları arşivine ulaşırsınız")
    public void aylık_bildirimler_tablosundan_bordroya_tıklarsanız_ücret_bordları_arşivine_ulaşırsınız() {
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(3);
        peyk_pages.bordro.click();
        String ozlukBordrolar = peyk_pages.ozlukBordrolarArsiv.getText();
        Assert.assertEquals(ozlukBordrolar, "Ücret Bordroları Arşiv");
        BrowserUtils.waitFor(3);
    }
    @Eğerki(": Aylık Bildirimler tablosundan Forma tıklarsanız Formlar arşivine ulaşırsınız")
    public void aylık_bildirimler_tablosundan_forma_tıklarsanız_formlar_arşivine_ulaşırsınız() {
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(3);
        peyk_pages.form.click();
        String formlar = peyk_pages.formlarArsiv.getText();
        Assert.assertEquals(formlar, "Formlar Arşiv");
        BrowserUtils.waitFor(5);

        peyk_pages.kullanici.click();
        peyk_pages.cikis.click();
        closeDriver();
    }


    }





