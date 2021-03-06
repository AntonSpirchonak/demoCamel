package com.epam.democamel.entity;

import java.util.ArrayList;
import java.util.List;
/*
 * Class Student
 * В приложении представляет собой сложный объект для передачи
 */
public class Student extends Person {

    private List<String> courses;

    public Student (String name, Integer age) {
        super(name, age);
        courses = new ArrayList<>();
    }

    public void addCourse (String courseName) {
        courses.add(courseName);
    }

    @Override
    public String toString () {
        return "Student{" +
                "courses=" + courses +
                '}';
    }
}
