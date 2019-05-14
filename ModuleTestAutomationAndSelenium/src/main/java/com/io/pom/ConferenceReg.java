package com.io.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//it is used for the storing the details of various persons 
public class ConferenceReg {
	
	static WebDriver driver;
	public ConferenceReg(WebDriver driver) {
		this.driver=driver;
	}
	
	By firstName=By.name("txtFN");
	By lastName=By.name("txtLN");
	By email=By.name("Email");
	By contactNo=By.name("Phone");
	By noOfPeople=By.name("size");
	By buildingName=By.name("Address");
	By areaName=By.name("Address2");
	By city=By.name("city");
	By state=By.name("state");
	By conferenceAccess=By.name("memberStatus");
	
	public void giveFirstName() {
		System.out.println(driver.getTitle());
		driver.findElement(firstName).sendKeys("Shruthi");
	}
	
	public void giveLastName() {
		driver.findElement(lastName).sendKeys("Gaddam");
	}
	
	public void giveEmail() {
		driver.findElement(email).sendKeys("shruthi@gmail.com");
	}
	
	public void giveContact() {
		driver.findElement(contactNo).sendKeys("9876543210");
	}
	
	public void giveNoOfPeople() {
		//driver.findElement(noOfPeople).sendKeys("");
		Select people = new Select(driver.findElement(noOfPeople));
		people.selectByVisibleText("1");
	}
	
	public void giveBuildingName() {
		driver.findElement(buildingName).sendKeys("Maruthi Heights");
	}
	
	public void giveAreaName() {
		driver.findElement(areaName).sendKeys("Aziz Nagar");
	}
	
	public void giveCity() {
		Select country = new Select(driver.findElement(city));
		country.selectByVisibleText("Hyderabad");
	}
	
	public void giveState() {
		Select state1 = new Select(driver.findElement(state));
		state1.selectByVisibleText("Telangana");
	}
	
	public void giveCconferenceAccess() {
		WebElement radio1 = driver.findElement(conferenceAccess);
		radio1.click();
	}
	
	public void clickNext() throws InterruptedException {
		driver.findElement(By.linkText("Next")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
}
