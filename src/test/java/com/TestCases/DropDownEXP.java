package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.POM.pomDropDown;

public class DropDownEXP extends BaseClass
{    @Test
     public void getDropDown() throws InterruptedException
     {
    	 pomDropDown pd=new pomDropDown(driver);
    	 pd.clik_DD();
    	 Thread.sleep(2000);
    	 WebElement ee=driver.findElement(By.xpath("//select[@id='dropdown']"));
    	 Select se=new Select(ee);
    	 se.selectByIndex(1);
    	 Thread.sleep(2000);
    	 driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
     }
}
