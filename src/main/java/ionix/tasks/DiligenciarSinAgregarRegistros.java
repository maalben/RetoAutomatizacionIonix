/**
 * Mario Alejandro Benitez Orozco
 *
 * <p>Copyright (c) 2024 . All Rights Reserved.
 *
 */
package ionix.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static ionix.userinterfaces.LoginUserInterfaces.BUTTON_SUBMIT;

public class DiligenciarSinAgregarRegistros implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_SUBMIT));
    }

    public static DiligenciarSinAgregarRegistros enElFormularioDeRegistro(){
        return Tasks.instrumented(DiligenciarSinAgregarRegistros.class);
    }
}
