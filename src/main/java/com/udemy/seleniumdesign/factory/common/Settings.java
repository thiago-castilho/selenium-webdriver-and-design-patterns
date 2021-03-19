package com.udemy.seleniumdesign.factory.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Settings extends GoogleAbstractComponent {

    public Settings(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "Mses6b")
    private WebElement settings;

    public void click() {
        this.settings.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((driver) -> this.settings.isDisplayed());
    }
}
