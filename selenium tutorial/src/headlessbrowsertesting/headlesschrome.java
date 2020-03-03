package headlessbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlesschrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.setHeadless(true);
		// instead of the top two lines we can also use options.addarguments("--headless");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		System.out.println(driver.getTitle());
		
	}

}
