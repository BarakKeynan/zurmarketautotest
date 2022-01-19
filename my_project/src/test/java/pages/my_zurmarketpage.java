package pages;

import java.util.ArrayList;
import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
//from selenium import webdriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.*;



public class my_zurmarketpage {

    WebDriver driver;
    pomModelzurmarket pom;

    @BeforeClass
    public void beforeMethod() {

	driver = new ChromeDriver();

	WebDriverManager.chromedriver().setup();
	driver.get("https://www.zurmarket.co.il/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	pom = PageFactory.initElements(driver, pomModelzurmarket.class);
	try {
	    Thread.sleep(2000);
	} catch (InterruptedException e) {	   
	    e.getMessage();
	}
    }
    
    

    @AfterMethod
    public void afterMethod() {
    }
    
    @BeforeTest
    public void beforeTest() {
	try {
	    Thread.sleep(2000);
	} catch (InterruptedException e) {	   
	    e.getMessage();
	}
	Robot bot;
	try {
	    bot = new Robot();
	    bot.mouseMove(500, 500);
	} catch (AWTException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	  
    }

    @Test

    public void test1() throws InterruptedException {
	

	pomModelzurmarket.SEARCH_FIELD.sendKeys("זרעי חציל");

	pomModelzurmarket.search_button1.click();
	Thread.sleep(2000);

	if (pomModelzurmarket.searchResults1.getText().equals("זרעי חציל")) {
	    System.out.println("test 1 pass");
	} else {
	    System.err.println("test 1 fail");

	    Thread.sleep(2000);
	}
	Boolean runall = true;
if (runall) {	
	pomModelzurmarket.amount_counter.click();
	//if (pomModelzurmarket.result_sum.getText().equals("₪9.00")) {
	//    System.out.println("test 2 pass");
	//} else {
	//    System.err.println("test 2 fail");
//
	//    Thread.sleep(2000);

	}
}
    

    @Test
    public void test2() throws InterruptedException {

	pomModelzurmarket.amount_counter.click();
	if (pomModelzurmarket.result_sum.getText().equals("₪8.00")) {
	    System.out.println("test 2 pass");
	} else {
	    System.err.println("test 2 fail");

	    Thread.sleep(2000);

	}
    }

    @Test
    public void test3() throws InterruptedException {
	pomModelzurmarket.favorite_me.click();
	try {
	    String o = pomModelzurmarket.favorite_me.getText();

	    System.out.println(o);
	    Thread.sleep(2000);
	    if (o.contains(" ")) {
		System.out.println("test 3 pass");
	    } else {
		System.err.println("test 3 fail");
	    }

	} catch (Exception e) {

	    System.out.println("test 3 exception");
	}
    }

    @Test
    public void test4() throws InterruptedException {
	pomModelzurmarket.SEARCH_FIELD.clear();
	pomModelzurmarket.SEARCH_FIELD.sendKeys("7y7y7y");
	pomModelzurmarket.search_button1.click();

	System.out.println("we are here");
	System.out.println(pomModelzurmarket.SEARCH_FIELD.getText());
	System.out.println(pomModelzurmarket.res_list.getText());

	if (pomModelzurmarket.res_list.getText().equals("לא מצאו תוצאות חיפוש")) {
	    System.out.println("test 4 pass");
	} else {
	    System.err.println("test 4 fail");
	}

    }

    @Test

    public void test5() throws Exception {
	pomModelzurmarket.start_chat.click();

	try {
	    if (pomModelzurmarket.start_chat.getText().equals(" ")) {
		System.out.println("test 5 pass");
	    } else {
		System.err.println("test 5 fail");
	    }
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.getMessage();
	}
    }

    @Test

    public void test6() throws Exception {

	pomModelzurmarket.customer_namereg.sendKeys("Barak");

    }

    @Test

    public void test7() throws Exception {

	pomModelzurmarket.customer_phonereg.sendKeys("0507777777");
	// driver.switchTo().alert().dismiss();

    }

    @Test

    public void test8() throws Exception {

	pomModelzurmarket.customer_mailreg.sendKeys("barak.autotech@gmail");

    }

    @Test

    public void test9() throws Exception {
	getWindowsHandle();

	pomModelzurmarket.whatsup_chatbutton.click();
	Thread.sleep(2000);

    }

    private void getWindowsHandle() {
	// TODO Auto-generated method stub

    }

    @Test

    public void test10() throws Exception {
	getWindowsHandle();
	pomModelzurmarket.massenger_chatbutton.click();
	Thread.sleep(2000);

    }

    @Test

    public void test11() throws Exception {
	getWindowsHandle();
	pomModelzurmarket.insta_button.click();
	Thread.sleep(2000);

    }

    // TODO Auto-generated method stub

    @Test

    public void test12() throws Exception {
	getWindowsHandle();

	pomModelzurmarket.youtube_con.click();
	Thread.sleep(2000);

    }

    @Test

    public void test13() throws InterruptedException {
	getWindowsHandle();
	
	System.out.println("test 13 click");
	pomModelzurmarket.negishut_languages.click();
	
	Thread.sleep(2000);

	if (pomModelzurmarket.negishut_mode.getText().equals(" ")) {
	    System.out.println("test 13 pass");

	} else {

	    System.err.println("test 13 fail");
	}

	Thread.sleep(2000);
    }

    @Test

    public void test14() throws Exception {
	System.out.println("test 14");
	pomModelzurmarket.negishut_languages.click();
	System.out.println("test 14 negishut clicked");
	// getWindowsHandle();
	// WebElement testDropDown = driver.findElement(By.id("INDlangsCombo"));
	// Select dropdown = new Select(testDropDown);
	Select dropdown = new Select(pomModelzurmarket.italiano_sel);
	dropdown.selectByVisibleText("Italiano");
	System.out.println("test 14 italiano selected");
	System.out.println("test 14 Waiting for M%$#@r pop up");
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	// WebElement closepopup = driver.findElement(By.id("svg"));
	// closepopup.click();
	Actions actions = new org.openqa.selenium.interactions.Actions(driver);

	// actions.moveByOffset(844,436).click().perform() ;
	actions.moveToElement(pomModelzurmarket.italiano_sel, -617, -258);
	System.out.println("test 14 Jumpedd by 500x500");

	// pomModelzurmarket.negishut_safot.clear();
	// System.out.println("test 14 negishut_safot cleared");

    }

    @Test
    public void test15() throws Exception {
	System.out.println("test 15");
	pomModelzurmarket.negishut_languages.click();
	System.out.println("test 15 negishut clicked");
	Select dropdown = new Select(pomModelzurmarket.italiano_sel);
	dropdown.selectByVisibleText("polski");
	System.out.println("test 15 polski selected");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test16() throws Exception {
	System.out.println("test 16");
	pomModelzurmarket.negishut_languages.click();
	System.out.println("test 16 negishut clicked");
	Select dropdown = new Select(pomModelzurmarket.italiano_sel);
	dropdown.selectByVisibleText("Magyar");
	System.out.println("test 16 Magyar selected");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test17() throws Exception {
	System.out.println("test 17");
	pomModelzurmarket.negishut_languages.click();
	System.out.println("test 17 negishut clicked");
	Select dropdown = new Select(pomModelzurmarket.italiano_sel);
	dropdown.selectByVisibleText("Deutsch");
	System.out.println("test 17 Deutsch selected");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test18() throws Exception {
	System.out.println("test 18");
	pomModelzurmarket.negishut_languages.click();
	System.out.println("test 18 negishut clicked");
	Select dropdown = new Select(pomModelzurmarket.italiano_sel);
	dropdown.selectByVisibleText("galego");
	System.out.println("test 18 Galego selected");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test19() throws Exception {
	System.out.println("test 19");
	pomModelzurmarket.negishut_languages.click();
	System.out.println("test 19 negishut clicked");
	Select dropdown = new Select(pomModelzurmarket.italiano_sel);
	dropdown.selectByVisibleText("svenska");
	System.out.println("test 19 Svenska selected");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test20() throws Exception {
	System.out.println("test 20");
	pomModelzurmarket.negishut_languages.click();

	pomModelzurmarket.gui_functest.click();

	if (pomModelzurmarket.gui_functest.getText().equals("שינוי רקע האתר לשחור ואת הגופנים לבהירים")) {
	    System.out.println("test 20 pass");

	} else {

	    System.err.println("test 20 fail");
	}

	Thread.sleep(2000);
    }

    @Test
    public void test21() throws Exception {
	System.out.println("test 21");
	pomModelzurmarket.negishut_languages.click();

	pomModelzurmarket.gui_fuctest2.click();
	if (pomModelzurmarket.gui_fuctest2.getText().equals("המירו לצבעים שחור ולבן")) {
	    System.out.println("test 21 pass");

	} else {

	    System.err.println("test 21 fail");
	}

	Thread.sleep(2000);
    }

    @Test
    public void test22() throws Exception {
	System.out.println("test 22");
	pomModelzurmarket.negishut_languages.click();

	pomModelzurmarket.gui_fuctest3.click();
	if (pomModelzurmarket.gui_fuctest3.getText().equals("שינוי רקע האתר ללבן ואת הגופנים לכהים")) {
	    System.out.println("test 22 pass");

	} else {

	    System.err.println("test 22 fail");
	}

	Thread.sleep(2000);

    }
}