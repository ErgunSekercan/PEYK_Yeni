package com.KolaysoftPeyk.step_definitions;


import com.KolaysoftPeyk.pages.PEYK_Pages;
import com.KolaysoftPeyk.utility.BrowserUtils;
import com.KolaysoftPeyk.utility.ConfigurationReader;
import com.KolaysoftPeyk.utility.Driver;
import io.cucumber.java.tr.Eğerki;
import org.openqa.selenium.Keys;
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
    @Eğerki(": Özlük Form Onayına tıklarsanız Özlük Form Onayı ve Özlük Arşive ulaşabilirsiniz")
    public void özlük_form_onayına_tıklarsanız_özlük_form_onayı_ve_özlük_arşive_ulaşabilirsiniz() {
        peyk_pages.ozlukFormOnay.click();
        BrowserUtils.waitFor(2);
        String ozlukArsiv = peyk_pages.ozlukArsiv.getText();
        Assert.assertEquals(ozlukArsiv,"Özlük Arşiv");
        BrowserUtils.waitFor(2);
        peyk_pages.ozlukArsiv.click();
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Özlük Dosyalarına tıklarsanız Genel Durum Raporu İndire ve Özlük İndire ulaşabilirsiniz")
    public void özlük_dosyalarına_tıklarsanız_genel_durum_raporu_i̇ndire_ve_özlük_i̇ndire_ulaşabilirsiniz() {
        peyk_pages.ozlukDosyalari.click();
        BrowserUtils.waitFor(2);
        String ozlukIndir = peyk_pages.ozlukIndir.getText();
        Assert.assertEquals(ozlukIndir, "Özlük İndir");
        BrowserUtils.waitFor(2);
    }

    @Eğerki(": Kırmızı renkli yükle butonu ile özlük dosyası yüklemek isterseniz butona basıp dosya seçip istediğiniz özlüğe yükleme yapabilirsiniz")
    public void kırmızı_renkli_yükle_butonu_ile_özlük_dosyası_yüklemek_isterseniz_butona_basıp_dosya_seçip_istediğiniz_özlüğe_yükleme_yapabilirsiniz() {

        peyk_pages.kirmiziBtn.click();
        BrowserUtils.waitFor(2);
        peyk_pages.dosyaSec.sendKeys("C:\\Users\\Kolaysoft\\IdeaProjects\\PEYK_Yeni\\3_kişininMetni.pdf");
        BrowserUtils.waitFor(2);
        peyk_pages.ozlukSecme.sendKeys("Özlük Formu");
        peyk_pages.ozlukSecme.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.yuklenecekYer.sendKeys("Doküman Satırı");
        BrowserUtils.waitFor(2);
        peyk_pages.yuklenecekYer.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.kaydet2.click();
        BrowserUtils.waitFor(2);
        peyk_pages.degistir.click();
        BrowserUtils.waitFor(3);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(1);
    }
    @Eğerki(": Mavi renkli yükle butonu ile özlük dosyası yüklemek isterseniz butona basıp istediğiniz özlüğe yükleme yapabilirsiniz")
    public void mavi_renkli_yükle_butonu_ile_özlük_dosyası_yüklemek_isterseniz_butona_basıp_istediğiniz_özlüğe_yükleme_yapabilirsiniz() {

        peyk_pages.maviBtn.click();
        BrowserUtils.waitFor(1);
        peyk_pages.ozlukSec.sendKeys("Özlük Formu");
        BrowserUtils.waitFor(1);
        peyk_pages.ozlukSec.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(1);
        peyk_pages.duzenle.click();
        BrowserUtils.waitFor(2);
        peyk_pages.metinAlani.sendKeys("a");
        BrowserUtils.waitFor(1);
        peyk_pages.kaydet3.click();
        BrowserUtils.waitFor(1);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(2);
        peyk_pages.tamam.click();


        closeDriver();
        }





        }












