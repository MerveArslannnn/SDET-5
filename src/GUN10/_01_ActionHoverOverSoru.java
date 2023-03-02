package GUN10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionHoverOverSoru extends BaseDriver {
    //     https://www.etsy.com/ sayfasına gidiniz.
    //    Jewellery -> Neckless -> Bib Neckless click
    //    tıklatma işleminden sonra URL de
    //    bib-necklaces kelimesinin geçtiğini doğrulayın.

    @Test
    public void Test1(){
        driver.get("https://www.etsy.com/");
        Actions aksiyonlar=new Actions(driver);

        WebElement Jewellery= driver.findElement(By.xpath("//span[@id='catnav-primary-link-10855']"));
        WebElement Neckless= driver.findElement(By.xpath("//span[@id='side-nav-category-link-10873']"));
        WebElement BibNeckless= driver.findElement(By.xpath("//a[@id='catnav-l3-10881']"));

        aksiyonlar.moveToElement(Jewellery).build().perform();
        MyFunc.Bekle(2);//gözükene kadar bekle diyeceğiz yarın

        aksiyonlar.moveToElement(Neckless).build().perform();
        MyFunc.Bekle(2);

        aksiyonlar.moveToElement(BibNeckless).click().build().perform();
       // BibNeckless.click();   --> şeklinde de yapılabilir
        MyFunc.Bekle(2);
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        Assert.assertTrue("url de bib kolye var mı",driver.getCurrentUrl().contains("bib-necklaces"));//beklentiyi yazıyorum
        //hata varsa söyle demek bu hata varsa ekrana yazar
        BekleKapat();





    }
}
