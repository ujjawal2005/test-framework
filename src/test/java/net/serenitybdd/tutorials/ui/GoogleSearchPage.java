package net.serenitybdd.tutorials.ui;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("https://www.google.com")
public class GoogleSearchPage extends PageObject {
	 @FindBy(id = "lst-ib")
	    public WebElementFacade element;

	    public void search(CharSequence ... charSequences) {
	        element.sendKeys(charSequences);
	    }
}
