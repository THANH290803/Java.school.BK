import java.util.Scanner;

public class two_way {
    public static void main(String[] args) {
        int month;
        Scanner input = new Scanner(System.in);

        System.out.print("month = ");
        month = input.nextInt();

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("Thang " + month + " co 31 ngay");
        } else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("Thang " + month + " co 30 ngay");
        } else if (month == 2) {
            int year;
            System.out.print("nhap nam: ");
            year = input.nextInt();
            if (year % 4 == 0){
                System.out.println("Thang " + month + " co 29 ngay");
            } else {
                System.out.println("Thang " + month + " co 28 ngay");
            }
        } else {
            System.out.println("Không hợp lệ");
        }
    }
}