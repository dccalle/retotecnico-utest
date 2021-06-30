package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class UtestPage extends PageObject {
    public static final Target JOIN = Target.the("Join today button").located(By.className("unauthenticated-nav-bar__sign-up"));


}
