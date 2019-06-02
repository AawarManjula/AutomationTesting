package vtigerhome.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboardpage {
	
	
	@FindBy(id="menubar_quickCreate")
	private WebElement quickCreateSymbol;
	
	@FindBy(id="menubar_quickCreate_Leads")
	private WebElement leadLink;
	
	

	

	public WebElement getQuickCreateSymbol() {
		return quickCreateSymbol;
	}

	public WebElement getleadLink() {
		return leadLink;
	}
	
	public void navigateToCreateNewLeadPage(){
		getQuickCreateSymbol().click();
		getleadLink().click();
	}
	

}
