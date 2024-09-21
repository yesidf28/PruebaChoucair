package com.choucair.co.steps;

import com.choucair.co.pages.ValidationPages;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPages {
    @Step("Validar menu Recruitment")
    public Boolean recruitmentVisible(){
        return menuRecruitment.isDisplayed();
    }

    @Step("Validar emergente Succes")
    public Boolean ventanaEmergenteSucces(){
        return ventanaEmergente.isDisplayed();
    }



}
