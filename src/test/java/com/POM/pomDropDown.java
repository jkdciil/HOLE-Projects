package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomDropDown {
    
	public WebDriver ldriver;
	public pomDropDown(WebDriver rdriver)
	{   
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(linkText="Dropdown")
	WebElement txt_dropdown;
	
	@FindBy(xpath="//select[@id='dropdown']")
	WebElement txt_Select_an_Option;
	
	public void clik_DD()
	{
		txt_dropdown.click();
	}
}
