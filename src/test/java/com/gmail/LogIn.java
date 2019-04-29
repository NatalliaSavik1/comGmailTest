package com.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn {
   private WebDriver driver;
   private WebDriverWait wait;

    public LogIn(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

        @FindBy(id ="maia-header")
         private WebElement header;

         private By getStartedButtonLocator = By.id("gmail-sign-in");
         private By mainSignup = By.id("initialView");


       public void open() {
           driver.get("https://www.gmail.com/mail/help/intl/ru/about.html?de.");
         }

         public void getSarted() {
             header.findElement(getStartedButtonLocator).click();
             wait.until(ExpectedConditions.visibilityOfElementLocated(mainSignup));
         }


}
