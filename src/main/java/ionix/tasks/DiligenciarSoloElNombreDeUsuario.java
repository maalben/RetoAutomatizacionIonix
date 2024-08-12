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

public class DiligenciarSoloElNombreDeUsuario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(TestData.getData().get("usuario").toString()).into(genericTarget("EditText","Username", "Campo de texto Username")));
        actor.attemptsTo(Click.on(BUTTON_SUBMIT));
    }

    public static DiligenciarSoloElNombreDeUsuario enElFormularioDeRegistro(){
        return Tasks.instrumented(DiligenciarSoloElNombreDeUsuario.class);
    }
}
