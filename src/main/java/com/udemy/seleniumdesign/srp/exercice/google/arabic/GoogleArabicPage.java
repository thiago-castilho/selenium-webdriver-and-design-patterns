package com.udemy.seleniumdesign.srp.exercice.google.arabic;

import com.udemy.seleniumdesign.srp.exercice.common.GoogleKeyboard;
import com.udemy.seleniumdesign.srp.exercice.common.GoogleKeyboardIcon;
import com.udemy.seleniumdesign.srp.exercice.google.french.GoogleFrenchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleArabicPage extends GoogleFrenchPage {

    private WebDriver driver;
    private GoogleKeyboardIcon keyboardIcon;
    private GoogleArabicLink link;
    private GoogleKeyboard keyboard;

    public GoogleArabicPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.link =PageFactory.initElements(driver, GoogleArabicLink.class);
        this.keyboardIcon = PageFactory.initElements(driver, GoogleKeyboardIcon.class);
        this.keyboard = PageFactory.initElements(driver, GoogleKeyboard.class);
    }

    @Override
    public void goTo() {
        this.driver.get("https://www.google.com.sa/");
    }

    public GoogleArabicLink getArabicLink() {
        return this.link;
    }

    public GoogleKeyboardIcon getKeyboardIcon() {
        return this.keyboardIcon;
    }

    public GoogleKeyboard getKeyboard() {
        return this.keyboard;
    }
}
