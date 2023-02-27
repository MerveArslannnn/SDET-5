package GUN06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru6 extends BaseDriver {
    //Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
    //Fake Alerts'e tıklayınız.
    //Show modal dialog buttonuna tıklayınız.
    //Ok'a tıklayınız.
    //Alert kapanmalıdır.
    @Test
    public void Test1(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);
        WebElement FaceAlerts= driver.findElement(By.cssSelector("[id='fakealerttest']"));
        FaceAlerts.click();
        MyFunc.Bekle(2);
        WebElement ShowModalBox= driver.findElement(By.cssSelector("div[class='centered']>input[type='button'][id='modaldialog']"));
        ShowModalBox.click();
        MyFunc.Bekle(2);
        WebElement Ok= driver.findElement(By.cssSelector("[class='dialog-actions']>button"));
        Ok.click();
        MyFunc.Bekle(2);
        WebElement index= driver.findElement(By.cssSelector("[href='../index.html']"));
        index.click();
        BekleKapat();



    }
}
