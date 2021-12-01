package com.knewhow.demo.controller.requestBean;

public class QueryByPhoneNumberRequest {
    private String phoneNumber;

    public QueryByPhoneNumberRequest() {}


    public QueryByPhoneNumberRequest(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "{" +
            " phoneNumber='" + getPhoneNumber() + "'" +
            "}";
    }


}
