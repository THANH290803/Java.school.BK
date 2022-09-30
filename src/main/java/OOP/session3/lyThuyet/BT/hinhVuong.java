package OOP.session3.lyThuyet.BT;

import java.util.Scanner;

public class hinhVuong extends hinhHoc {
    public double canh;

    public hinhVuong(){

    }
    public hinhVuong(double canh){
        this.canh = canh;
    }
    public void nhap(Scanner input){
        System.out.print("Nhap canh: ");
        this.canh = input.nextDouble();
    }
    public void tinhChuVi() {
        this.tinhChuVi = this.canh * 4;
    }
    public void tinhDienTich() {
        this.tinhDienTich= Math.pow(this.canh, 2);
    }
    @Override
    public String toString() {
        return "hinhVuong{" +
                "canh=" + canh +
                ", chuVi=" + tinhChuVi +
                ", dienTich=" + tinhDienTich +
                '}';
    }
}
