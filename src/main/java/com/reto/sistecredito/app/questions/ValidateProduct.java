package com.reto.sistecredito.app.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.reto.sistecredito.app.ui.UIProduct.LBL_PRODUCT;
import static com.reto.sistecredito.app.util.Constants.products;

public class ValidateProduct implements Question<String> {
    public ValidateProduct(){}

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_PRODUCT.of(products.get(0).getNameProduct())).viewedBy(actor).asString();
    }
    public static ValidateProduct inCart(){return new ValidateProduct();}
}
