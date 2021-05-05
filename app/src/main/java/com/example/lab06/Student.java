package com.example.lab06;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private String listTravel;

    public Student(int id, String name, String listTravel) {
        this.id = id;
        this.name = name;
        this.listTravel = listTravel;
    }

    public Student(String name, String listTravel) {
        this.name = name;
        this.listTravel = listTravel;
    }

    public Student(String name) {
        this.name = name;
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

    public String getListTravel() {
        return listTravel;
    }

    public void setListTravel(String listTravel) {
        this.listTravel = listTravel;
    }
}
