package com.choucair.co.steps;


import com.choucair.co.pages.LoginPages;
import net.thucydides.core.annotations.Step;

public class LoginStep extends LoginPages {



    @Step("Ingresar Username")
    public void  inputUsername(String username){
        inputUsername.sendKeys(username);
    }

    @Step("Ingresar Password")
    public void  inputPassword(String password){
        inputPassword.sendKeys(password);
    }

    @Step("Presionar Boton Login")
    public void  ClickLogin(){
        buttonLogin.click();
    }
}
