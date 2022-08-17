package reto_Diana_Patricia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MettingPage {
    public static final Target NewMetting = Target.the("").locatedBy("//span[contains(text(),'New Meeting')]");

    public static final Target NameMetting = Target.the("").located(By.name("MeetingName"));

    public static final Target MettingType = Target.the("").locatedBy("//span[contains(text(),'General')]");

    public static final Target SearchMettingType=Target.the("").located(By.id("s2id_autogen6_search"));

    public static final Target SelectMettingType = Target.the("").locatedBy("//span[contains(text(),'Strategy')]");


    public static final Target NumberMetting = Target.the("").located(By.name("MeetingNumber"));

    public static final Target StartDate = Target.the("").located(By.name("StartDate"));

    public static final Target HourStart = Target.the("").locatedBy("//div[4]/select");

    public static final Target EndDate = Target.the("").located(By.name("EndDate"));

    public static final Target HourEnd = Target.the("").locatedBy("//div[5]/select");

    public static final Target Location = Target.the("").locatedBy("(//span[contains(text(),'--select')])[1]");

    public static final Target SearchLocation=Target.the("").located(By.id("s2id_autogen7_search"));

    public static final Target SelectLocation = Target.the("").locatedBy("//span[contains(text(),'On Site')]");

    public static final Target Unit = Target.the("").locatedBy("(//span[contains(text(),'--select')])[1]");

    public static final Target SearchUnit=Target.the("").located(By.id("s2id_autogen8_search"));

    public static final Target SelectUnit = Target.the("").locatedBy("//span[contains(text(),'Talent')]");

    public static final Target OrganizedBy = Target.the("").locatedBy("(//span[contains(text(),'--select')])[1]");

    public static final Target SearchOrganizedBy=Target.the("").located(By.id("s2id_autogen9_search"));

    public static final Target SelectOrganizedBy = Target.the("").locatedBy("//span[contains(text(),'Owen ')]");

    public static final Target Reporter = Target.the("").locatedBy("(//span[contains(text(),'--select')])[1]");

    public static final Target SearchReporter=Target.the("").located(By.id("s2id_autogen10_search"));

    public static final Target SelectReporter = Target.the("").locatedBy("//span[contains(text(),'Z')]");

    public static final Target Attendee = Target.the("").locatedBy("(//span[contains(text(),'--select')])[1]");

    public static final Target SearchAttendee=Target.the("").located(By.id("s2id_autogen12_search"));

    public static final Target SelectAttendee = Target.the("").locatedBy("//span[contains(text(),'Layla ')]");

    public static final Target SaveNewMetting = Target.the("").locatedBy("//span[contains(text(),'Save')]");

    public static final Target FilterUnitName = Target.the("").locatedBy("//*[@id=\"s2id_Serenity_Pro_Meeting_MeetingGrid0_QuickFilter_UnitId\"]/a");

    public static final Target SearchFilterUnitName=Target.the("").located(By.id("s2id_autogen3_search"));

    public static final Target SelectFilterUnitName = Target.the("").locatedBy("//span[contains(text(),'Talent')]");



}
