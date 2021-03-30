package com.udemy.seleniumdesign.srp.exercice.google.arabic;

import com.udemy.seleniumdesign.srp.exercice.common.GoogleAbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleArabicLink extends GoogleAbstractComponent {


    public GoogleArabicLink(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "العربية")
    private WebElement link;

    public void click() {
        this.link.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((driver) -> this.link.isDisplayed());
    }
}
