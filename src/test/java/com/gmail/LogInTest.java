package com.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class LogInTest extends WebDriverSettings {

    @Test
    public void LogInTest() {
        LogIn logIn = PageFactory.initElements(driver, LogIn.class );

        logIn.open();
        logIn.getSarted();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("initialView")));

        driver.findElement(By.id("identifierId")).sendKeys("testsavik@gmail.com");

        driver.findElement(By.id("identifierNext")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type=password]")));

        driver.findElement(By.cssSelector("input[type=password]")).sendKeys("080590ujL");

        driver.findElement(By.id("passwordNext")).click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".gb_x.gb_Da.gb_f")));

        driver.findElement(By.cssSelector(".gb_x.gb_Da.gb_f")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gb_71")));

        driver.findElement(By.id("gb_71")).click();

        System.out.println("LogOut");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("initialView")));

    }



}
