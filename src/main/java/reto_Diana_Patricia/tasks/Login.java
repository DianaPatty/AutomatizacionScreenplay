package reto_Diana_Patricia.tasks;

import reto_Diana_Patricia.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Enter.theValue("admin").into(LoginPage.USERNAME),
                Enter.theValue("serenity").into(LoginPage.PASSWORD),
        Click.on(LoginPage.SIGN_IN)

        );


    }
}
