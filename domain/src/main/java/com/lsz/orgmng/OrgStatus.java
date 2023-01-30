package com.lsz.orgmng;

public enum OrgStatus {

    EFFECTIVE("EFFECTIVE"),

    CANCELLED("CANCELLED"),

    ;



    private final String code;


    OrgStatus(String code) {
        this.code = code;
    }




}
