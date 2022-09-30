package OOP.Session5.new_example;

import java.util.Scanner;

public class Person {
    public String name;
    public String gender;
    public String addess;
    public String dod;

    public void inputPerson(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap thong tin");
        System.out.print("Nhap ten: ");
        name = input.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gender = input.nextLine();
        System.out.print("Nhap dia chi: ");
        addess = input.nextLine();
        System.out.print("Nhap ngay sinh: ");
        dod = input.nextLine();
    }
}
