package com.KolaysoftPeyk.step_definitions;


import com.KolaysoftPeyk.pages.PEYK_Pages;
import com.KolaysoftPeyk.utility.BrowserUtils;
import com.KolaysoftPeyk.utility.ConfigurationReader;
import com.KolaysoftPeyk.utility.Driver;
import io.cucumber.java.tr.Diyelimki;
import io.cucumber.java.tr.Eğerki;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class PEYK_UcretBordrosuStepDefinitions extends Driver{

    PEYK_Pages peyk_pages = new PEYK_Pages();

    @Eğerki(": Ücret Bordrosuna tıklarsanız Ücret Bordrosu Yükleme ve Dönem İşlemlerini görürsünüz")
    public void ücret_bordrosuna_tıklarsanız_ücret_bordrosu_yükleme_ve_dönem_i̇şlemlerini_görürsünüz() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        peyk_pages.TcNo.sendKeys(ConfigurationReader.getProperty("TcNo"));
        peyk_pages.sifre.sendKeys(ConfigurationReader.getProperty("sifre"));
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
    @Diyelimki(": Ücret Bordrosu Yüklemek isteyip,Ücret Bordrosu Yükleye tıklayıp,")
    public void ücret_bordrosu_yüklemek_isteyip_ücret_bordrosu_yükleye_tıklayıp() {
        peyk_pages.ucretBordrosuYukle.click();
        BrowserUtils.waitFor(2);
        String ucBordYuk = peyk_pages.ucretBordrosuYukle.getText();
        Assert.assertEquals(ucBordYuk,"Ücret Bordrosu Yükle");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Dönemi seçip, pdf yükleyip,")
    public void dönemi_seçip_pdf_yükleyip() {
        peyk_pages.donem.click();
        BrowserUtils.waitFor(2);
        peyk_pages.tem.click();
        peyk_pages.evet.click();
        BrowserUtils.waitFor(3);

        //peyk_pages.bordroPdfYukleyiniz.click();
        //BrowserUtils.waitFor(2);
        peyk_pages.bordroPdfYukleyiniz.sendKeys("C:\\Users\\Kolaysoft\\IdeaProjects\\PEYK_Yeni\\Ali Boz-87197540786.pdf");
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": Dökümanları Yükleye tıklayıp, oluşan pdf'i seçip,")
    public void dökümanları_yükleye_tıklayıp_oluşan_pdf_i_seçip() {
        peyk_pages.dokumanlariYukle.click();
        BrowserUtils.waitFor(2);
        peyk_pages.checkBox.click();
        BrowserUtils.waitFor(2);
    }
    @Eğerki(": İmzala&Gönder deyip, Pin'i girdikten sonra İmzalaya basarsanız bordro göndermiş olursunuz")
    public void i̇mzala_gönder_deyip_pin_i_girdikten_sonra_i̇mzalaya_basarsanız_bordro_göndermiş_olursunuz() {

        peyk_pages.imzalaGonder.click();
        BrowserUtils.waitFor(2);

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",peyk_pages.kayitSayisi);
        BrowserUtils.waitFor(2);

        try {
            String pin = peyk_pages.pin.getText();
            BrowserUtils.waitFor(2);

            if (pin.contains("P")) {
                peyk_pages.eImzaPassword.click();
                peyk_pages.eImzaPassword.sendKeys("3944");
                BrowserUtils.waitFor(2);
            }
        }catch (Exception e){
            System.out.println("E-imza bulunmamaktadır!");
        }

        peyk_pages.imzala.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(5);
        Assert.assertEquals(peyk_pages.bilgi.getText(),"Bilgi");
        BrowserUtils.waitFor(2);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(1);

    }
    @Eğerki(": Dönem İşlemlerine tıklarsanız Ücret Bordrosu Dönem İşlemlerini görüntüleyebilirsiniz")
    public void dönem_i̇şlemlerine_tıklarsanız_ücret_bordrosu_dönem_i̇şlemlerini_görüntüleyebilirsiniz() {
        peyk_pages.donemIslemleri.click();
        BrowserUtils.waitFor(2);
        String ucBordYuk = peyk_pages.ucBordDonIslem.getText();
        Assert.assertEquals(ucBordYuk, "Ücret Bordrosu Dönem İşlemleri");
        BrowserUtils.waitFor(3);

        peyk_pages.kullanici.click();
        peyk_pages.cikis.click();
        closeDriver();

    }


    }





