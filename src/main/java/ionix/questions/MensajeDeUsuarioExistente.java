package ionix.questions;

import ionix.interactions.Capturar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static ionix.userinterfaces.LoginUserInterfaces.*;

public class MensajeDeUsuarioExistente implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(Capturar.unPantallazoComoEvidencia());
        return Text.of(TEXT_LABEL_POPUP).answeredBy(actor).toString();
    }

    public static MensajeDeUsuarioExistente es() {
        return  new MensajeDeUsuarioExistente();
    }
}
