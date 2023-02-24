package com.reto.sistecredito.app.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.reto.sistecredito.app.ui.UIHome.LBL_MESSAGE;

public class ValidateRegister implements Question<String> {

    public ValidateRegister(){}

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_MESSAGE).viewedBy(actor).asString();
    }

    public static ValidateRegister getText(){
        return new ValidateRegister();
    }
}
