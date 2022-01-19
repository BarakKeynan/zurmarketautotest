
		package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class pomModelzurmarket {

		private static final String input = null;

		@FindBy (how = How.NAME, using = "q")
		static WebElement user;

		
		
		@FindBy (how = How.ID, using = "INDlangsCombo")
		//WebElement testDropDown = driver.findElement(By.id("INDlangsCombo"));  

		static WebElement italiano_sel;
	
		
		//WebElement testDropDown = driver.findElement(By.id("INDlangsCombo"));  

		
		
	
		
		//*[@id="item_id_3609776"]/a/svg[2]
		
		@FindBy (how = How.XPATH, using = "//*[@id=\"item_id_3629542\"]/a")
		static WebElement  favorite_me;
		
		@FindBy (how = How.XPATH, using = "//*[@id=\"item_id_3629542\"]/a/svg[2]")
		static WebElement  favorited_title;
		@FindBy (how = How.XPATH, using = "//*[@id=\"main\"]/div/div[1]/div[2]/div/div/div[2]/button\n")
		static WebElement  conv_button;
		@FindBy (how = How.XPATH, using = "//*[@id=\"main\"]/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/input")
		static WebElement  conv_searchfield;
		
		@FindBy (how = How.ID, using = "INDmenu-btn")
		static WebElement  negishut_languages;
		
		
		@FindBy (how = How.XPATH, using = "//*[@id=\"INDexpandMenu\"]")
		static WebElement  negishut_mode;
		
		//*[@id="INDa11yMode"]/svg/g/path[2]
		//*[@id="main"]/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/input
		
		//*[@id="main"]/div/div[1]/div[2]/div/div/div[2]/button
		
		//*[@id="Shape"]
		
		
		@FindBy (how = How.XPATH, using = "//*[@id=\"search_msg_facebook_and_sort\"]/div[1]/span/b[2]")
		static WebElement  res_list;	
		@FindBy (how = How.XPATH, using = "//*[@id=\"q\"]")
		static WebElement  SEARCH_FIELD;		
		////*[@id="main"]/div/div[1]/div[2]/div/div/div[2]/button/i

		@FindBy (how = How.XPATH, using = "//*[@id=\"searchBtnHook\"]/input")
		static WebElement search_button1;	
		
		@FindBy (how = How.XPATH, using = "//*[@id=\"item_id_3629542\"]/div/div[1]/div/a[1]/div/img")
		static WebElement searchResults1;
		
		@FindBy (how = How.XPATH, using = "//*[@id=\"item_id_3629542\"]/div/div[2]/div/div/div[3]/a")
		static WebElement choose;
		@FindBy (how = How.XPATH, using = "//*[@id=\"header_cart\"]/div[3]/div[1]/div[2]/span[2]")
		static WebElement price_calc;
		
		@FindBy (how = How.XPATH, using = "//*[@id=\"item_id_3629542\"]/div/div[2]/div/div/div[3]/a")
		static WebElement order_result;
		 ;
	
		 @FindBy (how = How.XPATH, using ="//*[@id=\"main\"]/div/div[1]/div[2]/div[2]/div/div[2]/button")
			static WebElement SICHA_HADASHA;
			 ;
		
			 
			 //*[@id="main"]/div/div[1]/div[2]/div[2]/div/div[2]/button
		 
			@FindBy (how = How.XPATH, using = "//*[@id=\"item_id_3629542\"]/div/div[2]/div/div/div[2]/input")
			static WebElement amount_key;
			@FindBy (how = How.XPATH, using ="//*[@id=\"item_id_3629542\"]/div/div[2]/div/div/div[2]/input") 
			static WebElement amount_order;
		
			@FindBy (how = How.ID, using ="fls-input-email") 
			static WebElement NLemail_subscribe;
			
			@FindBy (how = How.XPATH, using ="//*[@id=\"main\"]/div/div[1]/div[2]/div/div/div[2]") 
			static WebElement newconv_click;
			
			@FindBy (how = How.XPATH, using ="/html/body/flashy-popup//div/div/div/div[2]/div/form/button") 			
			static WebElement Have_fun;
			
			@FindBy (how = How.XPATH, using ="//*[@id=\"glassix-widget-launcher-closed\"]/div/img")
			static WebElement start_chat;
			
			@FindBy (how = How.XPATH, using ="//*[@id=\"item_id_3629542\"]/div/div[2]/div/div/div[3]")
			static WebElement amount_counter;
			@FindBy (how = How.XPATH, using ="//*[@id=\"header_cart\"]/div[3]/div[1]/div[2]/span[2]")
			static WebElement result_sum;
			////*[@id="item_id_3629542"]/div/div[3]/div/a/p/text()
			
			@FindBy (how = How.CLASS_NAME, using ="fls-close fls-top-left")
			static WebElement close_popup1;
		
			@FindBy (how = How.XPATH, using ="//*[@id=\"main\"]/div/div[1]/footer/div[1]/div/div/div[3]/button/div[1]/i")
			static WebElement Email_button;
			
			
		
		@FindBy (how = How.ID, using ="ticket_customer_name")
		static WebElement customer_namereg;
		

		@FindBy (how = How.ID, using ="ticket_customer_phone")
		static WebElement customer_phonereg;
	
		
		@FindBy (how = How.ID, using ="ticket_customer_email")
		static WebElement customer_mailreg;
		
		
		@FindBy (how = How.XPATH, using ="//*[@id=\"blackwhite_label_2\"]")
		static WebElement gui_functest;
		@FindBy (how = How.ID, using ="blackwhite_label_2")
		static WebElement gui_functestres;
		
		@FindBy (how = How.XPATH, using ="//*[@id=\"monochrome_label_2\"]")
		static WebElement gui_fuctest2;
		
		@FindBy (how = How.XPATH, using ="//*[@id=\"whiteblack_label_2\"]")
		static WebElement gui_fuctest3;
		//ticket_customer_phone
			
			////*[@id="main"]
			
			//
			
			
			//
	
		 
		 
		 
		/*	amount_button
	 * 
	 * 
	 * 
	 * 
	 * 
	 
	 */
	@FindBy (how = How.XPATH, using = "//*[@id=\fls-input-email\"]")
	static WebElement  email_input;	
	
	
	
	
	
	
	
	@FindBy (how = How.ID, using = "password")
	static WebElement password1;	

	@FindBy (how = How.XPATH, using = "//*[@id=\"login-overlay\"]/div/form/button")
	static WebElement log_in_button;	
	@FindBy (how = How.XPATH, using = "//*[@id=\"main_block\"]/div[2]/div")
	static WebElement 	whatsupchat_resulet
;
	
	
	@FindBy (how = How.ID, using = "reg-email-filled")
	static WebElement email_address;	
	@FindBy (how = How.ID, using = "reg-password-filled")
	static WebElement password;	
	@FindBy (how = How.ID, using ="reg-email-filled-repeat")
	static WebElement email_repeat;	
	@FindBy (how = How.XPATH, using ="//*[@id=\"registration-form\"]/div[7]/label")
	static WebElement age_checkbox;	
	@FindBy (how = How.XPATH, using ="//*[@id=\"registration-form\"]/div[8]/label")
	static WebElement terms_checkbox;	
	@FindBy (how = How.ID, using ="submit-registration")
	static WebElement submit_registration;
	
	@FindBy (how = How.XPATH, using ="/html/body/div[4]")
	static WebElement hCaptcha_challenge;
	
	@FindBy (how = How.XPATH, using ="//*[@id=\"ember555\"]/div/div/div[1]/div/div[1]")
	static WebElement Animal_and;

	
	@FindBy (how = How.XPATH, using ="/html/body/flashy-popup//div/div/div/div[1]/div/svg")
	static WebElement Close_pop;
	
	@FindBy (how = How.XPATH, using ="//*[@id=\"footer_group2\"]/ul/li[4]/a")
	static WebElement whatsup_chatbutton;
	@FindBy (how = How.XPATH, using ="//*[@id=\"action-button\"]")
	static WebElement whatsup_res;
	
	//*[@id="action-button"]
	//*[@id="footer_group2"]/ul/li[4]/a
	
	@FindBy (how = How.CLASS_NAME, using ="_2y_4")
	static WebElement whatsup_textclass;
	
	@FindBy (how = How.XPATH, using ="//*[@id=\"footer_group2\"]/ul/li[1]/a")
	static WebElement massenger_chatbutton;
	
	
	@FindBy (how = How.XPATH, using ="//*[@id=\"footer_group2\"]/ul/li[3]/a")
	static WebElement youtube_con;
	@FindBy (how = How.XPATH, using ="//*[@id=\"footer_group2\"]/ul/li[2]/a")
	static WebElement insta_button;
	
	
	
	
	//*[@id="footer_group2"]/ul/li[3]/a
	
	//*[@id="footer_group2"]/ul/li[3]/a
	
	
	//*[@id="main"]/div/div[1]/footer/div[1]/div/div/div[1]/a
	//contact_btn
	
	//*
	////*[@id="react-app"]/div/div/div/div/div/form/div/button
	@FindBy (how = How.CLASS_NAME, using ="he")
	static WebElement negishut_safot;
	@FindBy (how = How.XPATH, using ="//*[@id=\"main\"]/div/div[1]/div[2]/div/div/div[2]/button")
	static WebElement athalat_sicha;
	///*[@id="registration-form"]/div[8]/label
	@FindBy (how = How.ID, using = "searchTxt")
	static WebElement search_fill;	
	@FindBy (how = How.CLASS_NAME, using = "fls-close fls-top-left")
	static WebElement close_popup888;
	@FindBy (how = How.ID, using = "Button1")
	static WebElement search_button;	
	@FindBy (how = How.XPATH, using = "//*[@id=\"serachResults\"]/option[1]")
	static WebElement serachResults1;
	@FindBy (how = How.ID, using = "serachResults")
	static WebElement serachResults;
	@FindBy (how = How.ID, using = "mesComvo")
	static WebElement unit;
	@FindBy (how = How.ID, using = "quantity")
	static WebElement amount;
	@FindBy(className = "calculator_deleteTxt")
	static List<WebElement> add_button;
	@FindBy(linkText = "äñø")
	static List<WebElement> remoov_button;
	@FindBy(className = "first")
	static List<WebElement> food_name;
	//ìçí ìáï
	@FindBy (how = How.XPATH, using = "//*[@id=\"serachResults\"]/option[1]")
	static WebElement white_bread;
	//ìçí æéúéí
	@FindBy (how = How.XPATH, using = "//*[@id=\"serachResults\"]/option[4]")
	static WebElement olive_bread;
	
	//÷ìåøéåú ùåøä øàùåðä
	@FindBy (how = How.XPATH, using = "//*[@id=\"foodsTable\"]/tbody/tr[2]/td[7]")
	static WebElement calor_line1;    
	//÷ìåøéåú ùåøä ùðéä
	@FindBy (how = How.XPATH, using = "//*[@id=\"foodsTable\"]/tbody/tr[3]/td[7]")
	static WebElement calor_line2;
	//÷ìåøéåú ñéëåí
	@FindBy (how = How.XPATH, using = "//*[@id=\"foodsSummery\"]/table/tbody/tr[3]/td[1]")
	static WebElement calor_sum;       //*[@id="foodsSummery"]/table/tbody/tr[3]/td[1]
	
	//ôçîéîåú ùåøä øàùåðä
	@FindBy (how = How.XPATH, using = "//*[@id=\"foodsTable\"]/tbody/tr[2]/td[8]")
	static WebElement carbo_line1;
	//ôçîéîåú ùåøä ùðéä
	@FindBy (how = How.XPATH, using = "//*[@id=\"foodsTable\"]/tbody/tr[3]/td[8]")
	static WebElement carbo_line2;
	//ôçîéîåú ñéëåí
	   
	


}

