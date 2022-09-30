package OOP.session1;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args){
        exampleOPP hcn = new exampleOPP();
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào chiều dài : ");
        hcn.setChieuDai(input.nextDouble());
        System.out.println("nhập vào chiều rộng : ");
        hcn.setChieuRong(input.nextDouble());
        System.out.println("chu vi hình chữ nhật là : " + hcn.tinhChuVi());
        System.out.println("diện tích hình chữ nhật là : " + hcn.tinhDienTich());
    }
}
