package reto_Diana_Patricia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import reto_Diana_Patricia.userinterface.StarSharpPage;

public class OpenUp implements Task {
    private StarSharpPage StarSharpPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(Open.browserOn(StarSharpPage));
    }
}
