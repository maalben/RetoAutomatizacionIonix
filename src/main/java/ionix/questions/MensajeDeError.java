package ionix.questions;

import ionix.interactions.Capturar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class MensajeDeError implements Question<String> {

    private final Target target;

    public MensajeDeError(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(Capturar.unPantallazoComoEvidencia());
        return Text.of(target).answeredBy(actor).toString();
    }

    public static MensajeDeError es(Target target) {
        return  new MensajeDeError(target);
    }
}
