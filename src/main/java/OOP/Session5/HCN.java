package OOP.Session5;

import java.util.Scanner;

public class HCN implements hinh2D{
    public static double chieuDai;
    public static double chieuRong;

    Scanner input = new Scanner(System.in);
    private double tinhChuVi;
    private double tinhDienTich;

    public HCN(){
    }

    public HCN(double chieuDai, double chieuRong ){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void nhap(Scanner input){
        System.out.print("Nhap chieu dai: ");
        this.chieuDai = this.input.nextDouble();
        System.out.print("nhap chieu rong: ");
        this.chieuRong = this.input.nextDouble();
    }

    @Override
    public void tinhChuVi() {
        this.tinhChuVi  = (this.chieuDai + this.chieuRong) * 2;
        System.out.println("Chu vi HCN la: " + tinhChuVi);
    }

    @Override
    public void tinhDienTinh() {
        this.tinhDienTich = this.chieuDai * this.chieuRong;
        System.out.println("Dien tich HCN la: " + tinhDienTich);
    }


}
