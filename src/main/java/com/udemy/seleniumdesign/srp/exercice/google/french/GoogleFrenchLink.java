package com.udemy.seleniumdesign.srp.exercice.google.french;

import com.udemy.seleniumdesign.srp.exercice.common.GoogleAbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleFrenchLink extends GoogleAbstractComponent {

    public GoogleFrenchLink(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Français")
    private WebElement link;

    public void click() {
        this.link.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((driver) -> this.link.isDisplayed());
    }
}
