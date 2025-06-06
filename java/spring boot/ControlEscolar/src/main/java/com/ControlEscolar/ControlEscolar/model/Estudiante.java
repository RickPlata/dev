package com.ControlEscolar.ControlEscolar.model;

public class Estudiante {
    private int id;
    private String name;
    private String email;
    private Integer age;
    private String course;

    //constructor
    public Estudiante (int id, String name, String email, int age, String course){
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCoursem() {
        return course;
    }

    public void setCoursem(String coursem) {
        this.course = coursem;
    }
}
