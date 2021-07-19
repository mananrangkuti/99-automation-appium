package android.ninetynine.pageobjects;
import org.openqa.selenium.By;

import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ListingCreation extends Base_Test {
	GeneralUtilities function;
	public ListingCreation(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		function = new GeneralUtilities(driver);
	}
	

	By LC_GotItButton = By.xpath("//*[@text='Got it!']");

	By LC_CreateListing = By.xpath("//*[@text='Create listing']");
	By LC_CreateMustSee = By.xpath("//*[@text='Create Must See listing']");
	By LC_CreateReg = By.xpath("//*[@id='createRegularListing']");
	
	By LC_EnterPostalCode = By.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup']]");
	By LC_InputPostalCode = By.xpath("//*[@id='etSearchLocation']");
	
	By LC_ResultPostalCode = By.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup']]");
	
	//Listing creation flow
	By LC_Sale = By.xpath("//*[@text='Sale']");
	By LC_Rent = By.xpath("//*[@text='Rental']");
	By LC_RoomRent = By.xpath("//*[@text='Room Rental']");
	By LC_MasterRoom = By.xpath("//*[@text='Master Room']");
	By LC_CommonRoom = By.xpath("//*[@text='Common Room']");
	By LC_SubCategory = By.xpath("//*[@id='etCreateListingTextRow' and (./preceding-sibling::* | ./following-sibling::*)[@text='Sub Category']]");
	By LC_SubCategory_Terrace = By.xpath("//*[@text='Terrace House']");
	By LC_BuildUpArea = By.xpath("//*[@id='etCreateListingTextRow' and (./preceding-sibling::* | ./following-sibling::*)[@text='Build-Up Area'] and (./preceding-sibling::* | ./following-sibling::*)[@id='ivCreateListingTextRow']]");
	By LC_UnitNumber = By.xpath("//*[@id='tvValueCreateListingTextPicker']");
	By LC_UnitNumber_Done = By.xpath("//*[@text='Done']");
	By LC_Bedroom = By.xpath("//*[@id='etCreateListingTextRow' and (./preceding-sibling::* | ./following-sibling::*)[@text='Bedrooms']]");
	By LC_Bedroom_Studio = By.xpath("//*[@text='STUDIO']");
	By LC_Size = By.xpath("//*[@id='etCreateListingTextRow' and (./preceding-sibling::* | ./following-sibling::*)[@text='Size']]");
	By LC_RoomSize = By.xpath("//*[@id='etCreateListingTextRow' and (./preceding-sibling::* | ./following-sibling::*)[@text='Room Size']]");
	By LC_Prize = By.xpath("//*[@id='etCreateListingTextRow' and (./preceding-sibling::* | ./following-sibling::*)[@text='Price']]");
	By LC_CreateFreeListing = By.xpath("//*[@text='Create free listing']");
	By LC_CreateFreeListingModal = By.xpath("//*[@id='tvCreateListingFree']");
	By LC_SkipAndCreateListing = By.xpath("//*[@text='Skip and create free listing']");
	By Listing_created = By.xpath("//*[@text='Listing created!']");
	By LC_ButtonToDashboard = By.xpath("//*[@id='btnToDashboard']");
	
	//method below for click Create Listing button
	public void Click_GotItButton() throws Exception{
		function.click(LC_GotItButton);
	}
	
	//method below for click Create Listing button
	public void Click_CreateReg() throws Exception{
		function.click(LC_CreateReg);
	}
	
	//method below for click Create Listing button
	public void Click_CreateListing() throws Exception{
		function.click(LC_CreateListing);
	}
	
	//method below for click create must see
	public void Click_PostalCode() throws Exception{
		function.click(LC_EnterPostalCode);
	}
	
	//method below for click create must see
	public void Click_CreateMustSee() throws Exception{
		function.click(LC_CreateMustSee);
	}
	
	//method below for click Create Listing button
	public void Click_Result() throws Exception{
		function.click(LC_ResultPostalCode);
	}
		
	//Listing Creation Flow
	//method below for clicking sale
	public void Click_BtSale() throws Exception{
		function.click(LC_Sale);
	}
	
	//method below for click rent
	public void Click_BtRent() throws Exception{
		function.click(LC_Rent);
	}

	//method below for click room rental
	public void Click_BtRoomRent() throws Exception{
		function.click(LC_RoomRent);
	}
	
	//method below for clicking master room for room rental
	public void Click_MasterRoom() throws Exception{
		function.click(LC_MasterRoom);
	}
	
	//method below for clicking common room for room rental
	public void Click_CommonRoom() throws Exception{
		function.click(LC_CommonRoom);
	}
	
	//method below for click unit number
	public void Click_UnitNumber() throws Exception{
		function.click(LC_UnitNumber);
	}
	
	//method below for click unit number done
	public void Click_UnitNumberDone() throws Exception{
		function.click(LC_UnitNumber_Done);
	}
	
	//method below for click size
	public void Click_Size() throws Exception{
		function.click(LC_Size);
	}	
	
	//method below for clicking Room Size for room rental
	public void Click_RoomSize() throws Exception{
		function.click(LC_RoomSize);
	}
	
	//method below for click price
	public void Click_Price() throws Exception{
		function.click(LC_Prize);
	}	
	
	//method below for landed property listing creation
	public void Click_SubCategory() throws Exception{
		function.click(LC_SubCategory);
	}
	
	//method below for selecting landed property category
	public void Click_SubCategoryTerrace() throws Exception{
		function.click(LC_SubCategory_Terrace);
	}
	
	//method below for selecting build up area(BUA)
	public void Click_BUA() throws Exception{
		function.click(LC_BuildUpArea);
	}
	
	
	//method below for click rent
	public void Click_Bedroom() throws Exception{
		function.click(LC_Bedroom);
	}
	
	//method below for click rent
	public void Click_BedroomStudio() throws Exception{
		function.click(LC_Bedroom_Studio);
	}
	
	//method below for clicking on create free listing button
	public void Click_CreateFreeListing() throws Exception{
		function.click(LC_CreateFreeListing);
	}
	
	//method below for clicking on create free listing button for pop up
	public void Click_CreateFreeListingModal() throws Exception{
		function.click(LC_CreateFreeListingModal);
	}
	
	//method below for clicking on skip and create listing
	public void Click_SkipAndCreateListing() throws Exception{
		function.click(LC_SkipAndCreateListing);
	}
	
	//method below for clicking back to dashboard after listing created
	public void Click_ButtonToDashboard() throws Exception{
		function.click(LC_ButtonToDashboard);
	}
	
	//Must See creation flow
		By LC_MustSeeGotIt = By.xpath("//*[@text='Got it']");
		By LC_AddPhoto = By.xpath("//*[@id='ivPhotoAdd']");
		By LC_PhotoLibrary = By.xpath("//*[@text='Photo library']");
		By LC_PicturesFolder = By.xpath("//*[@class='android.widget.LinearLayout' and ./*[./*[@text='Pictures']] and ./*[@id='ivGalleryFolderCover']]");
		By LC_FirstPhoto = By.xpath("(//*[@id='recyclerView']/*/*[@id='ivGalleryPhoto'])[1]");
		By LC_MenuCompleted = By.xpath("//*[@id='menu_completed']");
		By LC_LivingRoomPhoto = By.xpath("//*[@id='ivManagePhotoItem' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='Living Room']]]]]");
		By LC_BathroomPhoto = By.xpath("//*[@id='ivManagePhotoItem' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='Bathroom']]]]]");
		By LC_KitchenPhoto = By.xpath("//*[@id='ivManagePhotoItem' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='Kitchen']]]]]");
		By LC_ActionDone = By.xpath("//*[@id='action_done']");
		By LC_AdditionalDetails = By.xpath("//*[@text='Additional Details']");
		By LC_AddDetailsFeatures = By.xpath("//*[@text='Features*']");
		By LC_BalconyCheck = By.xpath("//*[@id='checkbox' and (./preceding-sibling::* | ./following-sibling::*)[@text='Balcony']]");
		By LC_FeaturesOk = By.xpath("//*[@text='OK']");
		By LC_FeaturesBathroom = By.xpath("//*[@text='Required' and @id='tvChosenValue' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='Number of bathrooms*']]]]");
		By LC_Features3Bathroom = By.xpath("//*[@text='3']");
		By LC_FeaturesAvailabilityDate = By.xpath("//*[@text='Required' and @id='tvChosenValue' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='Date of availability*']]]]");
		By LC_Features31July = By.xpath("//*[@contentDescription='31 July 2021']");
		By LC_FeaturesFurnishing = By.xpath("//*[@text='None']");
		By LC_FeaturesFullyFurnished = By.xpath("//*[@text='Fully Furnished']");
		By LC_SaveFeatures = By.xpath("//*[@text='SAVE']");
		By LC_SubmitForApproval = By.xpath("//*[@text='Submit for approval']");
		By LC_BackToDashboard = By.xpath("//*[@text='Back to dashboard']");
		By LC_ListingSubmitted = By.xpath("//*[@text='Your listing has been submitted for approval!']");

		//method for clicking Got it after scrolling on instructions for must see listing creation
		public void Click_MustSeeGotIt() throws Exception{
			function.click(LC_MustSeeGotIt);
		}

		//method for clicking on + box to add photos
		public void Click_AddPhoto() throws Exception{
			function.click(LC_AddPhoto);
		}

		//method for clicking on photo library
		public void Click_PhotoLibrary() throws Exception{
			function.click(LC_PhotoLibrary);;
		}

		//method for clicking on "Pictures" folder
		public void Click_PicturesFolder() throws Exception{
			function.click(LC_PicturesFolder);
		}

		//method for clicking on first picture in folder
		public void Click_FirstPhoto() throws Exception{
			function.click(LC_FirstPhoto);
		}

		//method for clicking on tick after selecting photos
		public void Click_PhotoComplete() throws Exception{
			function.click(LC_MenuCompleted);
		}

		//method to add photo for living room
		public void Click_LRPhoto() throws Exception{
			function.click(LC_LivingRoomPhoto);
		}

		//method to add photo for bathroom
		public void Click_BathroomPhoto() throws Exception{
			function.click(LC_BathroomPhoto);
		}

		//method to add photo for kitchen
		public void Click_KitchenPhoto() throws Exception{
			function.click(LC_KitchenPhoto);
		}

		//method to click on Done button after adding photos
		public void Click_ActionDone() throws Exception{
			function.click(LC_ActionDone);
		}

		//method to add additional details
		public void Click_AddDetails() throws Exception{
			function.click(LC_AdditionalDetails);
		}

		//method to add features in additional details
		public void Click_AddFeatures() throws Exception{
			function.click(LC_AddDetailsFeatures);
		}

		//method to check balcony in features
		public void Click_FeaturesBalcony() throws Exception{
			function.click(LC_BalconyCheck);
		}

		//method to add features
		public void Click_FeaturesOk() throws Exception{
			function.click(LC_FeaturesOk);
		}

		//method to add number of bathrooms
		public void Click_FeaturesBathroom() throws Exception{
			function.click(LC_FeaturesBathroom);
		}

		//method to click on 3 bathrooms
		public void Click_3Bathrooms() throws Exception{
			function.click(LC_Features3Bathroom);
		}

		//method to add date of availability
		public void Click_FeatureDateOfA() throws Exception{
			function.click(LC_FeaturesAvailabilityDate);
		}

		//method to select 31st July as date of availability
		public void Click_31July() throws Exception{
			function.click(LC_Features31July);
		}

		//method to add furnishing to features
		public void Click_FeatureFurnishing() throws Exception{
			function.click(LC_FeaturesFurnishing);
		}

		//method to select fully furnished in features
		public void Click_FullyFurnished() throws Exception{
			function.click(LC_FeaturesFullyFurnished);
		}

		//method to save features
		public void Click_SaveFeatures() throws Exception{
			function.click(LC_SaveFeatures);
		}

		//method to submit listing for approval
		public void Click_SubmitForApproval() throws Exception{
			function.click(LC_SubmitForApproval);
		}

		//method to click back to dashboard
		public void Click_BackToDashboard() throws Exception{
			function.click(LC_BackToDashboard);
		}

		//method below to verify that listing has been created
		public boolean Verify_ListingCreation() {
			boolean verify=false;
			verify=driver.findElement(Listing_created).isDisplayed();
			return verify;
		}

		//method below to verify that must see listing has been submitted for approval
		public boolean Verify_ListingSubmitted() {
			boolean verify=false;
			verify=driver.findElement(LC_ListingSubmitted).isDisplayed();
			return verify;
		}
}
		
//	//method below for input username
//		public void InputUsername(String username) throws Exception {
//			function.input(Username, username);
//		}
//		
