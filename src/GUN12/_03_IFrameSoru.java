package GUN12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseDriver {
    @Test
    public void Test(){
        /*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
  */
        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement input=driver.findElement(By.xpath("//b[text()='Topic :']/following::input"));
        input.sendKeys("Türkiye");
        //driver.switchTo().defaultContent(); bunları denemek için yaptım
        // 0. elemanın 0.,1,2 elemanını bulmak için kullan.
        //driver.switchTo().frame(0);
        driver.switchTo().frame(0);

        WebElement button= driver.findElement(By.id("a"));
        button.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement webSelect=driver.findElement(By.id("animals"));
        Select menu=new Select(webSelect);
        //menu.selectByVisibleText("Avatar");
        menu.selectByIndex(3);//4. eleman demek

        BekleKapat();



    }
}
