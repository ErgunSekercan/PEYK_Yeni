package com.KolaysoftPeyk.step_definitions;

import com.KolaysoftPeyk.pages.PEYK_Pages;
import com.KolaysoftPeyk.utility.BrowserUtils;
import com.KolaysoftPeyk.utility.ConfigurationReader;
import com.KolaysoftPeyk.utility.Driver;
import io.cucumber.java.tr.Eğerki;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class PEYK_TanimlarStepDefinitions extends Driver{

    PEYK_Pages peyk_pages = new PEYK_Pages();

    @Eğerki(": PEYKe tıklarsanız peykin altındaki tüm uygulamalara ulaşabilirsiniz")
    public void pey_ke_tıklarsanız_peykin_altındaki_tüm_uygulamalara_ulaşabilirsiniz() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("TcNo"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("sifre"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(7);

        peyk_pages.PEYK.click();
        BrowserUtils.waitFor(2);
        String tanim = peyk_pages.tanimlar.getText();
        Assert.assertEquals(tanim,"Tanımlar");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Tanımlara tıklarsanız Departman,Çalışan,Form tanımları gibi uygulamalara erişebilirsiniz")
    public void tanımlara_tıklarsanız_departman_çalışan_form_tanımları_gibi_uygulamalara_erişebilirsiniz() {
        peyk_pages.tanimlar.click();
        BrowserUtils.waitFor(2);
        String departman = peyk_pages.departmanTanimi.getText();
        Assert.assertEquals(departman,"Departman Tanımı");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Departman Tanımına tıklarsanız Departman Listesine ulaşıp Yeni Departman oluşturabilirsiniz")
    public void departman_tanımına_tıklarsanız_departman_listesine_ulaşıp_yeni_departman_oluşturabilirsiniz() {
        peyk_pages.departmanTanimi.click();
        BrowserUtils.waitFor(2);
        String departList = peyk_pages.departmanListesi.getText();
        Assert.assertEquals(departList,"Departman Listesi");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.departmanSeciniz.click();
        BrowserUtils.waitFor(2);
        peyk_pages.merkezDepartman.click();
        BrowserUtils.waitFor(2);
        peyk_pages.turSeciniz.click();
        BrowserUtils.waitFor(2);
        peyk_pages.turSube.click();
        BrowserUtils.waitFor(2);
        peyk_pages.departmanAdi.sendKeys("Kolaysoft");
        BrowserUtils.waitFor(2);
        peyk_pages.departmanKodu.sendKeys("001");
        BrowserUtils.waitFor(2);
        peyk_pages.kaydet4.click();
        BrowserUtils.waitFor(2);
        peyk_pages.departmanSil.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Departman Tür Tanımına tıklarsanız Departman Türü Listesine ulaşıp Yeni Departman Türü oluşturabilirsiniz")
    public void departman_tür_tanımına_tıklarsanız_departman_türü_listesine_ulaşıp_yeni_departman_türü_oluşturabilirsiniz() {
        peyk_pages.departmanTurTanimi.click();
        BrowserUtils.waitFor(2);
        String depturu = peyk_pages.departmanTuruListesi.getText();
        Assert.assertEquals(depturu,"Departman Türü Listesi");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.departmanTuruOlustur.sendKeys("Bilkent");
        BrowserUtils.waitFor(2);
        peyk_pages.kaydet4.click();
        BrowserUtils.waitFor(2);
        peyk_pages.departmanTuruSil.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Çalışan Tanımlarına tıklarsanız Çalışanlara ve Çalışan Şifre Yönetimine ulaşabilirsiniz")
    public void çalışan_tanımlarına_tıklarsanız_çalışanlara_ve_çalışan_şifre_yönetimine_ulaşabilirsiniz() throws AWTException {
        peyk_pages.calisanTanimlari.click();
        BrowserUtils.waitFor(2);
        String calisanlar = peyk_pages.calisanlar.getText();
        Assert.assertEquals(calisanlar,"Çalışanlar");
        BrowserUtils.waitFor(2);

    }
    @Eğerki(": Çalışanlara tıklarsanız Çalışan Listesine ulaşabilir Yeni Çalışan Oluşturabilir Çoklu İşlemler yapabilirsiniz")
    public void çalışanlara_tıklarsanız_çalışan_listesine_ulaşabilir_yeni_çalışan_oluşturabilir_çoklu_i̇şlemler_yapabilirsiniz() throws AWTException {
        peyk_pages.calisanlar.click();
        BrowserUtils.waitFor(2);
        String calisanListesi = peyk_pages.calisanListesi.getText();
        Assert.assertEquals(calisanListesi,"Çalışan Listesi");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.calisanAdi.sendKeys("Yıldırım");
        BrowserUtils.waitFor(2);
        peyk_pages.calisanSoyadi.sendKeys("Tufan");
        BrowserUtils.waitFor(2);
        peyk_pages.calisanTckn.sendKeys("76789134724");
        BrowserUtils.waitFor(2);
        peyk_pages.departman.sendKeys("Merkez");
        BrowserUtils.waitFor(2);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.bildirimTuru.sendKeys("SMS");
        BrowserUtils.waitFor(2);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.telefonNumarasi.sendKeys("5425424242");
        BrowserUtils.waitFor(2);
        peyk_pages.kaydet5.click();
        BrowserUtils.waitFor(2);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(3);
        peyk_pages.calisanSil.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Çalışan Şifre Yönetimine tıklarsanız Yeni Şifre Talebi oluşturabilir,Ana Sayfa Linki,Kayıt Bildirisi Gönderebilir Bloke Listesine ulaşabilirsiniz")
    public void çalışan_şifre_yönetimine_tıklarsanız_yeni_şifre_talebi_oluşturabilir_ana_sayfa_linki_kayıt_bildirisi_gönderebilir_bloke_listesine_ulaşabilirsiniz() {
        peyk_pages.calisanSifreYon.click();
        BrowserUtils.waitFor(2);
        String calisanSifreYonetimi = peyk_pages.calSifYon.getText();
        Assert.assertEquals(calisanSifreYonetimi,"Çalışan Şifre Yönetimi");
        BrowserUtils.waitFor(2);
        peyk_pages.calisanBlokeListesi.click();
        BrowserUtils.waitFor(2);
        String calisanBlokeListesi = peyk_pages.calBlokList.getText();
        Assert.assertEquals(calisanBlokeListesi,"Çalışan Bloke Listesi");
        BrowserUtils.waitFor(3);
        peyk_pages.IkAdminBlokeListesi.click();
        BrowserUtils.waitFor(2);
        String IkAdminBlokeListesi = peyk_pages.IkAdmlBlokList.getText();
        Assert.assertEquals(IkAdminBlokeListesi,"IK Admin Hesabı Bloke Listesi");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniSifreTalebi.click();
        BrowserUtils.waitFor(2);
        peyk_pages.ilkCalisan.click();
        BrowserUtils.waitFor(2);
        peyk_pages.exceleAktar.click();
        BrowserUtils.waitFor(2);
        peyk_pages.sifreTekrarGonder.click();
        BrowserUtils.waitFor(2);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(2);
        peyk_pages.anaSayfaLinkiGonder.click();
        BrowserUtils.waitFor(2);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(2);
        peyk_pages.kayıtBildirisiGonder.click();
        BrowserUtils.waitFor(2);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(2);
        peyk_pages.hayir.click();
        BrowserUtils.waitFor(2);
        peyk_pages.sonucYenile.click();
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Firma Bilgilerine tıklarsanız Logo Yükle,Antentli Kağıt Yükle,Şifre Politikası Belirle,İndirilebilir Dosya Yükle,Bildirim Tasarım Ekranı ve Firma Parametrelerine ulaşabilirsiniz")
    public void firma_bilgilerine_tıklarsanız_logo_yükle_antentli_kağıt_yükle_şifre_politikası_belirle_indirilebilir_dosya_yükle_bildirim_tasarım_ekranı_ve_firma_parametrelerine_ulaşabilirsiniz() {
        peyk_pages.firmaBilgileri.click();
        BrowserUtils.waitFor(2);
        String logoYukle = peyk_pages.logoYukle.getText();
        Assert.assertEquals(logoYukle,"Logo Yükle");
        BrowserUtils.waitFor(2);
        peyk_pages.logoYukle.click();
        BrowserUtils.waitFor(2);
        peyk_pages.chooseFile.isDisplayed();
        BrowserUtils.waitFor(2);
        peyk_pages.kapat.click();
        BrowserUtils.waitFor(2);
        peyk_pages.antentliKagYuk.click();
        BrowserUtils.waitFor(2);
        peyk_pages.chooseFile.isDisplayed();
        peyk_pages.kapat.click();
        BrowserUtils.waitFor(2);
        peyk_pages.sifrePolitikasiBelirle.click();
        BrowserUtils.waitFor(2);
        String sifrePolitikasiEkrani = peyk_pages.sifrePolitikasiEkrani.getText();
        Assert.assertEquals(sifrePolitikasiEkrani,"Şifre Politikası Ekranı");
        BrowserUtils.waitFor(2);
        peyk_pages.kapat.click();
        BrowserUtils.waitFor(2);
        peyk_pages.indirilebilirDosyaYükle.click();
        BrowserUtils.waitFor(2);
        String indirilebilirDosyaniziYükleyiniz = peyk_pages.indirilebilirDosyaniziYükleyiniz.getText();
        Assert.assertEquals(indirilebilirDosyaniziYükleyiniz,"İndirilebilir dosyanızı yükleyiniz.");
        BrowserUtils.waitFor(2);
        peyk_pages.kapat.click();
        BrowserUtils.waitFor(2);
        peyk_pages.bildirimTasarimEkrani.click();
        BrowserUtils.waitFor(2);
        String eslestirilenGonderim = peyk_pages.eslestirilenGonderim.getText();
        Assert.assertEquals(eslestirilenGonderim,"Eşleştirilen Gönderim :");
        BrowserUtils.waitFor(2);
        peyk_pages.kapat.click();
        BrowserUtils.waitFor(2);
        peyk_pages.firmaParametreleri.click();
        BrowserUtils.waitFor(2);
        String parametreAdi = peyk_pages.parametreAdi.getText();
        Assert.assertEquals(parametreAdi,"Parametre Adı");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Bilgilendirme Durumuna tıklarsanız Çalışan Bilgilendirme Durumu Sorgulama ekranına ulaşabilirsiniz")
    public void bilgilendirme_durumuna_tıklarsanız_çalışan_bilgilendirme_durumu_sorgulama_ekranına_ulaşabilirsiniz() {
        peyk_pages.bilgilendirmeDurumu.click();
        BrowserUtils.waitFor(2);
        String calisanBilgilendirmeList = peyk_pages.calisanBilgilendirmeList.getText();
        Assert.assertEquals(calisanBilgilendirmeList,"Çalışan Listesi");
        BrowserUtils.waitFor(2);
        peyk_pages.calisanSec.click();
        BrowserUtils.waitFor(2);
        peyk_pages.baslangicTarihi.sendKeys("01-08-2024");
        BrowserUtils.waitFor(1);
        peyk_pages.bitisTarihi.sendKeys("07-08-2024");
        BrowserUtils.waitFor(2);
        peyk_pages.aramaYap.click();
        BrowserUtils.waitFor(2);
        peyk_pages.bilgilendirmeTel.isDisplayed();
        BrowserUtils.waitFor(2);

    }
    @Eğerki(": Onay Akışına tıklarsanız Onay Akış Politikanızı oluşturabilirsiniz")
    public void onay_akışına_tıklarsanız_onay_akış_politikanızı_oluşturabilirsiniz() throws AWTException {
        peyk_pages.onayAkisi.click();
        BrowserUtils.waitFor(2);
        String yeniOnayAkisi = peyk_pages.yeniOnayAkisi.getText();
        Assert.assertEquals(yeniOnayAkisi,"Yeni Oluştur");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.belgeTuruSeciniz.sendKeys("AKIŞ");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.kaydet5.click();
        BrowserUtils.waitFor(2);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(3);
        peyk_pages.akisSil.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": E-Imza Doğrulamaya tıklarsanız Akıllı kart markasını seçebilirsiniz")
    public void e_imza_doğrulamaya_tıklarsanız_akıllı_kart_markasını_seçebilirsiniz() {
        peyk_pages.eImzaDog.click();
        BrowserUtils.waitFor(2);
        String eImzaDogrulama = peyk_pages.AkilliKart.getText();
        Assert.assertEquals(eImzaDogrulama,"Akıllı kart markası");
        BrowserUtils.waitFor(2);
    }

    @Eğerki(": Form Tanımlarına tıklarsanız Form Şablonları ve Talep Form Editörüne ulaşabilirsiniz")
    public void form_tanımlarına_tıklarsanız_form_şablonları_ve_talep_form_editörüne_ulaşabilirsiniz() {
        peyk_pages.formTanimlari.click();
        BrowserUtils.waitFor(2);
        String formSablonlari = peyk_pages.formSablonlari.getText();
        Assert.assertEquals(formSablonlari,"Form Şablonları");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Form Şablonlarına tıklarsanız Öncelikli Formları Sıralayıp Yeni Form Şablonu oluşturabilirsiniz")
    public void form_şablonlarına_tıklarsanız_öncelikli_formları_sıralayıp_yeni_form_şablonu_oluşturabilirsiniz() throws AWTException {
        peyk_pages.formSablonlari.click();
        BrowserUtils.waitFor(2);
        String formSablon = peyk_pages.formSablon.getText();
        Assert.assertEquals(formSablon,"Form Şablonları");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.formTuru.sendKeys("BİLDİRİM");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.formAdi.sendKeys("Kolaysoft");
        BrowserUtils.waitFor(2);
        peyk_pages.calisanParametreleri.click();
        BrowserUtils.waitFor(1);
        peyk_pages.calisanAd.click();
        BrowserUtils.waitFor(1);
        peyk_pages.formuKaydet.click();
        BrowserUtils.waitFor(1);
        peyk_pages.kapat.click();
        BrowserUtils.waitFor(1);
        peyk_pages.formAdi_Kolaysoft.isDisplayed();
        BrowserUtils.waitFor(2);
        peyk_pages.sil.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Form Şablonlarında önce Yeni Oluştur sonra da Form Türü Tanımına tıklarsanız Yeni Form Türü oluşturabilirsiniz")
    public void form_şablonlarında_önce_yeni_oluştur_sonra_da_form_türü_tanımına_tıklarsanız_yeni_form_türü_oluşturabilirsiniz() throws AWTException {
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.formTuruTanimi.click();
        BrowserUtils.waitFor(2);
        String formTuruListesi = peyk_pages.formTuruListesi.getText();
        Assert.assertEquals(formTuruListesi,"Form Türü Listesi");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(2);
        peyk_pages.formTuru2.sendKeys("ALACAK");
        BrowserUtils.waitFor(2);
        peyk_pages.kaydet4.click();
        BrowserUtils.waitFor(2);
        peyk_pages.formTuru3.sendKeys("ALACAK");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.waitFor(2);
        peyk_pages.alacakTuru.isDisplayed();
        BrowserUtils.waitFor(2);
        peyk_pages.sil2.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Talep Form Editörüne tıklarsanız Yeni Talep Formu oluşturabilirsiniz")
    public void talep_form_editörüne_tıklarsanız_yeni_talep_formu_oluşturabilirsiniz() {
        peyk_pages.talepFormEditor.click();
        BrowserUtils.waitFor(2);
        String talepFormlari = peyk_pages.talepFormlari.getText();
        Assert.assertEquals(talepFormlari,"Talep Formları");
        BrowserUtils.waitFor(2);
        peyk_pages.yeniOlustur.click();
        BrowserUtils.waitFor(3);
        peyk_pages.baslik.click();
        BrowserUtils.waitFor(2);
        peyk_pages.basliginIci.sendKeys("Otomasyon Test Formu");
        BrowserUtils.waitFor(2);
        peyk_pages.kaydet5.click();
        BrowserUtils.waitFor(2);
        peyk_pages.kapat.click();
        BrowserUtils.waitFor(2);
        peyk_pages.talepFormAdi.sendKeys("Otomasyon Test Formu");
        BrowserUtils.waitFor(2);
        peyk_pages.aramaYap2.click();
        BrowserUtils.waitFor(2);
        peyk_pages.sil2.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(2);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(2);
        peyk_pages.kayitBulunamadi.isDisplayed();
        BrowserUtils.waitFor(2);

        peyk_pages.kullanici.click();
        peyk_pages.cikis.click();
        closeDriver();
    }


    }





