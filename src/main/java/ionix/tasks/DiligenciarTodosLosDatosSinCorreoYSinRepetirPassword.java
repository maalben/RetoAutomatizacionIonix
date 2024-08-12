/**
 * Mario Alejandro Benitez Orozco
 *
 * <p>Copyright (c) 2024 . All Rights Reserved.
 *
 */
package ionix.tasks;

import ionix.models.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static ionix.userinterfaces.LoginUserInterfaces.BUTTON_SUBMIT;
import static ionix.userinterfaces.LoginUserInterfaces.genericTarget;

public class DiligenciarTodosLosDatosSinCorreoYSinRepetirPassword implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(!TestData.getData().get("usuario").toString().equals("null")){
            actor.attemptsTo(Enter.theValue(TestData.getData().get("usuario").toString()).into(genericTarget("EditText","Username", "Campo de texto Username")));
        }
        if(!TestData.getData().get("claveInicial").toString().equals("null")){
            actor.attemptsTo(Enter.theValue(TestData.getData().get("claveInicial").toString()).into(genericTarget("EditText","Password", "Campo de texto Password")));
        }
        if(!TestData.getData().get("claveFinal").toString().equals("null")){
            actor.attemptsTo(Enter.theValue(TestData.getData().get("claveFinal").toString()).into(genericTarget("EditText","Repeat password", "Campo de texto Repeat password")));
        }
        actor.attemptsTo(Click.on(BUTTON_SUBMIT));
    }

    public static DiligenciarTodosLosDatosSinCorreoYSinRepetirPassword enElFormularioDeRegistro(){
        return Tasks.instrumented(DiligenciarTodosLosDatosSinCorreoYSinRepetirPassword.class);
    }
}
