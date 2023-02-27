package GUN07;

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
        WebElement Calculate= driver.findElement(By.xpath("//a[@href='calculator']"));
        Calculate.click();
        MyFunc.Bekle(2);
        WebElement input1= driver.findElement(By.xpath("//div/input[1]"));
        input1.sendKeys("5");
        MyFunc.Bekle(2);
        WebElement input2= driver.findElement(By.xpath("//div/input[2]"));
        input2.sendKeys("10");
        WebElement button= driver.findElement(By.xpath("(//div/input)[3]"));
        button.click();
        MyFunc.Bekle(2);
        WebElement cvp= driver.findElement(By.xpath("//p/span"));
        System.out.println("cvp = " + cvp.getText());
        BekleKapat();


    }
}
