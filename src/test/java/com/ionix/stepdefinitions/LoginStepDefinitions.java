package com.ionix.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ionix.exceptions.AssertionsAutomationMobilepractice;
import ionix.exceptions.ErrorElementNotFoundException;
import ionix.models.TestData;
import ionix.questions.*;
import ionix.tasks.*;
import ionix.userinterfaces.LoginUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import static ionix.userinterfaces.LoginUserInterfaces.*;
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

    @When("^Yo confirmo el popup y regreso a la pantalla inicial$")
    public void yoConfirmoElPopupYRegresoALaPantallaInicial(){
        mario.attemptsTo(Click.on(genericTarget("TextView","Confirm", "Boton de confirmar popup")));
        mario.attemptsTo(Click.on(BUTTON_BACK_SCREEN));
        mario.attemptsTo(Click.on(BUTTON_SUBMIT));
    }

    @When("^Yo confirmo el popup$")
    public void yoConfirmoElPopup(){
        mario.attemptsTo(Click.on(genericTarget("TextView", "Confirm", "Boton de confirmar popup")));
    }

    @Then("Yo deberia ver un mensaje de error de usuario existente")
    public void yoDeberiaVerUnMensajeDeErrorDeUsuarioExistente() {
        mario.should(seeThat(MensajeDeUsuarioExistente.es(), equalTo(TestData.getData().get("MensajeEsperado").toString()))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.ERROR_MENSAJE_VALIDACION_USUARIO_EXISTENTE));
    }

    @Then("Yo deberia ver un mensaje de error de que el nombre de usuario ya existe")
    public void yoDeberiaVerUnMensajeDeErrorDeQueElNombreDeUsuarioYaExiste() {
        mario.should(seeThat(MensajeDeError.es(TEXT_LABEL_ERROR), equalTo(TestData.getData().get("MensajeEsperado").toString()))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.ERROR_MENSAJE_VALIDACION_GENERAL));
    }

    @Then("Yo deberia ver un mensaje de error de que el nombre de usuario no deberia contener arroba")
    public void yoDeberiaVerUnMensajeDeErrorDeQueElNombreDeUsuarioNoDeberiaContenerArroba() {
        mario.should(seeThat(MensajeDeError.es(TEXT_LABEL_ERROR), equalTo(TestData.getData().get("MensajeEsperado").toString()))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.ERROR_MENSAJE_VALIDACION_GENERAL));
    }

    @Then("Yo deberia ver un mensaje de error de que el nombre de usuario no debe estar vacio")
    public void yoDeberiaVerUnMensajeDeErrorDeQueElNombreDeUsuarioNoDebeEstarVacio() {
        mario.should(seeThat(MensajeDeError.es(TEXT_LABEL_ERROR), equalTo(TestData.getData().get("MensajeEsperado").toString()))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.ERROR_MENSAJE_VALIDACION_GENERAL));
    }

    @Then("Yo deberia ver un mensaje de error de que el password tiene formato incorrecto")
    public void yoDeberiaVerUnMensajeDeErrorDeQueElPasswordTieneFormatoIncorrecto() {
        mario.should(seeThat(MensajeDeError.es(LoginUserInterfaces.TEXT_LABEL_ERROR), equalTo(TestData.getData().get("MensajeEsperado").toString()))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.ERROR_MENSAJE_VALIDACION_GENERAL));
    }

    @Then("Yo deberia ver el mensaje de bienvenida en la aplicacion")
    public void yoDeberiaVerElMensajeDeBienvenidaEnLaAplicacion() {
        mario.attemptsTo(WaitUntil.the(genericTarget("TextView","Welcome to ionix", "Label de creacion de registro exitoso"), WebElementStateMatchers.isPresent()).forNoMoreThan(5).seconds());
        mario.should(seeThat(MensajeDeError.es(genericTarget("TextView","Welcome to ionix", "Label de creacion de registro exitoso")), equalTo(TestData.getData().get("MensajeEsperado").toString()))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.ERROR_MENSAJE_NUEVO_REGISTRO_NOT_EXPECTED));
    }

    @Then("Yo deberia ver un mensaje de error de que el repeat password tiene formato incorrecto")
    public void yoDeberiaVerUnMensajeDeErrorDeQueElRepeatPasswordTieneFormatoIncorrecto() {
        mario.should(seeThat(MensajeDeError.es(TEXT_LABEL_ERROR_REPEAT_PASSWORD), equalTo(TestData.getData().get("MensajeEsperado").toString()))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.ERROR_MENSAJE_VALIDACION_GENERAL));
    }

    @When("^Yo diligencio solo el nombre de usuario$")
    public void yoDiligencioSoloElNombreDeUsuario(){
        mario.attemptsTo(DiligenciarSoloElNombreDeUsuario.enElFormularioDeRegistro());
    }

    @Then("Yo deberia ver un mensaje de error de que el password es requerido")
    public void yoDeberiaVerUnMensajeDeErrorDeQueElPasswordEsRequerido() {
        mario.should(seeThat(MensajeDeError.es(LoginUserInterfaces.TEXT_LABEL_ERROR), equalTo(TestData.getData().get("MensajeEsperadoClaveInicial").toString()))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.ERROR_MENSAJE_PASSWORD_REQUERIDO));
    }

    @Then("Yo deberia ver un mensaje de error de que el repeat password es requerido")
    public void yoDeberiaVerUnMensajeDeErrorDeQueElRepeatPasswordEsRequerido() {
        mario.should(seeThat(MensajeDeError.es(TEXT_LABEL_ERROR_REPEAT_PASSWORD), equalTo(TestData.getData().get("MensajeEsperadoClaveFinal").toString()))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.ERROR_MENSAJE_PASSWORD_REQUERIDO));
    }

    @When("^Yo diligencio el formulario de registro sin correo y sin repetir el password$")
    public void yoDiligencioElFormularioDeRegistroSinCorreoYSinRepetirElPassword(){
        mario.attemptsTo(DiligenciarTodosLosDatosSinCorreoYSinRepetirPassword.enElFormularioDeRegistro());
    }

    @Then("Yo deberia ver un mensaje de error de que solo el repeat password es requerido")
    public void yoDeberiaVerUnMensajeDeErrorDeQueSoloElRepeatPasswordEsRequerido() {
        mario.should(seeThat(MensajeDeError.es(LoginUserInterfaces.TEXT_LABEL_ERROR), equalTo(TestData.getData().get("MensajeEsperadoClaveFinal").toString()))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.ERROR_MENSAJE_PASSWORD_REQUERIDO));
    }

    @When("^Yo diligencio el formulario de registro completo$")
    public void yoDiligencioElFormularioDeRegistroCompleto(){
        mario.attemptsTo(DiligenciarTodosLosDatos.enElFormularioDeRegistro());
    }

    @Then("Yo deberia ver un mensaje de error de ingresar un correo valido")
    public void yoDeberiaVerUnMensajeDeErrorDeIngresarUnCorreoValido() {
        mario.should(seeThat(MensajeDeError.es(TEXT_LABEL_ERROR_EMAIL), equalTo(TestData.getData().get("MensajeEsperado").toString()))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.ERROR_MENSAJE_EMAIL_ERRONEO));
    }

    @When("^Yo diligencio el formulario de registro para detectar mensaje despues de dejar el focus de un campo$")
    public void yoDiligencioElFormularioDeRegistroParaDetectarMensajeDespuesDeDejarElFocusDeUnCampo(){
        mario.attemptsTo(DiligenciarAlgunosCampos.enElFormularioDeRegistro());
    }

    @Then("Yo deberia ver un mensaje de error de que solo el password no tiene el formato esperado")
    public void yoDeberiaVerUnMensajeDeErrorDeQueSoloElPasswordNoTieneElFormatoEsperado() {
        mario.should(seeThat(MensajeDeError.es(LoginUserInterfaces.TEXT_LABEL_ERROR), equalTo(TestData.getData().get("MensajeEsperado").toString()))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.ERROR_MENSAJE_VALIDACION_GENERAL));
    }

    @When("^Yo diligencio el formulario sin ingresar valores en los campos$")
    public void yoDiligencioElFormularioSinIngresarValoresEnLosCampos(){
        mario.attemptsTo(DiligenciarSinAgregarRegistros.enElFormularioDeRegistro());
    }

    @Then("Yo deberia ver los mensajes de error en los campos obligatorios")
    public void yoDeberiaVerLosMensajesDeErrorEnLosCamposObligatorios() {
        mario.should(seeThat(MensajeDeError.es(LoginUserInterfaces.TEXT_LABEL_ERROR), equalTo(TestData.getData().get("MensajeErrorPassword").toString()))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.ERROR_MENSAJE_VALIDACION_GENERAL));
        mario.should(seeThat(MensajeDeError.es(TEXT_LABEL_ERROR_REPEAT_PASSWORD), equalTo(TestData.getData().get("MensajeErrorRepeatPassword").toString()))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.ERROR_MENSAJE_VALIDACION_GENERAL));
        mario.should(seeThat(MensajeDeError.es(TEXT_LABEL_ERROR), equalTo(TestData.getData().get("MensajeErrorUsuario").toString()))
                .orComplainWith(AssertionsAutomationMobilepractice.class,
                        AssertionsAutomationMobilepractice.ERROR_MENSAJE_VALIDACION_GENERAL));
    }
}
