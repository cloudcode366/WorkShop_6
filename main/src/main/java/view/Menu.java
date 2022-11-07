package view;

import model.*;

import java.util.Scanner;

public class Menu extends FuncView {
    public Scanner sc = new Scanner(System.in);

    public Menu() {

    }

    public Menu(StudentList list) throws Exception {
        System.out.println("1.Add new student.");
        System.out.println("2.Search a student by code.");
        System.out.println("3.Update a student by code.");
        System.out.println("4.Remove a student by code.");
        System.out.println("5.List all student.");
        int n = sc.nextInt();
        switch (n) {
            case 1:

                addNewStudent(list);
                break;
            case 2:
                searchStudent(list);
                break;
            case 3:
                updateStudent(list);
                break;
            case 4:
                removeStudent(list);
                break;
            case 5:
                showStudent(list);
                break;
            default:
                throw new Exception();
        }
    }

}
