package com.choucair.co.utilities.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class WebSite {
    @Steps(shared = true)
    PageObject choucair;
    @Step("Navegar al sitio web")
    public void navigateTO(String url) {
        choucair.setDefaultBaseUrl(url);
        choucair.open();


    }
}
