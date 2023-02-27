package GUN06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BaseDriver {
    @Test
    public void Test1(){


//        1) Bu siteye gidin. -> http://demoqa.com/text-box
//        2) Full Name kısmına "Automation" girin.
//        3) Email kısmına "Testing@gmail.com" girin.
//        4) Current Address kısmına "Testing Current Address" girin.
//        5) Permanent Address kısmına "Testing Permanent Address" girin.
//        6) Submit butonuna tıklayınız.
//        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
//        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.


        driver.get("http://demoqa.com/text-box");
        WebElement FullName=driver.findElement(By.cssSelector("[id='userName']"));
        FullName.sendKeys("Automation");
        MyFunc.Bekle(2);
        WebElement Email=driver.findElement(By.cssSelector("div[class='col-md-9 col-sm-12']>input[id='userEmail']"));
        Email.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(2);
        WebElement CurrentAddress= driver.findElement(By.cssSelector("div[class='col-md-9 col-sm-12']>textarea[id='currentAddress']"));
        CurrentAddress.sendKeys("Testing Current Address");
        MyFunc.Bekle(2);
        WebElement PermanentAddress= driver.findElement(By.cssSelector("div[class='col-md-9 col-sm-12']>textarea[id='permanentAddress']"));
        PermanentAddress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(2);
      if (FullName.getText().equals("Automation"))
          System.out.println("test passed" );
      else
          System.out.println("test fail");
      if (Email.getText().equals("Testing"))
          System.out.println("test passed");
      else
          System.out.println("test fail");

        //Assert.assertTrue("Testing var",Email.getText().equals("Testing"));
        //Assert.assertTrue("Automation var",FullName.getText().equals("Automation"));

        BekleKapat();




    }
}
