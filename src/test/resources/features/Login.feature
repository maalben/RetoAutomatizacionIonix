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

#  @CP02001
#  Scenario Outline: Validar campo username no debería permitir un usuario registrado anteriormente
#    Given Yo cargo los datos de prueba
#      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
#      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
#    When Yo diligencio el formulario de registro sin correo
#    And Yo confirmo el popup y regreso a la pantalla inicial
#    Then Yo deberia ver un mensaje de error de usuario existente
#    Examples:
#      | usuario     | claveInicial | claveFinal | MensajeEsperado                      |
#      | testprueba1 | Ra1945++/    | Ra1945++/  | Nombre de usuario ya esta registrado |

#  @CP02002
#  Scenario Outline: Validar campo usuario no debe permitir ingresar en su contenido el carácter arroba (@)
#    Given Yo cargo los datos de prueba
#      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
#      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
#    When Yo diligencio el formulario de registro sin correo
#    Then Yo deberia ver un mensaje de error de que el nombre de usuario no deberia contener arroba
#    Examples:
#      | usuario    | claveInicial | claveFinal | MensajeEsperado               |
#      | testprueb@ | Ra1945++/    | Ra1945++/  | Username should not contain @ |

#  @CP02003
#  Scenario Outline: Validar campo usuario no debe permitir ingresar en su contenido el carácter arroba (@)
#    Given Yo cargo los datos de prueba
#      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
#      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
#    When Yo diligencio el formulario de registro sin correo
#    Then Yo deberia ver un mensaje de error de que el nombre de usuario no debe estar vacio
#    Examples:
#      | usuario | claveInicial | claveFinal | MensajeEsperado           |
#      | null    | Ra1945++/    | Ra1945++/  | Username should not empty |

#  @CP02004
#  Scenario Outline: Verificar que si se ingresa un password 7 caracteres, se debería ver algún mensaje indicando este error
#    Given Yo cargo los datos de prueba
#      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
#      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
#    When Yo diligencio el formulario de registro sin correo
#    Then Yo deberia ver un mensaje de error de que el password tiene formato incorrecto
#    Examples:
#      | usuario     | claveInicial | claveFinal | MensajeEsperado                   |
#      | testprueba1 | Ra1945+      | Ra1945+    | Password does not have the format |

#  @CP02005
#  Scenario Outline: Validar campo password debe tener 8 caracteres de largo
#    Given Yo cargo los datos de prueba
#      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
#      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
#    When Yo diligencio el formulario de registro sin correo
#    And Yo confirmo el popup
#    Then Yo deberia ver el mensaje de bienvenida en la aplicacion
#    Examples:
#      | usuario     | claveInicial | claveFinal | MensajeEsperado  |
#      | testprueba1 | Ra1945++     | Ra1945++   | Welcome to ionix |

#  @CP02006
#  Scenario Outline: Validar campo password debe tener entre 8 a 10 caracteres de largo
#    Given Yo cargo los datos de prueba
#      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
#      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
#    When Yo diligencio el formulario de registro sin correo
#    And Yo confirmo el popup
#    Then Yo deberia ver el mensaje de bienvenida en la aplicacion
#    Examples:
#      | usuario     | claveInicial | claveFinal | MensajeEsperado  |
#      | testprueba1 | Ra1945++++     | Ra1945++++   | Welcome to ionix |

#  @CP02007**********
#  Scenario Outline: Validar campo password debe tener más de 10 caracteres de largo
#    Given Yo cargo los datos de prueba
#      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
#      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
#    When Yo diligencio el formulario de registro sin correo
#    And Yo confirmo el popup
#    Then Yo deberia ver el mensaje de bienvenida en la aplicacion
#    Examples:
#      | usuario     | claveInicial | claveFinal  | MensajeEsperado  |
#      | testprueba1 | Ra1945++++-  | Ra1945++++- | Welcome to ionix |

#  @CP02008
#  Scenario Outline: Validar campo password debe contener una letra mayuscula
#    Given Yo cargo los datos de prueba
#      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
#      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
#    When Yo diligencio el formulario de registro sin correo
#    Then Yo deberia ver un mensaje de error de que el password tiene formato incorrecto
#    And Yo deberia ver un mensaje de error de que el repeat password tiene formato incorrecto
#    Examples:
#      | usuario     | claveInicial | claveFinal | MensajeEsperado                   |
#      | testprueba1 | aa1945++     | aa1945++   | Password does not have the format |

#  @CP02009
#  Scenario Outline: Validar campo password debe contener una letra minuscula
#    Given Yo cargo los datos de prueba
#      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
#      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
#    When Yo diligencio el formulario de registro sin correo
#    Then Yo deberia ver un mensaje de error de que el password tiene formato incorrecto
#    And Yo deberia ver un mensaje de error de que el repeat password tiene formato incorrecto
#    Examples:
#      | usuario     | claveInicial | claveFinal | MensajeEsperado                   |
#      | testprueba1 | AA1945++     | AA1945++   | Password does not have the format |

#  @CP02010
#  Scenario Outline: Validar campo password debe contener un caracter numerico
#    Given Yo cargo los datos de prueba
#      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
#      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
#    When Yo diligencio el formulario de registro sin correo
#    Then Yo deberia ver un mensaje de error de que el password tiene formato incorrecto
#    And Yo deberia ver un mensaje de error de que el repeat password tiene formato incorrecto
#    Examples:
#      | usuario     | claveInicial | claveFinal | MensajeEsperado                   |
#      | testprueba1 | AAabcd++     | AAabcd++   | Password does not have the format |

  @CP02011
  Scenario Outline: Validar campo password debe contener un caracter especial
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
    When Yo diligencio el formulario de registro sin correo
    Then Yo deberia ver un mensaje de error de que el password tiene formato incorrecto
    And Yo deberia ver un mensaje de error de que el repeat password tiene formato incorrecto
    Examples:
      | usuario     | claveInicial | claveFinal | MensajeEsperado                   |
      | testprueba1 | AAabcd12     | AAabcd12   | Password does not have the format |

