package com.itheima.domain;

public class student {
    private String name;
    private String age;

    public student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public student(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
