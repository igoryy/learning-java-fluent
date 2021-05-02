package com.exemplo.demo.domain;

import lombok.Data;

import java.util.List;

@Data
public class Parent {

    private String name;
    private Integer age;
    private List<String> cities;
    private List<Child> children;

}
