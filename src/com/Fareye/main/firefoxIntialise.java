package com.Fareye.main;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Fareye.utilities.excelfiles;

public class firefoxIntialise extends BaseClass {


	@BeforeTest()
	public static void firefoxinit() throws IOException {
		System.setProperty("webdriver.gecko.driver", excelfiles.geckodriver);
	 
		FirefoxOptions firefoxoption= new FirefoxOptions();
		firefoxoption.addArguments("-private-window");
		//firefoxoption.addArguments("--headless");
		firefoxoption.addArguments("--window-size=19200,10980");
		driver = new FirefoxDriver(firefoxoption);

		BaseClass bc = new BaseClass();
		Properties prop = bc.InitProperties();

		String url = prop.getProperty("url");

		driver.get(url);
	}
	}
