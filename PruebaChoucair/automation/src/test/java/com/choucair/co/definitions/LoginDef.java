package com.choucair.co.definitions;
import com.choucair.co.steps.LoginStep;
import com.choucair.co.steps.ValidationStep;
import com.choucair.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDef {
    @Steps(shared = true)
    WebSite url;
    @Steps(shared = true)
    LoginStep login;
    @Steps(shared = true)
    ValidationStep validate;

    @Given("el usuario tiene acceso al sitio web")
    public void ingresarUrl() {
        url.navigateTO("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("ingresar credenciales validas {string} y {string} luego presionar el boton Login")
    public void inicioSesion (String username,String password){
        login.inputUsername(username);
        login.inputPassword(password);
        login.ClickLogin();
    }
    @Then("Se visualiza la opcion Recruitment.")
    public void validarIngreso(){
        Assert.assertTrue(validate.recruitmentVisible());
    }
}
