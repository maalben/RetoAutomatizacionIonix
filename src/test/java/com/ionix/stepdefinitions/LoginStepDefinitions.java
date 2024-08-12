package com.ionix.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ionix.exceptions.AssertionsAutomationMobilepractice;
import ionix.models.TestData;
import ionix.questions.ElBotonEnLaPantallaLogin;
import ionix.questions.LaCantidadDeCamposDetectados;
import ionix.questions.LaValidacionDeCadaCampoDeTexto;
import ionix.questions.MensajeDeUsuarioExistente;
import ionix.tasks.Cargar;
import ionix.tasks.ContarLosCampos;
import ionix.tasks.DiligenciarTodosLosDatosSinCorreo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import static ionix.userinterfaces.LoginUserInterfaces.BUTTON_BACK_SCREEN;
import static ionix.userinterfaces.LoginUserInterfaces.BUTTON_SUBMIT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
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
    public void yoCargoLosDatosDePrueba(List<Map<String, String>> datos) {
        mario.wasAbleTo(Cargar.losDatosDePrueba(datos.get(0)));
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

    @When("^Yo diligencio el formulario de registro sin correo$")
    public void yoDiligencioElFormularioDeRegistroSinCorreo(){
        mario.attemptsTo(DiligenciarTodosLosDatosSinCorreo.enElFormularioDeRegistro());
    }

    @When("^Yo regreso a la pantalla inicial$")
    public void yoRegresoALaPantallaInicial(){
        mario.attemptsTo(Click.on(BUTTON_BACK_SCREEN));
        mario.attemptsTo(Click.on(BUTTON_SUBMIT));
    }

    @Then("Yo deberia ver un mensaje de error de usuario existente")
    public void yoDeberiaVerUnMensajeDeErrorDeUsuarioExistente() {
        mario.should(seeThat(MensajeDeUsuarioExistente.es(), equalTo(TestData.getData().get("MensajeEsperado").toString()))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.ERROR_MENSAJE_VALIDACION_USUARIO_EXISTENTE));
    }
}
