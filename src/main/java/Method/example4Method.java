package Method;

import java.util.Scanner;

public class example4Method {
    public static void main(String[] args) {
        double a = nhap();
        double b = nhap();
        double c = nhap();
        int j =(int) nhap();
        tim_n(j);
    }

    private static void tim_n(int j) {
        int giai_thua = 1;
        if (j == 0 || j == 1) {
            System.out.println("giai_thua = 1");
        } else {
            for (int i = 1; i <= j; i++) {
                giai_thua *= i;
            }
        }
        System.out.println("giai thua la: " + giai_thua);
    }


    public static double nhap() {
        double n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap gia tri: ");
        n = input.nextDouble();

        return n;
    }
}



