package GUN08;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClassGiris extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.amazon.com/");

        WebElement webMenu= driver.findElement(By.id("searchDropdownBox"));
        //bu element select tag i ile başlıyorsa,sne bunu SELECT e cast yap ve öyle kullan

        Select ddMenu1=new Select(webMenu);//elementi daha rahat kullanılabilir SELECT nesnesi haline dönüştürdü
        ddMenu1.selectByIndex(2); //ister bu şekilde seçebilirsin :indexle
        ddMenu1.deselectByValue("search-alias=electronics"); // ister bu sekilde seçebilirsin :value ile
        ddMenu1.deselectByVisibleText("Elektronik"); //ister bu sekilde seçebilirsin :görünen string ile

        BekleKapat();

    }
}
