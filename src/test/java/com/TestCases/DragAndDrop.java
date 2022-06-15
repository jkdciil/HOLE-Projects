package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.POM.pomDragAndDrop;
import com.POM.pomDropDown;

public class DragAndDrop extends BaseClass
{
	@Test
	public void DragAndDropm() throws Throwable
	{
		pomDropDown pd=new pomDropDown(driver);
		pd.DD2();
		/*pomDragAndDrop ddd=new pomDragAndDrop(driver);
		ddd.DD();*/
		Thread.sleep(2000);
		WebElement src=driver.findElement(By.id("column-a"));
		WebElement trg=driver.findElement(By.id("column-b"));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(src, trg);
		Thread.sleep(2000);
		
	}
}
