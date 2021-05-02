package com.exemplo.demo.domain;

public class Girl extends  Child {

    private final String gender = "Female";

    public Girl(String name, Integer age) {
        super(name, age);
    }

    public String getGender() {
        return this.gender;
    }
}
