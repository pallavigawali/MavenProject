package newProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_001 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
//        WebElement DropDown = driver.findElement(By.id("course"));
//        Select s=new Select(DropDown);
//        s.selectByIndex(3);
//        Thread.sleep(1000);
//        s.selectByVisibleText("Javascript");
//        Thread.sleep(1000);
        
       WebElement MultiSelect = driver.findElement(By.id("ide"));
       Select s=new Select(MultiSelect);
       s.selectByIndex(3);
       Thread.sleep(1000);
       s.selectByValue("ec");
	    
	}

}
