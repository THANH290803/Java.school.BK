import java.util.Scanner;

public class correct_task {
    public static void main(String[] args) {
        double a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.print("c = ");
        c = input.nextInt();
        if (a == 0){
            if (b == 0){
                if (c == 0){
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = (-c)/b;
                System.out.println("Phuong trinh co nghiem: x = " + x);
            }
        } else {
            double delta = Math.pow(b,2) - 4 * a * c;
            if(delta == 0){
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = (-b) / (2 * a);
                System.out.println("Phuong trinh co nghiem: x = " + x);
            } else {
                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co nghiem: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}