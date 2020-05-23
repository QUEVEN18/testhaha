package testpackge;

import org.apache.xalan.xsltc.dom.AdaptiveResultTreeImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class test {
public  WebDriver driver;
//@BeforeTest
//public   void    test() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","D:\\qwq\\chromedriver.exe");
//        Thread.sleep(3000);
//        driver = new ChromeDriver();
//        Thread.sleep(3000);
//        driver.get("https://www.w3cschool.cn/");
//        Thread.sleep(3000);
//        driver.manage().window().maximize();
//
//    }
    @Parameters({"name","passwd"})
    @Test
    public void  Login(String name,String passwd) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\qwq\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3cschool.cn/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div[2]/div/a[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/form/div[1]/div[1]/input")).sendKeys(name);
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/form/div[2]/div[1]/input")).sendKeys(passwd);
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/form/div[5]/button")).click();
        Thread.sleep(3000);
        driver.close();
    }
//    public static void main(String args[]) throws InterruptedException {
//        test t=new test();
//       t.openChrome();
//        t.Login("13981871131","queven9306278");
//    }
}
