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
public class Professor implements Serializable{
    private String id;
    private String name;
    private String dept;
    private int yrs_teaching;

    public Professor() {
    }

    public Professor(String id, String name, String dept, int yrs_teaching) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.yrs_teaching = yrs_teaching;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getYrs_teaching() {
        return yrs_teaching;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setYrs_teaching(int yrs_teaching) {
        this.yrs_teaching = yrs_teaching;
    }
    public Object[] toObjects() {
        return new Object[] {
            id, name, dept, yrs_teaching
        };
    }
}
