package com.bohdan.controller;

import java.util.Locale;
import java.util.ResourceBundle;

public class SystemRegex {

    private ResourceBundle regexBundle;

/*
    public SystemRegex(String regexPath, Locale locale) {
        regexBundle = ResourceBundle.getBundle(regexPath, locale);
    }
*/

/*
    public SystemRegex(String regexPath, Locale locale) {
        regexBundle = ResourceBundle.getBundle(regexPath, new Locale("ua", "UA"));
    }
    */

    public SystemRegex(String regexPath, Locale locale) {
        regexBundle = ResourceBundle.getBundle(regexPath, new Locale("en", "EN"));
    }

    public ResourceBundle getRegexBundle() {
        return regexBundle;
    }
}
