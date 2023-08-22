package e_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void ajioTest()
  {
	  Reporter.log("opening ajio", true);
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.ajio.com/");
	  driver.quit();
  }
}
