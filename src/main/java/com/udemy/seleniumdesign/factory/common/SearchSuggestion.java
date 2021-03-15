package com.udemy.seleniumdesign.factory.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchSuggestion extends GoogleAbstractComponent {

    public SearchSuggestion(final WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li.sbct")
    private List<WebElement> suggestions;

    public void clickSuggestionByIndex(int index) {
        this.suggestions.get(index - 1).click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((driver) -> this.suggestions.size() > 5);
    }
}
