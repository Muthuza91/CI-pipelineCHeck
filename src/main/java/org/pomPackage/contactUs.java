package org.pomPackage;

import org.basePackage.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class contactUs extends baseClass{
	
public By verifycontactus = By.xpath("//h2[text()='Get In Touch']");
	
	public By contactuser = By.xpath("//input[@placeholder=\"Name\"]");
	
	public By contactemail = By.xpath("//input[@placeholder=\"Email\"]");
	
	public By subject = By.xpath("//input[@placeholder=\"Subject\"]");
	
	public By message = By.xpath("//textarea[@placeholder=\"Your Message Here\"]");
	
	public By choose = By.xpath("//input[@name=\"upload_file\"]");
	
	public By submit = By.xpath("//input[@name=\"submit\"]");
	
	public By verifysuccess = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]");
	
	public By home = By.xpath("//span[text()=' Home']");
	

	public void verify() {
		driver.findElement(verifycontactus).isDisplayed();
		
	}
	
	public void contactform(String name, String email,String sub,String text) {
		driver.findElement(contactuser).sendKeys(name);
		driver.findElement(contactemail).sendKeys(email);
		driver.findElement(subject).sendKeys(sub);
		driver.findElement(message).sendKeys(text);
		
	}
	
	public void upload() throws InterruptedException {
		
		String file = "C:\\Users\\WGN\\Documents\\upload Test\\muthuUpload.jpg";
		driver.findElement(By.name("upload_file")).sendKeys(file);
		sleep(2000);
	
	}
	
	public void clicksubmit() {
		driver.findElement(submit).click();
		
	}
	
	public void clickok() {
		WebElement element = driver.findElement(submit);
		jsClick(element);
	}
	
	public void verifysubmit() {
		driver.findElement(verifysuccess).isDisplayed();
		
	}
	
	public void clickhome() {
		driver.findElement(home).click();
		
	}
	
	
	
	

}
