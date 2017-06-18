package net.serenitybdd.tutorials.features.navigation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.tutorials.model.Category;
import net.serenitybdd.tutorials.steps.NavigatingUser;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

/**
 * Created by john on 9/05/2016.
 */
@RunWith(SerenityRunner.class)
public class WhenBrowsingProductCategories {

    @Steps
    NavigatingUser mark;

    @Managed
    WebDriver browser;

    @Test
    public void shouldBeAbleToNavigateToTheMotorsCategory() {
    	//browser = System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
    	//browser = new ChromeDriver();
    	
    	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
    	//System.setProperty("webdriver.chrome.driver","C:/Users/UJJAWAL/serenity-tutorials/tutorial1/webdrivers/chromedriver.exe");
    	
    	
    	//browser=new ChromeDriver();
    	
        // Given
        mark.isOnTheHomePage();

        // When
        mark.navigatesToCategory(Category.Motors);

        // Then
        mark.shouldSeePageTitleContaining("New & Used Cars");
    }
}
