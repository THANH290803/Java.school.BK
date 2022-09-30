package OOP.session3.lyThuyet.BT;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        hcn hcn = new hcn();
        hcn.nhap(input);
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        System.out.println(hcn.toString());

        hinhVuong[] hv = new hinhVuong[3];
        for(int i = 0; i < 3; i++){
            hv[i].nhap(input);
            hv[i].tinhChuVi();
            hv[i].tinhDienTich();
            System.out.println(hv[i].toString());
        }
    }

}

