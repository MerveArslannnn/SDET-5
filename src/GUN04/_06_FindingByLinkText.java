package GUN04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");
        //LinkText yoluyla elamn bulma işlemi sadece a tag inde kullanılabilir

        WebElement siparislerimLinki=driver.findElement(By.linkText("Siparişlerim"));
        //Gözüken text i Sipaişlerim olan a tag li webelement
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText()); //= Siparişlerim

        System.out.println("siparislerimLinki.getAttribute(href) = " + siparislerimLinki.getAttribute("href")); // = https://www.hepsiburada.com/siparislerim
        System.out.println("siparislerimLinki.getAttribute(title) = " + siparislerimLinki.getAttribute("title"));  //= Siparişlerim
        System.out.println("siparislerimLinki.getAttribute(rel) = " + siparislerimLinki.getAttribute("rel")); // = nofollow


        //partialLinktext
        WebElement link2=driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("link2.getText() = " + link2.getText()); // = Süper Fiyat, Süper Teklif


        MyFunc.Bekle(3);
        driver.quit();
    }
}
