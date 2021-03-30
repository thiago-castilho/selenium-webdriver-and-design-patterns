package com.udemy.seleniumdesign.srp.exercice.common;

import com.udemy.seleniumdesign.srp.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleKeyboardIcon extends AbstractComponent {

    public GoogleKeyboardIcon(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "hOoLGe")
    private WebElement keyboardIcon;

    public void click() {
        this.keyboardIcon.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((driver) -> this.keyboardIcon.isDisplayed());
    }
}
