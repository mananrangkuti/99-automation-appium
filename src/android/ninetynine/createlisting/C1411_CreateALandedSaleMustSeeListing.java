package android.ninetynine.createlisting;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import io.appium.java_client.TouchAction;
import android.ninetynine.pageobjects.*;

public class C1411_CreateALandedSaleMustSeeListing extends Base_Test {
	
	private Login login;
	private Homepage hp;
	private GeneralUtilities util;
	private ListingCreation lc;
	private TouchAction action;
	
	@Test
	public void C1411_CreateALandedSaleMustSee_Listing() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		hp = new Homepage(driver);
		util = new GeneralUtilities(driver);
		lc = new ListingCreation(driver);
		action = new TouchAction(driver);

			
		System.out.println("\n");
		System.out.println("TestCase : C1411");	
		System.out.println("Create a Landed/Sale Must See listing");	
		System.out.println("---------");		 
		System.out.println("#Given I am an agent");
		wait_Long();	
		login.Click_Home_Me();
				
		if (util.verifyLogin()) {
			 System.out.println("State : Logged in");			
			 driver.swipe(620, 1114, 604, 235, 2845);
			 driver.swipe(633, 1162, 612, 493, 3771);
		     driver.swipe(597, 1204, 622, 593, 2131);
		     
		     login.Click_MeLogout();
		     login.Click_ConfLogout();		  
		     wait_Long();		    
		     
		     login.Click_Home_Me();
			 login.Click_MeLogin();
			 login.Click_Login();
			 login.InputUsername(CONFIG.getProperty("Jinhao_VerUser_Email"));
			 login.InputPassword(CONFIG.getProperty("Jinhao_VerUser_Pass"));
			 login.Click_ButtonLogin(); 
		     wait_Long();
	     
		     //Click My Listings
		     System.out.println("#And I click MyListings tab on homepage");
			 hp.Click_MyListings();
			 lc.Click_GotItButton();
			 
			 //Click create listing button
		     System.out.println("#And I click Create Listing button");
		     BACK();
			 lc.Click_CreateListing();
			 lc.Click_CreateMustSee();
			 driver.swipe(620, 1114, 604, 235, 2845);
			 driver.swipe(620, 1114, 604, 235, 2845);
			 lc.Click_MustSeeGotIt();
			 
			 //Listing creation flow
		     System.out.println("#And I input listing details");
			 lc.Click_PostalCode();
			 driver.findElement(By.xpath("//*[@id='etSearchLocation']")).sendKeys("Toh Tuck Garden");
			 lc.Click_Result();
			 lc.Click_BtSale();
			 driver.swipe(620, 1114, 604, 235, 2845);
			 lc.Click_SubCategory();
			 lc.Click_SubCategoryTerrace();
			 driver.swipe(620, 1114, 604, 235, 2845);
			 lc.Click_Bedroom();
			 lc.Click_BedroomStudio();
			 
			 //Build up area
			 action.press(360,927).release().perform(); // 2
			 action.press(360,1069).release().perform(); // 5
			 BACK();
			 BACK();
			 
			 //Price
			 action.press(120,927).release().perform(); // 1
			 action.press(600,927).release().perform(); // 3
			 BACK();
			 
			 //add initial photo to bedroom
			 lc.Click_AddPhoto();
			 lc.Click_PhotoLibrary();
			 lc.Click_PicturesFolder();
			 lc.Click_FirstPhoto();
			 lc.Click_PhotoComplete();
			 wait_Long();
			 
			 //add photo to living room
			 lc.Click_LRPhoto();
			 lc.Click_PhotoLibrary();
			 lc.Click_PicturesFolder();
			 lc.Click_FirstPhoto();
			 lc.Click_PhotoComplete();
			 driver.swipe(620, 1114, 604, 235, 2845);
			 
			 //add photo to bathroom
			 lc.Click_BathroomPhoto();
			 lc.Click_PhotoLibrary();
			 lc.Click_PicturesFolder();
			 lc.Click_FirstPhoto();
			 lc.Click_PhotoComplete();
			 
			 //add photo to kitchen
			 lc.Click_KitchenPhoto();
			 lc.Click_PhotoLibrary();
			 lc.Click_PicturesFolder();
			 lc.Click_FirstPhoto();
			 lc.Click_PhotoComplete();
			 lc.Click_ActionDone();
			 driver.swipe(620, 1114, 604, 235, 2845);
			 
			 //additional details
			 lc.Click_AddDetails();
			 driver.findElement(By.xpath("//*[@id='etTextBox' and (./preceding-sibling::* | ./following-sibling::*)[./*[./*[@text='Description*']]]]")).sendKeys("Appium Must See Creation");
			 lc.Click_AddFeatures();
			 lc.Click_FeaturesBalcony();
			 lc.Click_FeaturesOk();
			 lc.Click_FeaturesBathroom();
			 lc.Click_3Bathrooms();
			 lc.Click_SaveFeatures();
			 System.out.println("#When I click on Submit Approval");
			 lc.Click_SubmitForApproval();
			 try {
					assertEquals(lc.Verify_ListingSubmitted(), true, "Listing created!");
					System.out.println("#Then my Must See listing for Landed/Sale would be submitted for approval");
					
				} catch (Exception e){
							
					System.out.println("#Listing submission unsuccessful");
					
				}		
			 lc.Click_BackToDashboard();		 
		} else {
			
				System.out.println("State : Logged out");
				login.Click_Home_Me();
				login.Click_MeLogin();
				login.Click_Login();
				login.InputUsername(CONFIG.getProperty("Jinhao_VerUser_Email"));
				login.InputPassword(CONFIG.getProperty("Jinhao_VerUser_Pass"));
				login.Click_ButtonLogin(); 
			    wait_Long();
		     
			    //Click My Listings
			    System.out.println("#And I click MyListings tab on homepage");
				hp.Click_MyListings();
				lc.Click_GotItButton();
				
				//Click create listing button
			    System.out.println("#And I click Create Listing button");
			    BACK();
				lc.Click_CreateListing();
				lc.Click_CreateMustSee();
				driver.swipe(620, 1114, 604, 235, 2845);
				driver.swipe(620, 1114, 604, 235, 2845);
				lc.Click_MustSeeGotIt();
				 
				//Listing creation flow
			    System.out.println("#And I input listing details");
				lc.Click_PostalCode();
				driver.findElement(By.xpath("//*[@id='etSearchLocation']")).sendKeys("Toh Tuck Garden");
				lc.Click_Result();
				lc.Click_BtSale();
				driver.swipe(620, 1114, 604, 235, 2845);
				lc.Click_SubCategory();
				lc.Click_SubCategoryTerrace();
				driver.swipe(620, 1114, 604, 235, 2845);
				lc.Click_Bedroom();
				lc.Click_BedroomStudio();
				
				//Build up area
				action.press(360,927).release().perform(); // 2
				action.press(360,1069).release().perform(); // 5
				BACK();
				BACK();
				
				//Price
				action.press(120,927).release().perform(); // 1
				action.press(600,927).release().perform(); // 3
				BACK();
				
				//add initial photo to bedroom
				lc.Click_AddPhoto();
				lc.Click_PhotoLibrary();
				lc.Click_PicturesFolder();
				lc.Click_FirstPhoto();
				lc.Click_PhotoComplete();
				wait_Long();
				
				//add photo to living room
				lc.Click_LRPhoto();
				lc.Click_PhotoLibrary();
				lc.Click_PicturesFolder();
				lc.Click_FirstPhoto();
				lc.Click_PhotoComplete();
				driver.swipe(620, 1114, 604, 235, 2845);
				
				//add photo to bathroom
				lc.Click_BathroomPhoto();
				lc.Click_PhotoLibrary();
				lc.Click_PicturesFolder();
				lc.Click_FirstPhoto();
				lc.Click_PhotoComplete();
				
				//add photo to kitchen
				lc.Click_KitchenPhoto();
				lc.Click_PhotoLibrary();
				lc.Click_PicturesFolder();
				lc.Click_FirstPhoto();
				lc.Click_PhotoComplete();
				lc.Click_ActionDone();
				driver.swipe(620, 1114, 604, 235, 2845);
				
				//additional details
				lc.Click_AddDetails();
				driver.findElement(By.xpath("//*[@id='etTextBox' and (./preceding-sibling::* | ./following-sibling::*)[./*[./*[@text='Description*']]]]")).sendKeys("Appium Must See Creation");
				lc.Click_AddFeatures();
				lc.Click_FeaturesBalcony();
				lc.Click_FeaturesOk();
				lc.Click_FeaturesBathroom();
				lc.Click_3Bathrooms();
				lc.Click_SaveFeatures();
				System.out.println("#When I click on Submit Approval");
				lc.Click_SubmitForApproval();
				try {
					assertEquals(lc.Verify_ListingSubmitted(), true, "Listing created!");
					System.out.println("#Then my Must See listing for Landed/Sale would be submitted for approval");
					
				} catch (Exception e){			
						System.out.println("#Listing submission unsuccessful");
				}	
				lc.Click_BackToDashboard();	
		}	 
		wait_Med();		
	}

}
