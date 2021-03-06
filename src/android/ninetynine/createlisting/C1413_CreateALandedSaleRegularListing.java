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

public class C1413_CreateALandedSaleRegularListing extends Base_Test {
	
	private Login login;
	private Homepage hp;
	private GeneralUtilities util;
	private ListingCreation lc;
	private TouchAction action;
	
	@Test
	public void C1413_CreateALandedSaleRegular_Listing() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		hp = new Homepage(driver);
		util = new GeneralUtilities(driver);
		lc = new ListingCreation(driver);
		action = new TouchAction(driver);

			
		System.out.println("\n");
		System.out.println("TestCase : C1413");	
		System.out.println("Create a Landed/Sale regular listing");	
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
			 lc.Click_CreateReg();
			 
			 //Listing creation flow
		     System.out.println("#And I input listing details");
			 lc.Click_PostalCode();
			 driver.findElement(By.xpath("//*[@id='etSearchLocation']")).sendKeys("820 Mountbattten Road");
			 lc.Click_Result();
			 lc.Click_BtSale();
			 driver.swipe(620, 1114, 604, 235, 2845);
			 lc.Click_SubCategory();
			 lc.Click_SubCategoryTerrace();
			 lc.Click_Bedroom();
			 lc.Click_BedroomStudio();
			 BACK();
			 lc.Click_BUA();
			 action.press(360,927).release().perform(); // 2
			 action.press(360,1069).release().perform(); // 5
			 BACK();
			 lc.Click_Price();
			 action.press(360,927).release().perform(); // 2
			 action.press(360,1069).release().perform(); // 5
			 BACK();
			 System.out.println("#When I click on Create listing");
			 lc.Click_CreateFreeListing();
			 lc.Click_CreateFreeListingModal();
			 lc.Click_SkipAndCreateListing();
			 try {
				 assertEquals(lc.Verify_ListingCreation(), true, "Listing created!");
				 System.out.println("#Then my listing should be created for Landed/Sale");
					
			 } catch (Exception e){				
				 System.out.println("#Listing creation unsuccessful");
			 }
			 lc.Click_ButtonToDashboard();
			 
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
				lc.Click_CreateReg();
				 
				//Listing creation flow
			    System.out.println("#And I input listing details");
				lc.Click_PostalCode();
				driver.findElement(By.xpath("//*[@id='etSearchLocation']")).sendKeys("820 Mountbattten Road");
				lc.Click_Result();
				lc.Click_BtSale();
				driver.swipe(620, 1114, 604, 235, 2845);
				lc.Click_SubCategory();
				lc.Click_SubCategoryTerrace();
				lc.Click_Bedroom();
				lc.Click_BedroomStudio();
				BACK();
				lc.Click_BUA();
				action.press(360,927).release().perform(); // 2
				action.press(360,1069).release().perform(); // 5
				BACK();
				lc.Click_Price();
				action.press(360,927).release().perform(); // 2
				action.press(360,1069).release().perform(); // 5
				BACK();
				System.out.println("#When I click on Create Listing");
				lc.Click_CreateFreeListing();
				lc.Click_CreateFreeListingModal();
				lc.Click_SkipAndCreateListing();
				try {
					assertEquals(lc.Verify_ListingCreation(), true, "Listing created!");
					System.out.println("#Then my listing should be created for Landed/Sale");
						
				} catch (Exception e){				
					System.out.println("#Listing creation unsuccessful");
				}
				lc.Click_ButtonToDashboard();
			
		}
		
		 
		wait_Med();
		
		
	}

}
