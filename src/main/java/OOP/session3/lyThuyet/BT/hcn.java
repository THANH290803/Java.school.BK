package OOP.session3.lyThuyet.BT;

import java.util.Scanner;

public class hcn extends hinhHoc{
    public static double chieuDai;

    public static double chieuRong;

    Scanner input = new Scanner(System.in);

    public hcn(){
    }
    public hcn(double chieuDai, double chieuRong ){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void nhap(Scanner input){
        System.out.print("Nhap chieu dai: ");
        this.chieuDai = this.input.nextDouble();
        System.out.println("nhap chieu rong: ");
        this.chieuRong = this.input.nextDouble();
    }

    public void tinhChuVi(){
        this.tinhChuVi  = (this.chieuDai + this.chieuRong) * 2;

    }
    public void tinhDienTich(){
        this.tinhDienTich = this.chieuDai * this.chieuRong;


    }

    @Override
    public String toString() {
        return "hcn{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                ", tinhChuVi=" + tinhChuVi +
                ", tinhDienTich=" + tinhDienTich +
                '}';
    }
}
