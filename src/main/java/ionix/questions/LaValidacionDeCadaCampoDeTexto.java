/**
 * Mario Alejandro Benitez Orozco
 *
 * <p>Copyright (c) 2024 . All Rights Reserved.
 *
 */
package ionix.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static ionix.userinterfaces.LoginUserInterfaces.EDIT_TEXTS;
import static ionix.util.Utilidades.transformStringToList;
import static ionix.util.Utilidades.transformTargetToListThroughAttribute;

public class LaValidacionDeCadaCampoDeTexto implements Question<Boolean> {

    private final String textFieldsValues;

    public LaValidacionDeCadaCampoDeTexto(String textFieldsValues) {
        this.textFieldsValues = textFieldsValues;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return transformTargetToListThroughAttribute(EDIT_TEXTS, "hint", actor)
                .equals(transformStringToList(textFieldsValues, ","));
    }

    public static LaValidacionDeCadaCampoDeTexto sea(String textFieldsValues) {
        return  new LaValidacionDeCadaCampoDeTexto(textFieldsValues);
    }
}
