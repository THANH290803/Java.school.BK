package Method;
import java.util.Scanner;

public class axample3Method {
    public static void main(String[] args) {
        double a = nhap();
        double b = nhap();
        double c = nhap();
        tamgiac(a,b,c);
    }
    public static double nhap(){
        double n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap gia tri: ");
        n = input.nextDouble();


        return n;
    }
    private static void tamgiac(double a, double b, double c){
        if (a > 0 && b > 0 && c > 0){
            if (a+b>c && b+c>a && a+c>b){
                System.out.print("Day la 1 tam giac");
            }else {
                System.out.print("Khong phai 1 tam giac");
            }
        }else {
            System.out.print("Nhap sai");
        }
    }
}
