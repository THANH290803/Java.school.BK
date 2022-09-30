package OOP.session2.chuaBT;

import java.util.Scanner;

public class main {
    public static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        Student st1 = new Student();
        st1.inputStudent();
        System.out.println(st1.toString());
        st1.scholarship();
    }
}
