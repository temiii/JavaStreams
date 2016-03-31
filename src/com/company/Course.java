package com.company;


import java.io.Serializable;

public class Course implements Serializable {
    private String name;
    private int num;

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public Course(String java, int i) {
        java = this.name;
        i = this.num;
    }
}

