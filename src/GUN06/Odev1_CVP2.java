package GUN06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1_CVP2 extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement business=driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        business.click();
        MyFunc.Bekle(3);
        WebElement discover=driver.findElement(By.cssSelector("[id$='_4588']>[value='Online Advertising']"));
        discover.click();
        MyFunc.Bekle(3);
        WebElement Eveyday=driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        Eveyday.click();
        MyFunc.Bekle(3);
        WebElement Good=driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        Good.click();
        MyFunc.Bekle(3);
        WebElement usingXYZ= driver.findElement(By.cssSelector("select[id$='_4597']>:nth-child(4)"));
        usingXYZ.click();

        BekleKapat();

    }
}
