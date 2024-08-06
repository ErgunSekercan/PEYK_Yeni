package com.KolaysoftPeyk.step_definitions;

import com.KolaysoftPeyk.pages.PEYK_Pages;
import com.KolaysoftPeyk.utility.BrowserUtils;
import com.KolaysoftPeyk.utility.ConfigurationReader;
import com.KolaysoftPeyk.utility.Driver;
import io.cucumber.java.tr.Eğerki;
import org.testng.Assert;

public class PEYK_TanimlarStepDefinitions extends Driver{

    PEYK_Pages peyk_pages = new PEYK_Pages();

    @Eğerki(": PEYKe tıklarsanız peykin altındaki tüm uygulamalara ulaşabilirsiniz")
    public void pey_ke_tıklarsanız_peykin_altındaki_tüm_uygulamalara_ulaşabilirsiniz() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("TcNo"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("sifre"));
        peyk_pages.giris.click();
        BrowserUtils.waitFor(10);

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
    }
    @Eğerki(": Departman Tür Tanımına tıklarsanız Departman Türü Listesine ulaşıp Yeni Departman Türü oluşturabilirsiniz")
    public void departman_tür_tanımına_tıklarsanız_departman_türü_listesine_ulaşıp_yeni_departman_türü_oluşturabilirsiniz() {
        peyk_pages.departmanTurTanimi.click();
        BrowserUtils.waitFor(2);
        String depturu = peyk_pages.departmanTuru.getText();
        Assert.assertEquals(depturu,"Departman Türü Listesi");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Çalışan Tanımlarına tıklarsanız Çalışanlara ve Çalışan Şifre Yönetimine ulaşabilirsiniz")
    public void çalışan_tanımlarına_tıklarsanız_çalışanlara_ve_çalışan_şifre_yönetimine_ulaşabilirsiniz() {
        peyk_pages.calisanTanimlari.click();
        BrowserUtils.waitFor(2);
        String calisanlar = peyk_pages.calisanlar.getText();
        Assert.assertEquals(calisanlar,"Çalışanlar");
        BrowserUtils.waitFor(2);


    }
    @Eğerki(": Çalışanlara tıklarsanız Çalışan Listesine ulaşabilir Yeni Çalışan Oluşturabilir Çoklu İşlemler yapabilirsiniz")
    public void çalışanlara_tıklarsanız_çalışan_listesine_ulaşabilir_yeni_çalışan_oluşturabilir_çoklu_i̇şlemler_yapabilirsiniz() {
        peyk_pages.calisanlar.click();
        BrowserUtils.waitFor(2);
        String calisanListesi = peyk_pages.calisanListesi.getText();
        Assert.assertEquals(calisanListesi,"Çalışan Listesi");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Çalışan Şifre Yönetimine tıklarsanız Yeni Şifre Talebi oluşturabilir,Ana Sayfa Linki,Kayıt Bildirisi Gönderebilir Bloke Listesine ulaşabilirsiniz")
    public void çalışan_şifre_yönetimine_tıklarsanız_yeni_şifre_talebi_oluşturabilir_ana_sayfa_linki_kayıt_bildirisi_gönderebilir_bloke_listesine_ulaşabilirsiniz() {
        peyk_pages.calisanSifreYon.click();
        BrowserUtils.waitFor(2);
        String calisanSifreYonetimi = peyk_pages.calSifYon.getText();
        Assert.assertEquals(calisanSifreYonetimi,"Çalışan Şifre Yönetimi");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Firma Bilgilerine tıklarsanız Logo,Antentli Kağıt Yükleyebilir,Şifre Politikası Belirleyip diğer işlemleri yapabilirsiniz")
    public void firma_bilgilerine_tıklarsanız_logo_antentli_kağıt_yükleyebilir_şifre_politikası_belirleyip_diğer_işlemleri_yapabilirsiniz() {
        peyk_pages.firmaBilgileri.click();
        BrowserUtils.waitFor(2);
        String logoYukle = peyk_pages.logoYukle.getText();
        Assert.assertEquals(logoYukle,"Logo Yükle");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Bilgilendirme Durumuna tıklarsanız Çalışan Bilgilendirme Durumu Sorgulama ekranına ulaşabilirsiniz")
    public void bilgilendirme_durumuna_tıklarsanız_çalışan_bilgilendirme_durumu_sorgulama_ekranına_ulaşabilirsiniz() {
        peyk_pages.bilgilendirmeDurumu.click();
        BrowserUtils.waitFor(2);
        String calisanBilgilendirmeList = peyk_pages.calisanBilgilendirmeList.getText();
        Assert.assertEquals(calisanBilgilendirmeList,"Çalışan Listesi");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Onay Akışına tıklarsanız Onay Akış Politikanızı oluşturabilirsiniz")
    public void onay_akışına_tıklarsanız_onay_akış_politikanızı_oluşturabilirsiniz() {
        peyk_pages.onayAkisi.click();
        BrowserUtils.waitFor(2);
        String yeniOnayAkisi = peyk_pages.yeniOnayAkisi.getText();
        Assert.assertEquals(yeniOnayAkisi,"Yeni Oluştur");
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

    @Eğerki(": Form Tanımlarına tıklarsanız Form Şablonları,Form Türü Tanımı,Firma Parametreleri,Talep Form Editörüne ulaşabilirsiniz")
    public void form_tanımlarına_tıklarsanız_form_şablonları_form_türü_tanımı_firma_parametreleri_talep_form_editörüne_ulaşabilirsiniz() {
        peyk_pages.formTanimlari.click();
        BrowserUtils.waitFor(2);
        String formSablonlari = peyk_pages.formSablonlari.getText();
        Assert.assertEquals(formSablonlari,"Form Şablonları");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Form Şablonlarına tıklarsanız Öncelikli Formları Sıralayıp Yeni Form Şablonu oluşturabilirsiniz")
    public void form_şablonlarına_tıklarsanız_öncelikli_formları_sıralayıp_yeni_form_şablonu_oluşturabilirsiniz() {
        peyk_pages.formSablonlari.click();
        BrowserUtils.waitFor(2);
        String formSablon = peyk_pages.formSablon.getText();
        Assert.assertEquals(formSablon,"Form Şablonları");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Form Türü Tanımına tıklarsanız Yeni Form Türü oluşturabilirsiniz")
    public void form_türü_tanımına_tıklarsanız_yeni_form_türü_oluşturabilirsiniz() {
       /* peyk_pages.formTuruTanimi.click();
        BrowserUtils.waitFor(2);
        String eImzaDogrulama = peyk_pages.formTuruListesi.getText();
        Assert.assertEquals(eImzaDogrulama,"Form Türü Listesi");
        BrowserUtils.waitFor(4);*/
    }
    @Eğerki(": Firma Parametrelerine tıklarsanız Yeni Firma Parametresi oluşturabilirsiniz")
    public void firma_parametrelerine_tıklarsanız_yeni_firma_parametresi_oluşturabilirsiniz() {
      /*  peyk_pages.firmaParametreleri.click();
        BrowserUtils.waitFor(2);
        String firmaParam = peyk_pages.firmaParam.getText();
        Assert.assertEquals(firmaParam,"Firma Parametreleri");
        BrowserUtils.waitFor(2);*/
    }
    @Eğerki(": Talep Form Editörüne tıklarsanız Yeni Talep Formu oluşturabilirsiniz")
    public void talep_form_editörüne_tıklarsanız_yeni_talep_formu_oluşturabilirsiniz() {
        peyk_pages.talepFormEditor.click();
        BrowserUtils.waitFor(2);
        String talepFormlari = peyk_pages.talepFormlari.getText();
        Assert.assertEquals(talepFormlari,"Talep Formları");
        BrowserUtils.waitFor(2);

        peyk_pages.kullanici.click();
        peyk_pages.cikis.click();
        closeDriver();
    }


    }





