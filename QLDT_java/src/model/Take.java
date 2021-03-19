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
public class Take {
    private Student student;
    private Course course;
    private String grade;

    public Take() {
    }

    public Take(Student student, Course course, String grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getGrade() {
        return grade;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public Object[] toObject() {
        return new Object[] {
            student.getId(), course.getId(),course.getTerm(), grade
        };
    }
}
