package ionix.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUserInterfaces {

    static String basePathXpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]";

    public static final Target EDIT_TEXTS = Target.the("Campos de tipo EditText")
            .locatedBy("//android.widget.EditText");

    public static final Target BUTTON_SUBMIT = Target.the("Boton de submit")
            .located(MobileBy.xpath("//android.widget.Button/android.widget.TextView"));

    public static final Target EDIT_TEXT_USERNAME = Target.the("Campo de texto Usuario")
            .located(MobileBy.xpath( basePathXpath+"/android.widget.EditText[1]"));


        public static final Target TEXTFIELD_USER = Target.the("Campo de texto de usuario")
            .located(MobileBy.AccessibilityId("test-Username"));

    public static final Target TEXTFIELD_PASSWORD = Target.the("Campo de texto de contraseña").located(MobileBy.AccessibilityId("test-Password"));

    public static final Target LABEL_PRODUCTS = Target.the("Etiqueta de titulo Productos").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView"));

    public static final Target ALERT_MESSAGE_ERROR = Target.the("Mensaje error en alerta").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView"));

}
