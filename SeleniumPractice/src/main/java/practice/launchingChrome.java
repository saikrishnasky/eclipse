package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String actual_title="facebook – log in or sign up";
		String ecp_title=driver.getTitle();
		
		if(actual_title.equalsIgnoreCase(ecp_title)==true) {
			System.out.println("test is passed");
		}
		else {
			System.out.println("test is failed");
		}
		
	}

}
