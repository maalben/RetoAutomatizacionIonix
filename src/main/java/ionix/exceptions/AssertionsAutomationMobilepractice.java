package ionix.exceptions;

public class AssertionsAutomationMobilepractice extends AssertionError {

    private static final long serialVersionUID = 1L;

    public static final String CANTIDAD_CAMPOS_NO_ESPERADA = "La cantidad de campos detectadas no coincide con la esperada";
    public static final String BOTON_NO_ESPERADO = "El boton de referencia no es el esperado";
    public static final String CAMPO_DE_TEXTO_NO_ESPERADO = "Existe algun campo de texto que no coincide segun en la pantalla";
    public static final String ERROR_MENSAJE_VALIDACION_USUARIO_EXISTENTE = "Error con la validacion de usuario existente";

    public AssertionsAutomationMobilepractice(String message, Throwable cause) {
        super(message, cause);
    }

    public AssertionsAutomationMobilepractice(String message) {
        super(message);
    }

}
