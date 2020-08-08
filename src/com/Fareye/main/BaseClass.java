package com.Fareye.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Fareye.utilities.excelfiles;




public class BaseClass {
	
public static WebDriver driver;


@BeforeSuite
public static Properties  InitProperties() throws IOException
{
Properties prop= new Properties();	
FileInputStream fis= new FileInputStream(excelfiles.configfilepath);

prop.load(fis);


return prop;


}

	
}





