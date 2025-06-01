
package sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Force {
	
	public static void main (String[] args) throws InterruptedException {

 System.setProperty("webdriver.chrome.driver","C:/sel/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
	
			
		 driver.get("https://gamingsanta.shop");
		 driver.manage().window().maximize();
		 
		Thread.sleep(3000);
        System.out.println(driver.getTitle());
		
	
			
		
	}

}
