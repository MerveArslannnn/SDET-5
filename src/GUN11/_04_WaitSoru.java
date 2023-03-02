package GUN11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_WaitSoru extends BaseDriver {
    /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */
    @Test
    public void Wait1(){
        driver.get("https://www.demoblaze.com/index.html");
        Duration muhlet=Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(muhlet);

        WebElement link= driver.findElement(By.linkText("Samsung galaxy s6"));
        link.click();

        WebElement sepetLink= driver.findElement(By.linkText("Add to cart"));
        sepetLink.click();

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());//alert çıkana kadar bekle dedik

        driver.switchTo().alert().accept();

        WebElement anasayfa=driver.findElement(By.id("nava"));
        anasayfa.click();


        BekleKapat();




    }
}
