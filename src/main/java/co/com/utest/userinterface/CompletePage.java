package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompletePage {
    public static final Target PASSWORD =
            Target.the("where we write the Password").located(By.id("password"));
    public static final Target PASSWORD_CONFIRM =
            Target.the("where we Confirm Password").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_STAYINFORM =
            Target.the("where we check stayinform").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_TERMSOFUSE =
            Target.the("where we check termofuse").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_PRIVACY =
            Target.the("where we  check privacy").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_COMPLETE =
            Target.the("complete setup").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
    public static final Target COMPLETE_SETUP =
            Target.the("Complete setup").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));

}

