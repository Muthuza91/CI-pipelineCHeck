Feature: Web application

	@case1
	Scenario: Register User
		
		Given user enter into the url
		Then user verify that home page is visible successfully
		Then Click on Signup or Login button
		Then Verify New User Signup! is visible
		Then enter name and email address
		Then click Signup button
		Then user verify that ENTER ACCOUNT INFORMATION is visible
		Then fill enter account information and Select all checkbox
		Then fill address information
		Then click create account button
		Then verify that ACCOUNT CREATED! is visible
		Then click continue button
		Then Verify that Logged in as username is visible
		Then Click Delete Account button
		Then Verify that ACCOUNT DELETED! is visible 
		And click Continue button afterdelete
		
	@case2	
	Scenario: Login User with correct email and password
		
		Given user enter into the url
		Then user verify that home page is visible successfully
		Then Click on Signup or Login button
		Then verify Login to your account is visible
	  Then Enter correct email address and password
	  Then Click login button
	  Then Verify that Logged in as username is visible
	  Then Click Delete Account button
	  Then Verify that ACCOUNT DELETED! is visible

	  
	@case3
	Scenario: Login User with incorrect email and password
	  	
	  Given user enter into the url
		Then user verify that home page is visible successfully
		Then Click on Signup or Login button
		Then verify Login to your account is visible
	  Then Enter incorrect email address and password
		Then Click login button
		Then Verify error Your email or password is incorrect! is visible
	  
	 
	 
	@case4
	Scenario: Logout User
	  	
	  Given user enter into the url
		Then user verify that home page is visible successfully
		Then Click on Signup or Login button
		Then verify Login to your account is visible
	  Then Enter correct email address and password
	  Then Click login button
	  Then Verify that Logged in as username is visible
	  Then Click Logout button
	  Then Verify that user is navigated to login page
	  
	  
	  
	 @case5
	 Scenario: Register User with existing email
	  
	  Given user enter into the url
		Then user verify that home page is visible successfully
		Then Click on Signup or Login button
		Then Verify New User Signup! is visible
		Then Enter name and already registered email address
		Then click Signup button
	  Then Verify error Email Address already exist! is visible
	   
	  @case6
	  Scenario: Contact Us Form
	  
		  Given user enter into the url
			Then user verify that home page is visible successfully	  
		  Then Click on Contact Us button
			Then Verify GET IN TOUCH is visible
		  Then Enter name, email, subject and message
			Then Upload file
			Then Click Submit button
			Then Click OK button
			Then Verify success message Success! Your details have been submitted successfully. is visible
			Then Click Home button and verify that landed to home page successfully
	  
	  
	   
	  @case7
	  Scenario: Verify Test Cases Page
	  
		  Given user enter into the url
			Then user verify that home page is visible successfully
			Then Click on Test Cases button
			Then Verify user is navigated to test cases page successfully
	  
	

		@case8
	  Scenario: Verify All Products and product detail page
	  
	  	Given user enter into the url
			Then user verify that home page is visible successfully
	  	Then Click on Products button
			Then Verify user is navigated to ALL PRODUCTS page successfully
			Then The products list is visible
			Then Click on View Product of first product and User is landed to product detail page
			Then Verify that detail detail is visible: product name, category, price, availability, condition, brand


		@case9
	  Scenario: Search Product
	  
	  	Given user enter into the url
			Then user verify that home page is visible successfully
	  	Then Click on Products button
			Then Verify user is navigated to ALL PRODUCTS page successfully
	  	Then Enter product name in search input and click search button
			Then Verify SEARCHED PRODUCTS is visible
			Then Verify all the products related to search are visible
			
			
			
		@case10
	  Scenario: Verify Subscription in home page
	  
	  	Given user enter into the url
			Then user verify that home page is visible successfully	
			Then Scroll down to footer
			Then Verify text SUBSCRIPTION
			Then Enter email address in input and click arrow button
			Then Verify success message You have been successfully subscribed! is visible
			
			
		@case11
		Scenario: Verify Subscription in Cart page
			
			Given user enter into the url
			Then user verify that home page is visible successfully	
			Then Click Cart button
	  	Then Scroll down to footer
			Then Verify text SUBSCRIPTION
			Then Enter email address in input and click arrow button
			Then Verify success message You have been successfully subscribed! is visible

	  
	 	@case12
	  Scenario: Add Products in Cart
	  
		 	Given user enter into the url
			Then user verify that home page is visible successfully
	  	Then Click on Products button
  		Then Hover over first product and click Add to cart
			Then Click Continue Shopping button
			Then Hover over second product and click Add to cart
			Then Click View Cart button				
			Then Verify both products are added to Cart
			Then Verify their prices quantity and total price
	 
	  
	  @case13
	  Scenario: Verify Product quantity in Cart
	  
		 	Given user enter into the url
			Then user verify that home page is visible successfully
			Then Click View Product for any product on home page
			Then Verify product detail is opened
			Then Increase quantity to four
			Then Click Add to cart button
			Then Click View Cart button
			Then Verify that product is displayed in cart page with exact quantity
	  
	  
	  @case14
	  Scenario: Place Order: Register while Checkout
	  	
	  	Given user enter into the url
			Then user verify that home page is visible successfully
			Then Add products to cart
			Then Click Cart button
			Then Verify that cart page is displayed
			Then Click Proceed To Checkout
			Then Click Register or Login button
			Then Fill all details in Signup and create account
			Then Verify ACCOUNT CREATED! and click Continue button
			Then Verify Logged in as username at top
			Then Click Cart button
			Then Click Proceed To Checkout button
			Then Verify Address Details and Review Your Order
			Then Enter description in comment text area and click Place Order
			Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
			Then Click Pay and Confirm Order button
			Then Verify success message Your order has been placed successfully!
			Then Click Delete Account button
			Then Verify that ACCOUNT DELETED! is visible
			And click Continue button afterdelete
				  
				  
	  
	  @case15
	  Scenario: Place Order: Register before Checkout
	  
	  	Given user enter into the url
			Then user verify that home page is visible successfully
			Then Click on Signup or Login button
			Then Fill all details in Signup and create account
			Then Verify ACCOUNT CREATED! and click Continue button
			Then Verify Logged in as username at top
	  	Then Add products to cart
	  	Then Click Cart button
	  	Then Verify that cart page is displayed
	  	Then Click Proceed To Checkout button
			Then Verify Address Details and Review Your Order
			Then Enter description in comment text area and click Place Order
			Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
			Then Click Pay and Confirm Order button
			Then Verify success message Your order has been placed successfully!
			Then Click Delete Account button
			Then Verify that ACCOUNT DELETED! is visible
			And click Continue button afterdelete
	  
	  
	  
	  @case16
	  Scenario: Place Order: Login before Checkout
	  
	  	Given user enter into the url
			Then user verify that home page is visible successfully
			Then Click on Signup or Login button
	  	Then Fill email, password and click Login button
	  	Then Add products to cart
	  	Then Click Cart button
	  	Then Verify that cart page is displayed
	  	Then Click Proceed To Checkout button
			Then Verify Address Details and Review Your Order
			Then Enter description in comment text area and click Place Order
			Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
			Then Click Pay and Confirm Order button
			Then Verify success message Your order has been placed successfully!
			Then Click Delete Account button
			Then Verify that ACCOUNT DELETED! is visible
			And click Continue button afterdelete
	  
	  
	  @case17
	  Scenario: Remove Products From Cart
	  
	  	Given user enter into the url
			Then user verify that home page is visible successfully
			Then Add products to cart
	  	Then Click Cart button
	  	Then Verify that cart page is displayed
	  	Then Click X button corresponding to particular product
			Then Verify that product is removed from the cart


		@case18
		Scenario: displayed
		
			Given user enter into the url
			And Verify that categories are visible on left side bar
			Then Click on Women category
			And Click on any category link under Women category, for example: Dress
			Then Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS
			Then On left side bar, click on any sub-category link of Men category
			And Verify that user is navigated to that category page
			
		@case19
		Scenario: View & Cart Brand Products
			
			Given user enter into the url
			Then Click on Products button
			Then Verify that Brands are visible on left side bar
			Then Click on any brand name
			Then Verify that user is navigated to brand page and brand products are displayed
			Then On left side bar, click on any other brand link
			Then Verify that user is navigated to that brand page and can see products
		
		
		@case20
		Scenario: Search Products and Verify Cart After Login
			
			Given user enter into the url
			Then Click on Products button
			Then Verify user is navigated to ALL PRODUCTS page successfully
			Then Enter product name in search input and click search button
			Then Verify SEARCHED PRODUCTS is visible
			Then Verify all the products related to search are visible
			Then Add those products to cart
 			Then Click Cart button
 			And verify that products are visible in cart
			Then Click on Signup or Login button 
			And submit login details
			Then Again, go to Cart page
			Then Verify that those products are visible in cart after login as well

	  @case21
	  Scenario: Add review on product
	  	Given user enter into the url
	  	Then Click on Products button
			Then Verify user is navigated to ALL PRODUCTS page successfully
			Then Click on View Product button
			Then Verify Write Your Review is visible
			Then Enter name, email, review and Click Submit button
			Then Verify success message Thank you for your review
				  
	  @case22
	  Scenario: Add to cart from Recommended items
	  	
	  	Given user enter into the url
	  	Then Scroll to bottom of page
			Then Verify RECOMMENDED ITEMS are visible
			Then Click on Add To Cart on Recommended product
			Then Click View Cart button
			Then Verify that product is displayed in cart page
				
	  @case23
	  Scenario: Verify address details in checkout page
	  	
	  	Given user enter into the url
			Then user verify that home page is visible successfully
			Then Click on Signup or Login button
			Then Fill all details in Signup and create account
			Then Verify ACCOUNT CREATED! and click Continue button
			Then Verify Logged in as username at top
			Then Add products to cart
			Then Click Cart button
			Then Verify that cart page is displayed
			Then Click Proceed To Checkout
			Then Verify that the delivery address is same address filled at the time registration of account
			Then Verify that the billing address is same address filled at the time registration of account
			Then Click Delete Account button
			Then Verify that ACCOUNT DELETED! is visible
			And click Continue button afterdelete
			
			
		@case24
		Scenario:
			
			Given user enter into the url
			Then user verify that home page is visible successfully
			Then Add products to cart
			Then Click Cart button
			Then Verify that cart page is displayed
			Then Click Proceed To Checkout
			Then Click Register or Login button
			Then Fill all details in Signup and create account
			Then Verify ACCOUNT CREATED! and click Continue button
			Then Verify Logged in as username at top
			Then Click Cart button
			Then Click Proceed To Checkout button
			Then Verify Address Details and Review Your Order
			Then Enter description in comment text area and click Place Order
			Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
			Then Click Pay and Confirm Order button
			Then Verify success message Your order has been placed successfully!
			Then Click Download Invoice button and verify invoice is downloaded successfully and Click Continue button
			Then Click Delete Account button
			Then Verify that ACCOUNT DELETED! is visible
			And click Continue button afterdelete
			
				  
		@case25
		Scenario: Verify Scroll Up using Arrow button and Scroll Down functionality
	  	
	  	Given user enter into the url
			Then user verify that home page is visible successfully  	
			Then Scroll down to footer
			Then Verify text SUBSCRIPTION
			Then Click on arrow at bottom right side to move upward
			And Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen
				  
	  
	  @case26
	  Scenario:
	  	
	  	Given user enter into the url
			Then user verify that home page is visible successfully  	
			Then Scroll down to footer
			Then Verify text SUBSCRIPTION
			Then Scroll up page to top
			And Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen	 