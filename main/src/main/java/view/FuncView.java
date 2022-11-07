package view;

import controller.*;
import model.*;

import java.io.EOFException;
import java.util.Scanner;

public class FuncView {
    private String code;
    private String name;
    private double mark;
    public static Student tmp;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return this.mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Scanner sc = new Scanner(System.in);

    public void addNewStudent(StudentList list) {
        while (true) {
            try {
                System.out.print("Enter code:");
                setCode(sc.nextLine());
                if (!getCode().matches("^S\\d{3}")) {
                    throw new EOFException();
                }
                System.out.print("Enter name:");
                setName(sc.nextLine());
                if (getName().equals("")) {
                    throw new EOFException();
                }
                System.out.print("Enter mark:");
                setMark(sc.nextDouble());
                if (getMark() < 0 || getMark() > 10) {
                    throw new EOFException();
                }
                break;
            } catch (Exception e) {
                System.out.println("Error input, please try again.");

            }
        }
        tmp = new Student();
        tmp.setName(name);
        tmp.setCode(code);
        tmp.setMark(mark);
        list.add(tmp);
    }

    FuncController control = new FuncController();

    public void searchStudent(StudentList list) {
        while (true) {
            try {
                System.out.print("Enter student's code:");
                setCode(sc.nextLine());
                if (!getCode().matches("^S\\d{3}")) {
                    throw new EOFException();
                }
                break;
            } catch (Exception e) {
                System.out.print("Error input,please try again.");
            }
            
        }
        FuncView f = new FuncView();
        if (control.search(list, getCode(), f)) {
            System.out.print(f.tmp.toString());
        } else {
            System.out.print("Don't have this student");
        }
    }

    public void updateStudent(StudentList list) {
        while (true) {
            try {
                System.out.print("Enter code:");
                setCode(sc.nextLine());
                if (!getCode().matches("^S\\d{3}")) {
                    throw new EOFException();
                }
                System.out.print("Enter new name:");
                setName(sc.nextLine());
                if (getName().equals("")) {
                    throw new EOFException();
                }
                System.out.print("Enter new mark:");
                setMark(sc.nextDouble());
                if (getMark() < 0 || getMark() > 10) {
                    throw new EOFException();
                }
                break;
            } catch (Exception e) {
                System.out.println("Error input, please try again.");

            }
        }
        tmp = new Student();
        tmp.setCode(getCode());
        tmp.setName(getName());
        tmp.setMark(getMark());
        if (control.update(list, getCode(), tmp)) {
            System.out.print("update success");
        } else {
            System.out.print("update error");
        }
    }

    public void removeStudent(StudentList list) {
        while (true) {
            try {
                System.out.print("Enter student's code:");
                setCode(sc.nextLine());
                if (!getCode().matches("^S\\d{3}")) {
                    throw new EOFException();
                }
                break;
            } catch (Exception e) {
                System.out.print("Error input,please try again.");
            }
            
        }
        if (control.remove(list, getCode())) {
            System.out.print("Remove success");
        } else
            System.out.print("Remove error");
    }

    public void showStudent(StudentList list) {
        int n = list.size();
        for (int i = 1; i < n; i++) {
            System.out.print(list.get(i).toString());
        }
    }
}
