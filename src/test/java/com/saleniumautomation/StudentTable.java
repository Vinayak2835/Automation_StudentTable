package com.saleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StudentTable {

	public static void main(String[] args) {
		 int totalSum = 0;
		 int totalMarks = 100;
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("file:///C:/Users/VINAYAK/Desktop/studentdata.html");
		 
		 List<WebElement>  list = driver.findElements(By.xpath("//table[@id=\"studentdata\"]/tbody/tr/td[3]"));
		 
		 for(int i = 0; i <= list.size()-1; i++) {
		     String value = list.get(i).getText();
		     totalSum = totalSum + Integer.parseInt(value);
		     if(totalSum == totalMarks) {
		    	 System.out.println("Yes total marks are equal");
		    	 break;
		     }
		   }
		// System.out.print("Total Marks is "+totalSum);
		 driver.close();
	}

}
