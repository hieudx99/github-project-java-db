/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author hieudx
 */
public class Student implements Serializable{
    private String id;
    private String name;
    private int age;
    private String major;
    private float gpa;
    private int hrs_completed;

    public Student() {
    }

    public Student(String id, String name, int age, String major, float gpa, int hrs_completed) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = gpa;
        this.hrs_completed = hrs_completed;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public int getHrs_completed() {
        return hrs_completed;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setHrs_completed(int hrs_completed) {
        this.hrs_completed = hrs_completed;
    }
    public Object[] toObject() {
        return new Object[] {
            id, name, age, major, gpa, hrs_completed
        };
    }
    
}
