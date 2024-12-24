package seleniumPracticeproject.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebtablePractice {
	
	  WebDriver driver;
	    @BeforeTest
	    public void setup() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	    }
	    @Test
//	    void checkTheCountryTextInColumn() throws InterruptedException {
	 
//	        driver.get("https://cosmocode.io/automation-practice-webtable/");
//	        driver.manage().window().maximize();
//	        Thread.sleep(2000);
//	        driver.findElement(By.xpath("//tr//child::td//strong[text()=\"Algeria\"]//parent::td//preceding-sibling::td//input")).click();
//	        Thread.sleep(2000);
//	        List<WebElement> text = driver.findElements(By.xpath("//table//tr//td[2]/strong"));
//	        
//	        for(int i =0; i< text.size();i++) {
//	        	if(text.get(i).getText().equals("Indi")) {
//	        		System.out.println(true);
//	        	}
//	        	else {
//	        		System.out.println(false);
//	        	}
//	        }
	        
//	        String url = driver.getCurrentUrl();
//	        Assert.assertTrue(url.contains("lambdatest"));
//	    }
	    
	    public void getAllRows() throws InterruptedException {
	    	  driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		        driver.manage().window().maximize();
		        Thread.sleep(2000);
//	    	List<WebElement> columnData = driver.findElements(By.xpath("//table[@summary='Sample Table']//tbody/tr//td[1]"));
//	    	int size = columnData.size();
//	    	System.out.println("size is" + size);
//	    	JavascriptExecutor jspec = (JavascriptExecutor)driver;
//	    	WebElement totalElement = driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]//tfoot//tr//td//span"));
//	    	jspec.executeScript("arguments[0].scrollIntoView(true);", totalElement);
//	    	String text = totalElement.getText();
//	    	System.out.println("text" + text);
//	    	int structureCount = Integer.parseInt(text.split(" ")[0]);
//	    	System.out.println(structureCount);
//	    	if(size==structureCount)
//	    		System.out.println("count matches with total");
//	    	else
//	    		System.out.println("count doesnot"); 
		        
//		       WebElement burfRow = driver.findElement(By.xpath("//table[@summary='Sample Table']//tr//th//span[text()='Burj Khalifa']//parent::th//parent::tr"));
//		       String height = burfRow.findElement(By.xpath("./td[3]")).getText();
//		       System.out.println("height is" + height);
//		       if(height.equals("829m")) {
//		    	   System.out.println("yes");
//		       }else
//		       {
//		    	   System.out.println("no");
//		       }
		        
//		        WebElement table = driver.findElement(By.xpath("//table[@border='1']"));
//		       WebElement lastRow = table.findElement(By.xpath("//tr[last()]"));
//		      List<WebElement> columns = lastRow.findElements(By.xpath("//td"));
//		       System.out.println(columns.size());
		        
		      driver.findElement(By.xpath("//span[text()='Main Level 1 ']//preceding-sibling::input")).click();
		      driver.findElement(By.xpath("//a[@href='radio-button.php']")).click();
		      driver.findElement(By.xpath("//label[text()='Impressive']//preceding-sibling::input")).click();
		    
		      
	    }
	    @AfterTest
	    void tearDown() {
	        driver.quit();
	    }
}
