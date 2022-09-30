package OOP.session2.chuaBT;

import java.util.Scanner;

public class Student extends Person{
    public String id;
    public double averageMark;
    public String email;

    public void inputStudent(){
        Scanner input = new Scanner(System.in);
        inputPerson();
        System.out.print("Student's ID: ");
        id = input.nextLine();
        System.out.print("Student's average mark: ");
        averageMark = input.nextDouble();
        System.out.print("Student's email: ");
        input.nextLine();
        email = input.nextLine();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", averageMark=" + averageMark +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }

    public void scholarship(){
        if(this.averageMark > 8){
            System.out.println("OK");
        } else {
            System.out.println("Miss scholarship");
        }
    }
}
