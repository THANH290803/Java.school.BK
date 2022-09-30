package OOP.Session5;

import java.util.Scanner;

public class HT implements hinh2D {
    public double R;

    public double pi = 3.14;


    Scanner input = new Scanner(System.in);


    public void nhap(Scanner input){
        System.out.print("Nhap ban kinh R: ");
        R = input.nextDouble();
    }


    @Override
    public void tinhChuVi() {
        double tinhChuVi =(this.R * 2) * pi;
        System.out.println("Chu vi hinh tron la: " + tinhChuVi);
    }


    @Override
    public void tinhDienTinh() {
        double tinhDienTinh = Math.pow(this.R, 2) * pi;
        System.out.println("Dien tich hinh tron la: " + tinhDienTinh);


    }
}
