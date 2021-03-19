package com.udemy.seleniumdesign.factory.common.settings;

import com.udemy.seleniumdesign.factory.common.GoogleAbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchSettings extends GoogleAbstractComponent {


    public SearchSettings(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[@id='dEjpnf']/li[1]/a[@class='EzVRq'][1]")
    private WebElement searchSettings;

    public void click() {
        this.searchSettings.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((driver) -> this.searchSettings.isDisplayed());
    }
}
