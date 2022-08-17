package reto_Diana_Patricia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target USERNAME = Target.the("").located(By.name("Username"));

    public static final Target PASSWORD = Target.the("").located(By.name("Password"));

    public static final Target SIGN_IN = Target.the("").located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));


}
