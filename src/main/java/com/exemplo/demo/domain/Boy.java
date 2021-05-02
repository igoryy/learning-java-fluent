package com.exemplo.demo.domain;

public class Boy extends Child {

    private final String gender = "Male";

    public Boy(String name, Integer age) {
        super(name, age);
    }

    public String getGender(){
        return this.gender;
    }
}
