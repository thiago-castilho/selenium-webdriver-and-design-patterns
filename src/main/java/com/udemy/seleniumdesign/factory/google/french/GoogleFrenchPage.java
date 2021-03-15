package com.udemy.seleniumdesign.factory.google.french;

import com.udemy.seleniumdesign.factory.common.SearchSuggestion;
import com.udemy.seleniumdesign.factory.common.SearchWidget;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleFrenchPage {

    private WebDriver driver;
    private GoogleFrenchLink link;
    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;

    public GoogleFrenchPage(WebDriver driver) {
        this.driver = driver;
        this.link = PageFactory.initElements(driver, GoogleFrenchLink.class);
        this.searchWidget = PageFactory.initElements(driver, SearchWidget.class);
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
    }

    public void goTo() {
        this.driver.get("https://www.google.fr");
    }

    public GoogleFrenchLink getLink() {
        return link;
    }

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }

    public SearchSuggestion getSearchSuggestion() {
        return searchSuggestion;
    }
}
