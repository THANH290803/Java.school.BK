package OOP.Session5.new_example;

import java.util.Scanner;

public class main {
    public static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Hoc sinh");
        Student st1 = new Student();
        st1.inputStudent();
        System.out.println(st1.toString());
        st1.scholarship();

        System.out.println("Giao vien");
        Teacher st2 = new Teacher();
        st2.inputTeacher();
        st2.slary();
    }
}
