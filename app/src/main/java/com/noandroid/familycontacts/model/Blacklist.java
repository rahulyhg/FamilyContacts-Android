package com.noandroid.familycontacts.model;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "BLACKLIST".
 */
public class Blacklist {

    private Long id;
    private String PhoneNumber;

    public Blacklist() {
    }

    public Blacklist(Long id) {
        this.id = id;
    }

    public Blacklist(Long id, String PhoneNumber) {
        this.id = id;
        this.PhoneNumber = PhoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

}
