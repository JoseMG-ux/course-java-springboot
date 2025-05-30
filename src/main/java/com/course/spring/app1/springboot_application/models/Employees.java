package com.course.spring.app1.springboot_application.models;

public class Employees {

    private Integer id;
    private String name;
    private String lastName;
    private String direction;
    private String position;
    private Integer age;

    public Employees(Integer id, String name, String lastName, String direction, String position, Integer age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.direction = direction;
        this.position = position;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
