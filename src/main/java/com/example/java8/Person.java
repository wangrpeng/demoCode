package com.example.java8;

public class Person {

    public static final Integer MALE = 0;
    public static final Integer FEMALE = 1;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    private Integer sex;
}
