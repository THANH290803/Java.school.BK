package Method;

import java.util.Scanner;

public class exampleMethod {
    public static void main(String[] args) {
        int a = nhap();
        int b = nhap();
        System.out.println("tong = " + tinh_tong(a, b));
        System.out.println("hieu = " + tinh_hieu(a, b));
        System.out.println("tich = " + tinh_tich(a, b));
        System.out.println("thuong = " + tinh_thuong(a, b));
    }
    // method nhap
    public static int nhap() {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Nhap so: ");
        n = input.nextInt();
        return n;
    }
    //    method tinh tong
    public static int tinh_tong(int m, int n) {
        int tong = m + n;
        return tong;
    }

    // method tinh hieu
    public static int tinh_hieu(int a, int b) {
        int hieu = a - b;
        return hieu;
    }
    public static int tinh_tich(int a, int b) {
        int tich = a * b;
        return tich;
    }
    public static double tinh_thuong(int a, int b) {
        double thuong = (double) a / b;
        return thuong;
    }
}
