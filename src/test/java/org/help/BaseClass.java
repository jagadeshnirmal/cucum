package org.help;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;


public class BaseClass {
public  static WebDriver driver;
	static Actions a;
	static Robot r;
	static Select s;
	
	
	public static void launchBrowser() {
		 driver = new ChromeDriver();
		 
}
public static void lanuchUrl(String url) {
          driver.get(url);
}
public static void getTitle() {
	driver.getTitle();
	
}

private void implicitWait() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	

}



public static void closeTab() {
	driver.close();

}
public static void quit() {
		driver.quit();

	}

public static void findElementName(String name) {
	driver.findElement(By.name(name));

}
public static void findElementClassname(String xpath) {
	driver.findElement(By.xpath(xpath));

}
public static void toFillTextBox(WebElement ele,String value) {
	ele.sendKeys(value);
}
public static void toClick(WebElement element) {
element.click();

}
public static void getText(WebElement e1) {
	e1.getText();
}
public static void getAttribute(WebElement e2,String value) {
	e2.getAttribute(value);

}
public static void moveElement(WebElement e3) {
	 a= new Actions(driver);
	a.moveToElement(e3).perform();
}

public static void doubleclick(WebElement e3) {
	a.doubleClick(e3).perform();

}
public static void ContextClick() {
	a.contextClick().perform();

}
public static void Robot() throws AWTException {
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_DOWN);
}

public static void select(WebElement element) {
	s= new Select(element);
		}
	public static void byIndex(int index) {
		s.selectByIndex(index);
	
	}
	public static void byValue(String value) {
		s.selectByValue(value);
	}
	public static void byVisibleText(String text) {
		s.selectByVisibleText(text);
		
	}
	
	public static void isMultiple() {
		s.isMultiple();
	}
	public static void getOptions() {
		
	s.getOptions();
	}

public static void getAll() {
	s.getAllSelectedOptions();
}
	 public static void firstSelect() {
		s.getFirstSelectedOption();
		
	}
	 public static void deSelect(int index) {
		s.deselectByIndex(index);
	}

	 public static void deSelectByValue(String value) {
		s.deselectByValue(value);
	
	}
	public static void deSelectAll() {
		s.deselectAll();
	} 
	
	public static void windowsHandle(String windowid) {
		driver.switchTo().window(windowid);
Set<String> handles = driver.getWindowHandles();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}






















	

