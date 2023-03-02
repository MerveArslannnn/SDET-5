package GUN10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTusKontrolSendKeys extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://demoqa.com/auto-complete");
        WebElement element= driver.findElement(By.id("autoCompleteMultipleInput"));
        //element.sendKeys("Ahmet");
        //shift a shift i bıraktım  hmet ->Ahmet
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar
                .moveToElement(element)  //kutucuğa gel
                .click()                 //içine tıklat
                .keyDown(Keys.SHIFT)    //shift e bas
                .sendKeys("a")         //shift+a ->A
                .keyUp(Keys.SHIFT)     //shift i bırak
                .sendKeys("hmet")      //yazıyı gönder
                .build();
        //aksiyon hazırlandı
        MyFunc.Bekle(2);
        aksiyon.perform();//gerçekleştirildi
        BekleKapat();
    }
}
