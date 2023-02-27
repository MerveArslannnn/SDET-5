package GUN07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru3 extends BaseDriver {
    //1) Bu siteye gidin. -> https://www.snapdeal.com/
    //2) "teddy bear" aratın ve Search butonuna tıklayın.
    //3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
    //Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
    @Test
    public void Test1(){
        driver.get("https://www.snapdeal.com/");
        WebElement arama= driver.findElement(By.xpath("//div[@class='col-xs-14 search-box-wrapper']/input"));
        arama.sendKeys("teddy bear");
        MyFunc.Bekle(2);
        WebElement button= driver.findElement(By.xpath("//div[@class='col-xs-14 search-box-wrapper']/button"));
        button.click();
        MyFunc.Bekle(2);
        WebElement msg= driver.findElement(By.xpath("//div[@id='searchMessageContainer']/div/span"));
        msg.getAttribute("We've got 297 results for 'teddy bear'");
        BekleKapat();



    }
}
