package com.org.Maven1;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class brokenLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://Drivers//chromedriver.exe");
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		List<WebElement> anker=driver.findElements(By.tagName("a"));
		System.out.println("No of links are" + anker.size());
		for(int i=0;i<=anker.size();i++){
			List<WebElement> ele= anker;
			System.out.println(ele.get(i).getText());
			//String url=ele.getAttribute("href");
			
			
			
		}
		

	}




public static void linkstoTest(String linkurl){
	try {
		
	
	URL url=new URL(linkurl);
	
	HttpURLConnection noOfLinks= (HttpURLConnection)url.openConnection();
	noOfLinks.setConnectTimeout(3000);
	noOfLinks.connect();
	if(noOfLinks.getResponseCode()==200){
		System.out.println(linkurl +"  _ " + noOfLinks.getResponseMessage());
		
		
	}
	if(noOfLinks.getResponseCode()==noOfLinks.HTTP_NOT_FOUND){
		
		System.out.println("not working ");
	}
	
	
	
} catch (Exception e) {
		
	}
	
	
	
	
}
}
