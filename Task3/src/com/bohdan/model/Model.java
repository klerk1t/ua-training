package com.bohdan.model;

import java.util.LinkedList;

public class Model {

    private LinkedList<Record> recordsList = new LinkedList<>();

    public void addRecord(Record record) {
        recordsList.add(record);
    }

    public LinkedList<Record> getRecordsList() {
        return recordsList;
    }
}
