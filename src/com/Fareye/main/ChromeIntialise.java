package com.Fareye.main;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Fareye.utilities.excelfiles;

public class ChromeIntialise extends BaseClass{


	@BeforeTest
	public static void ChromeInit() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", excelfiles.Chromedriver);
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("start-maximized");
		// DesiredCapabilities cap= new DesiredCapabilities();
		// cap.setCapability(ChromeOptions.CAPABILITY,option);

		BaseClass bc = new BaseClass();
		Properties prop = bc.InitProperties();
		driver = new ChromeDriver(option);
		

		String url = prop.getProperty("url");
		System.out.println(url);
		
	
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.MINUTES);
	
		driver.get(url);
	

	}
}

