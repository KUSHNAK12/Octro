package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {

		// WebDriver --> Interface ctr+shift+o-->import shortcut

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		 driver.get("\"https://www.amazon.in/");
		 
	}

}
