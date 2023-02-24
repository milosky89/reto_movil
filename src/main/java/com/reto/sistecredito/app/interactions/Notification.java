package com.reto.sistecredito.app.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.reto.sistecredito.app.ui.UIHome.BTN_NOTIFICATION;

public class Notification implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(BTN_NOTIFICATION.resolveFor(actor).isPresent()){
            actor.attemptsTo(
                    WaitUntil.the(BTN_NOTIFICATION, WebElementStateMatchers.isPresent()).forNoMoreThan(4).seconds(),
                    Click.on(BTN_NOTIFICATION)
            );
        }
    }
    public static Notification inScreen(){
        return Tasks.instrumented(Notification.class);
    }
}
