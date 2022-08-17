package reto_Diana_Patricia.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class NavegationMenuBusinessUnitPage {


    public static final Target ORGANIZATION = Target.the("").locatedBy("//span[contains(text(),'Organization')]");

    public static final Target BUSINESS_UNITS = Target.the("").locatedBy("//span[contains(text(),'Business Units')]");
}
