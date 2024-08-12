/**
 * Mario Alejandro Benitez Orozco
 *
 * <p>Copyright (c) 2024 . All Rights Reserved.
 *
 */
package ionix.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LaCantidadDeCamposDetectados implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        int cantidad = actor.recall("editTextCount");
        return String.valueOf(cantidad);
    }

    public static LaCantidadDeCamposDetectados es() {
        return new LaCantidadDeCamposDetectados();
    }
}
