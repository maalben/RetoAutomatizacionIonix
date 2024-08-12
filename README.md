
# RetoAutomatizacionIonix

En este repositorio se almacena todo el desarrollo del reto de automatización para la vacante de QA Automation Engineer en la empresa IONIX.


Tecnologías usadas:

Java 11

Gradle 7.4.2

Serenity BDD 3.3.10

Appium 8.3.0

Appium Server 2.11.3


Para ejecutar la prueba, se puede de 2 maneras, desde el IDE Intellij, cargando el proyecto, y solo es ejecutar el archivo TestRunner, el cual se encuentra en la siguiente ruta:

src/test/java/com/ionix/runners/TestRunners.java

Solo es presionar click derecho sobre el archivo y ejecutar.


La otra manera es a través de interfaz de comandos, tener en cuenta la versión del SO.


Para Mac:

./gradlew clean test

Para Windows:

gradle clean test


En mi caso no lo he validado en Windows, solo en Mac, pero debería servir igual.

Por último, tenga presente que para que esto le ejecute debe tener ejecutando el appium server antes que nada y un dispositivo simulador de Android Versión 12, sino es la versión, deberá modificarla en el archivo serenity.properties. Ya con estas precondiciones puede ejecutar sin ningún problema.
