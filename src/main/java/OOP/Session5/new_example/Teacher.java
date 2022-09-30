package OOP.Session5.new_example;

import java.util.Scanner;

public class Teacher extends Person {
    public String number;
    public String email;
    public String specialized;
    public double basicSalary;
    public double hourlySalary;
    public double NumberOfWorkingHours;

    public void inputTeacher() {
        Scanner input = new Scanner(System.in);
        inputPerson();
        System.out.print("Nhap so can cuoc: ");
        number = input.nextLine();
        System.out.print("Nhap email: ");

        email = input.nextLine();
        System.out.print("Nhap chuyen nghanh: ");
        specialized = input.nextLine();
        System.out.print("Nhap luong co ban: ");
        basicSalary = input.nextDouble();
        System.out.print("Nhap luong theo gio: ");
        hourlySalary = input.nextDouble();
        System.out.print("Nhap so gio la viec: ");
        NumberOfWorkingHours = input.nextDouble();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", addess='" + addess + '\'' +
                ", dod='" + dod + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                ", specialized='" + specialized + '\'' +
                ", basicSalary=" + basicSalary +
                ", hourlySalary=" + hourlySalary +
                ", NumberOfWorkingHours=" + NumberOfWorkingHours +
                '}';
    }

    public void slary() {
        Double slary = (hourlySalary * NumberOfWorkingHours) + basicSalary;
        System.out.println("Luong: " + slary);
    }
}
