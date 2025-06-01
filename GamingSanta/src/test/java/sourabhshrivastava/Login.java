package sourabhshrivastava;

import java.time.Duration;
import java.util.Set;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@preserveAspectRatio=\"xMidYMid meet\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"YT_9QV\"]")).click();     
		driver.findElement(By.xpath("//button[@class=\"kuTaGy wixui-button zKbzSQ\"]/following::span[contains(text(),'Sign up with Google')]")).click();
		Thread.sleep(5000);
		String currenthandle=driver.getWindowHandle();
		
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());
		System.out.println(currenthandle);
		
		//driver.switchTo().frame((WebElement) By.xpath("//iframe[@src=\"/_/bscframe\"]"));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("sourabhshrivastava569@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@jsname=\"LgbsSe\"])[2]")).click();
		driver.close();
	}}
		driver.switchTo().window(parent);		
		driver.findElement(By.xpath("//button[@class=\"dkeRPE\"]")).click();
		@SuppressWarnings("unused")
		List <WebElement> products =driver.findElements(By.xpath("//span[contains(text(),'Add to Cart')]"));
		System.out.println("test1");
		/*WebElement prod = products.stream().filter(product -> 
	  product.findElement(By.xpath("//div[starts-with(@data-slug=\"lenovo-legion-go-8-8-144hz-wqxga-gaming-handheld-amd-ryzen-z1-extreme-16gb-with\"]")).getText().equals("lenovo-legion-go-8-8-144hz-wqxga-gaming-handheld-amd-ryzen-z1-extreme-16gb-with")
	).findFirst().orElse(null);
		System.out.println(prod);*/
		//prod.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
	System.out.println(driver.findElement(By.xpath("//div[@aria-label=\"Lenovo Legion Go 8.8″ 144Hz  AMD Ryzen Z1 Extreme 16GB. Brand-New gallery\"]//span[contains(text(),\"Add to Cart\")]")).getText());
	driver.findElement(By.xpath("//div[@aria-label=\"Lenovo Legion Go 8.8″ 144Hz  AMD Ryzen Z1 Extreme 16GB. Brand-New gallery\"]//span[contains(text(),\"Add to Cart\")]")).click();
	Thread.sleep(3000);
	System.out.println("code");
	int size = driver.findElements(By.tagName("iframe")).size();
	System.out.println(size);
	/*WebElement iframe=driver.findElement(By.xpath("//div[@class=\"minicart\"]"));
	iframe.getText();
	Thread.sleep(3000);*/
	WebDriver iframe=driver.switchTo().frame(1);
	// Alert a = driver.switchTo().alert();
	 //a.getText();
	Thread.sleep(3000);
	 iframe.findElement(By.id("widget-view-cart-button")).click();
	 driver.switchTo().defaultContent();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[@class=\"sC5KCfT\"]")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@aria-label=\"Email for order confirmation\"]")).sendKeys("sourabhshrivastava569@gmail.com");
	 driver.findElement(By.xpath("//input[@aria-label=\"First name\"]")).sendKeys("Sourabh");
	 driver.findElement(By.xpath("//input[@aria-label=\"Last name\"]")).sendKeys("Shrivastava");
	 driver.findElement(By.xpath("//input[@aria-label=\"Phone\"]")).sendKeys("8698425477");
	 
	 
	}}
