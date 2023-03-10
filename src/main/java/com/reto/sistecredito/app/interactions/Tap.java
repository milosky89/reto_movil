package com.reto.sistecredito.app.interactions;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class Tap {
    private Tap(){}
    public static TapByTarget on(Target target) {
        return Tasks.instrumented(TapByTarget.class, target);
    }
    public static TapByCoordinates on(int x, int y) {
        return Tasks.instrumented(TapByCoordinates.class, x, y);
    }

}
