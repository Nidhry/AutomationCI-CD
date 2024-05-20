import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select; 

public class class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.edge.driver", "C:\\Users\\91987\\Documents\\Drivers\\edgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); 
		driver.get("https://demo.trip.dcsplus.net/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[1]/ul/li[1]/a/i\r\n")).click();
		driver.findElement(By.name("Username")).sendKeys("nidhi.chaudhary@dcsplus.net");
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/form/div[1]/div[2]/div/input")).sendKeys("nidhi");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/form/div[2]/button")).click();
	    Thread.sleep(10000);
	   
	    WebElement staticDropdown = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/li[2]/select"));
	    Select dropdown = new Select(staticDropdown);
	    dropdown.selectByIndex(15);
	    Thread.sleep(10000);
	    //driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/li[1]/select")).click();
	    
	    
	    
		
		
		
	}

}

