/**
 * Mario Alejandro Benitez Orozco
 *
 * <p>Copyright (c) 2024 . All Rights Reserved.
 *
 */
package ionix.exceptions;

public class AssertionsAutomationMobilepractice extends AssertionError {

    private static final long serialVersionUID = 1L;

    public static final String CANTIDAD_CAMPOS_NO_ESPERADA = "La cantidad de campos detectadas no coincide con la esperada";
    public static final String BOTON_NO_ESPERADO = "El boton de referencia no es el esperado";
    public static final String CAMPO_DE_TEXTO_NO_ESPERADO = "Existe algun campo de texto que no coincide segun en la pantalla";
    public static final String ERROR_MENSAJE_VALIDACION_USUARIO_EXISTENTE = "Error con la validacion de usuario existente";
    public static final String ERROR_MENSAJE_VALIDACION_GENERAL = "El mensaje de error cargado no es el esperado";
    public static final String ERROR_MENSAJE_NUEVO_REGISTRO_NOT_EXPECTED = "Mensaje de creacion de cuenta no esperado";
    public static final String ERROR_MENSAJE_PASSWORD_REQUERIDO = "El mensaje de error de password requerido no es el esperado";
    public static final String ERROR_MENSAJE_EMAIL_ERRONEO = "El mensaje de error de correo no valido no es el esperado";

    public AssertionsAutomationMobilepractice(String message, Throwable cause) {
        super(message, cause);
    }

    public AssertionsAutomationMobilepractice(String message) {
        super(message);
    }

}
