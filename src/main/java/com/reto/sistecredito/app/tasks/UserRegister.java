package com.reto.sistecredito.app.tasks;

import com.reto.sistecredito.app.models.User;
import com.reto.sistecredito.app.util.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.reto.sistecredito.app.ui.UIHome.*;
import static com.reto.sistecredito.app.ui.UIRegister.*;
import static com.reto.sistecredito.app.util.Constants.users;

public class UserRegister implements Task {

    public UserRegister(List<User> users){
      Constants.users = users;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        if(BTN_NOTIFICATION.resolveFor(actor).isPresent()){
            actor.attemptsTo(
                    Click.on(BTN_NOTIFICATION)
            );
        }
        actor.attemptsTo(
                WaitUntil.the(BTN_ITEM, WebElementStateMatchers.isPresent()).forNoMoreThan(4).seconds(),
                Click.on(BTN_ITEM),
                Click.on(BTN_ACCOUNT),
                Click.on(BTN_INTO),
                Click.on(BTN_CREATE),
                Enter.theValue(users.get(0).getEmail()).into(TXT_EMAIL),
                Enter.theValue(users.get(0).getKey()).into(TXT_KEY),
                Enter.theValue(users.get(0).getKey2()).into(TXT_KEY_2),
                Click.on(LTS_DOCUMENT_TYPE),
                Click.on(ITEM_DOCUMENT.of(users.get(0).getDocumentType())),
                Enter.theValue(users.get(0).getNumber()).into(TXT_NUMBER_DOCUMENT),
                Enter.theValue(users.get(0).getName()).into(TXT_NAME),
                Enter.theValue(users.get(0).getLastName()).into(TXT_LAST_NAME),
                Enter.theValue(users.get(0).getBirthDate()).into(TXT_BIRTH_DATE),
                Click.on(LTS_GENDER),
                Click.on(ITEM_GENDER.of(users.get(0).getGender())),
                Click.on(BTN_SAVE)
        );
    }

    public static UserRegister inApp(List<User> users){
        return Tasks.instrumented(UserRegister.class,users);
    }
}