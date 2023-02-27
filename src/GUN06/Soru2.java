package GUN06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseDriver {
    @Test
    public void Test1(){
      // 1) Bu siteye gidin. -> https://demo.applitools.com/
      // 2) Username kısmına "ttechno@gmail.com" girin.
      // 3) Password kısmına "techno123." girin.
      // 4) "Sign in" buttonunan tıklayınız.
      // 5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
        driver.get("https://demo.applitools.com/");
        WebElement Username= driver.findElement(By.cssSelector("[id='username'][type='text']"));
        Username.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(2);
        WebElement Password= driver.findElement(By.cssSelector("[id='password'][type='password']"));
        Password.sendKeys("techno123.");
        MyFunc.Bekle(2);
        WebElement SingIn= driver.findElement(By.cssSelector("div[class='buttons-w']>[id='log-in']"));
        SingIn.click();
        WebElement kontrol= driver.findElement(By.cssSelector("[id='time']"));
        String currenturl = driver.getCurrentUrl();

        Assert.assertTrue("TestPassed", currenturl.equals("https://demo.applitools.com/app.html"));


        BekleKapat();






    }
}
