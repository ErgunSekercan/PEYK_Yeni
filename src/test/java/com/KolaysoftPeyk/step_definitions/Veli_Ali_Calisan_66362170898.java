package com.KolaysoftPeyk.step_definitions;


import com.KolaysoftPeyk.pages.PEYK_Pages;
import com.KolaysoftPeyk.utility.BrowserUtils;
import com.KolaysoftPeyk.utility.ConfigurationReader;
import com.KolaysoftPeyk.utility.Driver;
import io.cucumber.java.tr.Eğerki;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Veli_Ali_Calisan_66362170898 extends Driver{

    PEYK_Pages peyk_pages = new PEYK_Pages();

    @Eğerki(": TCKN ve şifrenizle giriş yaparsanız Ana Sayfada Onay Bekleyenler, Ücret Bordroları ve Formlar Arşive ulaşıp Talep Formu doldurup Özlük Dosyası yükleyip İşlem geçmişinizi görüntüleyebilirsiniz")
    public void tckn_ve_şifrenizle_giriş_yaparsanız_ana_sayfada_onay_bekleyenler_ücret_bordroları_ve_formlar_arşive_ulaşıp_talep_formu_doldurup_özlük_dosyası_yükleyip_i̇şlem_geçmişinizi_görüntüleyebilirsiniz() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys("66362170898");
        peyk_pages.sifre.sendKeys("Aa,12345");
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);
    }
    @Eğerki(": Onay Bekleyenlere tıklarsanız sizin onayınıza gönderilmiş formları ve bordroları görüntüleyip onaylayabilirsiniz")
    public void onay_bekleyenlere_tıklarsanız_sizin_onayınıza_gönderilmiş_formları_ve_bordroları_görüntüleyip_onaylayabilirsiniz() {

        peyk_pages.onayBekleyenler.click();
        String onayBek = peyk_pages.onayBekleyenler.getText();
        Assert.assertEquals(onayBek,"Onay Bekleyenler");
        BrowserUtils.waitFor(3);

        try {

            if (peyk_pages.onayBekleyen1.isDisplayed()) {
                peyk_pages.secOpsiyonu.click();
                BrowserUtils.waitFor(2);
                peyk_pages.sayfadakileriSec.click();
                BrowserUtils.waitFor(2);
                peyk_pages.tamam.click();
                BrowserUtils.waitFor(2);
                peyk_pages.secilenleriOnayla.click();
                BrowserUtils.waitFor(2);
                peyk_pages.evet.click();
                BrowserUtils.waitFor(2);
            }
        }catch (Exception e){
            System.out.println("Kayıt bulunamadı");
        }
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Talep Formlarına tıklarsanız Talep Form Listesine ulaşabilir Yeni Talep oluşturabilirsiniz")
    public void talep_formlarına_tıklarsanız_talep_form_listesine_ulaşabilir_yeni_talep_oluşturabilirsiniz() throws AWTException {

        peyk_pages.talepFormlariCalisan.click();
        BrowserUtils.waitFor(2);
        peyk_pages.yeniTalep.click();
        BrowserUtils.waitFor(2);
        peyk_pages.talepFormu.sendKeys("GÜNLÜK İZİN FORMU");
        BrowserUtils.waitFor(2);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.kabulEdiyorum.click();
        BrowserUtils.waitFor(2);
        peyk_pages.kaydetVeGonder.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(3);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(3);

        peyk_pages.kullanici.click();
        peyk_pages.cikis.click();
        closeDriver();
    }

    }







