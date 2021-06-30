package co.com.utest.tasks;

import co.com.utest.model.UtestData;
import co.com.utest.userinterface.PersonalPage;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FillOutPersonal implements Task {
    private List<UtestData> utestData;

    public FillOutPersonal(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static FillOutPersonal thePage(List<UtestData> utestData) {
        return (FillOutPersonal)Tasks.instrumented(FillOutPersonal.class, new Object[]{utestData});
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(new Performable[]{Enter.theValue(new CharSequence[]{((UtestData)this.utestData.get(0)).getStrfirtName()}).into(PersonalPage.FIRTS_NAME), Enter.theValue(new CharSequence[]{((UtestData)this.utestData.get(0)).getStrlastName()}).into(PersonalPage.LAST_NAME), Enter.theValue(new CharSequence[]{((UtestData)this.utestData.get(0)).getStrEmail()}).into(PersonalPage.EMAIL), SelectFromOptions.byVisibleText(((UtestData)this.utestData.get(0)).getStrbirthMonth()).from(PersonalPage.BIRTH_MONTH), SelectFromOptions.byVisibleText(((UtestData)this.utestData.get(0)).getStrbirthDay()).from(PersonalPage.BIRTH_DAY), SelectFromOptions.byVisibleText(((UtestData)this.utestData.get(0)).getStrbirthYear()).from(PersonalPage.BIRTH_YEAR), Click.on(PersonalPage.BUTTON_LOCATION)});
    }
}
