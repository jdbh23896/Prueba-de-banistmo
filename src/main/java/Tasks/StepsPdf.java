package Tasks;
import userinterfaces.PaginatestPdf;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class StepsPdf implements Task {
    public static StepsPdf navigationpagepdf() {
        return Tasks.instrumented(StepsPdf.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

               actor.attemptsTo(Click.on(PaginatestPdf.PAGEPDF),
                Click.on(PaginatestPdf.DOWNLOADPDF),
                Click.on(PaginatestPdf.VIEWPAGE));

    }
}
