package co.com.utest.tasks;

import co.com.utest.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private UtestPage UtestPage;

    public static OpenUp thePage() {
        return (OpenUp)Tasks.instrumented(OpenUp.class, new Object[0]);
    }

    public <T extends Actor> void performAs(T actor) {
        Performable[] var10001 = new Performable[]{Open.browserOn(this.UtestPage), null};
        UtestPage var10004 = this.UtestPage;
        var10001[1] = Click.on(co.com.utest.userinterface.UtestPage.JOIN);
        actor.attemptsTo(var10001);
    }
}
