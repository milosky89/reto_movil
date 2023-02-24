package com.reto.sistecredito.app.tasks;

import com.reto.sistecredito.app.interactions.Notification;
import com.reto.sistecredito.app.interactions.SelectText;
import com.reto.sistecredito.app.models.Product;
import com.reto.sistecredito.app.util.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.reto.sistecredito.app.ui.UIHome.*;
import static com.reto.sistecredito.app.ui.UIProduct.*;
import static com.reto.sistecredito.app.util.Constants.products;

public class AddProduct implements Task {

    public  AddProduct(List<Product> products){
        Constants.products = products;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Notification.inScreen(),
                Click.on(BTN_ITEM),
                Click.on(BTN_CATEGORY),
                Click.on(ITEM_CATEGORY),
                SelectText.scroll(CARD_PRODUCT,products.get(0).getNameProduct()),
                Click.on(BTN_BUY),
                Click.on(BTN_SIZE.of(products.get(0).getSize())),
                WaitUntil.the(BTN_CLOSE, WebElementStateMatchers.isPresent()).forNoMoreThan(2).seconds(),
                Click.on(BTN_CLOSE),
                Click.on(BTN_CART)
        );
    }
    public static AddProduct inApp(List<Product> products){
        return Tasks.instrumented(AddProduct.class,products);
    }
}
