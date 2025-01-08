package org.pomPackage;

import org.basePackage.baseClass;
import org.openqa.selenium.By;

public class HomePage extends baseClass {
	
	
	public By verifyhomepage = By.xpath("//img[@alt='Website for automation practice']");
	
	public By signup = By.xpath("//a[text()=' Signup / Login']");
	
	public By verifyloggedin = By.xpath("//a[text()=' Logged in as ']");
	
	public By deleteaccount = By.xpath("//a[text()=' Delete Account']");
	
	public By logout = By.xpath("//a[text()=' Logout']");
	
	public By contact = By.xpath("//a[text()=' Contact us']");
	
	public By test = By.xpath("//a[text()=' Test Cases']");
	
	public By product = By.xpath("//a[text()=' Products']");
	
	public void verifyhome() {
		
		boolean displayed = driver.findElement(verifyhomepage).isDisplayed();
		System.out.println(displayed);
	}
	
	public void sign() {	
		driver.findElement(signup).click();
	}
	
	public void verifylogin() {
		driver.findElement(verifyloggedin).isDisplayed();
	}
	
	public void delete() {
		driver.findElement(deleteaccount).click();
	}
	
	public void logout() {
		driver.findElement(logout).click();
		
	}
	
	public void contactbutton() {
		driver.findElement(contact).click();;
		
	}
	
	public void testcase() {
		driver.findElement(test).click();
	}
	
	public void clickproduct() {
		driver.findElement(product).click();
	}
	
	public void subscription() {
		driver.findElement(By.xpath("//h2[text()='Subscription']")).isDisplayed();
	}
	
	public void subdetails(String email) {
		driver.findElement(By.xpath("//input[@placeholder='Your email address']")).sendKeys(email);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	
	public void subscribesuccess() {
		driver.findElement(By.xpath("//div[text()='You have been successfully subscribed!']")).isDisplayed();
	}
	
	public void clickcart() {
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		
	}

}
