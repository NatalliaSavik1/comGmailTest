package com.gmail;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class WebDriverSettings {
    public ChromeDriver driver;
    public WebDriverWait wait;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/Savik_NV/IdeaProjects/chromedriver.exe");

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        System.out.println("test start");
    }

    @AfterTest
    public void close() {
        System.out.println("test closed");
        driver.quit();
    }
}
