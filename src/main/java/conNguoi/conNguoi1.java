package conNguoi;

import java.util.Scanner;

public class conNguoi1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        Khoi tao obj cn1 cua class conNguoi
        conNguoi cn1 = new conNguoi();
        System.out.println("Nhap thong tin cua doi tuong cn1: ");
        System.out.print("Ho ten: ");
        cn1.hoTen = input.nextLine();
        System.out.print("Tuoi: ");
        cn1.tuoi = input.nextInt();
        System.out.print("Dia chi: ");
        input.nextLine();
        cn1.diaChi = input.nextLine();
        System.out.print("So dien thoai: ");
        cn1.sdt = input.nextLine();
        cn1.an();
        cn1.choi();
        cn1.ngu();
        System.out.println(cn1.toString());
        System.out.println("--------------------");
        conNguoi cn2 = new conNguoi();
        System.out.println(cn2.toString());
    }
}
