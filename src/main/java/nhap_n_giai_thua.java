import java.util.Scanner;

public class nhap_n_giai_thua {
    public static void main(String[] args) {
        int n;
        long gt = 1;
        int i = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("number = ");
        n = input.nextInt();
        if(n < 0){
            System.out.print("n kho co gia thua ");
        } else if (n == 0) {
            gt = 1;
            System.out.print("n! = " + gt);
        } else {
            for (i = 1; i <= n; i++) {
                gt *= i;
            }
            System.out.println("n! = " + gt);
        }
        return;
    }
}
