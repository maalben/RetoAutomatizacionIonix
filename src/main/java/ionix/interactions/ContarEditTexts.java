package ionix.interactions;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class ContarEditTexts implements Interaction {

    private final Target editTexts;

    public ContarEditTexts(Target editTexts) {
        this.editTexts = editTexts;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades elements = editTexts.resolveAllFor(actor);
        int numberOfEditTexts = elements.size();
        actor.remember("editTextCount", numberOfEditTexts);
    }

    public static ContarEditTexts enLaPantallaDeLogin(Target editTexts){
        return Tasks.instrumented(ContarEditTexts.class, editTexts);

    }
}
