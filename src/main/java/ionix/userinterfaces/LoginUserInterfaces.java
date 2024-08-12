/**
 * Mario Alejandro Benitez Orozco
 *
 * <p>Copyright (c) 2024 . All Rights Reserved.
 *
 */
package ionix.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUserInterfaces {

    static String basePathXpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]";

    public static final Target EDIT_TEXTS = Target.the("Campos de tipo EditText")
            .locatedBy("//android.widget.EditText");

    public static final Target BUTTON_SUBMIT = Target.the("Boton de submit")
            .located(MobileBy.xpath("//android.widget.Button/android.widget.TextView"));

    public static Target genericTarget(String type, String nameField, String description){
        return Target.the(description)
                .located(MobileBy.xpath("//android.widget."+type+"[@text='"+nameField+"']"));
    }

    public static final Target BUTTON_BACK_SCREEN = Target.the("Boton para regresar a la pantalla inicial")
            .locatedBy("//android.widget.Button");

    public static final Target TEXT_LABEL_POPUP = Target.the("Texto del popup")
            .locatedBy("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");

    public static final Target TEXT_LABEL_ERROR_REPEAT_PASSWORD = Target.the("Texto mensaje de error debajo del campo repeat password")
            .locatedBy(basePathXpath+"/android.widget.TextView[3]");

    public static final Target TEXT_LABEL_ERROR = Target.the("Mensaje de error debajo de campo de texto")
            .locatedBy(basePathXpath+"/android.widget.TextView[2]");

    public static final Target TEXT_LABEL_ERROR_EMAIL = Target.the("Texto mensaje de error debajo del campo Email (Optional)")
            .locatedBy(basePathXpath+"/android.widget.TextView[2]");



}
