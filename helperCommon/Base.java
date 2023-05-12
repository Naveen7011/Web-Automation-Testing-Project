package helperCommon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base
{
  public static WebDriver driver;
  public static Properties prop;
  
  static
  {
	try
	{
		FileInputStream file=new FileInputStream("TestData/UserData.properties") ;
		prop=new Properties();
		prop.load(file);
	} 
	
	catch (FileNotFoundException e)
	{
		e.printStackTrace();
	} 
	
	catch (IOException e) 
	{
		
		e.printStackTrace();
	} 
  }
  
   public void mouseHover(WebElement ele) //method 2
  {
	  Actions mousehover=new Actions(driver);
	  mousehover.moveToElement(ele).build().perform();
	  
  }
  
  public void mouseRightClick(WebElement ele) //method 3
  {
	  Actions mouserightclick=new Actions(driver);
	  mouserightclick.contextClick(ele).build().perform();
	  
  }
  
  public void type(WebElement ele,String value) //method 4
  {
	  Actions typetext=new Actions(driver);
	typetext.sendKeys(ele,value).build().perform();
  }
  
  public void selectByVisibleText(WebElement ele,String value) //method 5
  {
	  Select s=new Select(ele);
	  s.selectByVisibleText(value);
	  
  }

  public void selectByIndex(WebElement ele,int value) //method 6
  {
	  Select s=new Select(ele);
	  s.selectByIndex(value);
	  
  }
  
  public void selectByValue(WebElement ele,String value) //method 7
  {
	  Select s=new Select(ele);
	  s.selectByValue(value);
	  
  }
  
  public void screenshot() //method 8
  {
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File file1=ts.getScreenshotAs(OutputType.FILE);
	  try 
	  {
		FileUtils.copyFile(file1, new File("Screenshots/"+System.currentTimeMillis()+".png"));
      } 
	     catch (IOException e)
	  {
		
		e.printStackTrace();
      }
	  
  }
  
  public void waitforExpectedElement(WebElement ele,int timeout)
  {
 	 
 	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
 	 wait.until(ExpectedConditions.visibilityOf(ele));
  }
  
  
 public void waitElementClickable(WebElement ele,int timeout)
 {
	 
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
	 wait.until(ExpectedConditions.elementToBeClickable(ele));
 }
 
   
 public void selectAlertPopup(int timeout)
 {     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
       wait.until(ExpectedConditions.alertIsPresent());
 	  Alert a=driver.switchTo().alert();
 	  a.accept();
 }

 public void jsClickExecutor(WebElement ele)
 {
 	  JavascriptExecutor js=(JavascriptExecutor) driver;
 	  js.executeScript("arguments[0].click();", ele);
 }

}

