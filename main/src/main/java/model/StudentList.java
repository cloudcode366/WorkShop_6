package model;

import java.util.ArrayList;

public class StudentList extends ArrayList<Student> {

    StudentList() {

    }

    public StudentList(Student newStudent) {

        add(newStudent);
    }

    public void addNewStudent(Student newStudent) {
        add(newStudent);
    }

}
