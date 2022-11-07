package app;

import model.*;
import view.*;

public class app {
    static StudentList list = new StudentList(null);

    public static void main(String[] args) {

        Menu newMenu;
        while (true) {
            try{
            newMenu = new Menu(list);
            }
            catch(Exception e){
                break;
            }
        }
    }
}
