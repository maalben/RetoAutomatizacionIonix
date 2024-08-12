package ionix.util;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Utilidades {

    public static List<String> transformStringToList(String textWithSeparation, String separation){
        String[] parts = textWithSeparation.split(separation.trim());
        List<String> list = Arrays.asList(parts);
        return list;
    }

    public static List<String> transformTargetToListThroughAttribute(Target target, String attribute, Actor actor){
        ListOfWebElementFacades elements = target.resolveAllFor(actor);
        List<String> actualValues = elements.stream()
                .map(element -> element.getAttribute(attribute))
                .collect(Collectors.toList());
        return actualValues;
    }


}
