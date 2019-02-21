package com.bohdan.model;

import java.util.Date;

class Record {

    private String firstName;
    private String lastName;
    private String initials;
    private String nickname;
    private Date createRecordDate;

    Record(String firstName, String lastName, String initials,
           String nickname, Date createRecordDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.initials = initials;
        this.nickname = nickname;
        this.createRecordDate = createRecordDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getInitials() {
        return initials;
    }

    public String getNickname() {
        return nickname;
    }

    public Date getCreateRecordDate() {
        return createRecordDate;
    }

}
