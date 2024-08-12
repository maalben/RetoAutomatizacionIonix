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

    public static final Target TEXT_LABEL_ERROR_USERNAME = Target.the("Texto mensaje de error debajo del campo de username")
            .locatedBy(basePathXpath+"/android.widget.TextView[2]");

    public static final Target TEXT_LABEL_ERROR_PASSWORD = Target.the("Texto mensaje de error debajo del campo de password")
            .locatedBy(basePathXpath+"/android.widget.TextView[3]");

    public static final Target TEXT_LABEL_ERROR_REPEAT_PASSWORD = Target.the("Texto mensaje de error debajo del campo repeat password")
            .locatedBy(basePathXpath+"/android.widget.TextView[4]");





        public static final Target TEXTFIELD_USER = Target.the("Campo de texto de usuario")
            .located(MobileBy.AccessibilityId("test-Username"));

    public static final Target TEXTFIELD_PASSWORD = Target.the("Campo de texto de contraseña").located(MobileBy.AccessibilityId("test-Password"));

    public static final Target LABEL_PRODUCTS = Target.the("Etiqueta de titulo Productos").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView"));

    public static final Target ALERT_MESSAGE_ERROR = Target.the("Mensaje error en alerta").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView"));

}
