package co.com.utest.tasks;

import co.com.utest.model.UtestData;
import co.com.utest.userinterface.DevicePage;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class FillOutDevice implements Task {
    private List<UtestData> utestData;

    public FillOutDevice(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static FillOutDevice thePage(List<UtestData> utestData) {
        return (FillOutDevice)Tasks.instrumented(FillOutDevice.class, new Object[]{utestData});
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(new Performable[]{Click.on(DevicePage.CONTAINER_PC_OS), Enter.theValue(new CharSequence[]{((UtestData)this.utestData.get(0)).getStrPcOs()}).into(DevicePage.INPUT_PC_OS).thenHit(new Keys[]{Keys.ARROW_DOWN, Keys.ENTER}), Click.on(DevicePage.CONTAINER_PC_OS_VERSION), Enter.theValue(new CharSequence[]{((UtestData)this.utestData.get(0)).getStrPcOsVersion()}).into(DevicePage.INPUT_PC_OS_VERSION).thenHit(new Keys[]{Keys.ENTER}), Click.on(DevicePage.CONTAINER_PC_OS_LANGUAGE), Enter.theValue(new CharSequence[]{((UtestData)this.utestData.get(0)).getStrPcOsLanguage()}).into(DevicePage.INPUT_PC_OS_LANGUAGE).thenHit(new Keys[]{Keys.ENTER}), Click.on(DevicePage.CONTAINER_PHONE_BRAND), Enter.theValue(new CharSequence[]{((UtestData)this.utestData.get(0)).getStrPhoneBrand()}).into(DevicePage.INPUT_PHONE_BRAND).thenHit(new Keys[]{Keys.ENTER}), Click.on(DevicePage.CONTAINER_PHONE_MODEL), Enter.theValue(new CharSequence[]{((UtestData)this.utestData.get(0)).getStrPhoneModel()}).into(DevicePage.INPUT_PHONE_MODEL).thenHit(new Keys[]{Keys.ENTER}), Click.on(DevicePage.CONTAINER_PHONE_OS), Enter.theValue(new CharSequence[]{((UtestData)this.utestData.get(0)).getStrPhoneOS()}).into(DevicePage.INPUT_PHONE_OS).thenHit(new Keys[]{Keys.ENTER}), Click.on(DevicePage.BUTTON_LASTSTEP)});
    }
}
