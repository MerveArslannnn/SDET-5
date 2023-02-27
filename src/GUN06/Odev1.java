package GUN06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends BaseDriver {
    // 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
    // 2- Business i çekleyin.
    // 3- discover XYZ ye tıklatın ve online Advertising i seçin
    // 4- Every day i seçin
    // 5- Good u seçin
    // 6- using XYZ yi tıklatın ve 3.seçeneği seçin
    // css selector

    @Test
    public void Test1(){
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement business=driver.findElement(By.cssSelector("span[class='label-body']"));
        business.click();
        MyFunc.Bekle(3);
        WebElement discover=driver.findElement(By.cssSelector("select[id$='_4588']>:nth-child(4)"));
        discover.click();
        MyFunc.Bekle(3);
        WebElement Eveyday=driver.findElement(By.cssSelector("[class='radio-w']>label>[value='Every Day']"));
        Eveyday.click();
        MyFunc.Bekle(3);
        WebElement Good=driver.findElement(By.cssSelector("[class='radio-w']>label>[value='Good']"));
        Good.click();
        MyFunc.Bekle(3);
        WebElement usingXYZ= driver.findElement(By.cssSelector("select[id$='_4597']>:nth-child(3)"));
        usingXYZ.click();

        BekleKapat();

    }

}
