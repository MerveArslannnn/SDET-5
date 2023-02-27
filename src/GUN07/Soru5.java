package GUN07;

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
        WebElement FakeAlerts= driver.findElement(By.xpath("//a[@href='alerts/fake-alert-test.html']"));
        FakeAlerts.click();
        MyFunc.Bekle(2);
        WebElement ShowAlertBox= driver.findElement(By.xpath("(//div/input)[1]"));
        ShowAlertBox.click();
        MyFunc.Bekle(2);
        WebElement Ok= driver.findElement(By.xpath("(//div/button)"));
        Ok.click();
        WebElement index= driver.findElement(By.xpath("(//div/a)"));
        index.click();
        BekleKapat();




    }
}
