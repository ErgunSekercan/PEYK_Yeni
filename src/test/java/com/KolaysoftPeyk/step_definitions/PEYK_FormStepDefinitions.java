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

        //Şablonlu Form Gönderimi
        peyk_pages.sec.click();
        BrowserUtils.waitFor(2);
        peyk_pages.calisanSecimi.click();
        BrowserUtils.waitFor(1);
        peyk_pages.aliVeli.click();
        BrowserUtils.waitFor(1);
        peyk_pages.kaydet.click();
        BrowserUtils.waitFor(1);
        peyk_pages.onayla.click();
        BrowserUtils.waitFor(3);

        try {
            String pin = peyk_pages.pin.getText();
            BrowserUtils.waitFor(2);

            if (pin.contains("P")) {
                peyk_pages.eImzaPassword.click();
                peyk_pages.eImzaPassword.sendKeys("3944");
                BrowserUtils.waitFor(2);
                peyk_pages.imzalaGonder.click();
                peyk_pages.evet.click();
            }
        } catch (Exception e) {
            System.out.println("E-imza bulunmamaktadır!");
            //peyk_pages.onayla.click();
            BrowserUtils.waitFor(2);
            peyk_pages.imzalaGonder.click();
            BrowserUtils.waitFor(1);
            peyk_pages.evet.click();
            BrowserUtils.waitFor(5);
        }

        Assert.assertEquals(peyk_pages.pdfGonderiliyor.getText(),"PDF imzalandı ve gönderiliyor");
        BrowserUtils.waitFor(2);

        //Şablonsuz Form Gönderimi
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(1);
        peyk_pages.anaFormGonder.click();
        BrowserUtils.waitFor(1);
        peyk_pages.sablonsuzGonderim.click();
        BrowserUtils.waitFor(1);
        peyk_pages.pdfUzantili.sendKeys("C:\\Users\\Kolaysoft\\IdeaProjects\\PEYK_Yeni\\3_kişininMetni.pdf");
        BrowserUtils.waitFor(1);
        peyk_pages.dokumanYukle.click();
        BrowserUtils.waitFor(1);
        peyk_pages.dokumanEkle.click();
        BrowserUtils.waitFor(1);
        peyk_pages.pdfUzantili.sendKeys("C:\\Users\\Kolaysoft\\IdeaProjects\\PEYK_Yeni\\Ali Veli-66362170898.pdf");
        BrowserUtils.waitFor(1);
        peyk_pages.dokumanYukle.click();
        BrowserUtils.waitFor(1);
        peyk_pages.ePostaKonusu.click();
        BrowserUtils.waitFor(1);
        peyk_pages.ePostaKonusu.sendKeys("1");
        BrowserUtils.waitFor(1);
        peyk_pages.ePostaIcerigi.click();
        BrowserUtils.waitFor(1);
        peyk_pages.ePostaIcerigi.sendKeys("2");
        BrowserUtils.waitFor(1);
        peyk_pages.calisanSecimi.click();
        BrowserUtils.waitFor(1);
        peyk_pages.aliVeli2.click();
        BrowserUtils.waitFor(3);
        peyk_pages.kaydet.click();
        BrowserUtils.waitFor(1);
        peyk_pages.onayla.click();
        BrowserUtils.waitFor(1);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(5);
        peyk_pages.ucKisininMetni.click();
        BrowserUtils.waitFor(2);
        peyk_pages.aliVeliPdf.click();
        BrowserUtils.waitFor(2);
        peyk_pages.topluFormGonder.click();
        BrowserUtils.waitFor(2);
        peyk_pages.sablonsuz1.click();
        peyk_pages.sablonsuz2.click();
        BrowserUtils.waitFor(2);

            try {
                String pin = peyk_pages.pin.getText();
                BrowserUtils.waitFor(2);

                if (pin.contains("P")) {
                    peyk_pages.eImzaPassword.click();
                    peyk_pages.eImzaPassword.sendKeys("3944");
                    BrowserUtils.waitFor(2);
                    peyk_pages.imzalaGonder.click();
                    peyk_pages.evet.click();
                }
            } catch (Exception e) {
                System.out.println("E-imza bulunmamaktadır!");
                peyk_pages.imzalaGonder.click();
                BrowserUtils.waitFor(1);
                peyk_pages.evet.click();
                BrowserUtils.waitFor(5);
            }


        Assert.assertEquals(peyk_pages.kayitBulunamadi.getText(),"Kayıt bulunamadı.");
        BrowserUtils.waitFor(2);

    }
    @Eğerki(": Form İşlemlerine tıklarsanız PDF Oluşturuldu safhasındaki formları Form Gönder veya Toplu Form Gönder seçeneğiyle gönderebilir daha önce gönderilmiş formların durumlarını görüntüleyebilirsiniz")
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





