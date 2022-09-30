package Assignment_New;

import java.util.HashMap;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        Menu menu= new Menu();
        HashMap<Integer, Phone> add_edit = new HashMap<Integer, Phone>();
        Phone dv= new Phone();
        menu.menu_main();
        int f;
        System.out.println("Nhap so: ");
        f = input.nextInt();
        switch (f) {
            case 1:

        }


        int m,n=0;
        for (;n!=5;) {
            menu.menu_phone();
            System.out.print("nhap so: ");
            n= input.nextInt();
            switch(n) {
                case 1:
                    dv.imei();

                    for (;add_edit.containsKey(dv.getIMEI()) == true;){
                        System.out.println("trung IMEI, nhap lai: ");
                        dv.imei();
                    }
                    dv.nhap();
                    add_edit.put(dv.getIMEI(),dv);
//                    System.out.println(add_edit.get(dv.getIMEI()));
                    break;
                case 2:
                    System.out.print("nhap IMEI thiet bi muon sua: ");
                    n= input.nextInt();
                    for (;add_edit.containsKey(n) == false;){
                        System.out.println("khong co IMEI, nhap lai: ");
                        System.out.print("nhap IMEI: ");
                        n= input.nextInt();
                    }
                    System.out.println("thong tin thiet bi:");
                    System.out.println(add_edit.get(n));
                    menu.edit();
                    int k;
                    System.out.print("nhap so: ");
                    k= input.nextInt();
                    switch (k){
                        case 1:
                            System.out.print("Enter device name: ");
                            String ten;
                            ten= input.nextLine();
                            ten= input.nextLine();
                            add_edit.get(n).setPhone_name(ten);
                            break;
                        case 2:
                            System.out.print("Enter new producer: ");
                            String nsx;
                            nsx= input.nextLine();
                            add_edit.get(n).setProducer(nsx);
                            break;
                        case 3:
                            System.out.print("Enter Rom parameter: ");
                            int Rom;
                            Rom= input.nextInt();
                            add_edit.get(n).setRom(Rom);
                            break;
                        case 4:
                            System.out.print("Enter Ram parameter: ");
                            int Ram;
                            Ram= input.nextInt();
                            add_edit.get(n).setRam(Ram);
                            break;
                        case 5:
                            System.out.print("Enter production date: ");
                            int D,M,Y;
                            D= input.nextInt();
                            System.out.print("Enter month: ");
                            M= input.nextInt();
                            System.out.print("Enter Year: ");
                            Y=input.nextInt();
                            add_edit.get(n).check_date(D,M,Y);
                            break;
                        case 6:
                            System.out.print("Enter price: ");
                            int Pri;
                            Pri= input.nextInt();
                            add_edit.get(n).setPrice(Pri);
                            break;
                        case 7:
                            return;
                    }
                    break;
                case 3:
                    menu.menu_sort();
                    System.out.print("nhap so: ");
                    m= input.nextInt();
                    switch (m){
                        case 1:
                    }
                case 4:
                    System.out.println(add_edit.get(dv.getIMEI()));
            }
        }


    }
}
