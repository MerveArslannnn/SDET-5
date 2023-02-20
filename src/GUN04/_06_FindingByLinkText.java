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

        WebElement siparislerimLinki=driver.findElement(By.linkText("Siparişlerim"));
        //Gözüken text i Sipaişlerim olan a tag li webelement
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());

        MyFunc.Bekle(3);
        driver.quit();
    }
}
