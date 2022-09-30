package Assignment_New;

import java.util.Scanner;

public class Phone {
    public Scanner input= new Scanner(System.in);
    private String phone_name,producer;
    private int IMEI,D,M,Y,price,Ram,Rom;

//    get,set


    public int getIMEI() {
        return IMEI;
    }

    public void setIMEI(int IMEI) {
        this.IMEI = IMEI;
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

    public void check_date(int D, int M, int Y){
        for (;M<1||M>12;){
            System.out.print("sai thang nhap lai: ");
            M= input.nextInt();
        }this.M=M;
        if (M==2){
            if (Y%4==0 && Y%100!=0){
                if (D>0&&D<=29){
                    this.D=D;
                }
            }else
                for (;D<0&&D>=28;){
                    System.out.print("nhap sai ngay nhap lai: ");
                    this.D= input.nextInt();
                }


        }

    }



    //    nhap thong tin
    public void imei(){
        System.out.print("Enter IMEI: ");
        this.IMEI= input.nextInt();
    }
    public void nhap(){

        System.out.print("enter device name: ");
        this.phone_name= input.nextLine();
        this.phone_name= input.nextLine();
        System.out.print("enter manufacturer: ");
        this.producer= input.nextLine();
        System.out.print("Enter Rom(Gb): ");
        this.Rom= input.nextInt();
        System.out.print("Enter Ram(Gb): ");
        this.Ram= input.nextInt();
        System.out.println("Enter production date(dd/mm/yy): ");
        System.out.print("Enter date: ");
        this.D= input.nextInt();
        System.out.print("Enter month:");
        this.M= input.nextInt();
        System.out.print("Enter year: ");
        this.Y= input.nextInt();
        this.check_date(D,M,Y);
        System.out.print("enter price(VND): ");
        this.price= input.nextInt();
    }

    public void Phone(){

    }

    @Override
    public String toString() {
        return "Phone{" +
                "input=" + input +
                ", phone_name='" + phone_name + '\'' +
                ", producer='" + producer + '\'' +
                ", IMEI=" + IMEI +
                ", D=" + D +", M=" + M + ", Y=" + Y +
                ", price=" + price +
                ", Ram=" + Ram +
                ", Rom=" + Rom +
                '}';
    }
}

