package com.bohdan.controller;

import java.util.Locale;
import java.util.ResourceBundle;

public class SystemLanguage {

    private ResourceBundle languageBundleMessage;

/*    public SystemLanguage(String messagePath, Locale locale) {
        languageBundleMessage = ResourceBundle.getBundle(messagePath, locale);
    }*/


   public SystemLanguage(String messagePath, Locale locale) {
        languageBundleMessage = ResourceBundle.getBundle(messagePath, new Locale("en", "EN"));
    }




/*

    UA
    public SystemLanguage(String messagePath, Locale locale) {
        languageBundleMessage = ResourceBundle.getBundle(messagePath, new Locale("ua", "UA"));
    }
*/

    public ResourceBundle getLanguageBundle() {
        return languageBundleMessage;
    }
}
