package com.bohdan.model;

class UniquenessOfData {
    static boolean checkingNickname(String nickname) {
        for(DBSample x : DBSample.values()) {
            if(x.getNickname().equals(nickname)) {
                return false;
            }
        }
        return true;
    }
}
