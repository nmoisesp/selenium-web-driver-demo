package com.webdriver.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxNavigation {
    private static final String ROOT_PATH = "Users/nmoises/Documents/engineering/java-projects";

    public static void main(String ...args){
        WebDriver webDriver = new ChromeDriver();
        String fileAbsolutePath = "file:///%s/selenium-web-driver-demo/src/main/webapp/CheckboxTest.html";
        webDriver.get(String.format(fileAbsolutePath, ROOT_PATH));

        WebElement checkbox = webDriver.findElement(By.id("lettuceCheckbox"));
        checkbox.click();
        webDriver.quit();
    }
}