package test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ap1 {

	public static void main(String[] args) {
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.stremio.com/");
		System.out.println("lol");
		driver.quit();
	}

}
