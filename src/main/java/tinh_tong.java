import java.util.Scanner;

public class tinh_tong{
    // Nhập 10 số nguyen tính tổng các số đó
    public static void main (String[] args){
        int num, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào một số: ");
        num = input.nextInt();
        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }
        System.out.println("Tổng các số tự nhiên từ 1 đến "+ num +" là: "+sum);

        System.out.println();

        // lý thuyết
        int arr[]= {1,2, 3, 4, 5 };
        double[]arrl = {1.1,2.6,5.8, 72.3};
        int arr2[] = new int[10];
        double[] arr3 = new double[10];
        System.out.println(arr[2]);

        // chữa bài
        // khai bao tong
        int tong = 0;
        int[] mang = new int[10];
       //  Scanner input = new Scanner(System.in);
        // nhap mang
        for (int i = 0; i < 10; i++) {
            System.out.println("mang[" + i + "] = ");
            mang[i] = input.nextInt();
        }
        // tinh tong
        for (int i = 0; i < 10; i++){
            tong += mang[i];
        }
        // hien thi tong
        System.out.println("Tong = " + tong);
    }
}
