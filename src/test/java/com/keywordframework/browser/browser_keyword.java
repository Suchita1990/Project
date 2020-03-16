package com.keywordframework.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/*
 * Once the dependency is sorted in your Maven/Gradle project,
 * add the below import in your Java file
 * import io.github.bonigarcia.wdm.WebDriverManager;
 */
import io.github.bonigarcia.wdm.WebDriverManager;

public class browser_keyword 
{
	private static RemoteWebDriver driver;
    public void openBrowser(String browserName)
    {
       switch (browserName) 
       {
	case "Chrome":
		/*Using WebDriverManager, we can automatically download the driver’s binary files
		 *(.exe files) for Web Automation*/
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  break;	 
	case "Firefox":
		  WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
		  break;
	case "InternetExplorer":
		  WebDriverManager.iedriver().setup();
		  driver=new InternetExplorerDriver();
		  break;
	case "Safari":
		
	case "Opera":
		  WebDriverManager.operadriver().setup();
		  driver=new OperaDriver();
		  break;
	default:
		 System.out.println("Invalid Browser Name");
		break;
	}
	}
}
