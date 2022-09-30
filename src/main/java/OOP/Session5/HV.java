package OOP.Session5;

import java.util.Scanner;

public class HV implements hinh2D {
    public double canh;


    public void nhap(Scanner input){
        System.out.print("Nhap canh: ");
        canh = input.nextDouble();
    }

    @Override
    public void tinhChuVi() {
        double tinhChuVi = this.canh * 4;
        System.out.println("Chu vi hinh vuong la: " + tinhChuVi);
    }

    @Override
    public void tinhDienTinh() {
        double tinhDienTich= Math.pow(this.canh, 2);
        System.out.println("Dien tich hinh vuong la: " + tinhDienTich);
    }




}
