package com.udemy.seleniumdesign.srp.exercice.google.french;

import com.udemy.seleniumdesign.srp.exercice.google.english.GoogleEnglishPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleFrenchPage extends GoogleEnglishPage {

    private WebDriver driver;
    private GoogleFrenchLink link;

    public GoogleFrenchPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.link = PageFactory.initElements(driver, GoogleFrenchLink.class);
    }

    public void goTo() {
        this.driver.get("https://www.google.fr/");
    }

    public GoogleFrenchLink getLink() {
        return link;
    }
}
