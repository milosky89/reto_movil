package com.reto.sistecredito.app.util;

import net.serenitybdd.screenplay.Actor;

public class CapabilitesCommands {

    private CapabilitesCommands() {
        throw new IllegalStateException("Error en ComandosCapabilities");
    }

    public static String getPlatformName(Actor actor) {
        return GetDriver.as(actor).appiumDriver().getCapabilities().getCapability("platformName").toString(); }

    public static boolean isiOS(Actor actor) {
        return getPlatformName(actor).equals("iOS");
    }

    public static boolean isAndroid(Actor actor) {
        return getPlatformName(actor).equals("Android");
    }

}
