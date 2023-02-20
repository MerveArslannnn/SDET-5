package GUN04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353"); //sayfaya gider
        WebElement name= driver.findElement(By.className("form-textbox"));
        name.sendKeys("Merve");
        //birden fazla aynı locator a sahip eleman bulursa findElement ne yapar?
        //cvp: ilk element i bulur
       List<WebElement>labels= driver.findElements(By.className("form-sub-label"));
        System.out.println(labels.size());
        for (WebElement e:labels) {
            System.out.println("e.getText() = " + e.getText());
        }
        //çıktısı:
        //2 = 2 adet class var dedi
        //e.getText() = First Name =1. class
        //e.getText() = Last Name =2. class

        MyFunc.Bekle(3);
        driver.quit();

        // aranılan eleman bulunamazsa : findElement NoSuchElement hatası veriri
        // findElements is size ı 0 olan List verir, yani hata vermez.

    }
}
