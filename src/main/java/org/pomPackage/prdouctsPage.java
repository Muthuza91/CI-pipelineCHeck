package org.pomPackage;

import org.basePackage.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class prdouctsPage extends baseClass {
	

	public By allproducts = By.xpath("//h2[text()='All Products']");
	
	public By productlist = By.xpath("/html/body/section[2]/div/div/div[2]/div"); 
	
	public By viewproduct = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a");
		
	public void verifyallproducts() {
		driver.findElement(allproducts).isDisplayed();
		
	}
	
	public void productvisible() {
		driver.findElement(productlist).isDisplayed();
	
	}
	
	public void firstproductview() {
		driver.findElement(viewproduct).click();

	}
	
	
	
	public void verifyproductdetail() {
		driver.findElement(By.xpath("//h2[text()='Blue Top']")).isDisplayed();
		
		driver.findElement(By.xpath("//p[text()='Category: Women > Tops']")).isDisplayed();
		
		driver.findElement(By.xpath("//span[text()='Rs. 500']")).isDisplayed();
		
		driver.findElement(By.xpath("//b[text()='Availability:']")).isDisplayed();
		
		driver.findElement(By.xpath("//b[text()='Condition:']")).isDisplayed();
		
		driver.findElement(By.xpath("//b[text()='Brand:']")).isDisplayed();
	
	}
	
	public void search(String value) {
		driver.findElement(By.xpath("//input[@placeholder=\"Search Product\"]")).sendKeys(value);
		
	}
	
	public void searchedpro() {
		driver.findElement(By.xpath("//h2[text()='Searched Products']")).isDisplayed();
		
	}
	
	public void addtocart(String cart) {
		driver.findElement(By.xpath(cart)).click();
		
	}
	
	public void increrasequantity(String count) {
		WebElement product = driver.findElement(By.xpath("//input[@name=\"quantity\"]"));
		product.clear();
		product.sendKeys(count);
	}
	
	public void review(String name,String email,String review) {
		driver.findElement(By.xpath("//input[@placeholder=\"Your Name\"]")).sendKeys(name);
		driver.findElement(By.xpath("//input[@placeholder=\"Email Address\"]")).sendKeys(email);
		driver.findElement(By.xpath("//textarea[@placeholder=\"Add Review Here!\"]")).sendKeys(review);
		click("//button[@id=\"button-review\"]");
	}

}


