package com.webdriver.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectItemNavigation {

    private static final String ROOT_PATH = "Users/nmoises/Documents/engineering/java-projects";

    public static void main(String ...args){
        WebDriver webDriver = new ChromeDriver();
        String fileAbsolutePath = "file:///%s/selenium-web-driver-demo/src/main/webapp/SelectItemTest.html";
        webDriver.get(String.format(fileAbsolutePath, ROOT_PATH));

        WebElement element = webDriver.findElement(By.id("select1"));
        Select selectItem = new Select(element);
        selectItem.selectByVisibleText("Maybe");
        webDriver.quit();
    }
}