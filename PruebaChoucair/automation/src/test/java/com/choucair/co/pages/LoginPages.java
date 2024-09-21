package com.choucair.co.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import  net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPages extends PageObject{

    @FindBy(name = "username")
    protected WebElementFacade inputUsername;

    @FindBy(name = "password")
    protected WebElementFacade inputPassword;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    protected WebElementFacade buttonLogin;

}
