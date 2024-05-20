import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class flightSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.edge.driver", "C:\\Users\\91987\\Documents\\Drivers\\edgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); 
		driver.get("https://demo.trip.dcsplus.net/index.html");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"flight-tab\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div[2]/div[3]/div/form/div/div/div[1]/fieldset/div[2]/label/strong")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("flightOrigin")).sendKeys("lon");
		Thread.sleep(5000);
		
	      // Locate the dropdown element
        WebElement dropdownElement = driver.findElement(By.className("city-airport-item"));

        // Click on the dropdown to open it
        dropdownElement.click();
        Thread.sleep(10000);
        // Locate the specific option by its data-value attribute
        WebElement option = driver.findElement(By.cssSelector("li[data-value*='LON']"));

        // Click on the option to select it
        //option.click();
		
		driver.findElement(By.xpath("//*[@id=\"singleCity\"]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"flightDestination\"]")).sendKeys("par");
		Thread.sleep(10000);
		 //WebElement dropdownElement1 = driver.findElement(By.className("city-airport-item.active"));

		 //Thread.sleep(1000);
	        //dropdownElement.click();
	        Thread.sleep(10000);
	        // Locate the specific option by its data-value attribute
	        WebElement option1 = driver.findElement(By.cssSelector("li[data-value*='PAR']"));

	        Thread.sleep(1000);
	        option1.click();

		driver.findElement(By.xpath("//*[@id=\"f_dIn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"date-dIn\"]/div/div[1]/table/tbody/tr[2]/td[1]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div[2]/div[3]/div/form/div/div/div[2]/div[3]/div[1]/div/div[1]/input")).click();
		Thread.sleep(10000);
		int i=1;
		while(i<5)
		{
		driver.findElement(By.xpath("//*[@id=\"flight\"]/div/form/div/div/div[2]/div[3]/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/button[2]/i")).click();
		i++;
	}
        driver.findElement(By.xpath("//*[@id=\"flight\"]/div/form/div/div/div[2]/div[3]/div[1]/div/div[2]/div[3]/button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div[2]/div[3]/div/form/div/div/div[2]/div[3]/div[5]/button")).click();
        Thread.sleep(10000);
        
        
}
}

