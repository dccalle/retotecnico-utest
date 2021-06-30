package co.com.utest.tasks;

import co.com.utest.model.UtestData;
import co.com.utest.userinterface.LocationPage;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class FillOutLocation implements Task {
    private List<UtestData> utestData;

    public FillOutLocation(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static FillOutLocation thePage(List<UtestData> utestData) {
        return (FillOutLocation)Tasks.instrumented(FillOutLocation.class, new Object[]{utestData});
    }

    public <T extends Actor> void performAs(T actor) {
        String Country = ((UtestData)this.utestData.get(0)).getStrCountry();
        actor.attemptsTo(new Performable[]{Enter.theValue(new CharSequence[]{((UtestData)this.utestData.get(0)).getStrCity()}).into(LocationPage.INPUT_CITY), Hit.the(new Keys[]{Keys.ARROW_DOWN}).into(LocationPage.INPUT_CITY), Hit.the(new Keys[]{Keys.ENTER}).into(LocationPage.INPUT_CITY), Enter.theValue(new CharSequence[]{((UtestData)this.utestData.get(0)).getStrZip()}).into(LocationPage.INPUT_POST_CODE), Click.on(LocationPage.SELECT_COUNTRY), Enter.theValue(new CharSequence[]{((UtestData)this.utestData.get(0)).getStrCountry()}).into(LocationPage.INPUT_COUNTRY), Click.on(LocationPage.BUTTON_DEVICE)});
    }
}
