package com.reto.sistecredito.app.util;

import com.reto.sistecredito.app.models.Product;
import com.reto.sistecredito.app.models.User;

import java.util.ArrayList;
import java.util.List;

public class Constants {

    public static final String USER_INTERFACE_CLASS = "user interface class";
    public static final String CONSTANT_CLASS = "constant class";
    public static List<User> users = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();

    private Constants(){
        throw new IllegalStateException(CONSTANT_CLASS);
    }
}
