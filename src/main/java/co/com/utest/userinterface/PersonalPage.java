package co.com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalPage extends PageObject {
    public static final Target FIRTS_NAME =
            Target.the("where we write the first name").located(By.id("firstName"));
    public static final Target LAST_NAME =
            Target.the("where we write the last name").located(By.id("lastName"));
    public static final Target EMAIL =
            Target.the("where we write the email").located(By.id("email"));
    public static final Target BIRTH_MONTH =
            Target.the("where we write select birthday month ").located(By.id("birthMonth"));
    public static final Target BIRTH_DAY =
            Target.the("where we write select birthday month ").located(By.id("birthDay"));
    public static final Target BIRTH_YEAR =
            Target.the("where we write select birthday month ").located(By.id("birthYear"));
    public static final Target BUTTON_LOCATION =
            Target.the("button to show location form ").located(By.xpath("//a[@class='btn btn-blue']"));


}
