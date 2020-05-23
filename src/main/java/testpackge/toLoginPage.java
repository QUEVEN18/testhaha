package testpackge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLoginPage {
    public   WebDriver openChrome() {
        System.setProperty("webdriver.chrome.driver","D:\\qwq\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

//    public  void toLoginPage() throws InterruptedException {
//        WebDriver driver = openChrome();
//        driver.get("https://www.w3cschool.cn/");
//        driver.wait(1000);
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div[2]/div/a[2]")).click();
//        Thread.sleep(1000);
//
//    }

}
