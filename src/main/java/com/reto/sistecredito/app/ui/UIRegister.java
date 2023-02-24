package com.reto.sistecredito.app.ui;

import com.reto.sistecredito.app.util.Constants;
import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UIRegister {

    public static final Target TXT_EMAIL = Target.the("text email")
            .located(MobileBy.id("br.com.dafiti:id/form_email"));
    public static final Target TXT_KEY = Target.the("text key")
            .located(MobileBy.id("br.com.dafiti:id/form_password"));
    public static final Target TXT_KEY_2 = Target.the("text key2")
            .located(MobileBy.id("br.com.dafiti:id/form_password_confirm"));
    public static final Target LTS_DOCUMENT_TYPE = Target.the("list document type")
            .located(MobileBy.id("br.com.dafiti:id/form_document_type"));
    public static final Target ITEM_DOCUMENT = Target.the("item document")
            .locatedBy("//*[contains(@text,'{0}')]");
    public static final Target TXT_NUMBER_DOCUMENT = Target.the("text document number")
            .located(MobileBy.id("br.com.dafiti:id/form_identification"));
    public static final Target TXT_NAME = Target.the("text name")
            .located(MobileBy.id("br.com.dafiti:id/form_first_name"));
    public static final Target TXT_LAST_NAME = Target.the("txt last name")
            .located(MobileBy.id("br.com.dafiti:id/form_last_name"));
    public static final Target TXT_BIRTH_DATE = Target.the("txt birth Date")
            .located(MobileBy.id("br.com.dafiti:id/form_birthday"));
    public static final Target LTS_GENDER = Target.the("list gender")
            .located(MobileBy.id("br.com.dafiti:id/form_gender"));
    public static final Target ITEM_GENDER = Target.the("item gender")
            .locatedBy("//*[contains(@text,'{0}')]");
    public static final Target BTN_SAVE = Target.the("Button save")
            .located(MobileBy.id("br.com.dafiti:id/register_button"));
    private UIRegister(){
        throw new IllegalStateException(Constants.USER_INTERFACE_CLASS);
    }
}
