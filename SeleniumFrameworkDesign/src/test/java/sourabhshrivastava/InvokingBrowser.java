package sourabhshrivastava;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokingBrowser {

	
	public static void main(String[] args)
	 {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver driver= new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("www.gamingsanta.shop");
	}

}  