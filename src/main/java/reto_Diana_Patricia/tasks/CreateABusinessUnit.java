package reto_Diana_Patricia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import reto_Diana_Patricia.userinterface.BusinessUnitsPage;

import static reto_Diana_Patricia.util.Constants.BUSINESS_UNIT_TALENT;
import static reto_Diana_Patricia.util.Constants.PARENT_UNIT_HUMAN_RESOURCES;

public class CreateABusinessUnit implements Task{
    public static CreateABusinessUnit onTheBotton (){

        return Tasks.instrumented(CreateABusinessUnit.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BusinessUnitsPage.NewBusinessUnit),
                Enter.theValue(BUSINESS_UNIT_TALENT).into(BusinessUnitsPage.NameBusinessUnit),
                Click.on(BusinessUnitsPage.ListParentUnit),
                Click.on(BusinessUnitsPage.SearchParentUnit),
                Enter.theValue(PARENT_UNIT_HUMAN_RESOURCES).into(BusinessUnitsPage.SearchParentUnit),
                Click.on(BusinessUnitsPage.SelectParentUnit),
                Click.on(BusinessUnitsPage.SaveNewBusinessUnit)

        );
    }
}






