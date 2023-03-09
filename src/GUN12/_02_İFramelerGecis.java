package GUN12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_İFramelerGecis extends BaseDriver {
@Test
    public void Test1(){

    driver.get("https://chercher.tech/practice/frames");
    //   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
    //   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.

    driver.switchTo().frame(0);
    WebElement input= driver.findElement(By.xpath("//b[@id='topic']//following::input"));
    input.sendKeys("TÜRKİYE");
    driver.switchTo().defaultContent();
    driver.switchTo().frame(1);
    WebElement webSelect=driver.findElement(By.id("animals"));
    Select nesneSelect=new Select(webSelect);
    nesneSelect.selectByVisibleText("Avatar");

    BekleKapat();

}
}
