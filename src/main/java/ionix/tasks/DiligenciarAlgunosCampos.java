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

import static ionix.userinterfaces.LoginUserInterfaces.genericTarget;

public class DiligenciarAlgunosCampos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(TestData.getData().get("usuario").toString()).into(genericTarget("EditText","Username", "Campo de texto Username")));
        actor.attemptsTo(Enter.theValue(TestData.getData().get("claveInicial").toString()).into(genericTarget("EditText","Password", "Campo de texto Password")));
        actor.attemptsTo(Click.on(genericTarget("EditText","Repeat password", "Campo de texto Repeat password")));
    }

    public static DiligenciarAlgunosCampos enElFormularioDeRegistro(){
        return Tasks.instrumented(DiligenciarAlgunosCampos.class);
    }
}
