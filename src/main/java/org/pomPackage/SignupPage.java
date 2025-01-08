package org.pomPackage;

import org.basePackage.baseClass;
import org.openqa.selenium.By;

public class SignupPage extends baseClass {
	
public By verifynewuser= By.xpath("//h2[text()='New User Signup!']");
	
	public By username = By.xpath("//input[@placeholder=\"Name\"]");
	
	public By useremail = By.xpath("//input[@data-qa=\"signup-email\"]");
	
	public By signupbutton = By.xpath("//button[text()='Signup']");
	
	public By verifyenteraccountinformation= By.xpath("//b[text()='Enter Account Information']");
	
	public By gender = By.xpath("//input[@value=\"Mr\"]");
	
	public By password = By.xpath("//input[@name='password']");
	
	public By date = By.xpath("//select[@name='days']");
	
	public By month = By.xpath("//select[@name='months']");
	
	public By year = By.xpath("//select[@name='years']");
	
	public By checkbox_1 = By.xpath("//label[text()='Sign up for our newsletter!']");
	
	public By checkbox_2 = By.xpath("//label[text()='Receive special offers from our partners!']");
	
	public By first_name = By.xpath("//input[@name='first_name']");
	
	public By last_name = By.xpath("//input[@name='last_name']");
	
	public By company = By.xpath("//input[@name='company']");
	
	public By address1 = By.xpath("//input[@name='address1']");
	
	public By address2 = By.xpath("//input[@name='address2']");

	public By country = By.xpath("//select[@name='country']");
	
	public By india = By.xpath("//option[text()='India']");
	
	public By state = By.xpath("//input[@name='state']");
	
	public By city = By.xpath("//input[@name='city']");
	
	public By zipcode = By.xpath("//input[@name='zipcode']");
	
	public By mobile = By.xpath("//input[@name='mobile_number']");
	
	public By createaccount = By.xpath("//button[text()='Create Account']");
	
	public By verifyaccountcrerated = By.xpath("//b[text()='Account Created!']");
	
	public By continuebutton = By.xpath("//a[text()='Continue']");
	
	
//case 2
	
	public By verifylogin = By.xpath("//h2[text()='Login to your account']");
	
	public By logmail = By.xpath("//input[@data-qa='login-email']");
	
	public By logpassword = By.xpath("//input[@data-qa='login-password']");
	
	public By loginbutton = By.xpath("//button[@data-qa='login-button']");
	
	
//case3
	
	public By incorrectlogin = By.xpath("//p[text()='Your email or password is incorrect!']");
	
//case5
	
	public By emailalreadyexist = By.xpath("//p[text()='Email Address already exist!']");
	
	
	
	
	
	
//methods
	
	public void verifyuser() {
		driver.findElement(verifynewuser).isDisplayed();
	}

	public void userdetails(String name,String mail) {
		driver.findElement(username).sendKeys(name);
		driver.findElement(useremail).sendKeys(mail);
	}
	
	public void clicksignup() {
		driver.findElement(signupbutton).click();
	}
	public void verifyaccinformation() {	
		driver.findElement(verifyenteraccountinformation);		
	}
	
	public void accountinformation() {
		driver.findElement(gender).click();
		driver.findElement(password).sendKeys("12345");
		driver.findElement(date).sendKeys("9");
		driver.findElement(month).sendKeys("November");
		driver.findElement(year).sendKeys("1991");
		driver.findElement(checkbox_1).click();
		driver.findElement(checkbox_2).click();
	}
	
	public void addressinfromation() {
		driver.findElement(first_name).sendKeys("Muthazhagan");
		driver.findElement(last_name).sendKeys("G");
		driver.findElement(company).sendKeys("WGN");
		driver.findElement(address1).sendKeys("NO 73 chinnamman koil st");
		driver.findElement(address2).sendKeys("Kalavakkam");
		driver.findElement(country).click();
		driver.findElement(india).click();
		driver.findElement(state).sendKeys("tamilnadu");
		driver.findElement(city).sendKeys("chennai");
		driver.findElement(zipcode).sendKeys("603110");
		driver.findElement(address2).sendKeys("Thiruporur");
		driver.findElement(mobile).sendKeys("9789825643");
	}
	
	public void clickcreate() {
		driver.findElement(createaccount).click();
	}
	
	public void verifyacccreate() {
		driver.findElement(verifyaccountcrerated).isDisplayed();
	}
	
	public void clickcontinue() {
		driver.findElement(continuebutton).click();
	}
	
//case2
	
	
	public void verifyloginform() {
		driver.findElement(verifylogin).isDisplayed();
	
	}
	
	public void logindetails(String mail, String password) {
		driver.findElement(logmail).sendKeys(mail);
		driver.findElement(logpassword).sendKeys(password);
	
	}
	
	public void clicklogin() {
		driver.findElement(loginbutton).click();
	
	}
	
	
	
	
//case3
	
	public void incorrectsignin() {
		driver.findElement(incorrectlogin).isDisplayed();
		
	}
	
	
	
//case5
	
	public void verifyemailalreadyexist() {
		driver.findElement(emailalreadyexist).isDisplayed();
		
	}
	

}
