package reto_Diana_Patricia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reto_Diana_Patricia.userinterface.NavegationMenuMettingPage;

public class NavegateMenuMetting implements Task {
    public static NavegateMenuMetting onTheMenu (){
        return Tasks.instrumented(NavegateMenuMetting.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NavegationMenuMettingPage.MEETING),
                Click.on(NavegationMenuMettingPage.MEETINGS)



        );
    }
}
