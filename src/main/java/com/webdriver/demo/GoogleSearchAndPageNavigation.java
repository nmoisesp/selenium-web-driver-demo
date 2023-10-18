package com.webdriver.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GoogleSearchAndPageNavigation {

    public static void main(String[] args) throws MalformedURLException {
        // local
        //WebDriver webDriver = new ChromeDriver();

        // remote server
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);

        webDriver.get("https://www.google.com/");

        WebElement search = webDriver.findElement(By.name("q"));
        search.click();
        search.sendKeys("pluralsight");
        search.sendKeys(Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Imagens")));

        WebElement imageLink = webDriver.findElement(By.linkText("Imagens"));
        imageLink.click();

        WebElement imageElement = webDriver.findElement(By.cssSelector("img[class='rg_i Q4LuWd']"));
        imageElement.click();

        webDriver.quit();
    }
}