package co.com.utest.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage extends PageObject {
    public static final Target INPUT_CITY =
            Target.the("Where we write the city").located(By.id("city"));
    public static final Target INPUT_POST_CODE =
            Target.the("Where we write the post code").located(By.id("zip"));
    public static final Target SELECT_COUNTRY =
            Target.the("Container the country").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target INPUT_COUNTRY =
            Target.the("Input the country").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_DEVICE =
            Target.the("button to show device form ").located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}