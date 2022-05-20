package Website;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_login {

	public static void main(String[] args) {
		Object driver;
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		    WebDriver driver1=new ChromeDriver();
//login
		 driver1.manage().window().maximize();
		 driver1.get("https://www.urbanladder.com");
		 driver1.manage().timeouts(). implicitlyWait(3,TimeUnit.SECONDS);
		 driver1.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		 driver1.findElement(By.linkText("Log In")).click();
		 driver1.findElement(By.xpath("//input[@class='email required input_authentication']")).
		 sendKeys("rutujakumbhar271@gmail.com");
		 driver1.findElement(By.xpath("//input[@class='required input_authentication']")).
		 sendKeys("rutuja@25");
		 driver1.findElement(By.xpath("//input[@value='Log In']")).click();
		 		
		 
	}

}
