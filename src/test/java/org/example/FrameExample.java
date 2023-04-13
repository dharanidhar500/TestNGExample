package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FrameExample {

    ChromeDriver driver;

    @BeforeClass
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.manage().window().maximize();
    }
    @Test
    void frameMethod(){
        driver.switchTo().frame("mce_0_ifr");
        WebElement a =driver.findElement(By.id("tinymce"));
        a.clear();
        a.sendKeys("dharani dhar gupta");
    }
}
