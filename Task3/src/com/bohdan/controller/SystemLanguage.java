package com.bohdan.controller;

import java.util.Locale;
import java.util.ResourceBundle;

public class SystemLanguage {

    private ResourceBundle languageBundleMessage;

    public SystemLanguage(String messagePath, Locale locale) {
        languageBundleMessage = ResourceBundle.getBundle(messagePath, locale);
    }

    public ResourceBundle getLanguageBundle() {
        return languageBundleMessage;
    }
}
