package com.reto.sistecredito.app.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;

import static com.reto.sistecredito.app.util.CapabilitesCommands.isAndroid;

public class SelectText implements Interaction {

    Target targetAndroid;
    String text;
    public SelectText(Target targetAndroid, String texto){
        this.targetAndroid = targetAndroid;
        this.text = texto;
    }
    public static SelectText scroll(Target targetAndroid, String texto){
        return Tasks.instrumented(SelectText.class, targetAndroid, texto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(isAndroid(actor)).andIfSo(Scroll.untilVisibleTarget(targetAndroid.of(text)),
                        Tap.on(targetAndroid.of(text)))
        );
    }
}
