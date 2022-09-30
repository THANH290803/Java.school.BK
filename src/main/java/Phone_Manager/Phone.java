package Phone_Manager;

import java.util.Scanner;

public class Phone {
    public Scanner input = new Scanner(System.in);
    private String phone_name, producer, IMEI;
    private int D, M, Y, price, Ram, Rom;

//    get,set


    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public int getD() {
        return D;
    }

    public void setD(int d) {
        D = d;
    }

    public int getM() {
        return M;
    }

    public void setM(int m) {
        M = m;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public int getRom() {
        return Rom;
    }

    public void setRom(int rom) {
        Rom = rom;
    }

    public String getPhone_name() {
        return phone_name;
    }

    public void setPhone_name(String phone_name) {
        this.phone_name = phone_name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void check_date(int D, int M, int Y) {
        for (; M < 1 || M > 12; ) {
            System.out.print("Enter wrong month, re-enter: ");
            M = input.nextInt();
        }
        this.M = M;
        if (M == 2) {
            if (Y % 4 == 0 && Y % 100 != 0) {
                if (D > 0 && D <= 29) {
                    this.D = D;
                }
            } else
                for (; D < 0 && D >= 28; ) {
                    System.out.print("Enter wrong date, re-enter: ");
                    this.D = input.nextInt();
                }


        }

    }


    //    nhap thong tin
    public void imei() {
        System.out.print("Input IMEI: ");
        this.IMEI = input.nextLine();
    }

    public void nhap() {

        System.out.print("enter device name: ");
        this.phone_name = input.nextLine();

        System.out.print("Enter Rom(Gb): ");
        this.Rom = input.nextInt();
        System.out.print("Enter Ram(Gb): ");
        this.Ram = input.nextInt();
        System.out.println("Enter production date(dd/mm/yy): ");
        System.out.print("Enter date: ");
        this.D = input.nextInt();
        System.out.print("Enter month:");
        this.M = input.nextInt();
        System.out.print("Enter year: ");
        this.Y = input.nextInt();
        this.check_date(D, M, Y);
        System.out.print("enter price(VND): ");
        this.price = input.nextInt();
        System.out.print("enter manufacturer: ");
        this.producer = input.nextLine();
        this.producer = input.nextLine();
    }

}

