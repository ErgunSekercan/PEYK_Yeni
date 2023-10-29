package com.KolaysoftPeyk.step_definitions.others;


import com.KolaysoftPeyk.pages.others.EczaciAktivasyonPage;
import com.KolaysoftPeyk.utility.BrowserUtils;
import com.KolaysoftPeyk.utility.Driver;
import io.cucumber.java.tr.Eğerki;

import java.util.Set;

public class EczaciAktivasyonStepDefinitions {

    EczaciAktivasyonPage eczaciAktivasyonPage = new EczaciAktivasyonPage();

    @Eğerki(": Zimbraya gidip Kullanici adini girip Parolaya girip Oturum Aça tıklarsanız girmiş olursunuz")
    public void aktivasyonMail() {



            Driver.getDriver().get("https://mail.kolaysoft.com.tr/");

            eczaciAktivasyonPage.kullaniciAdi.sendKeys("ergun.sekercan@kolaysoft.com.tr");
            eczaciAktivasyonPage.parola.sendKeys("$EKer118434");
            eczaciAktivasyonPage.oturumAc.click();
            BrowserUtils.waitFor(5);
            eczaciAktivasyonPage.kullaniciMail.click();
            String t = eczaciAktivasyonPage.kullaniciMail.getText();

            while (t.contains("Eczacı Pos Aktivasyon")) {
            eczaciAktivasyonPage.kullaniciMail.click();
            BrowserUtils.waitFor(1);
            eczaciAktivasyonPage.delete.click();
            BrowserUtils.waitFor(1);

            String window = Driver.getDriver().getWindowHandle();

            eczaciAktivasyonPage.kullaniciMail.click();
            BrowserUtils.waitFor(1);
            eczaciAktivasyonPage.girisYap.click();


            Set<String> allWindows = Driver.getDriver().getWindowHandles();

            BrowserUtils.waitFor(1);

            for (String w : allWindows) {
                if (!(window.equals(w))) {
                    Driver.getDriver().switchTo().window(w);

                } else {
                    System.out.println("hello");
                }
            }

            eczaciAktivasyonPage.sifre.sendKeys("1111");
            eczaciAktivasyonPage.sifreTekrar.sendKeys("1111");
            eczaciAktivasyonPage.sifreBelirle.click();

            Driver.getDriver().close();
            Driver.getDriver().switchTo().window(window);
            BrowserUtils.waitFor(1);

        }
    }
}



