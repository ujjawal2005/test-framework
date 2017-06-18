package net.serenitybdd.tutorials.features.navigation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.tutorials.ui.GoogleSearchPage;
import net.thucydides.core.annotations.Managed;
@RunWith(SerenityRunner.class)
public class TmpTest {
	@Managed
    WebDriver driver;

	GoogleSearchPage testPage;

    @Test
    public void test() {
    	
    	//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        testPage.open(); //the first instance is being open here
        testPage.search("google"); //the second is here
    }
}
