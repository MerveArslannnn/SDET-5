package GUN07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BaseDriver {
    // 1) Bu siteye gidin. -> http://demoqa.com/text-box
    //  2) Full Name kısmına "Automation" girin.
    //  3) Email kısmına "Testing@gmail.com" girin.
    //  4) Current Address kısmına "Testing Current Address" girin.
    //  5) Permanent Address kısmına "Testing Permanent Address" girin.
    //  6) Submit butonuna tıklayınız.
    //  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
    //  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

    @Test
    public void Test1(){
        driver.get("http://demoqa.com/text-box");
        WebElement FullName= driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]"));
        FullName.sendKeys("Automation");
        MyFunc.Bekle(2);
        WebElement Email= driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
        Email.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(2);
        WebElement CurrentAddress= driver.findElement(By.xpath("(//textarea[@class='form-control'])[1]"));
        CurrentAddress.sendKeys("Testing Current Address");
        MyFunc.Bekle(2);
        WebElement PermanentAddress= driver.findElement(By.xpath("(//textarea[@class='form-control'])[2]"));
        PermanentAddress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(2);
        WebElement Submit= driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        Submit.click();
        WebElement msj= driver.findElement(By.xpath("//div[@class='mt-4 row'] /div"));
        msj.getAttribute("Automation");
        msj.getAttribute("Testing");
        BekleKapat();



    }
}
