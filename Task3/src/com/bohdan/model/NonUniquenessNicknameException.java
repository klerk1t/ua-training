package com.bohdan.model;

public class NonUniquenessNicknameException extends Exception {

    private String firstName;
    private String lastName;
    private String nickname;

    public NonUniquenessNicknameException(String firstName,
                                          String lastName, String nickname) {
        //super(message);
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
