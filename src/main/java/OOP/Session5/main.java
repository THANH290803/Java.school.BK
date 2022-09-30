package OOP.Session5;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HCN[] hcn = new HCN[3];
        for (int i = 0; i < 3; i++) {
            hcn[i] = new HCN();
            hcn[i].nhap(input);
            hcn[i].tinhChuVi();
            hcn[i].tinhDienTinh();
        }

        HV[] hv = new HV[4];
        for (int i = 0; i < 4; i++) {
            hv[i] = new HV();
            hv[i].nhap(input);
            hv[i].tinhChuVi();
            hv[i].tinhDienTinh();
        }


        HT[] ht = new HT[5];
        for (int i = 0; i < 5; i++){
            ht[i] = new HT();
            ht[i].nhap(input);
            ht[i].tinhChuVi();
            ht[i].tinhDienTinh();
    }
  }
}

