/**
 * Mario Alejandro Benitez Orozco
 *
 * <p>Copyright (c) 2024 . All Rights Reserved.
 *
 */
package ionix.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.annotations.Subject;

public class Capturar implements Interaction {

    @Override
    @Subject("{0} Take a screenshot")
    public <T extends Actor> void performAs(T t) {
        Serenity.takeScreenshot();
    }

    public static Capturar unPantallazoComoEvidencia(){
        return new Capturar();
    }
}
