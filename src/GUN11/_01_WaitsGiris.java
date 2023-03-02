package GUN11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

//Selenium Bekletme Komutları:
//1-Implicitly Wait:tüm sayfadaki elemanlar için,elemanın locator ı sayfa içinde bulunabilir hale
// getirene kadar verilen bekleme süresi
//Bütün elemanlar için geçerli ve eleman bulundupunda kalan süreyi beklemez.NoSunchElement hatasını verilen
//süre kadar bekler.(sadece html nin içinde locator a bakar var mı yok mu diye,eleman ekrana çıkar mı diye bakmaz.)
//Duration muhlet=Duration.ofSeconds(120);
//driver.manage().timeouts().implicitlyWait(muhlet);
/*
     Selenium Bekletme Komutları

      pageLoadTimeout :
      driver.manage().timeouts().pageLoadTimeout(dr);
      30 sn süresinde sayfanın yüklenmesini bekliyor, bu süreden sonra timeout düşerek hata verir.

     ImplicitlyWait:
     Tüm sayfadaki elemanlar için, elemanın locatorı sayfa içinde bulanabilir hale getirene kadar verilen bekleme süresi.
     Bütün elemanlar için geçerli ve eleman bulunduğunda kalan süreyi beklemez.NoSuchElement hatasını için verilen süre
     kadar beler.

        Duration muhlet=Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(muhlet);

     Explicit  Wait  : Tek bir eleman özel Kriter olarak tanımlanır sadece ilgili elemanda geçerli olur
 */

public class _01_WaitsGiris extends BaseDriver {
    @Test
    public void Wait1(){

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        WebElement btn=driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();
        Duration muhlet=Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(muhlet);//elemanı bulunca kalan süreyi beklemez.
        //MyFunc.Bekle(30);// bu programı durdurur ve elemanı bulunca bile kalan süreyi de bekletir.
        //MyFunc--> interviewlerde bekletme olarak kesinlikle söylenmiyor.

        WebElement mesaj=driver.findElement(By.xpath("//p[text()='WebDriver']"));

    }
}
