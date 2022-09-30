import java.util.Scanner;

public class BT6 {
    public static void main(String[] args){
        int rows;
        int number = 1, counter, j;
        //To get the user's input
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao của tam giác Floyd: ");
        //Copying user input into an integer variable named rows
        rows = input.nextInt();
        System.out.println("Tam Giác Floyd: ");
        System.out.println();
        for ( counter = 1 ; counter <= rows ; counter++ )
        {
            for ( j = 1 ; j <= counter ; j++ )
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        System.out.println();
    }
}

