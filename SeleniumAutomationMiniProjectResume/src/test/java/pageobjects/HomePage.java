package pageobjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//nav[@class='mt-2']/ul/li/a")
	List<WebElement> navBarItems;

	// NavBar->Catalog
	@FindBy(xpath = "//nav[@class='mt-2']/ul/li/a/p[contains(text(),'Catalog')]")
	WebElement NavBar_Catalog;

	@FindBy(linkText = "Products")
	WebElement NavBar_Catalog_Products;

	@FindBy(linkText = "Categories")
	WebElement NavBar_Catalog_Categories;

	@FindBy(linkText = "Manufacturers")
	WebElement NavBar_Catalog_Manufacturers;

	@FindBy(linkText = "Product reviews")
	WebElement NavBar_Catalog_Productreviews;

	@FindBy(linkText = "Product tags")
	WebElement NavBar_Catalog_Producttags;

	@FindBy(xpath = "//nav[@class='mt-2']/ul/li/a/p[contains(text(),'Catalog')]/../../ul/li/a[@href='#']/p[contains(text(),'Attributes')]")
	WebElement NavBar_Catalog_Attributes;

	@FindBy(linkText = "Product attributes")
	WebElement NavBar_Catalog_Attributes_Productattributes;

	@FindBy(linkText = "Specification attributes")
	WebElement NavBar_Catalog_Attributes_Specificationattributes;

	@FindBy(linkText = "Checkout attributes")
	WebElement NavBar_Catalog_Attributes_Checkoutattributes;

	// NavBar->Sales
	@FindBy(xpath = "//nav[@class='mt-2']/ul/li/a/p[contains(text(),'Sales')]")
	WebElement NavBar_Sales;

	@FindBy(linkText = "Orders")
	WebElement NavBar_Sales_Orders;

	@FindBy(linkText = "Shipments")
	WebElement NavBar_Sales_Shipments;

	@FindBy(linkText = "Return requests")
	WebElement NavBar_Sales_Return_requests;

	@FindBy(linkText = "Recurring payments")
	WebElement NavBar_Sales_RecurringPayments;

	@FindBy(linkText = "Gift cards")
	WebElement NavBar_Sales_Gift_cards;

	@FindBy(linkText = "Shopping carts and wishlists")
	WebElement NavBar_Sales_Shopping_CartsAndWishlists;

	// NavBar->Customers
	@FindBy(xpath = "//nav[@class='mt-2']/ul/li/a/p[contains(text(),'Customers')]")
	WebElement NavBar_Customers;

	@FindBy(xpath = "//ul[@class='nav nav-treeview'] //a/p[text()=' Customers']")
	WebElement NavBar_Customers_Customers;

	@FindBy(linkText = "Customer roles")
	WebElement NavBar_Customers_CustomerRoles;

	@FindBy(linkText = "Online customers")
	WebElement NavBar_Customers_OnlineCustomers;

	@FindBy(linkText = "Vendors")
	WebElement NavBar_Customers_Vendors;

	@FindBy(linkText = "Activity log")
	WebElement NavBar_Customers_Activity_log;

	@FindBy(linkText = "Activity Types")
	WebElement NavBar_Customers_Activity_Types;

	@FindBy(linkText = "GDPR requests (log)")
	WebElement NavBar_Customers_GDPRrequests_log;

	// NavBar->Promotions
	
	@FindBy(xpath = "//nav[@class='mt-2']/ul/li/a/p[contains(text(),'Promotions')]")
	WebElement NavBar_Promotions;

	@FindBy(linkText = "Discounts")
	WebElement NavBar_Promotions_Discounts;

	@FindBy(linkText = "Affiliates")
	WebElement NavBar_Promotions_Affiliates;

	@FindBy(linkText = "Newsletter subscribers")
	WebElement NavBar_Promotions_NewsletterSubscribers;

	@FindBy(linkText = "Campaigns")
	WebElement NavBar_Promotions_Campaigns;

	// NavBar->Content Management
	@FindBy(xpath = "//nav[@class='mt-2']/ul/li/a/p[contains(text(),'Content management')]")
	WebElement NavBar_ContentManagement;

	@FindBy(linkText = "Topics (pages)")
	WebElement NavBar_ContentManagement_TopicsPages;

	@FindBy(linkText = "Message templates")
	WebElement NavBar_ContentManagement_Message_Templates;

	@FindBy(linkText = "News items")
	WebElement NavBar_ContentManagement_NewsItems;

	@FindBy(linkText = "News comments")
	WebElement NavBar_ContentManagement_NewsComments;

	@FindBy(linkText = "Blog posts")
	WebElement NavBar_ContentManagement_BlogPosts;

	@FindBy(linkText = "Blog comments")
	WebElement NavBar_ContentManagement_BlogComments;

	@FindBy(linkText = "Polls")
	WebElement NavBar_ContentManagement_Polls;

	@FindBy(linkText = "Forums")
	WebElement NavBar_ContentManagement_Forums;

	// NavBar->System
	@FindBy(xpath = "//nav[@class='mt-2']/ul/li/a/p[contains(text(),'System')]")
	WebElement NavBar_System;

	@FindBy(linkText = "System information")
	WebElement NavBar_System_SystemInformation;

	@FindBy(linkText = "Log")
	WebElement NavBar_System_Log;

	@FindBy(linkText = "Warnings")
	WebElement NavBar_System_Warnings;

	@FindBy(linkText = "Maintenance")
	WebElement NavBar_System_Maintenance;

	@FindBy(linkText = "Message queue")
	WebElement NavBar_System_MessageQueue;

	@FindBy(linkText = "Schedule tasks")
	WebElement NavBar_System_ScheduleTasks;

	@FindBy(linkText = "Search engine friendly page names")
	WebElement NavBar_System_Search_EngineFriendlyPageNames;

	@FindBy(linkText = "Templates")
	WebElement NavBar_System_Templates;

	// NavBar->Reports
	@FindBy(xpath = "//nav[@class='mt-2']/ul/li/a/p[contains(text(),'Reports')]")
	WebElement NavBar_Reports;

	@FindBy(linkText = "Sales summary")
	WebElement NavBar_Reports_SalesSummary;

	@FindBy(linkText = "Low stock")
	WebElement NavBar_Reports_LowStock;

	@FindBy(linkText = "Bestsellers")
	WebElement NavBar_Reports_Bestsellers;

	@FindBy(linkText = "Products never purchased")
	WebElement NavBar_Reports_ProductsNeverPurchased;

	@FindBy(linkText = "Country sales")
	WebElement NavBar_Reports_CountrySales;

	@FindBy(linkText = "Customer reports")
	WebElement NavBar_Reports_CustomerReports;

	@FindBy(linkText = "Registered customers")
	WebElement NavBar_Reports_RegisteredCustomers;

	@FindBy(linkText = "Customers by order total")
	WebElement NavBar_Reports_CustomersByOrderTotal;

	@FindBy(linkText = "Customers by number of orders")
	WebElement NavBar_Reports_CustomersByNumberOfOrders;

	// NavBar->Help
	@FindBy(xpath = "//nav[@class='mt-2']/ul/li/a/p[contains(text(),'Help')]")
	WebElement NavBar_Help;

	@FindBy(linkText = "Training")
	WebElement NavBar_Help_Training;

	@FindBy(linkText = "Documentation")
	WebElement NavBar_Help_Documentation;

	@FindBy(linkText = "Community forums")
	WebElement NavBar_Help_Community_Forums;

	@FindBy(linkText = "Premium support services")
	WebElement NavBar_Help_PremiumSupportServices;

	@FindBy(linkText = "Solution partners")
	WebElement NavBar_Help_SolutionPartners;

	// NAVBar->Configuration->Settings
	@FindBy(linkText = "Settings")
	WebElement NavBar_Configuration_Settings;

	@FindBy(linkText = "General settings")
	WebElement NavBar_Configuration_Settings_GeneralSettings;

	@FindBy(linkText = "Customer settings")
	WebElement NavBar_Configuration_Settings_CustomerSettings;

	@FindBy(linkText = "Order settings")
	WebElement NavBar_Configuration_Settings_OrderSettings;

	@FindBy(linkText = "Shipping settings")
	WebElement NavBar_Configuration_Settings_ShippingSettings;

	@FindBy(linkText = "Tax settings")
	WebElement NavBar_Configuration_Settings_TaxSettings;

	@FindBy(linkText = "Catalog settings")
	WebElement NavBar_Configuration_Settings_CatalogSettings;

	@FindBy(linkText = "Shopping cart settings")
	WebElement NavBar_Configuration_Settings_ShoppingCartSettings;

	@FindBy(linkText = "Reward points")
	WebElement NavBar_Configuration_Settings_RewardPoints;

	@FindBy(linkText = "GDPR settings")
	WebElement NavBar_Configuration_Settings_GDPRSettings;

	@FindBy(linkText = "Vendor settings")
	WebElement NavBar_Configuration_Settings_VendorSettings;

	@FindBy(linkText = "Blog settings")
	WebElement NavBar_Configuration_Settings_BlogSettings;

	@FindBy(linkText = "News settings")
	WebElement NavBar_Configuration_Settings_NewsSettings;

	@FindBy(linkText = "Forum settings")
	WebElement NavBar_Configuration_Settings_ForumSettings;

	@FindBy(linkText = "Media settings")
	WebElement NavBar_Configuration_Settings_MediaSettings;

	@FindBy(linkText = "All settings (advanced)")
	WebElement NavBar_Configuration_Settings_AllSettingsAdvanced;

	// NAVBar->Configuration->Shipping
	@FindBy(linkText = "Shipping")
	WebElement NavBar_Configuration_Shipping;

	@FindBy(linkText = "Shipping providers")
	WebElement NavBar_Configuration_Shipping_ShippingProviders;

	@FindBy(linkText = "Warehouses")
	WebElement NavBar_Configuration_Shipping_Warehouses;

	@FindBy(linkText = "Pickup points")
	WebElement NavBar_Configuration_Shipping_PickupPoints;

	@FindBy(linkText = "Dates and ranges")
	WebElement NavBar_Configuration_Shipping_DatesAndRanges;

	@FindBy(linkText = "Measures")
	WebElement NavBar_Configuration_Shipping_Measures;

	// NAVBar->Configuration->POS
	@FindBy(linkText = "POS")
	WebElement NavBar_Configuration_POS;

	@FindBy(linkText = "PayPal Zettle")
	WebElement NavBar_Configuration_POS_PayPalZettle;

	// NAVBar->Configuration->Authentication
	@FindBy(linkText = "Authentication")
	WebElement NavBar_Configuration_Authentication;

	@FindBy(linkText = "External authentication")
	WebElement NavBar_Configuration_Authentication_ExternalAuthentication;

	@FindBy(linkText = "Multi-factor authentication")
	WebElement NavBar_Configuration_Authentication_MultiFactorAuthentication;

	// NAVBar->Configuration (nodes with no children)
	@FindBy(xpath = "//nav[@class='mt-2']/ul/li/a/p[contains(text(),'Configuration')]")
	WebElement NavBar_Configuration;

	@FindBy(linkText = "Email accounts")
	WebElement NavBar_Configuration_EmailAccounts;

	@FindBy(linkText = "Stores")
	WebElement NavBar_Configuration_Stores;

	@FindBy(linkText = "Countries")
	WebElement NavBar_Configuration_Countries;

	@FindBy(linkText = "Languages")
	WebElement NavBar_Configuration_Languages;

	@FindBy(linkText = "Currencies")
	WebElement NavBar_Configuration_Currencies;

	@FindBy(linkText = "Payment methods")
	WebElement NavBar_Configuration_PaymentMethods;

	@FindBy(linkText = "Payment restrictions")
	WebElement NavBar_Configuration_PaymentRestrictions;

	@FindBy(linkText = "Tax providers")
	WebElement NavBar_Configuration_TaxProviders;

	@FindBy(linkText = "Tax categories")
	WebElement NavBar_Configuration_TaxCategories;

	@FindBy(linkText = "Access control list")
	WebElement NavBar_Configuration_AccessControlList;

	@FindBy(linkText = "Widgets")
	WebElement NavBar_Configuration_Widgets;

	@FindBy(linkText = "Web API")
	WebElement NavBar_Configuration_WebAPI;

	@FindBy(linkText = "Local plugins")
	WebElement NavBar_Configuration_LocalPlugins;

	@FindBy(linkText = "All plugins and themes")
	WebElement NavBar_Configuration_AllPluginsAndThemes;

	public void clickNavBarItem(String navBarItem) throws Exception {
		Thread.sleep(500);// TODO
		wait.until(ExpectedConditions.elementToBeClickable(NavBar_Configuration));
		switch (navBarItem) {
		// NavBar->Catalog
		case "Catalog":
			NavBar_Catalog.click();
			break;
		case "Products":
			NavBar_Catalog_Products.click();
			break;
		case "Categories":
			NavBar_Catalog_Categories.click();
			break;
		case "Manufacturers":
			NavBar_Catalog_Manufacturers.click();
			break;
		case "Product reviews":
			NavBar_Catalog_Productreviews.click();
			break;
		case "Product tags":
			NavBar_Catalog_Producttags.click();
			break;
		case "Attributes":
			NavBar_Catalog_Attributes.click();
			break;
		case "Product attributes":
			NavBar_Catalog_Attributes_Productattributes.click();
			break;
		case "Specification attributes":
			NavBar_Catalog_Attributes_Specificationattributes.click();
			break;
		case "Checkout attributes":
			NavBar_Catalog_Attributes_Checkoutattributes.click();
			break;
		// NavBar->Sales
		case "Sales":
			NavBar_Sales.click();
			break;
		case "Orders":
			NavBar_Sales_Orders.click();
			break;
		case "Shipments":
			NavBar_Sales_Shipments.click();
			break;
		case "Return requests":
			NavBar_Sales_Return_requests.click();
			break;
		case "Recurring payments":
			NavBar_Sales_RecurringPayments.click();
			break;
		case "Gift cards":
			NavBar_Sales_Gift_cards.click();
			break;
		case "Shopping carts and wishlists":
			NavBar_Sales_Shopping_CartsAndWishlists.click();
			break;
		// NavBar->Customers
		case "Customers_Level_0":
			NavBar_Customers.click();
			break;
		case "Customers_Level_1":
			NavBar_Customers_Customers.click();
			break;
		case "Customer roles":
			NavBar_Customers_CustomerRoles.click();
			break;
		case "Online customers":
			NavBar_Customers_OnlineCustomers.click();
			break;
		case "Vendors":
			NavBar_Customers_Vendors.click();
			break;
		case "Activity log":
			NavBar_Customers_Activity_log.click();
			break;
		case "Activity Types":
			NavBar_Customers_Activity_Types.click();
			break;
		case "GDPR requests (log)":
			NavBar_Customers_GDPRrequests_log.click();
			break;
		// NavBar->Promotions
		case "Promotions":
			wait.until(ExpectedConditions.elementToBeClickable(NavBar_Configuration));
			NavBar_Promotions.click();
			break;
		case "Discounts":
			NavBar_Promotions_Discounts.click();
			break;
		case "Affiliates":
			NavBar_Promotions_Affiliates.click();
			break;
		case "Newsletter subscribers":
			NavBar_Promotions_NewsletterSubscribers.click();
			break;
		case "Campaigns":
			NavBar_Promotions_Campaigns.click();
			break;
		// NavBar->Content Management
		case "Content management":
			wait.until(ExpectedConditions.elementToBeClickable(NavBar_ContentManagement));
			NavBar_ContentManagement.click();
			break;
		case "Topics (pages)":
			NavBar_ContentManagement_TopicsPages.click();
			break;
		case "Message templates":
			NavBar_ContentManagement_Message_Templates.click();
			break;
		case "News items":
			NavBar_ContentManagement_NewsItems.click();
			break;
		case "News comments":
			NavBar_ContentManagement_NewsComments.click();
			break;
		case "Blog posts":
			NavBar_ContentManagement_BlogPosts.click();
			break;
		case "Blog comments":
			NavBar_ContentManagement_BlogComments.click();
			break;
		case "Polls":
			NavBar_ContentManagement_Polls.click();
			break;
		case "Forums":
			NavBar_ContentManagement_Forums.click();
			break;
		// NavBar->System
		case "System":
			wait.until(ExpectedConditions.elementToBeClickable(NavBar_System));
			NavBar_System.click();
			break;
		case "System information":
			NavBar_System_SystemInformation.click();
			break;
		case "Log":
			NavBar_System_Log.click();
			break;
		case "Warnings":
			NavBar_System_Warnings.click();
			break;
		case "Maintenance":
			NavBar_System_Maintenance.click();
			break;
		case "Message queue":
			NavBar_System_MessageQueue.click();
			break;
		case "Schedule tasks":
			NavBar_System_ScheduleTasks.click();
			break;
		case "Search engine friendly page names":
			NavBar_System_Search_EngineFriendlyPageNames.click();
			break;
		case "Templates":
			NavBar_System_Templates.click();
			break;
		// NavBar->Reports
		case "Reports":
			wait.until(ExpectedConditions.elementToBeClickable(NavBar_Reports));
			NavBar_Reports.click();
			break;
		case "Sales summary":
			NavBar_Reports_SalesSummary.click();
			break;
		case "Low stock":
			NavBar_Reports_LowStock.click();
			break;
		case "Bestsellers":
			NavBar_Reports_Bestsellers.click();
			break;
		case "Products never purchased":
			NavBar_Reports_ProductsNeverPurchased.click();
			break;
		case "Country sales":
			NavBar_Reports_CountrySales.click();
			break;
		case "Customer reports":
			NavBar_Reports_CustomerReports.click();
			break;
		case "Registered customers":
			NavBar_Reports_RegisteredCustomers.click();
			break;
		case "Customers by order total":
			NavBar_Reports_CustomersByOrderTotal.click();
			break;
		case "Customers by number of orders":
			NavBar_Reports_CustomersByNumberOfOrders.click();
			break;
		// NavBar->Help
		case "Help":
			wait.until(ExpectedConditions.elementToBeClickable(NavBar_Help));
			NavBar_Help.click();
			break;
		case "Training":
			NavBar_Help_Training.click();
			break;
		case "Documentation":
			NavBar_Help_Documentation.click();
			break;
		case "Community forums":
			NavBar_Help_Community_Forums.click();
			break;
		case "Premium support services":
			NavBar_Help_PremiumSupportServices.click();
			break;
		case "Solution partners":
			NavBar_Help_SolutionPartners.click();
			break;

		// NAVBar->Configuration
		case "Configuration":
			wait.until(ExpectedConditions.elementToBeClickable(NavBar_Configuration));
			NavBar_Configuration.click();
			break;

		// NAVBar->Configuration->Settings
		case "Settings":
			NavBar_Configuration_Settings.click();
			break;
		case "General settings":
			NavBar_Configuration_Settings_GeneralSettings.click();
			break;
		case "Customer settings":
			NavBar_Configuration_Settings_CustomerSettings.click();
			break;
		case "Order settings":
			NavBar_Configuration_Settings_OrderSettings.click();
			break;
		case "Shipping settings":
			NavBar_Configuration_Settings_ShippingSettings.click();
			break;
		case "Tax settings":
			NavBar_Configuration_Settings_TaxSettings.click();
			break;
		case "Catalog settings":
			NavBar_Configuration_Settings_CatalogSettings.click();
			break;
		case "Shopping cart settings":
			NavBar_Configuration_Settings_ShoppingCartSettings.click();
			break;
		case "Reward points":
			NavBar_Configuration_Settings_RewardPoints.click();
			break;
		case "GDPR settings":
			NavBar_Configuration_Settings_GDPRSettings.click();
			break;
		case "Vendor settings":
			NavBar_Configuration_Settings_VendorSettings.click();
			break;
		case "Blog settings":
			NavBar_Configuration_Settings_BlogSettings.click();
			break;
		case "News settings":
			NavBar_Configuration_Settings_NewsSettings.click();
			break;
		case "Forum settings":
			NavBar_Configuration_Settings_ForumSettings.click();
			break;
		case "Media settings":
			NavBar_Configuration_Settings_MediaSettings.click();
			break;
		case "All settings (advanced)":
			NavBar_Configuration_Settings_AllSettingsAdvanced.click();
			break;
		// NAVBar->Configuration->Shipping
		case "Shipping":
			NavBar_Configuration_Shipping.click();
			break;
		case "Shipping providers":
			NavBar_Configuration_Shipping_ShippingProviders.click();
			break;
		case "Warehouses":
			NavBar_Configuration_Shipping_Warehouses.click();
			break;
		case "Pickup points":
			NavBar_Configuration_Shipping_PickupPoints.click();
			break;
		case "Dates and ranges":
			NavBar_Configuration_Shipping_DatesAndRanges.click();
			break;
		case "Measures":
			NavBar_Configuration_Shipping_Measures.click();
			break;
		// NAVBar->Configuration->POS
		case "POS":
			NavBar_Configuration_POS.click();
			break;
		case "PayPal Zettle":
			NavBar_Configuration_POS_PayPalZettle.click();
			break;
		// NAVBar->Configuration->Authentication
		case "Authentication":
			NavBar_Configuration_Authentication.click();
			break;
		case "External authentication":
			NavBar_Configuration_Authentication_ExternalAuthentication.click();
			break;
		case "Multi-factor authentication":
			NavBar_Configuration_Authentication_MultiFactorAuthentication.click();
			break;
		// NAVBar->Configuration (nodes with no children)
		case "Email accounts":
			NavBar_Configuration_EmailAccounts.click();
			break;
		case "Stores":
			NavBar_Configuration_Stores.click();
			break;
		case "Countries":
			NavBar_Configuration_Countries.click();
			break;
		case "Languages":
			NavBar_Configuration_Languages.click();
			break;
		case "Currencies":
			NavBar_Configuration_Currencies.click();
			break;
		case "Payment methods":
			NavBar_Configuration_PaymentMethods.click();
			break;
		case "Payment restrictions":
			NavBar_Configuration_PaymentRestrictions.click();
			break;
		case "Tax providers":
			NavBar_Configuration_TaxProviders.click();
			break;
		case "Tax categories":
			NavBar_Configuration_TaxCategories.click();
			break;
		case "Access control list":
			NavBar_Configuration_AccessControlList.click();
			break;
		case "Widgets":
			NavBar_Configuration_Widgets.click();
			break;
		case "Web API":
			NavBar_Configuration_WebAPI.click();
			break;
		case "Local plugins":
			NavBar_Configuration_LocalPlugins.click();
			break;
		case "All plugins and themes":
			NavBar_Configuration_AllPluginsAndThemes.click();
			break;

		default:
			throw new Exception();
		}
	}

	public List<List<String>> getNavBarItems() {
		List<List<String>> actualList = new ArrayList<List<String>>();

		for (WebElement navBarItem : navBarItems) {
			wait.until(ExpectedConditions.elementToBeClickable(navBarItem));
			System.out.println(navBarItem.getText());
			actualList.add(Arrays.asList(navBarItem.getText()));
		}
		return actualList;
	}
}