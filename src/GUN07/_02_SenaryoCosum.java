package GUN07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;


public class _02_SenaryoCosum extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.saucedemo.com/");

        WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");
        MyFunc.Bekle(1);
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Bekle(1);
        WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
        MyFunc.Bekle(1);
        //ürün ekleme
        WebElement product1=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        product1.click();
        MyFunc.Bekle(1);
        WebElement addToCart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();
        MyFunc.Bekle(1);
        WebElement btnBack=driver.findElement(By.xpath("//button[@id='back-to-products']"));
        btnBack.click();
        MyFunc.Bekle(1);
        WebElement product2=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        product2.click();
        MyFunc.Bekle(1);
        WebElement addToCart2=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCart2.click();
        MyFunc.Bekle(1);
        WebElement btnBack2=driver.findElement(By.xpath("//button[@id='back-to-products']"));
        btnBack2.click();
        MyFunc.Bekle(1);

        WebElement sepet=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();
        MyFunc.Bekle(1);
        WebElement buttunCheckOut=driver.findElement(By.xpath("//button[@id='checkout']"));
        buttunCheckOut.click();
        MyFunc.Bekle(1);
        WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("Merve");
        MyFunc.Bekle(1);
        WebElement lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("Arslan");
        MyFunc.Bekle(1);
        WebElement zipcode=driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipcode.sendKeys("12345678");
        MyFunc.Bekle(1);
        WebElement bcontinue=driver.findElement(By.xpath("//input[@id='continue']"));
        bcontinue.click();
        MyFunc.Bekle(1);
        double toplam=0;
        List<WebElement> ucretler= driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        for (WebElement e:ucretler) {
            System.out.println("e.getText()= "+e.getText());
            toplam=toplam+Double.parseDouble(e.getText().substring(1));
        }
        System.out.println("toplam = " + toplam);

        WebElement Webalttoplam=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        System.out.println("Webalttoplam.getText() = " + Webalttoplam.getText());
        System.out.println("Webalttoplam.getText()= " + Webalttoplam.getText().replaceAll("[^0-9,.]",""));
        Double altToplam=Double.parseDouble(Webalttoplam.getText().replaceAll("[^0-9,.]",""));
        Assert.assertTrue("Değerler eşit değil",(toplam==altToplam));



        BekleKapat();
    }
}
