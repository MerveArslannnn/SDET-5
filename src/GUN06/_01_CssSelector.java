package GUN06;

import Utility.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {
    public static void main(String[] args) {
        //1-Açılan sayfadaki kutucupa mesajınızı yazınız
        //2-Butona tıklatınız
        //3-Butona basıldığında mesajınızın sayfada göründüğünü test ediniz.
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        //String mesajim="Merve Arslan";
        WebElement e=driver.findElement(By.cssSelector("input[id='user-message']"));
        e.sendKeys("Merve Arslan");
       // e.sendKeys(mesajim);
        WebElement buton=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        buton.click();
        WebElement msg=driver.findElement(By.cssSelector("[id='display']"));
        if (msg.getText().equals("Merve Arslan")) //msg.getText().equals(mesajim) bu şekilde de yapılabilir
            System.out.println("test passed" );
        else
            System.out.println("test fail");


        BekleKapat();
    }

}
