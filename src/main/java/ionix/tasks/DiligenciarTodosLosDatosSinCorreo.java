package ionix.tasks;

import ionix.models.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static ionix.userinterfaces.LoginUserInterfaces.BUTTON_SUBMIT;
import static ionix.userinterfaces.LoginUserInterfaces.genericTarget;

public class DiligenciarTodosLosDatosSinCorreo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(Enter.theValue(TestData.getData().get("usuario").toString()).into(genericTarget("EditText","Username", "Campo de texto Username")));
        actor.attemptsTo(Enter.theValue(TestData.getData().get("claveInicial").toString()).into(genericTarget("EditText","Password", "Campo de texto Password")));
        actor.attemptsTo(Enter.theValue(TestData.getData().get("claveFinal").toString()).into(genericTarget("EditText","Repeat password", "Campo de texto Repeat password")));
        actor.attemptsTo(Click.on(BUTTON_SUBMIT));
        actor.attemptsTo(Click.on(genericTarget("TextView","Confirm", "Boton de confirmar popup")));
    }

    public static DiligenciarTodosLosDatosSinCorreo enElFormularioDeRegistro(){
        return Tasks.instrumented(DiligenciarTodosLosDatosSinCorreo.class);
    }
}
