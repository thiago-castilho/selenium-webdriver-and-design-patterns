package com.udemy.seleniumdesign.test.factory;


import com.udemy.seleniumdesign.factory.google.french.GoogleFrenchPage;
import com.udemy.seleniumdesign.factory.google.arabic.GoogleArabicPage;
import com.udemy.seleniumdesign.factory.google.english.GoogleEnglishPage;
import com.udemy.seleniumdesign.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactoryTest extends BaseTest {

    private GoogleEnglishPage googleEnglishPage;
    private GoogleArabicPage googleArabicPage;
    private GoogleFrenchPage googleFrenchPage;

    @BeforeTest
    public void setupPages() {
        this.googleEnglishPage = new GoogleEnglishPage(driver);
//        this.googleArabicPage = new GoogleArabicPage(driver);
        this.googleFrenchPage = new GoogleFrenchPage(driver);
    }

    @Test(dataProvider = "getData")
    public void googleEnglishWorkflow(String keyword, int index) {

        googleEnglishPage.goTo();
        Assert.assertTrue(googleEnglishPage.getSearchWidget().isDisplayed());

        googleEnglishPage.getSearchWidget().enterKeyword(keyword);
        Assert.assertTrue(googleEnglishPage.getSearchSuggestion().isDisplayed());

        googleEnglishPage.getSearchSuggestion().clickSuggestionByIndex(index);
    }

    @Test(dataProvider = "getData")
    public void googleFrenchWorkflow(String keyword, int index) {

        googleFrenchPage.goTo();
        Assert.assertTrue(googleFrenchPage.getSearchWidget().isDisplayed());
        googleFrenchPage.getSettings().click();

        googleFrenchPage.getSearchSettings().isDisplayed();
        googleFrenchPage.getSearchSettings().click();

//        googleFrenchPage.getLink().click();
//        googleFrenchPage.getSearchWidget().enterKeyword(keyword);
//        Assert.assertTrue(googleFrenchPage.getSearchSuggestion().isDisplayed());
//
//        googleFrenchPage.getSearchSuggestion().clickSuggestionByIndex(index);
    }

//    @Test(dataProvider = "getData")
//    public void googleArabicWorkflow(String keyword, int index) {
//
//        googleArabicPage.goTo();
//        Assert.assertTrue(googleArabicPage.getSearchWidget().isDisplayed());
//
//        googleArabicPage.getSearchWidget().enterKeyword(keyword);
//        Assert.assertTrue(googleArabicPage.getSearchSuggestion().isDisplayed());
//
//        googleArabicPage.getSearchSuggestion().clickSuggestionByIndex(index);
//    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][] {
                {"selenium", 3},
                {"docker", 2}
        };
    }
}
