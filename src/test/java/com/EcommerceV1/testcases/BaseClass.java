package com.EcommerceV1.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.EcommerceV1.utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig= new ReadConfig();
	public String baseURL=readconfig.getUrl();
	public String username=readconfig.username();
	public String password=readconfig.password();
	public static Logger logger;
public static WebDriver driver;
@Parameters("browser")
@BeforeClass
public void setup(String sr) {
	logger=Logger.getLogger("ecommecre");
	PropertyConfigurator.configure("Log4j.properties");
	logger.info("Chrome is launched");
	if(sr.equals("Chrome")) {
		System.setProperty("WebDriver.chrome.driver",readconfig.chromepath());
		driver=new ChromeDriver();
	}else {logger.info("msedge is launched");
		System.setProperty("WebDriver.Edge.driver",readconfig.msedgepath());
		driver=new EdgeDriver();
		logger.info("url is entered");
	}driver.get(baseURL);
	
}

	@AfterClass
	public void teardown() {
		logger.info("test gonna endup");
		driver.quit();
	}
	public static void CaptureScreenShot(WebDriver driver,String tname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File SOURCE=ts.getScreenshotAs(OutputType.FILE);
		File TARGET =new File("./screenshot"+tname+ ".png");
		FileUtils.copyFile(SOURCE, TARGET);
		System.out.println("Screenshot taken");
			
	
	}
	public static String RandomEmail() {
		
		String GeneratedEmail=RandomStringUtils.randomAlphabetic(15);
		return GeneratedEmail;
		
			
	}
}
