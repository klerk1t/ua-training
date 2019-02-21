package com.bohdan.model;

import com.bohdan.controller.InputRecord;

import java.util.Date;
import java.util.LinkedList;

public class Model {

    private LinkedList<Record> recordsList = new LinkedList<>();

    public void addRecord(InputRecord inputRecord) throws NonUniquenessNicknameException {

        String firstName = inputRecord.getFirstName();
        String lastName = inputRecord.getLastName();
        String nickname = inputRecord.getNickname();

        if(!UniquenessOfData.checkingNickname(nickname))
            throw new NonUniquenessNicknameException(firstName, lastName, nickname);

        String initials = new String(new StringBuilder(lastName)
                .append(" ")
                .append(lastName.charAt(0))
                .append('.'));
        Date date = new Date();

        Record record = new Record(firstName, lastName, initials, nickname, date);
        recordsList.add(record);
    }

    public LinkedList<Record> getRecordsList() {
        return recordsList;
    }
}
