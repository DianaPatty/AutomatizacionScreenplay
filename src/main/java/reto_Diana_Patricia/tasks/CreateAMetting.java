package reto_Diana_Patricia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import reto_Diana_Patricia.userinterface.BusinessUnitsPage;
import reto_Diana_Patricia.userinterface.MettingPage;

import static reto_Diana_Patricia.util.Constants.BUSINESS_UNIT_TALENT;
import static reto_Diana_Patricia.util.Constants.PARENT_UNIT_HUMAN_RESOURCES;

public class CreateAMetting implements Task {

    public static CreateAMetting onTheBotton (){

        return Tasks.instrumented(CreateAMetting.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(MettingPage.NewMetting),

            Enter.theValue("Daily Team Talent").into(MettingPage.NameMetting),

            Click.on(MettingPage.MettingType),
            Click.on(MettingPage.SearchMettingType),
            Enter.theValue("Strategy").into(MettingPage.SearchMettingType),
            Click.on(MettingPage.SelectMettingType),

            Enter.theValue("765432").into(MettingPage.NumberMetting),

            Click.on(MettingPage.StartDate),
            Clear.field(MettingPage.StartDate),
            Enter.theValue("08/22/2022").into(MettingPage.StartDate),

            Click.on(MettingPage.HourStart),
            SelectFromOptions.byVisibleText("07:00").from(MettingPage.HourStart),

            Click.on(MettingPage.EndDate),
            Clear.field(MettingPage.EndDate),
            Enter.theValue("08/22/2022").into(MettingPage.EndDate),
            Click.on(MettingPage.HourEnd),
            SelectFromOptions.byVisibleText("09:00").from(MettingPage.HourEnd),

            Click.on(MettingPage.Location),
            Click.on(MettingPage.SearchLocation),
            Enter.theValue("On Site").into(MettingPage.SearchLocation),
            Click.on(MettingPage.SelectLocation),

            Click.on(MettingPage.Unit),
            Click.on(MettingPage.SearchUnit),
            Enter.theValue(BUSINESS_UNIT_TALENT).into(MettingPage.SearchUnit),
            Click.on(MettingPage.SelectUnit),

            Click.on(MettingPage.OrganizedBy),
            Click.on(MettingPage.SearchOrganizedBy),
            Enter.theValue("Owen Foster").into(MettingPage.SearchOrganizedBy),
            Click.on(MettingPage.SelectOrganizedBy),

            Click.on(MettingPage.Reporter),
            Click.on(MettingPage.SearchReporter),
            Enter.theValue("Zachary Edwards").into(MettingPage.SearchReporter),
            Click.on(MettingPage.SelectReporter),

            Click.on(MettingPage.Attendee),
            Click.on(MettingPage.SearchAttendee),
            Enter.theValue("Layla Roberts").into(MettingPage.SearchAttendee),
            Click.on(MettingPage.SelectAttendee),

            Click.on(MettingPage.SaveNewMetting)




           );

    }
}
