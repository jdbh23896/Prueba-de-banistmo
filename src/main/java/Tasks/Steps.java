package Tasks;

import userinterfaces.Paginatest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Steps implements Task {
    public static Steps navigationpage() {
        return Tasks.instrumented(Steps.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

                actor.attemptsTo(Click.on(Paginatest.PRODUCTOSANDSERVICIOS),
                Click.on(Paginatest.DEPOSITOS),
                Click.on(Paginatest.CUENTACOMERCIAL),
                Click.on(Paginatest.DOCUMENTOS),
                Click.on(Paginatest.PDF));
    }
}
