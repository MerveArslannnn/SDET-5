package GUN07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseDriver {
    //1) Bu siteye gidin. -> https://demo.applitools.com/
    //2) Username kısmına "ttechno@gmail.com" girin.
    //3) Password kısmına "techno123." girin.
    //4) "Sign in" buttonunan tıklayınız.
    //5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
    @Test
    public void Test1(){
        driver.get("https://demo.applitools.com/");
        WebElement Username= driver.findElement(By.xpath("(//input)[1]"));
        Username.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(2);
        WebElement Password= driver.findElement(By.xpath("(//input)[2]"));
        Password.sendKeys("techno123.");
        MyFunc.Bekle(2);
        WebElement SingIn= driver.findElement(By.xpath("(//a)[2]"));
        SingIn.click();
        MyFunc.Bekle(2);
        WebElement msj= driver.findElement(By.xpath("(//h6)[9]"));
        msj.getAttribute("Your nearest branch closes in: 30m 5s");
        BekleKapat();







    }
}
