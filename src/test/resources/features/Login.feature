Feature: Como usuario quiero validar el login de la aplicacion

  @CP01001
  Scenario: CP01001 Validar la cantidad de campos en el formulario
    When Yo cuento la cantidad de campos de texto en la pantalla de login
    Then Yo deberia ver "4" campos en el formulario

  @CP01002
  Scenario: CP01002 Validar que se visualice botón de Submit
    When Yo veo los componentes graficos de la pantalla
    Then Yo deberia ver el boton "SUBMIT"

  @CP01003
  Scenario: CP01003 Validar el hint o placeholder de cada campo de texto
    When Yo veo los componentes graficos de la pantalla
    Then Yo deberia validar el hint de cada campo de texto con los nombres "Username,Password,Repeat password,Email (Optional)"

  @CP02001
  Scenario Outline: CP02001 Validar campo username no debería permitir un usuario acabado de registrarse
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
    When Yo diligencio el formulario de registro sin correo
    And Yo confirmo el popup y regreso a la pantalla inicial
    Then Yo deberia ver un mensaje de error de usuario existente
    Examples:
      | usuario     | claveInicial | claveFinal | MensajeEsperado                      |
      | testprueba1 | Ra1945++/    | Ra1945++/  | Username exist |

  @CP02002
  Scenario Outline: CP02002 Validar campo username no debería permitir un usuario registrado anteriormente
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
    When Yo diligencio el formulario de registro sin correo
    Then Yo deberia ver un mensaje de error de que el nombre de usuario ya existe
    Examples:
      | usuario    | claveInicial | claveFinal | MensajeEsperado               |
      | ionixtester | Ra1945++/    | Ra1945++/  | Username exist |

  @CP02003
  Scenario Outline: CP02003 Validar campo usuario no debe permitir ingresar en su contenido el carácter arroba (@)
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
    When Yo diligencio el formulario de registro sin correo
    Then Yo deberia ver un mensaje de error de que el nombre de usuario no deberia contener arroba
    Examples:
      | usuario    | claveInicial | claveFinal | MensajeEsperado               |
      | testprueb@ | Ra1945++/    | Ra1945++/  | Username should not contain @ |

  @CP02004
  Scenario Outline: CP02004 Validar campo usuario no debe permitir estar vacío
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
    When Yo diligencio el formulario de registro sin correo
    Then Yo deberia ver un mensaje de error de que el nombre de usuario no debe estar vacio
    Examples:
      | usuario | claveInicial | claveFinal | MensajeEsperado           |
      | null    | Ra1945++/    | Ra1945++/  | Username should not empty |

  @CP02005
  Scenario Outline: CP02005 Verificar que si se ingresa un password 7 caracteres, se debería ver algún mensaje indicando este error
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
    When Yo diligencio el formulario de registro sin correo
    Then Yo deberia ver un mensaje de error de que el password tiene formato incorrecto
    Examples:
      | usuario     | claveInicial | claveFinal | MensajeEsperado                   |
      | testprueba1 | Ra1945+      | Ra1945+    | Password does not have the format |

  @CP02006
  Scenario Outline: CP02006 Validar campo password debe tener 8 caracteres de largo
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
    When Yo diligencio el formulario de registro sin correo
    And Yo confirmo el popup
    Then Yo deberia ver el mensaje de bienvenida en la aplicacion
    Examples:
      | usuario     | claveInicial | claveFinal | MensajeEsperado  |
      | testprueba1 | Ra1945++     | Ra1945++   | Welcome to ionix |

  @CP02007
  Scenario Outline: CP02007 Validar campo password debe tener entre 8 a 10 caracteres de largo
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
    When Yo diligencio el formulario de registro sin correo
    And Yo confirmo el popup
    Then Yo deberia ver el mensaje de bienvenida en la aplicacion
    Examples:
      | usuario     | claveInicial | claveFinal | MensajeEsperado  |
      | testprueba1 | Ra1945++++     | Ra1945++++   | Welcome to ionix |

  @CP02008
  Scenario Outline: CP02008 Validar campo password debe tener más de 10 caracteres de largo
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
    When Yo diligencio el formulario de registro sin correo
    And Yo confirmo el popup
    Then Yo deberia ver el mensaje de bienvenida en la aplicacion
    Examples:
      | usuario     | claveInicial | claveFinal  | MensajeEsperado  |
      | testprueba1 | Ra1945++++-  | Ra1945++++- | Welcome to ionix |

  @CP02009
  Scenario Outline: CP02009 Validar campo password debe contener una letra mayuscula
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
    When Yo diligencio el formulario de registro sin correo
    Then Yo deberia ver un mensaje de error de que el password tiene formato incorrecto
    And Yo deberia ver un mensaje de error de que el repeat password tiene formato incorrecto
    Examples:
      | usuario     | claveInicial | claveFinal | MensajeEsperado                   |
      | testprueba1 | aa1945++     | aa1945++   | Password does not have the format |

  @CP02010
  Scenario Outline: CP02010 Validar campo password debe contener una letra minuscula
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
    When Yo diligencio el formulario de registro sin correo
    Then Yo deberia ver un mensaje de error de que el password tiene formato incorrecto
    And Yo deberia ver un mensaje de error de que el repeat password tiene formato incorrecto
    Examples:
      | usuario     | claveInicial | claveFinal | MensajeEsperado                   |
      | testprueba1 | AA1945++     | AA1945++   | Password does not have the format |

  @CP02011
  Scenario Outline: CP02011 Validar campo password debe contener un caracter numerico
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
    When Yo diligencio el formulario de registro sin correo
    Then Yo deberia ver un mensaje de error de que el password tiene formato incorrecto
    And Yo deberia ver un mensaje de error de que el repeat password tiene formato incorrecto
    Examples:
      | usuario     | claveInicial | claveFinal | MensajeEsperado                   |
      | testprueba1 | AAabcd++     | AAabcd++   | Password does not have the format |

  @CP02012
  Scenario Outline: CP02012 Validar campo password debe contener un caracter especial
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
    When Yo diligencio el formulario de registro sin correo
    Then Yo deberia ver un mensaje de error de que el password tiene formato incorrecto
    And Yo deberia ver un mensaje de error de que el repeat password tiene formato incorrecto
    Examples:
      | usuario     | claveInicial | claveFinal | MensajeEsperado                   |
      | testprueba1 | AAabcd12     | AAabcd12   | Password does not have the format |

  @CP02013
  Scenario Outline: CP02013 Validar campo password no debe quedar vacio
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | MensajeEsperadoClaveInicial   | MensajeEsperadoClaveFinal |
      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperadoClaveInicial> |<MensajeEsperadoClaveFinal> |
    When Yo diligencio solo el nombre de usuario
    Then Yo deberia ver un mensaje de error de que el password es requerido
    And Yo deberia ver un mensaje de error de que el repeat password es requerido
    Examples:
      | usuario     | claveInicial | claveFinal | MensajeEsperadoClaveInicial | MensajeEsperadoClaveFinal   |
      | testprueba1 | AAabcd12     | AAabcd12   | Password is required        | Repeat password is required |

  @CP02014
  Scenario Outline: CP02014 Validar campo repeat password no debe ser idéntico al campo de password
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | MensajeEsperado   |
      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperado> |
    When Yo diligencio el formulario de registro sin correo
    Then Yo deberia ver un mensaje de error de que el password tiene formato incorrecto
    Examples:
      | usuario     | claveInicial | claveFinal | MensajeEsperado                   |
      | testprueba1 | Ra1945++     | Ra1945+-   | Password does not have the format |

  @CP02015
  Scenario Outline: CP02015 Validar campo repeat password no debe quedar vacio
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | MensajeEsperadoClaveFinal   |
      | <usuario> | <claveInicial> | <claveFinal> | <MensajeEsperadoClaveFinal> |
    When Yo diligencio el formulario de registro sin correo y sin repetir el password
    Then Yo deberia ver un mensaje de error de que solo el repeat password es requerido
    Examples:
      | usuario     | claveInicial | claveFinal | MensajeEsperadoClaveFinal             |
      | testprueba1 | Ra1945++     | null       | Repeat password is required |

  @CP02016
  Scenario Outline: CP02016 Validar si el campo Email es llenado, no tenga el formato de email (a@a.a)
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | correo        | MensajeEsperado   |
      | <usuario> | <claveInicial> | <claveFinal> | <correo> | <MensajeEsperado> |
    When Yo diligencio el formulario de registro completo
    Then Yo deberia ver un mensaje de error de ingresar un correo valido
    Examples:
      | usuario     | claveInicial | claveFinal | correo | MensajeEsperado             |
      | testprueba1 | Ra1945++     | Ra1945++   | prueba | Please enter a valid email |

  @CP02017
  Scenario Outline: CP02017 Validar si el campo Email es llenado, debe tener el formato de email (a@a.a)
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | correo        | MensajeEsperado   |
      | <usuario> | <claveInicial> | <claveFinal> | <correo> | <MensajeEsperado> |
    When Yo diligencio el formulario de registro completo
    Then Yo deberia ver el mensaje de bienvenida en la aplicacion
    Examples:
      | usuario     | claveInicial | claveFinal | correo | MensajeEsperado             |
      | testprueba1 | Ra1945++     | Ra1945++   | prueba@test.com | Welcome to ionix |

  @CP03001
  Scenario Outline: CP03001 Validar si al dejar el focus de un campo con error se muestra mensaje
    Given Yo cargo los datos de prueba
      | usuario   | claveInicial   | claveFinal   | correo        | MensajeEsperado   |
      | <usuario> | <claveInicial> | <claveFinal> | <correo> | <MensajeEsperado> |
    When Yo diligencio el formulario de registro para detectar mensaje despues de dejar el focus de un campo
    Then Yo deberia ver un mensaje de error de que solo el password no tiene el formato esperado
    Examples:
      | usuario     | claveInicial | claveFinal | correo | MensajeEsperado  |
      | testprueba1 | Ra           | null       | null      | Password does not have the format |

  @CP03002
  Scenario Outline: CP03002 Validar si los campos obligatorios del formulario no son llenados se vea mensaje de error debajo de ellos
    Given Yo cargo los datos de prueba
      | MensajeErrorUsuario   | MensajeErrorPassword   | MensajeErrorRepeatPassword   |
      | <MensajeErrorUsuario> | <MensajeErrorPassword> | <MensajeErrorRepeatPassword> |
    When Yo diligencio el formulario sin ingresar valores en los campos
    Then Yo deberia ver los mensajes de error en los campos obligatorios
    Examples:
      | MensajeErrorUsuario  | MensajeErrorPassword | MensajeErrorRepeatPassword  |
      | Username is required | Password is required | Repeat password is required |