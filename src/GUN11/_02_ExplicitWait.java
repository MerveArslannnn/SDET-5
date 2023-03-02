package GUN11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
//
  //   İnterview Sorusu :  Implicit ve Explicit

    //Implicitli  : Bütün elemanlar için geçerli,Bir kere tanımlanır. (HTML de verilen locator var mı?)
    //Explicit    : Tek bir eleman özel Kriter olarak tanımlanır sadece ilgili elemanda geçerli olur


public class _02_ExplicitWait extends BaseDriver {
    @Test
    public void Wait1() {

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        WebElement btn = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();
       // Duration muhlet=Duration.ofSeconds(30);   //alttakiyle aynı işlemi yapar
       // WebDriverWait bekle=new WebDriverWait(driver,muhlet);
        WebDriverWait bekle=new WebDriverWait(driver, Duration.ofSeconds(30));
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        //Beklenen kriterlerden->ExpectedConditions
        //Verilen Locatordaki element gözükür halde->visibilityOfElementLocated
        //gelene kadar bekle->bekle.until
        System.out.println("bitti");




    }
}
