package com.bohdan.model;

import java.util.Date;

public class Record {

    private String firstName;
    private String lastName;
    private String initials;
    private String nickname;
    private Date createRecord;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setCreateRecord(Date createRecord) {
        this.createRecord = createRecord;
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

    public Date getCreateRecord() {
        return createRecord;
    }

}
