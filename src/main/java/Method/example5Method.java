package Method;

import java.util.Scanner;

public class example5Method {
    public static Scanner input = new Scanner(System.in);
    public static int nhap_n() {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap gia tri: ");
        n = input.nextInt();
        return n;
    }
}

