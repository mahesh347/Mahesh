package com.org.Maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Basic1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println("maven installed sucuessfully");
		driver.quit();
		
		
		
		

	}

}
