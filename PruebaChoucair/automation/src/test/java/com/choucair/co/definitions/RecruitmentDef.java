package com.choucair.co.definitions;

import com.choucair.co.steps.LoginStep;
import com.choucair.co.steps.RecruimentStep;
import com.choucair.co.steps.ValidationStep;
import com.choucair.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class RecruitmentDef {


    @Steps(shared = true)
    RecruimentStep recruitment;
    @Steps(shared = true)
    ValidationStep validate;


    @When("Se ingresan todos los datos del candidato  FirtsName {string} MiddleName {string} Lastname {string}  Email {string} Contact Number {string} notes {string} y se presiona el boton save")
    public void IngresoDatos (String firstName, String middleName,String lastName, String email, String contacNumber, String notes){
        recruitment.inputFirstName(firstName);
        recruitment.inputMiddleName(middleName);
        recruitment.inputLastName(lastName);
        recruitment.ClickSelectVacancy();
        recruitment.inputEmail(email);
        recruitment.inputContactNumber(contacNumber);
        recruitment.inputNotes(notes);
        recruitment.ClickSave();

    }
    @Then("Se visualiza una ventana emergente con el mensaje succesfully Update.")
    public void validarIngreso(){
        Assert.assertTrue(validate.ventanaEmergenteSucces());
    }
}
