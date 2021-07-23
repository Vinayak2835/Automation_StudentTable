package com.saleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StudentData {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("file:///C:/Users/VINAYAK/Desktop/studentdata.html");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		String firstSubjectMarks = driver.findElement(By.xpath("//table[@id='studentdata']/tbody/tr[2]/td[3]")).getText();
		int marks1 = Integer.parseInt(firstSubjectMarks);
		System.out.println(marks1);
		String  secondSubjectMarks = driver.findElement(By.xpath("//table[@id='studentdata']/tbody/tr[3]/td[3]")).getText();
		int marks2 = Integer.parseInt(secondSubjectMarks);
		System.out.println(marks2);
		String thirdSubjectMarks = driver.findElement(By.xpath("//table[@id='studentdata']/tbody/tr[4]/td[3]")).getText();
		int marks3 = Integer.parseInt(thirdSubjectMarks);
		System.out.println(marks3);
		
		String totalMarks = driver.findElement(By.xpath("//table[@id='studentdata']/tbody/tr[5]/td[3]")).getText();
		int total = Integer.parseInt(totalMarks);
		System.out.println(total);
		
		if(marks1+marks2+marks3 == total) {
			System.out.println("Addition of Marks are  equal to " +total);
		} else {
			System.out.println("Addition of Marks are not equal to "+total);
		}
		
		driver.close();

	}
}
