package GUN04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353"); //sayfaya gider

       // WebElement labelFirstName=driver.findElement(By.id("hataliLocator"));
       // System.out.println("labelFirstName.getText() = " + labelFirstName.getText());
        //NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#hataliLocator"}
        //yani HATALI ARAMA YAPTIN DİYOR.

        try {
            WebElement labelFirstName=driver.findElement(By.id("hataliLocator"));

        }catch (Exception ex){
            System.out.println("WebElemant bulunamadı " + ex.getMessage());
            //WebElemant bulunamadı no such element: Unable to locate element: {"method":"css selector","selector":"#hataliLocator"}
        }

        MyFunc.Bekle(3);
        driver.quit();
    }
}
