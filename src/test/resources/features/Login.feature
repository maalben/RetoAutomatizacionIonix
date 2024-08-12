Feature: Como usuario quiero validar el login de la aplicacion

#  @CP01001
#  Scenario: Validar la cantidad de campos en el formulario
#    When Yo cuento la cantidad de campos de texto en la pantalla de login
#    Then Yo deberia ver "4" campos en el formulario

#  @CP01002
#  Scenario: Validar que se visualice botón de Submit
#    When Yo veo los componentes graficos de la pantalla
#    Then Yo deberia ver el boton "SUBMIT"

#  @CP01003
#  Scenario: Validar el hint o placeholder de cada campo de texto
#    When Yo veo los componentes graficos de la pantalla
#    Then Yo deberia validar el hint de cada campo de texto con los nombres "Username,Password,Repeat password,Email (Optional)"

  @CP02001
  Scenario Outline: Validar campo username no debería permitir un usuario registrado anteriormente
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | MensajeEsperado |
      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado>  |
    When Yo diligencio el formulario de registro sin correo
    And Yo regreso a la pantalla inicial
    Then Yo deberia ver un mensaje de error de usuario existente
    Examples:
      | usuario     | claveInicial | claveFinal | MensajeEsperado                      |
      | testprueba1 | Ra1945++/    | Ra1945++/  | Nombre de usuario ya esta registrado |



#  @CP001
#  Scenario Outline: Login to the demo sauceLabs application success
#    Given I load test data
#      | user   | pass   | expected   |
#      | <user> | <pass> | <expected> |
#    When I try to login myself using my data authentication
#    Then I should see the title screen expected
#
#    Examples:
#      | user          | pass         | expected  |
#      | standard_user | secret_sauce | PRODUCTS |
#
#
#  @CP002
#  Scenario Outline: Login to the demo sauceLabs application with login failed
#    Given I load test data
#      | user   | pass   | expected   |
#      | <user> | <pass> | <expected> |
#    When I try to login myself using my data authentication
#    Then I should see the alert with message expected
#
#    Examples:
#      | user            | pass         | expected                                                                  |
#      | locked_out_user | secret_sauce | Sorry, this user has been locked out.                              |
#      | admin           | secret_sauce | Username and password do not match any user in this service. |
