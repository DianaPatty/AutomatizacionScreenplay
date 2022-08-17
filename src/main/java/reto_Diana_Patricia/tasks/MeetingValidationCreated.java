package reto_Diana_Patricia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import reto_Diana_Patricia.userinterface.MettingPage;

import static reto_Diana_Patricia.util.Constants.BUSINESS_UNIT_TALENT;

public class MeetingValidationCreated implements Task {
    public static MeetingValidationCreated onTheBotton(){

        return Tasks.instrumented(MeetingValidationCreated.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MettingPage.FilterUnitName),
                Click.on(MettingPage.SearchFilterUnitName),
                Enter.theValue(BUSINESS_UNIT_TALENT).into(MettingPage.SearchFilterUnitName),
                Click.on(MettingPage.SelectFilterUnitName)




                );
    }
}
