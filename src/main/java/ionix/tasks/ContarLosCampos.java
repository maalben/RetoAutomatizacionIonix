package ionix.tasks;

import ionix.interactions.ContarEditTexts;
import ionix.interactions.Capturar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static ionix.userinterfaces.LoginUserInterfaces.EDIT_TEXTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ContarLosCampos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
           actor.attemptsTo(ContarEditTexts.enLaPantallaDeLogin(EDIT_TEXTS));
           actor.attemptsTo(Capturar.unPantallazoComoEvidencia());
    }

    public static ContarLosCampos deLaPantallaLogin() {
        return instrumented(ContarLosCampos.class);
    }
}
