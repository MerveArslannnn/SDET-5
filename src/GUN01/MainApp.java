package GUN01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MainApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.techno.study/");



    }
}
