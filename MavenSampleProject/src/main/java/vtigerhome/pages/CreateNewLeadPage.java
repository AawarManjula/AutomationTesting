package vtigerhome.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationtesting.utilities.SeleniumUtility;

public class CreateNewLeadPage 
{
	@FindBy(name="salutationtype")
	private WebElement firstNameSalutationTypeDropdown;
	
	@FindBy(id="Leads_editView_fieldName_firstname")
	private WebElement firstNameInputField;
	
	@FindBy(id="Leads_editView_fieldName_lastname")
	private WebElement lastNameInputField;
	
	@FindBy(id="Leads_editView_fieldName_phone")
	private WebElement primaryPhoneInputField;
	
	@FindBy(id="Leads_editView_fieldName_company")
	private WebElement companyInputField;
	
	@FindBy(id="Leads_editView_fieldName_email")
	private WebElement primaryEmailInputField;
	
	
	@FindBy(name="assigned_user_id")
	private WebElement assignedToDropdown;	
	
	@FindBy(id="goToFullForm")
	private WebElement goToFullFormButton;
	
	@FindBy(name="saveButton")
	private WebElement saveButton;
	
	@FindBy(css=".cancelLink")
	private WebElement cancelButton;

	public WebElement getFirstNameSalutationTypeDropdown() {
		return firstNameSalutationTypeDropdown;
	}

	public WebElement getFirstNameInputField() {
		return firstNameInputField;
	}

	public WebElement getLastNameInputField() {
		return lastNameInputField;
	}

	public WebElement getPrimaryPhoneInputField() {
		return primaryPhoneInputField;
	}

	public WebElement getCompanyInputField() {
		return companyInputField;
	}

	public WebElement getPrimaryEmailInputField() {
		return primaryEmailInputField;
	}

	public WebElement getAssignedToDropdown() {
		return assignedToDropdown;
	}

	public WebElement getGoToFullFormButton() {
		return goToFullFormButton;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	public void fillLeadCreationForm()
	{
		SeleniumUtility.setSleepTime(2000);
		SeleniumUtility.handleHtmlDropdownListWithVisibleText(getFirstNameSalutationTypeDropdown(), SeleniumUtility.properties.getProperty("salutionType"));
		getFirstNameInputField().sendKeys(SeleniumUtility.properties.getProperty("firstName"));
		
		getLastNameInputField().sendKeys(SeleniumUtility.properties.getProperty("lastName"));
		
		getPrimaryPhoneInputField().sendKeys(SeleniumUtility.properties.getProperty("primaryNumber"));
		
		getCompanyInputField().sendKeys(SeleniumUtility.properties.getProperty("company"));
		
		getPrimaryEmailInputField().sendKeys(SeleniumUtility.properties.getProperty("primaryEmail"));
		
		SeleniumUtility.handleHtmlDropdownListWithVisibleText(getAssignedToDropdown(), SeleniumUtility.properties.getProperty("assignedTo"));
		
		getSaveButton().click();
	}
}
