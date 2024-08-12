/**
 * Mario Alejandro Benitez Orozco
 *
 * <p>Copyright (c) 2024 . All Rights Reserved.
 *
 */
package ionix.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import ionix.models.TestData;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Cargar implements Task {
    private final Map<String, String> testData;

    public Cargar(Map<String, String> testData) {
        this.testData = testData;
    }

    public static Cargar losDatosDePrueba(Map<String, String> testData) {
        return Tasks.instrumented(Cargar.class, testData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Set<Map.Entry<String, String>> testDataAux = testData.entrySet();
        TestData.setData(testDataAux.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }
}
