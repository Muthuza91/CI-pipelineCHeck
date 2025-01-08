package stepDefinitions;




import org.junit.Assert;
import org.openqa.selenium.By;
import org.basePackage.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.pomPackage.contactUs;
import org.pomPackage.HomePage;
import org.pomPackage.PomClass;
import org.pomPackage.prdouctsPage;
import org.pomPackage.SignupPage;

public class RegisterUser extends baseClass {
	PomClass pom = new PomClass();
	
	HomePage home = new HomePage();
	
	SignupPage sign = new SignupPage();
	
	contactUs contact = new contactUs();
	
	prdouctsPage pro = new prdouctsPage();
	
	
	
	@Given("user enter into the url")
	public void user_enter_into_the_url() throws InterruptedException {
		geturl("https://automationexercise.com/");
		sleep(2000);
	}

	@Given("user verify that home page is visible successfully")
	public void user_verify_that_home_page_is_visible_successfully() {
	    home.verifyhome();
	
	}

	@Then("Click on Signup or Login button")
	public void user_click_on_signup_button() {
		home.sign();
	    
	}

	@Then("Verify New User Signup! is visible")
	public void verify_new_user_signup_is_visible() {
		sign.verifyuser();
	    
	}

	@Then("enter name and email address")
	public void enter_name_and_email_address_and_click_signup_button() {
	    sign.userdetails("muthu","muthuwgn22@gmail.com");
	    
	}
	
	@Then("click Signup button")
	public void click_signup_button() {
	    sign.clicksignup();
	}

	@Then("user verify that ENTER ACCOUNT INFORMATION is visible")
	public void user_verify_that_enter_account_information_is_visible() throws InterruptedException {
	    sleep(2000);
	    sign.verifyaccinformation();
	    
	}

	@Then("fill enter account information and Select all checkbox")
	public void fill_enter_account_information_and_select_all_checkbox() {
	    sign.accountinformation();
	    
	}

	@Then("fill address information")
	public void fill_address_information() {
	    sign.addressinfromation();
	    
	}

	@Then("click create account button")
	public void click_create_account_button() {
		sign.clickcreate();
	    
	}

	@Then("verify that ACCOUNT CREATED! is visible")
	public void verify_that_account_created_is_visible() {
		sign.verifyacccreate();
	    
	}

	@Then("click continue button")
	public void click_continue_button() {
		 sign.clickcontinue();
	    
	}

	@Then("Verify that Logged in as username is visible")
	public void verify_that_logged_in_as_username_is_visible() {
		home.verifylogin();
	    
	}

	@Then("Click Delete Account button")
	public void click_delete_account_button() throws InterruptedException {
		sleep(2000);
		home.delete();
	    
	}

	@Then("Verify that ACCOUNT DELETED! is visible")
	public void verify_that_account_deleted_is_visible() {
		
		
	}

	@Then("click Continue button afterdelete")
	public void click_continue_button_afterdelete() {
		pom.clickafterdelete();
		
	}
	
	
	
//case2
	
	
	@Then("verify Login to your account is visible")
	public void verify_login_to_your_account_is_visible() {
	    sign.verifyloginform();
	    
	}

	@Then("Enter correct email address and password")
	public void enter_correct_email_address_and_password() {
	    sign.logindetails("muthuwgn123@gmail.com", "muthu@123");
	    
	}

	@Then("Click login button")
	public void click_login_button() {
	    sign.clicklogin();
	    
	}
	
	
	
	
//case3
	
	@Then("Enter incorrect email address and password")
	public void enter_incorrect_email_address_and_password() {
		sign.logindetails("muthuwgn@gmail.com", "muthu@1234");
	
	}

	@Then("Verify error Your email or password is incorrect! is visible")
	public void verify_error_your_email_or_password_is_incorrect_is_visible() throws InterruptedException {
		sleep(2000);
		sign.incorrectsignin();
		
	}

	
	
//case4
	
	@Then("Click Logout button")
	public void click_logout_button() {
		home.logout();

	}

	@Then("Verify that user is navigated to login page")
	public void verify_that_user_is_navigated_to_login_page() {
		sign.verifyloginform();
	    
	}
	
	
	
//case5
	
	@Then("Enter name and already registered email address")
	public void enter_name_and_already_registered_email_address() {
	    sign.userdetails("Muthazhagan","muthuwgn1@gmail.com");
		
	}

	@Then("Verify error Email Address already exist! is visible")
	public void verify_error_email_address_already_exist_is_visible() {
		sign.verifyemailalreadyexist();
		
	}
	
	
	
//case6
	
	@Then("Click on Contact Us button")
	public void click_on_contact_us_button() throws InterruptedException {
	    home.contactbutton();	    
	}

	@Then("Verify GET IN TOUCH is visible")
	public void verify_get_in_touch_is_visible() {
	    contact.verify();
	    
	}

	@Then("Enter name, email, subject and message")
	public void enter_name_email_subject_and_message() throws InterruptedException {
	    contact.contactform("muthu", "muthuwgn1@gmail.com", "this is subject", "this is message");
	    sleep(2000);
	    System.out.println("success");
	}

			
	@Then("Upload file")
	public void upload_file() throws InterruptedException {
		sleep(2000);
		contact.upload();
		sleep(2000);
	    
	}

	@Then("Click Submit button")
	public void click_submit_button() {
		contact.clicksubmit();
	    	
	}

	@Then("Click OK button")
	public void click_ok_button() {
		driver.switchTo().alert().accept();
	   // contact.clickok();
	    
	}

	@Then("Verify success message Success! Your details have been submitted successfully. is visible")
	public void verify_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
	    contact.verifysubmit();
	    
	}

	@Then("Click Home button and verify that landed to home page successfully")
	public void click_home_button_and_verify_that_landed_to_home_page_successfully() {
	    contact.clickhome();
	    home.verifyhome();
	    
	}
	
	
	
//case7
	
	
	@Then("Click on Test Cases button")
	public void click_on_test_cases_button() {
	    home.testcase();
		
	}

	@Then("Verify user is navigated to test cases page successfully")
	public void verify_user_is_navigated_to_test_cases_page_successfully() {
	    pom.verifytest();
		
	}
	
	
//case8
	
	
	@Then("Click on Products button")
	public void click_on_products_button() throws InterruptedException {
	    home.clickproduct();
	    sleep(2000);
	    
	}

	@Then("Verify user is navigated to ALL PRODUCTS page successfully")
	public void verify_user_is_navigated_to_all_products_page_successfully() {
	    pro.verifyallproducts();
	    
	}

	@Then("The products list is visible")
	public void the_products_list_is_visible() {
	    pro.productvisible();
	    
	}

	@Then("Click on View Product of first product and User is landed to product detail page")
	public void click_on_view_product_of_first_product() {
	    pro.firstproductview();
	    
	}

	@Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
	public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
	    pro.verifyproductdetail();
	    
	}

	
	
//case9
	
	@Then("Enter product name in search input and click search button")
	public void enter_product_name_in_search_input_and_click_search_button() throws InterruptedException {
	    pro.search("jeans");
	    click("//button[@id=\"submit_search\"]");
	    sleep(2000);
	
	}

	@Then("Verify SEARCHED PRODUCTS is visible")
	public void verify_searched_products_is_visible() {
	    pro.searchedpro();
		
	}

	
	
	@Then("Verify all the products related to search are visible")
	public void verify_all_the_products_related_to_search_are_visible() {
		display("//div[@class=\"features_items\"]");
	    
	}
	
//case10
	
	@Then("Scroll down to footer")
	public void scroll_down_to_footer() {
		scroll();
	    
	}

	@Then("Verify text SUBSCRIPTION")
	public void verify_text_subscription() {
		home.subscription();
	    
	}

	@Then("Enter email address in input and click arrow button")
	public void enter_email_address_in_input_and_click_arrow_button() {
	    home.subdetails("muthuwgn1@gmail.com");
	    
	}

	@Then("Verify success message You have been successfully subscribed! is visible")
	public void verify_success_message_you_have_been_successfully_subscribed_is_visible() {
	    home.subscribesuccess();
	    
	}
	
	
	
//case11

	@Then("Click Cart button")
	public void click_cart_button() {
	    home.clickcart();
	    
	}
	
	
//case12
	
	@Then("Hover over first product and click Add to cart")
	public void hover_over_first_product_and_click_add_to_cart() throws InterruptedException {
	    hover("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/p");
	    sleep(2000);
	    pro.addtocart("(//a[@data-product-id=\"1\"])[2]");
	    sleep(5000);
	}

	@Then("Click Continue Shopping button")
	public void click_continue_shopping_button() throws InterruptedException {
	    click("//button[text()='Continue Shopping']");
	    sleep(3000);
	}

	@Then("Hover over second product and click Add to cart")
	public void hover_over_second_product_and_click_add_to_cart() throws InterruptedException {
	    hover("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[1]/p");
	    sleep(2000);
	    pro.addtocart("(//a[@data-product-id=\"2\"])[2]");
	    sleep(2000);
	}

	@Then("Click View Cart button")
	public void click_view_cart_button() {
	    click("//u[text()='View Cart']");
	    
	}

	@Then("Verify both products are added to Cart")
	public void verify_both_products_are_added_to_cart() {
	    display("//a[text()='Blue Top']");
	    display("//a[text()='Men Tshirt']");
	    
	}

	@Then("Verify their prices quantity and total price")
	public void verify_their_prices_quantity_and_total_price() {
	    display("(//td[@class='cart_price'])[1]");
	    display("(//td[@class='cart_price'])[2]");
	    display("(//td[@class='cart_quantity'])[1]");
	    display("(//td[@class='cart_quantity'])[2]");
	    
	}
	
	
//case13
	
	
	@Then("Click View Product for any product on home page")
	public void click_view_product_for_any_product_on_home_page() {
	    click("(//a[text()='View Product'])[7]");
	    
	}

	@Then("Verify product detail is opened")
	public void verify_product_detail_is_opened() {
	    display("//div[@class=\"product-information\"]");
	    
	}

	@Then("Increase quantity to four")
	public void increase_quantity_to_four() {
	    hover("//input[@name=\"quantity\"]");
	    pro.increrasequantity("5");
	    
	}

	@Then("Click Add to cart button")
	public void click_add_to_cart_button() throws InterruptedException {
	    click("//button[@type='button']");
	    sleep(2000);
	    
	}

	@Then("Verify that product is displayed in cart page with exact quantity")
	public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity() throws InterruptedException {
	    display("//a[text()='Madame Top For Women']");
	    display("//button[text()='5']");
	}

	
	
//case14
	
	@Then("Add products to cart")
	public void add_products_to_cart() throws InterruptedException {
		sleep(2000);
		hover("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/p");
	    sleep(2000);
	    pro.addtocart("(//a[@data-product-id=\"1\"])[2]");
	    sleep(2000);
	    click("//button[text()='Continue Shopping']");
	    
	}

	@Then("Verify that cart page is displayed")
	public void verify_that_cart_page_is_displayed() {
	    display("//li[text()='Shopping Cart']");
	    
	}

	@Then("Click Proceed To Checkout")
	public void click_proceed_to_checkout() {
	    click("//a[text()='Proceed To Checkout']");
	    
	}

	@Then("Click Register or Login button")
	public void click_register_login_button() {
	    click("//u[text()='Register / Login']");
	    
	}

	@Then("Fill all details in Signup and create account")
	public void fill_all_details_in_signup_and_create_account() throws InterruptedException {
		sign.userdetails("muthu","muthuwgn3@gmail.com");
		sign.clicksignup();
		sleep(2000);
		sign.accountinformation();
		sign.addressinfromation();
		sign.clickcreate();
		sleep(2000);
		
	}

	@Then("Verify ACCOUNT CREATED! and click Continue button")
	public void verify_account_created_and_click_continue_button() {
		sign.verifyacccreate();
		sign.clickcontinue();
	    
	}

	@Then("Verify Logged in as username at top")
	public void verify_logged_in_as_username_at_top() {
		home.verifylogin();
	    
	}

	@Then("Click Proceed To Checkout button")
	public void click_proceed_to_checkout_button() {
		click("//a[text()='Proceed To Checkout']");
	    
	}

	@Then("Verify Address Details and Review Your Order")
	public void verify_address_details_and_review_your_order() {
	    display("//h2[text()='Address Details']");
	    display("//h2[text()='Review Your Order']");
	    
	}

	@Then("Enter description in comment text area and click Place Order")
	public void enter_description_in_comment_text_area_and_click_place_order() throws InterruptedException {
	    send("//textarea[@name='message']", "good");
	    click("//a[text()='Place Order']");
	    sleep(2000);
 
	}

	@Then("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
	public void enter_payment_details_name_on_card_card_number_cvc_expiration_date() {
	    send("//input[@name=\"name_on_card\"]","hdfc");
	    send("//input[@name=\"card_number\"]","298390948");
	    send("//input[@name=\"cvc\"]","123");
	    send("//input[@name=\"expiry_month\"]","09");
	    send("//input[@name=\"expiry_year\"]","2029");
	    
	}

	@Then("Click Pay and Confirm Order button")
	public void click_pay_and_confirm_order_button() {
		click("//button[@data-qa=\"pay-button\"]");
	    
	}

	@Then("Verify success message Your order has been placed successfully!")
	public void verify_success_message_your_order_has_been_placed_successfully() {
		display("//p[text()='Congratulations! Your order has been confirmed!']");
	}
	
	
//case16
	
	@Then("Fill email, password and click Login button")
	public void fill_email_password_and_click_login_button() {
		sign.logindetails("muthuwgn2@gmail.com", "muthu@1234");
		sign.clicklogin();
		
	}
	
//case17
	
	@Then("Click X button corresponding to particular product")
	public void click_x_button_corresponding_to_particular_product() {
		click("//a[@data-product-id=\"1\"]");
	    
	}
	
	
//doubt
	
	@Then("Verify that product is removed from the cart")
	public void verify_that_product_is_removed_from_the_cart() throws InterruptedException {
		sleep(2000);
		Assert.assertTrue(driver.findElements(By.xpath("//a[text()='Blue Top']")).isEmpty());
		
		
//	    display("//b[text()='Cart is empty!']");
	    
	}

	
//case18
	
	@Given("Verify that categories are visible on left side bar")
	public void verify_that_categories_are_visible_on_left_side_bar() {
	    display("//h2[text()='Category']");
	    
	}

	@Then("Click on Women category")
	public void click_on_women_category() throws InterruptedException {
	    click("(//a[@data-parent=\"#accordian\"])[1]");
	    sleep(2000);
	}

	@Then("Click on any category link under Women category, for example: Dress")
	public void click_on_any_category_link_under_women_category_for_example_dress() throws InterruptedException {
	    click("(//a[text()='Dress '])[1]");
	    sleep(2000);
	}

	@Then("Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
	public void verify_that_category_page_is_displayed_and_confirm_text_women_tops_products() throws InterruptedException {
		sleep(2000);
		display("//li[text()='Women > Dress']");
	    display("//h2[contains(text(),'Women - ') and (text()=' Products')]");
	    
	}

	@Then("On left side bar, click on any sub-category link of Men category")
	public void on_left_side_bar_click_on_any_sub_category_link_of_men_category() throws InterruptedException {
	    click("(//a[@data-parent=\"#accordian\"])[2]");
	    sleep(2000);
	    click("//a[text()='Tshirts ']");
	    
	}

	@Then("Verify that user is navigated to that category page")
	public void verify_that_user_is_navigated_to_that_category_page() throws InterruptedException {
		sleep(2000);
		display("//li[text()='Men > Tshirts']");	    
	    
	}
	
//case19
	
	@Then("Verify that Brands are visible on left side bar")
	public void verify_that_brands_are_visible_on_left_side_bar() {
	    display("//h2[text()='Brands']");
	    
	}

	@Then("Click on any brand name")
	public void click_on_any_brand_name() {
	    click("//a[text()='Babyhug']");
	    
	}

	@Then("Verify that user is navigated to brand page and brand products are displayed")
	public void verify_that_user_is_navigated_to_brand_page_and_brand_products_are_displayed() {
		display("//li[text()='Babyhug']");
		display("//h2[(text()='Brand - ') and (text()=' Products')]");
	    
	}

	@Then("On left side bar, click on any other brand link")
	public void on_left_side_bar_click_on_any_other_brand_link() {
	    click("//a[text()='Allen Solly Junior']");
	    
	}

	@Then("Verify that user is navigated to that brand page and can see products")
	public void verify_that_user_is_navigated_to_that_brand_page_and_can_see_products() {
	    display("//li[text()='Allen Solly Junior']");
	    display("//h2[text()='Brand - Allen Solly Junior Products']");
	}

//case20
	
	@Then("Add those products to cart")
	public void add_those_products_to_cart() throws InterruptedException {
	    click("(//a[@data-product-id=\"33\"])[1]");
	    sleep(2000);
	    click("//button[text()='Continue Shopping']");
	    click("(//a[@data-product-id=\"35\"])[1]");
	    sleep(2000);
	    click("//button[text()='Continue Shopping']");
	    click("(//a[@data-product-id=\"37\"])[1]");
	    sleep(2000);
	    click("//button[text()='Continue Shopping']");
	    
	    
	}

	@Then("verify that products are visible in cart")
	public void verify_that_products_are_visible_in_cart() {
	    display("//a[text()='Soft Stretch Jeans']");
	    display("//a[text()='Regular Fit Straight Jeans']");
	    display("//a[text()='Grunt Blue Slim Fit Jeans']");
	    
	}

	@Then("submit login details")
	public void submit_login_details() {
		sign.logindetails("muthuwgn1@gmail.com", "muthu@1234");
		sign.clicklogin();
	    
	}

	@Then("Again, go to Cart page")
	public void again_go_to_cart_page() {
		home.clickcart();
	    
	}

	@Then("Verify that those products are visible in cart after login as well")
	public void verify_that_those_products_are_visible_in_cart_after_login_as_well() {
		display("//a[text()='Soft Stretch Jeans']");
	    display("//a[text()='Regular Fit Straight Jeans']");
	    display("//a[text()='Grunt Blue Slim Fit Jeans']");
	    
	}
	
	
	@Then("Click Pay and Confirm Order button and Verify success message Your order has been placed successfully!")
	public void click_pay_and_confirm_order_button_and_verify_success_message_your_order_has_been_placed_successfully() {
		click("//button[@data-qa=\"pay-button\"]");
		display("//div[@id='success_message']");
		
	}
	
//case 21
	
	
	@Then("Click on View Product button")
	public void click_on_view_product_button() {
	    click("(//a[text()='View Product'])[1]");
		
	}
	
	@Then("Verify Write Your Review is visible")
	public void verify_write_your_review_is_visible() {
		display("//a[text()='Write Your Review']");
	    
	}

	@Then("Enter name, email, review and Click Submit button")
	public void enter_name_email_and_review() {
		pro.review("muthu", "muthuwgn1@gmail.com", "THe product is good");
	    
	}
	

	@Then("Verify success message Thank you for your review")
	public void verify_success_message_thank_you_for_your_review() {
		display("//span[text()='Thank you for your review.']");
	    
	}
	
	
//case22
	
	@Then("Scroll to bottom of page")
	public void scroll_to_bottom_of_page() {
	    scroll();
	    
	}

	@Then("Verify RECOMMENDED ITEMS are visible")
	public void verify_recommended_items_are_visible() {
	    display("//h2[text()='recommended items']");
	    
	}

	@Then("Click on Add To Cart on Recommended product")
	public void click_on_add_to_cart_on_recommended_product() {
	    wait(10);
	    click("//*[@id=\"recommended-item-carousel\"]/div/div[2]/div[2]/div/div/div/a");
	    
	}

	@Then("Verify that product is displayed in cart page")
	public void verify_that_product_is_displayed_in_cart_page() throws InterruptedException {
		sleep(2000);
	    display("//a[text()='Winter Top']");
	    
	}
	
//case23
	
	@Then("Verify that the delivery address is same address filled at the time registration of account")
	public void verify_that_the_delivery_address_is_same_address_filled_at_the_time_registration_of_account() throws InterruptedException {
		sleep(2000);
		String a[]= {"muthazhagan","wgn","73,chinnamman koil street","kalavakkam","tamilnadu","chennai","603110"};
		
		for(int i=0; i<a.length; i++) {
			
			boolean contain = driver.findElement(By.xpath("//ul[@id=\"address_delivery\"]")).getText().contains(a[i]);
			if (contain){
				System.out.println(contain);
			}
			else {
				System.out.println(a[i]+" is not matched in address. so result is "+contain);
				quit();
			}
		}
		
	}

	@Then("Verify that the billing address is same address filled at the time registration of account")
	public void verify_that_the_billing_address_is_same_address_filled_at_the_time_registration_of_account() {
		
		String a[]= {"Muthazhagan","Wgn","73,chinnamman koil street","kalavakkam","tamilnadu","chennai","603110"};
		
		for(int i=0; i<a.length; i++) {
			
			boolean contain = driver.findElement(By.xpath("//ul[@id=\"address_invoice\"]")).getText().contains(a[i]);
			if (contain){
				System.out.println(contain);
			}
			else {
				System.out.println(a[i]+" is not matched in address. so result is "+contain);
				quit();
			}
		}

	}
	

//case24
	
	
	@Then("Click Download Invoice button and verify invoice is downloaded successfully and Click Continue button")
	public void click_download_invoice_button_and_verify_invoice_is_downloaded_successfully_and_click_continue_button() {
	    click("//a[text()='Download Invoice']");
	    click("//a[text()='Continue']");
		
	}
	
	
//case25
	
	@Then("Click on arrow at bottom right side to move upward")
	public void click_on_arrow_at_bottom_right_side_to_move_upward() {
	    click("//a[@id=\"scrollUp\"]");
		
	}

	@Then("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
	public void verify_that_page_is_scrolled_up_and_full_fledged_practice_website_for_automation_engineers_text_is_visible_on_screen() {
	    display("(//h2[text()='Full-Fledged practice website for Automation Engineers'])[1]");
		
	}
	
	
//case26 
	
	@Then("Scroll up page to top")
	public void scroll_up_page_to_top() {
	    scrollup();
		
	}



	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
