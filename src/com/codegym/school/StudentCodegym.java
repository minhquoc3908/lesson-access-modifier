package com.codegym.school;

public class StudentCodegym {
    private String name="John";
    private String classes="C02" ;
    public StudentCodegym(){
    }

    public void setName() {
        this.name = name;
    }

    public void setClasses() {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "StudentCodegym{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
