package GUN04;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {
        //  1-Hepsiburada.com  sayfasına git
        //  2-arama kutusuna usb yaz
        //  3-arama butonuna bas
        //  4-çıkan ürünlerin açıklamasında usb kelimesini kontrol.
        //
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
        //eleman arama kutusu=aramakutusunu bul;
        //aramakutusu.yazıgönder("usb")
        //elemanlar=urunListesiniAl;
        //for döngüsü ile kontrol et.
        MyFunc.Bekle(5);//5 saniye bekletir.
        driver.quit(); //programı çalışmasını bitirir.

    }
}
