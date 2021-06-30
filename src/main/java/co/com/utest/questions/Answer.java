package co.com.utest.questions;

        import co.com.utest.userinterface.CompletePage;
        import net.serenitybdd.screenplay.Actor;
        import net.serenitybdd.screenplay.Question;
        import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String strCompleteSetup;

    public Answer(String strCompleteSetup) {
        this.strCompleteSetup = strCompleteSetup;
    }

    public static Answer toThe(String strCompleteSetup) {
        return new Answer(strCompleteSetup);
    }

    public Boolean answeredBy(Actor actor) {
        String CompleteSetup = ((Text)Text.of(CompletePage.BUTTON_COMPLETE).viewedBy(actor)).asString();
        boolean result = this.strCompleteSetup.equals(CompleteSetup);
        return result;
    }
}
