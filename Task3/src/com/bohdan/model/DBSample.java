package com.bohdan.model;

public enum DBSample {


    USER1("Данил", "Ишутин", "Dendi"),
    USER2("Алексей", "Березин", "Solo"),
    USER3("Андрей", "Голубев", "Dread");

    private final String firstName;
    private final String lastName;
    private final String nickname;

    DBSample(String firstName, String lastName, String nickname) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickname() {
        return nickname;
    }
}
