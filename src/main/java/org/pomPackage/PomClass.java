package org.pomPackage;

import org.basePackage.baseClass;
import org.openqa.selenium.By;

public class PomClass extends baseClass {
	
public By verifyaccountdelete = By.xpath("//b[text()='Account Deleted!']");
	
	public By continuedelete = By.xpath("//a[text()='Continue']");
	
	public By verifytestcase = By.xpath("//b[text()=' Cases']");
	
	public void verifydelete() {
		driver.findElement(verifyaccountdelete).isDisplayed();
	}
	
	public void clickafterdelete() {
		driver.findElement(continuedelete).click();
	}
	
	public void verifytest() {
		driver.findElement(verifytestcase).isDisplayed();
	}
	
	

}
