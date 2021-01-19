package com.zpf.pojo;

public class Person {
    Integer id;
    Integer age;

    public Person(Integer id,Integer age) {
        this.id = id;

        this.age = age;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
