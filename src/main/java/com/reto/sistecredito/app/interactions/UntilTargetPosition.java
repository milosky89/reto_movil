package com.reto.sistecredito.app.interactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class UntilTargetPosition implements Interaction {

    private final Target target;
    public UntilTargetPosition(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = getProxiedDriver();
        TouchAction action = new TouchAction((AppiumDriver) driver);
        Dimension dimension = driver.manage().window().getSize();
        int initialPositionX = dimension.width / 2;
        int initialPositionY = dimension.height / 2;
        int finalPositionY = target.resolveFor(actor).getCoordinates().onPage().y;
        while (finalPositionY > dimension.height) {
            action.longPress(PointOption.point(initialPositionX, initialPositionY));
            action.moveTo(PointOption.point(initialPositionX, 1000));
            action.release().perform();
            finalPositionY = target.resolveFor(actor).getCoordinates().onPage().y;
        }
    }
}
