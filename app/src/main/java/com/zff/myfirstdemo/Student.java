package com.zff.myfirstdemo;

/**
 * Created by 76598 on 2017/6/15.
 */

public class Student{
    private int id ;
    private String name;
    private String postion;

    public Student() {
    }

    public Student(int id, String name, String postion) {
        this.id = id;
        this.name = name;
        this.postion = postion;
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

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", postion='" + postion + '\'' +
                '}';
    }

}
