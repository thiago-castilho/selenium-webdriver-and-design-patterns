package com.udemy.seleniumdesign.srp.exercice.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleKeyboard extends GoogleAbstractComponent{

    public GoogleKeyboard(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "kbd")
    private WebElement keyboard;

    @Override
    public boolean isDisplayed() {
        return this.wait.until((driver) -> this.keyboard.isDisplayed());
    }
}
