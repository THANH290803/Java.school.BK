package OOP.session2.BT;

import java.util.Scanner;

class Person{
    protected String name;
    protected String sex;
    protected String adrress;
    protected String ngaysinh;
    public void intputPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ten :");
        this.name = scanner.nextLine();
        System.out.println("Nhap gioi tinh");
        this.sex = scanner.nextLine();
        System.out.println("Nhap dia chi");
        this.adrress = scanner.nextLine();
        System.out.println("Nhap ngay sinh");
        this.ngaysinh = scanner.nextLine();
    }
    public void showPerson(){
        System.out.println("Ho Ten : " +this.name);
        System.out.println(" Gioi Tinh : " +this.sex);
        System.out.println(" Dia chi : " +this.adrress);
        System.out.println(" Ngay sinh : " +this.ngaysinh);
    }
}

