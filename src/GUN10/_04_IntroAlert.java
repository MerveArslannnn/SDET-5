package GUN10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_IntroAlert extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        WebElement clickMe1= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        MyFunc.Bekle(2);
        clickMe1.click();
        MyFunc.Bekle(2);

        //alert açılıyor
        //driver.switchTo().alert()  -> alert e geçeriz bu şekilde
        driver.switchTo().alert().accept();//tamam demek alert kutusunu ok ine basar ve kapatır alerti


        BekleKapat();
    }
}
