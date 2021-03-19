/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Connector;
import java.io.Serializable;
import java.sql.*;

/**
 *
 * @author hieudx
 */
public class Course implements Serializable{
    private String id;
    private String term;
    private String name;
    private String dept;
    private int enrollment;
    
    public Course() {
       
    }

    public Course(String id, String term, String name, String dept, int enrollment) {
        this.id = id;
        this.term = term;
        this.name = name;
        this.dept = dept;
        this.enrollment = enrollment;
    }

    public String getId() {
        return id;
    }

    public String getTerm() {
        return term;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }
    public Object[] toObjects() {
        return new Object[] {
            id, term, name, dept, enrollment
        };
    }
}
