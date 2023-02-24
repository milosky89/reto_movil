package com.reto.sistecredito.app.interactions;

import com.reto.sistecredito.app.util.GetDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class TapByTarget implements Task {

    private Target target;
    public TapByTarget(Target target) {
        this.target = target;
    }

    @Override
    @SuppressWarnings("rawtypes")
    @Step("{0} taps on #target")
    public <T extends Actor> void performAs(T actor) {
        new TouchAction((PerformsTouchActions) GetDriver.as(actor).appiumDriver())
                .tap(
                        new TapOptions()
                                .withElement(
                                        new ElementOption().withElement(target.resolveFor(actor).getWrappedElement())))
                .perform()
                .release();
    }
}
