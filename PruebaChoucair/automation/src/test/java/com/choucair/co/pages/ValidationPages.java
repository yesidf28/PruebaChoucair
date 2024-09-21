package com.choucair.co.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class ValidationPages extends PageObject {


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")
    protected WebElementFacade menuRecruitment;

    @FindBy(xpath = "//*[contains(text(), 'Success')]")
    protected WebElementFacade ventanaEmergente;
}
