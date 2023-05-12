package com.vuse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import helperCommon.Base;

public class Vuse {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.vuse.com/gb/en/customer/account/create");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		// driver.quit();
		WebElement accepts_all_cookies_button = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		accepts_all_cookies_button.click();
		WebElement age18plus_button = driver.findElement(By.linkText("I'M 18 OR OVER"));
		age18plus_button.click();

		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstname']"));
		firstname.sendKeys("Rahul");
		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastname']"));
		lastname.sendKeys("Sharma");
		WebElement emailaddress = driver.findElement(By.xpath("//input[@id='email_address']"));
		emailaddress.sendKeys("RahulSharma@xyz.com");
		WebElement dob = driver.findElement(By.xpath("//input[@id='dob']"));
		dob.sendKeys("20/03/1992");
		WebElement gender_dropdown = driver.findElement(By.xpath("//select[@id='gender']"));
		Select s = new Select(gender_dropdown);
		s.selectByValue("1");
		// WebElement
		// address=driver.findElement(By.xpath("//input[@id='address-search']"));
		// address.sendKeys("India");

		WebElement phone_number = driver.findElement(By.xpath("//input[@id='telephone']"));
		phone_number.sendKeys("1234567890");
		WebElement checkbox = driver.findElement(By.xpath("//span[@class='small-checkbox-text']"));
		checkbox.click();
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Sharma@123");
		WebElement confirm_password = driver.findElement(By.xpath("//input[@id='password-confirmation']"));
		confirm_password.sendKeys("Sharma@123");

		WebElement checkbox1 = driver.findElement(By.xpath("//input[@title='I accept the Vuse [Terms & Conditions]']"));
		checkbox1.click();

		WebElement checkbox2 = driver.findElement(By.xpath("(//input[@id='email_marketing'])[2]"));
		checkbox2.click();
		WebElement checkbox3 = driver.findElement(By.xpath("((//input[@id='mob_marketing'])[2]"));
		checkbox3.click();

	}
}
