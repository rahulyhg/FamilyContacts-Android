package com.noandroid.familycontacts.model;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "PINYIN".
 */
public class Pinyin {

    private Long id;
    private String zi;
    private String pinyin;

    public Pinyin() {
    }

    public Pinyin(Long id) {
        this.id = id;
    }

    public Pinyin(Long id, String zi, String pinyin) {
        this.id = id;
        this.zi = zi;
        this.pinyin = pinyin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZi() {
        return zi;
    }

    public void setZi(String zi) {
        this.zi = zi;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

}
