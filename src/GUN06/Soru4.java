package GUN06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseDriver {
    //Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
    //Calculate'e tıklayınız.
    //    İlk input'a herhangi bir sayı giriniz.
    //    İkinci input'a herhangi bir sayı giriniz.
    //Calculate button'una tıklayınız.
    //Sonucu alınız.
    //Sonucu yazdırınız.
    @Test
    public void Test1(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement Culculate1= driver.findElement(By.cssSelector("div[class='page-body']>ul>li>[id='calculatetest']"));
        Culculate1.click();
        MyFunc.Bekle(2);
        WebElement input1= driver.findElement(By.cssSelector("[class='form-label']>input[id='number1']"));
        input1.sendKeys("5");
        MyFunc.Bekle(2);
        WebElement input2= driver.findElement(By.cssSelector("[class='form-label']>input[id='number2']"));
        input2.sendKeys("9");
        MyFunc.Bekle(2);
        WebElement Calculate= driver.findElement(By.cssSelector("input[id='calculate']"));
        Calculate.click();
        MyFunc.Bekle(2);
        WebElement sonuc= driver.findElement(By.cssSelector("span[id='answer']"));
        sonuc.getText();
        System.out.println("sonuc = " + sonuc.getText());
        BekleKapat();






    }
}
