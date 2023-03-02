package GUN09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionDragAndDropTest extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions aksiyonlar = new Actions(driver);
        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norway = driver.findElement(By.id("box101"));
        MyFunc.Bekle(2);

      //1.yöntem
       aksiyonlar.dragAndDrop(oslo,norway).build().perform();//oslo yu norway e at

        //2. yöntem
       //aksiyonlar.clickAndHold(oslo).build().perform();//oslo yu tıklat al
       //aksiyonlar.moveToElement(norway).release().build().perform();//notway in üzerine git bırak

        BekleKapat();
    }
}
