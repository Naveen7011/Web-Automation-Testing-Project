package stepDefinition;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import helperCommon.Base;
import io.cucumber.java.Before;
public class Hooks extends Base
{

	@Before
	public void setup()
	{
		String browsername = prop.getProperty("browser");
		if (browsername.equals("Chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			option.addArguments("--incognito");
			driver = new ChromeDriver(option);
		}
		else if (browsername.equals("Firefox")) 
		{
			FirefoxOptions option = new FirefoxOptions();
			option.addArguments("--remote-allow-origins=*");
			option.addArguments("--incognito");
			driver = new FirefoxDriver(option);
		}

		else if (browsername.equals("Edge"))
		{
			EdgeOptions option = new EdgeOptions();
			option.addArguments("--remote-allow-origins=*");
			option.addArguments("--incognito");
			driver = new EdgeDriver(option);
		}

		driver.get(prop.getProperty("url"));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		
		// driver.quit();

	}

	
	/*
	 * @After public void tearDown(Scenario s) { if (s.isFailed()) { screenshot();
	 * 
	 * } driver.quit();
	 * 
	 * }
	 * 
	 */}
