package GUN06;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert;

public class _01_CssSelector_2 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        String mesajim="Merve Arslan";
        WebElement e=driver.findElement(By.cssSelector("input[id='user-message']"));
        e.sendKeys(mesajim);
        WebElement buton=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        buton.click();
        WebElement msg=driver.findElement(By.cssSelector("[id='display']"));
        Assert.assertTrue("aranılan mesaj bulunamadı",msg.getText().equals(mesajim)); //verilen değer true mu kontrol eder
        // eğer doğruysa mesaj çıkarmaz


        BekleKapat();
    }
}
