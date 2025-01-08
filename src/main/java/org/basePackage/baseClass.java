package org.basePackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseClass {
	
	public static WebDriver driver;
	
	public static Robot robot;
	
	
	public static void Browserlaunch() {
		driver= new ChromeDriver();
	}
	
	public static void maximise() {
		driver.manage().window().maximize();
		

	}
	
	public static void geturl(String url) {
		driver.get(url);
	}
	
	public static void sleep(int time) throws InterruptedException {
		Thread.sleep(time);
	}
	 
	public static void wait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public static void ss(WebDriver driver, String imgname) throws IOException {
		TakesScreenshot screenhsot = (TakesScreenshot)driver;
		File imgtype = screenhsot.getScreenshotAs(OutputType.FILE);
		File imgpath = new File("/AutomationPractise/Screenshot"+imgname+".png");
		FileUtils.copyFile(imgtype, imgpath);
	}
	
	public static void explicit(WebElement locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click() ;", element);
	}
	
	public static void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}
	
	public static void scrollup() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,0);");
	}
	
	public static void hover(String xpath) {
		 WebElement element = driver.findElement(By.xpath(xpath));
	     Actions action = new Actions(driver);
	     action.moveToElement(element).perform();
	}
	public static void robo() throws AWTException {
		robot = new Robot();   
	}
	
	public static void display(String xpath) {
		driver.findElement(By.xpath(xpath)).isDisplayed();
	}
	
	public static void send(String xpath, String value) {
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	
	public void click(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
		
	}
	
	public boolean isIndexHtmlPresent() {
        return driver.getTitle().contains("index.html");

	
	

	}
}
