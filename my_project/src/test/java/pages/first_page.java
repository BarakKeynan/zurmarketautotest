package pages;


import java.util.ArrayList;
import java.util.Set;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class first_page {

	WebDriver driver;
	pomModelzurmarket pom;

  @BeforeClass
  public void beforeMethod() {
	
	  driver=new ChromeDriver();

	  WebDriverManager.chromedriver().setup();
	  driver.get("https://www.zurmarket.co.il/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.manage().window().maximize();
	  pom= PageFactory.initElements(driver, pomModelzurmarket.class);
  }
}

  /*

  @AfterMethod
  public void afterMethod() {
  }

@Test
	
	public void test911() throws Exception{
	
	pomModelzurmarket.whatsup_chatbutton.click();
	
	try {
		    String a = pomModelzurmarket.whatsup_chatbutton.getText();
		    System.out.println(a);	
			if (a.contains(" ")) {
					System.out.println("test 911 pass");	
					} else {
						System.err.println("test 911 fail");
					}
					
					} catch (Exception e) {
						
						    System.out.println("test 9 exception");	
					}	

}
/*/
