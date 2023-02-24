package com.reto.sistecredito.app.ui;

import com.reto.sistecredito.app.util.Constants;
import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UIHome {
    public static final Target BTN_ITEM = Target.the("Button Item")
            .located(MobileBy.xpath("(//android.widget.ImageView)[4]"));
    public static final Target BTN_ACCOUNT = Target.the("Button account")
            .located(MobileBy.xpath("(//android.widget.ImageView)[8]"));
    public static final Target BTN_CATEGORY = Target.the("Button category")
            .located(MobileBy.xpath("(//android.widget.ImageView)[6]"));
    public static final Target ITEM_CATEGORY = Target.the("item category")
            .located(MobileBy.xpath("(//android.widget.TextView)[4]"));
    public static final Target BTN_INTO = Target.the("Button into")
            .located(MobileBy.xpath("(//android.widget.TextView)[3]"));
    public static final Target BTN_CREATE = Target.the("Button create")
            .located(MobileBy.xpath("(//android.widget.Button)[3]"));
    public static final Target BTN_NOTIFICATION = Target.the("Button create")
            .located(MobileBy.xpath("(//android.widget.ImageButton)[2]"));
    public static final Target LBL_MESSAGE = Target.the(" Message")
            .located(MobileBy.id("br.com.dafiti:id/account_email"));

    private UIHome(){
        throw new IllegalStateException(Constants.USER_INTERFACE_CLASS);
    }
}
