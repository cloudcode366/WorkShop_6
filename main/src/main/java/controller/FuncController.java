package controller;

import model.*;
import view.*;

public class FuncController {
    public boolean search(StudentList list, String code, FuncView tmp) {
        // student = new Student();
        int n = list.size();
        for (int i = 1; i < n; i++) {
            if (list.get(i).getCode().equals(code)) {
                tmp.tmp = list.get(i);
                return true;
            }
        }
        return false;
    }

    public boolean update(StudentList list, String code, Student student) {
        int n = list.size();
        boolean check = false;
        for (int i = 1; i < n; i++) {
            if (list.get(i).getCode().equals(code)) {
                list.get(i).setName(student.getName());
                list.get(i).setMark(student.getMark());
                check = true;
            }
        }
        return check;
    }

    public boolean remove(StudentList list, String code) {
        int n = list.size();
        boolean check = false;
        for (int i = 1; i < n; i++) {
            if (list.get(i).getCode().equals(code)) {
                list.remove(i);
                check = true;
            }

        }
        return check;
    }

    public Student show(StudentList list, int n) {
        // int n = list.size();
        Student tmp = list.get(n);
        return tmp;
    }
}
