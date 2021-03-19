/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hieudx
 */
public class Teach {
    private Professor prof;
    private Course course;

    public Teach() {
    }

    public Teach(Professor prof, Course course) {
        this.prof = prof;
        this.course = course;
    }

    public Professor getProf() {
        return prof;
    }

    public Course getCourse() {
        return course;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    public Object[] toObjects() {
        return new Object[] {
            prof.getId(), course.getId(), course.getTerm()
        };
    }
}
