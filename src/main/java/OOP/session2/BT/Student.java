package OOP.session2.BT;

import java.util.Scanner;

class Student extends Person {
    protected String masv;
    protected String email;
    protected double diemtrungbinh;

    public void intPutStudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien");
        this.masv = input.nextLine();
        System.out.println("Nhap diem trung binh");
        this.diemtrungbinh = input.nextDouble();
        System.out.println();
        System.out.println("Nhap email");
        this.email = input.nextLine();
        this.email = input.nextLine();
    }


    public String toString() {
        return "Person{" +
                "ma sinh vien='" + masv +  '\'' +
                ", diem trung binh=" + diemtrungbinh +
                ", email='" + email + '\'' +
                '}';
    }
    public void showStudent(){
        System.out.print("Email: " + this.email);
        System.out.println("Ma sinh vien : " +this.masv);
        System.out.println(" Diem trung binh " + this.diemtrungbinh);

    }
    public void kiemtrahocbong(){
        if(this.diemtrungbinh >=8){
            System.out.println("Duoc hoc bong");
        }else{
            System.out.println("Khong duoc hoc bong");
        }
    }

}
