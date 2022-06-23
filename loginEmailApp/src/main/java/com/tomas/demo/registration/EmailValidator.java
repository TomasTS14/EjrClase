package com.tomas.demo.registration;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(String s) {
     //la regex de un email
        Pattern pattern = Pattern.compile(".{3,}@.\\..");
    //el patron usará un matcher  que trabajara sobre la String s
        Matcher matcher = pattern.matcher(s);
    //el matcher puede verificar si match o no
        return matcher.matches();

    }
}
