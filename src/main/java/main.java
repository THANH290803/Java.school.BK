import java.util.Scanner;

public class main {
    public static void main(String[] args){
        // Nhập 2 số nguyên a, . Tính tổng hiệu tích thương
        // Khai báo 3 biến a, b , tổng
        int a,b;
        int tong, hieu;
        int nhan;
        double thuong;

        Scanner input = new Scanner(System.in);
        // nhập a
        System.out.print("a = ");
        a = input.nextInt();
        // Nhap b
        System.out.print("b = ");
        b = input.nextInt();
        // tinh tong
        tong = a + b;
        System.out.println(" tong a + b = " + tong);
        // tinh hieu
        hieu = a - b;
        System.out.println(" hieu a - b = " + hieu);
        // tinh nhan
        nhan = a * b;
        System.out.println(" nhan a * b = " + nhan);
        // tinh thuong
        thuong = (double)a/b;
        System.out.println(" thuong a/b = " + thuong);
        double so_thuc;
        so_thuc = input.nextInt();
        boolean true_false = true;
        true_false = false;
    }
}

