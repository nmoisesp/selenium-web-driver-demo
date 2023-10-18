package com.webdriver.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonNavigation {

    private static final String ROOT_PATH = "Users/nmoises/Documents/engineering/java-projects";

    public static void main(String ...args){
        WebDriver webDriver = new ChromeDriver();
        String fileAbsolutePath = "file:///%s/selenium-web-driver-demo/src/main/webapp/RadioButtonTest.html";
        webDriver.get(String.format(fileAbsolutePath, ROOT_PATH));

        List<WebElement> radioButtons = webDriver.findElements(By.name("color"));
        radioButtons.get(1).click();

        for(WebElement radioButton : radioButtons){
            if(radioButton.isSelected()){
                System.out.println(radioButton.getAttribute("value"));
            }
        }
        webDriver.quit();
    }

}
