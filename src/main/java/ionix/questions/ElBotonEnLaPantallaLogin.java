package ionix.questions;

import ionix.interactions.Capturar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static ionix.userinterfaces.LoginUserInterfaces.BUTTON_SUBMIT;

public class ElBotonEnLaPantallaLogin implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(Capturar.unPantallazoComoEvidencia());
        return Text.of(BUTTON_SUBMIT).answeredBy(actor).toString();
    }

    public static ElBotonEnLaPantallaLogin es() {
        return  new ElBotonEnLaPantallaLogin();
    }
}
