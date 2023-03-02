package GUN11;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
/*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */

public class _03_FillingFormTask extends BaseDriver {
    @Test
    public void Wait1(){
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name= driver.findElement(By.cssSelector("div[class='form-group']>input"));
        name.sendKeys("Merve");
        WebElement Comment= driver.findElement(By.cssSelector("div[class='form-group']>textarea[id='description']"));
        Comment.sendKeys("Arslan");
        WebElement Submit= driver.findElement(By.cssSelector("input[id='btn-submit']"));
        Submit.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));
        System.out.println("Bitti");

       WebElement mesaj= driver.findElement(By.id("submit-control"));
       Assert.assertEquals("Form submited Successfully!",mesaj.getText());

        BekleKapat();



    }
}
