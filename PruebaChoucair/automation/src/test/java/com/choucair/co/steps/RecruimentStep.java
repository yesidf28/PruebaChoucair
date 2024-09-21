package com.choucair.co.steps;

import com.choucair.co.pages.RecruitmentPages;
import net.thucydides.core.annotations.Step;

public class RecruimentStep extends RecruitmentPages{

    @Step("Agregar Candidato")
    public void  ClickAdd(){
        buttonAdd.click();
    }

    @Step("Ingresar FirstName")
    public void  inputFirstName(String firstName){
        firstName1.sendKeys(firstName);
    }

    @Step("Ingresar middleName")
    public void  inputMiddleName(String middleName){
        middleName1.sendKeys(middleName);
    }

    @Step("Ingresar lastName")
    public void  inputLastName(String lastName){
        lastName1.sendKeys(lastName);
    }

    @Step("Seleccionar Vacancy")
    public void  ClickSelectVacancy(){
        buttonSelectVacancy.click();
        selectVacancy.click();
    }

    @Step("Ingresar Email")
    public void  inputEmail(String email){
        email1.sendKeys(email);
    }

    @Step("Ingresar Contact Number")
    public void  inputContactNumber(String contactNumber){
        contactNumber1.sendKeys(contactNumber);
    }

    @Step("Ingresar Notes")
    public void  inputNotes(String notes){
        notes1.sendKeys(notes);
    }

    @Step("Guardar registro")
    public void  ClickSave(){
        buttonSave.click();

    }


}

