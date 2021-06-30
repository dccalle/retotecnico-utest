package co.com.utest.tasks;

import co.com.utest.model.UtestData;
import co.com.utest.userinterface.CompletePage;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillOutComplete implements Task {
    private List<UtestData> utestData;

    public FillOutComplete(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static FillOutComplete thePage(List<UtestData> utestData) {
        return (FillOutComplete)Tasks.instrumented(FillOutComplete.class, new Object[]{utestData});
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(new Performable[]{Enter.theValue(new CharSequence[]{((UtestData)this.utestData.get(0)).getStrPassword()}).into(CompletePage.PASSWORD), Enter.theValue(new CharSequence[]{((UtestData)this.utestData.get(0)).getStrPassword()}).into(CompletePage.PASSWORD_CONFIRM), Click.on(CompletePage.CHECKBOX_STAYINFORM), Click.on(CompletePage.CHECKBOX_TERMSOFUSE), Click.on(CompletePage.CHECKBOX_PRIVACY), Click.on(CompletePage.BUTTON_COMPLETE)});
    }
}
