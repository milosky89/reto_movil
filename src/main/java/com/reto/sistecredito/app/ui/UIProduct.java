package com.reto.sistecredito.app.ui;

import com.reto.sistecredito.app.util.Constants;
import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UIProduct {

    public static final Target BTN_SEARCH = Target.the("button search")
            .located(MobileBy.xpath("(//android.widget.LinearLayout)[5]"));
    public static final Target CARD_PRODUCT = Target.the("card product")
            .locatedBy("//*[contains(@text,'{0}')]");
    public static final Target BTN_BUY = Target.the("button buy")
            .located(MobileBy.id("br.com.dafiti:id/buy_button"));
    public static final Target BTN_SIZE = Target.the("button size")
            .locatedBy("//*[contains(@text,'{0}')]");
    public static final Target BTN_CLOSE = Target.the("button close")
            .located(MobileBy.AccessibilityId("cerca"));
    public static final Target BTN_CART = Target.the("button CART")
            .located(MobileBy.AccessibilityId("Carrito"));
    public static final Target LBL_PRODUCT = Target.the(" Product")
            .locatedBy("//*[contains(@text,'{0}')]");
    private UIProduct(){
        throw new IllegalStateException(Constants.USER_INTERFACE_CLASS);
    }
}
