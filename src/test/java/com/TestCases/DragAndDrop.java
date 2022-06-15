package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.POM.pomDragAndDrop;

public class DragAndDrop extends BaseClass
{
	@Test
	public void DragAndDropm() throws Throwable
	{
		pomDragAndDrop ddd=new pomDragAndDrop(driver);
		ddd.DD();
		Thread.sleep(2000);
		WebElement src=driver.findElement(By.id("column-a"));
		WebElement trg=driver.findElement(By.id("column-b"));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(src, trg);
		Thread.sleep(2000);
		
	}
}
