package reto_Diana_Patricia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reto_Diana_Patricia.userinterface.NavegationMenuBusinessUnitPage;

public class NavegateMenuBusinessUnit implements Task {

    public static NavegateMenuBusinessUnit onTheMenu (){
        return Tasks.instrumented(NavegateMenuBusinessUnit.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(NavegationMenuBusinessUnitPage.ORGANIZATION),
            Click.on(NavegationMenuBusinessUnitPage.BUSINESS_UNITS)
        );
    }
}
