package com.webdriver.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverTables {
    private static final String ROOT_PATH = "Users/nmoises/Documents/engineering/java-projects";

    public static void main(String ...args){
        WebDriver webDriver = new ChromeDriver();
        String fileAbsolutePath = "file:///%s/selenium-web-driver-demo/src/main/webapp/TableTest.html";
        webDriver.get(String.format(fileAbsolutePath, ROOT_PATH));

        WebElement outerTable = webDriver.findElement(By.tagName("table"));
        WebElement innerTable = outerTable.findElement(By.tagName("table"));
        List<WebElement> rows = innerTable.findElements(By.tagName("td"));
        System.out.println(rows.get(1).getText());

        // selecting table elements using XPATH
        WebElement element = webDriver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
        System.out.println(element.getText());
        webDriver.quit();
    }
}