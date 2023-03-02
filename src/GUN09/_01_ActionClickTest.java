package GUN09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



import javax.swing.*;

public class _01_ActionClickTest extends BaseDriver {
    @Test
    public void Test(){

        driver.get("https://demoqa.com/buttons");

        WebElement ClickMe=driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions aksiyonlar=new Actions(driver);
        Action aksion=aksiyonlar.moveToElement(ClickMe).click().build();
        System.out.println("Aksiyon hazırlandı");
        MyFunc.Bekle(4);
        aksion.perform();//aksiyonu gerçekleştir,işleme al uygula,icra et,harekete geç
        System.out.println("Aksiyon gerçekleşti");
        BekleKapat();






    }
}
