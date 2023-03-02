package GUN08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Soru extends BaseDriver {
    ////        Test Senaryosu
    ////        1- https://www.facebook.com/  sayfasına gidiniz
    ////        2- CreateNewAccount a tıklatınız.
    ////        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
    ////        4- Doğum tarihinizi Select sınıfı ile seçiniz
    ////        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
    ////          öncesinde de görünmediğini, sonrasında da göründüğünü
    ////          assert ile doğrulayınız.
    @Test
    public void Test1(){
        driver.get("https://www.facebook.com/");
      // MyFunc.Bekle(2);
      //  List<WebElement> cookiesAccept=driver.findElements(By.xpath("//button[text()='Allow essential and optional cookies']"));
      //  if (cookiesAccept.size() > 0)
      //      cookiesAccept.get(0).click();

        MyFunc.Bekle(1);
        WebElement btnYeniHesap= driver.findElement(By.linkText("Yeni hesap oluştur"));
        btnYeniHesap.click();

        MyFunc.Bekle(1);
        WebElement firstname=driver.findElement(By.name("firstname"));
        firstname.sendKeys("merve");

        MyFunc.Bekle(1);
        WebElement lastname= driver.findElement(By.name("lastname"));
        lastname.sendKeys("arslan");

        //WebElement reEmail=driver.findElement(By.name("reg_email_confirmation__"));
        //Assert.assertTrue(reEmail.isDisplayed());//beklenen görğnmemesi false

        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("mervegz263@gmail.com");

        MyFunc.Bekle(1);
        WebElement reEmail=driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertTrue(reEmail.isDisplayed());//beklenen görünmesi
        reEmail.sendKeys("mervegz263@gmail.com");

        MyFunc.Bekle(1);
        WebElement sifre=driver.findElement(By.name("reg_passwd__"));
        sifre.sendKeys("123456Mg");

        WebElement webDay= driver.findElement(By.id("day"));
        Select day=new Select(webDay);
        day.selectByVisibleText("21");

        MyFunc.Bekle(1);
        WebElement webMonth= driver.findElement(By.id("month"));
        Select month=new Select(webMonth);
        month.selectByValue("11");

        MyFunc.Bekle(1);
        WebElement webYear= driver.findElement(By.id("year"));
        Select year=new Select(webYear);
        year.selectByValue("1990");

        BekleKapat();


    }
}
