package OOP.session2.chuaBT;

import java.util.Scanner;

public class Person {
    public String name;
    public String gender;
    public String address;
    public String dob;

    public void inputPerson(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input Student's Information");
        System.out.print("Student's name: ");
        name = input.nextLine();
        System.out.print("Student's gender: ");
        gender = input.nextLine();
        System.out.print("Student's address: ");
        address = input.nextLine();
        System.out.print("Student's Date of Birth: ");
        dob = input.nextLine();
    }
}
