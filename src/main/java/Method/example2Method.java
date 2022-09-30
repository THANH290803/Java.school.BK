package Method;

import java.util.Scanner;

public class example2Method {
    // kiem tra va so do co phai cach tam giac khoong
    // Yeu cau: viet thanh cac method rieng
    public static void main(String[] args) {
        double a = nhap();
        double b = nhap();
        double c = nhap();
        t_tinh(a,b,c);
    }
    public static double nhap(){
        double n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap gia tri: ");
         n = input.nextDouble();

        return n;
    }
    private static void t_tinh(double a, double b, double c) {
        double x, t, x1, x2;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm!");
                } else {
                    System.out.println("Phương trình vô nghiệm!");
                }
            } else{
                x = -c / b;
                System.out.println("x = " + x);
            }
        } else {
            t = Math.pow(b,2)-(4*a*c);

            if (t==0){
                x =(-b)/ (2*a);
                System.out.println("x = " + x);
            } else if (t < 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có 2 nghiệm là: ");
                x1 = (double) ((-b + Math.sqrt(t)) / (2 * a));
                x2 = (double) ((-b - Math.sqrt(t)) / (2 * a));
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}

