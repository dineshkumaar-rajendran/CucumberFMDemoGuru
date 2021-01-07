package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM {

	private WebDriver driver;
	private By username = By.xpath("//input[@name='uid']");
	private By password = By.xpath("//input[@name='password']");
	private By loginbtn = By.xpath("//input[@name='btnLogin']");

	public void enter_username(String usernames) {
		driver.findElement(username).sendKeys(usernames); // mngr301916 and bEdaryq

	}

	public void enter_passwords(String passwords) {
		driver.findElement(password).sendKeys(passwords);
	}

	public void click_login() {
		driver.findElement(loginbtn).click();
	}

	public LoginPage_POM(WebDriver driver) {
		this.driver = driver;
	}

}
