package GUN12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_WindowsGiris extends BaseDriver {
    @Test
    public void Test1(){
        /*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.

 */
        driver.get("https://www.selenium.dev/");
        String anasayfaWindowID=driver.getWindowHandle();
        List<WebElement>linkler=driver.findElements(By.cssSelector("a[target='_blank']"));
        //aşağıdaki kod ile tüm sayfalar açıldı
        for (WebElement link:linkler) {
            if (!link.getAttribute("href").contains("mail"))
                link.click();

        }
        Set<String>windowsIdler=driver.getWindowHandles();
        for (String id:windowsIdler) {
            MyFunc.Bekle(2);
            driver.switchTo().window(id);//sıradaki window a geçmiş olduk
            System.out.println("Title = " + driver.getTitle()+"url = "+driver.getCurrentUrl());
        }

        for (String id:windowsIdler) {
            if (id.equals(anasayfaWindowID))
                continue;

            driver.switchTo().window(id);
            driver.close();

        }





        BekleKapat();


    }
}
