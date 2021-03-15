package com.udemy.seleniumdesign.factory.common;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SearchWidget extends GoogleAbstractComponent {

    public SearchWidget(final WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "q")
    private WebElement searchWidget;

    public void enterKeyword(final String keyword) {
        this.searchWidget.clear();
        for (char ch : keyword.toCharArray()) {
            Uninterruptibles.sleepUninterruptibly(20, TimeUnit.MILLISECONDS);
            this.searchWidget.sendKeys(ch + "");
        }
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((driver) -> this.searchWidget.isDisplayed());
    }
}
