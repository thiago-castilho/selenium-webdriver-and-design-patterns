package com.udemy.seleniumdesign.srp.exercice.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class GoogleAbstractComponent {

    protected WebDriverWait wait;

    public GoogleAbstractComponent(final WebDriver driver) {
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public abstract boolean isDisplayed();
}
