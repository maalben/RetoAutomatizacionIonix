package com.ionix.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ionix.questions.LaValidacionDeCadaCampoDeTexto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import ionix.exceptions.AssertionsAutomationMobilepractice;
import ionix.questions.ElBotonEnLaPantallaLogin;
import ionix.questions.LaCantidadDeCamposDetectados;
import ionix.tasks.Cargar;
import ionix.tasks.ContarLosCampos;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginStepDefinitions {

    @Managed(driver ="appium")
    private WebDriver hisBrowser;
    Actor mario = Actor.named("Mario");

    @Before
    public void setup()
    {
        mario.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Yo cargo los datos de prueba$")
    public void yoCargoLosDatosDePrueba(List<Map<String, String>> data) {
        mario.wasAbleTo(Cargar.losDatosDePrueba(data.get(0)));
    }

    @When("^Yo cuento la cantidad de campos de texto en la pantalla de login$")
    public void yoCuentoLaCantidadDeCamposDeTextoEnLaPantallaDeLogin(){
        mario.attemptsTo(ContarLosCampos.deLaPantallaLogin());
    }

    @Then("Yo deberia ver {string} campos en el formulario")
    public void yoDeberiaVerCamposEnElFormulario(String string) {
        mario.should(seeThat(LaCantidadDeCamposDetectados.es(), equalTo(string))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.CANTIDAD_CAMPOS_NO_ESPERADA));
    }

    @When("^Yo veo los componentes graficos de la pantalla$")
    public void yoVeoLosComponentesGraficosDeLaPantalla(){
        //No hacer nada aqui, esto es solo informativo
    }

    @Then("Yo deberia ver el boton {string}")
    public void yoDeberiaVerElBoton(String string) {
        mario.should(seeThat(ElBotonEnLaPantallaLogin.es(), equalTo(string))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.BOTON_NO_ESPERADO));
    }

    @Then("Yo deberia validar el hint de cada campo de texto con los nombres {string}")
    public void yoDeberiaValidarElHintDeCadaCampoDeTextoConLosNombres(String string) {
        mario.should(seeThat(LaValidacionDeCadaCampoDeTexto.sea(string), equalTo(true))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.CAMPO_DE_TEXTO_NO_ESPERADO));
    }
}
