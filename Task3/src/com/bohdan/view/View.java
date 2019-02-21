package com.bohdan.view;

import com.bohdan.controller.SystemLanguage;
import java.util.Locale;

import static com.bohdan.view.TextConstans.INPUT_DATA;
import static com.bohdan.view.TextConstans.WRONG_INPUT_DATA;

public class View {

    private SystemLanguage systemLanguage;

    public View() {
        systemLanguage = new SystemLanguage(BundleMessagePath.MESSAGES, Locale.getDefault());
    }

    private void printMessage(String message) {
        System.out.println(message);
    }

    private String concatenationString(String ... messages) {
        StringBuilder stringBuilder = new StringBuilder();
        for(String x : messages) {
            stringBuilder.append(x);
        }
        return new String(stringBuilder);
    }

    public void printInput(String message) {
        printMessage(concatenationString(
                systemLanguage.getLanguageBundle().getString(INPUT_DATA),
                systemLanguage.getLanguageBundle().getString(message)
        ));
    }

    public void printWrongInput(String message) {
        printMessage(concatenationString(
                systemLanguage.getLanguageBundle().getString(WRONG_INPUT_DATA),
                systemLanguage.getLanguageBundle().getString(INPUT_DATA),
                systemLanguage.getLanguageBundle().getString(message)
        ));
    }


}
