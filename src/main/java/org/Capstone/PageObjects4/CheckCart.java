package org.Capstone.PageObjects4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckCart {
	
	WebDriver driver;

	  public CheckCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Sleeveless Dress']")
	public WebElement Dress1;
	
	@FindBy(xpath="//a[text()='Stylish Dress']")
	public WebElement Dress2;
	
	@FindBy(xpath="//a[text()='Sleeves Top and Short - Blue & Pink']")
	public WebElement Dress3;
	
	@FindBy(xpath="//a[text()='Sleeveless Unicorn Patch Gown - Pink']")
	public WebElement Dress4;
	
	@FindBy(xpath="//a[text()='Cotton Mull Embroidered Dress']")
	public WebElement Dress5;
	
	@FindBy(xpath="//a[text()='Blue Cotton Indie Mickey Dress']")
	public WebElement Dress6;
	
	@FindBy(xpath="//a[text()='Long Maxi Tulle Fancy Dress Up Outfits -Pink']")
	public WebElement Dress7;
	
	@FindBy(xpath="//a[text()='Sleeveless Unicorn Print Fit & Flare Net Dress - Multi']")
	public WebElement Dress8;
	
	@FindBy(xpath="//a[text()='Rose Pink Embroidered Maxi Dress']")
	public WebElement Dress9;
	
	public void CheckDress() {
	
	Assert.assertTrue(Dress1.isDisplayed());
	Assert.assertTrue(Dress2.isDisplayed());
	Assert.assertTrue(Dress3.isDisplayed());
	Assert.assertTrue(Dress4.isDisplayed());
	Assert.assertTrue(Dress5.isDisplayed());
	Assert.assertTrue(Dress6.isDisplayed());
	Assert.assertTrue(Dress7.isDisplayed());
	Assert.assertTrue(Dress8.isDisplayed());
	Assert.assertTrue(Dress9.isDisplayed());
	
	}

}
