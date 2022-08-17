package reto_Diana_Patricia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusinessUnitsPage {
    public static final Target NewBusinessUnit = Target.the("").locatedBy("//span[contains(text(),'New Business Unit')]");

    public static final Target NameBusinessUnit = Target.the("").located(By.name("Name"));

    public static final Target ListParentUnit = Target.the("").locatedBy("//span[contains(text(),'--select--')]");

    public static final Target SearchParentUnit = Target.the("").located(By.id("s2id_autogen1_search"));

    public static final Target SelectParentUnit = Target.the("").locatedBy("//span[contains(text(),'Human Resources')]");


    public static final Target SaveNewBusinessUnit = Target.the("").locatedBy("//span[contains(text(),'Save')]");



}
