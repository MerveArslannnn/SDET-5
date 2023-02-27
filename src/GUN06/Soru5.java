package GUN06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru5 extends BaseDriver {
    //Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
    //Fake Alerts' tıklayınız.
    //Show Alert Box'a tıklayınız.
    //Ok'a tıklayınız.
    //Alert kapanmalıdır.
    @Test
    public void Test1(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);
        WebElement FaceAlerts= driver.findElement(By.cssSelector("[id='fakealerttest']"));
        FaceAlerts.click();
        MyFunc.Bekle(2);
        WebElement ShowAlertBox= driver.findElement(By.cssSelector("div[class='centered']>input[type='button'][id='fakealert']"));
        ShowAlertBox.click();
        MyFunc.Bekle(2);
        WebElement Ok= driver.findElement(By.cssSelector("[class='dialog-actions']>button[id=dialog-ok] "));
        Ok.click();
        MyFunc.Bekle(2);
        WebElement index= driver.findElement(By.cssSelector("[href='../index.html']"));
        index.click();
        BekleKapat();



    }
}
