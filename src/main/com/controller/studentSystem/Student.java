package com.controller.studentSystem;

public class Student {
    private String id;
    private String name;
    private String cellphone;

    public Student() {

    }

    public Student(String id, String name, String cellphone) {
        this.id = id;
        this.name = name;
        this.cellphone = cellphone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getCellphone() {
        return cellphone;
    }
}
