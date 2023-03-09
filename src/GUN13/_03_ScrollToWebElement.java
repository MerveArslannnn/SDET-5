package GUN13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.copado.com/robotic-testing");
        driver.manage().deleteAllCookies();//cookiesleri sildik.
        MyFunc.Bekle(2);
        JavascriptExecutor js=(JavascriptExecutor) driver;


        WebElement element= driver.findElement(By.xpath("//a[text()='Read story']"));
        js.executeScript("arguments[0].scrollIntoView(true);",element);//elemante kadar kaydır

        //element.click();   tıklatma özelliğini kaybettiren elementlerin altında olduğunda tıklanamaz
        js.executeScript("arguments[0].click();",element);//html içinden elemente ulaşır ve tıklatır

        MyFunc.Bekle(5);
        BekleKapat();





    }
}
