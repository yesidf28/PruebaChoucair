package com.choucair.co.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import  net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RecruitmentPages extends PageObject{

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    protected WebElementFacade buttonAdd;

    @FindBy(name = "firstName")
    protected WebElementFacade firstName1;

    @FindBy(name = "middleName")
    protected WebElementFacade middleName1;

    @FindBy(name = "lastName")
    protected WebElementFacade lastName1;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[2]/i")
    protected WebElementFacade buttonSelectVacancy;

    @FindBy(xpath = "//*[contains(text(), 'Software Engineer')]")
    protected WebElementFacade selectVacancy;

    @FindBy( xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
    protected WebElementFacade email1;

    @FindBy( xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")
    protected WebElementFacade contactNumber1;

    @FindBy( xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/textarea" )
    protected WebElementFacade notes1;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]")
    protected WebElementFacade buttonSave;


}

