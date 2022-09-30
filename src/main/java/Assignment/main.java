package Assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    static ArrayList<Phone> arr = new ArrayList<>();

    public static void Menu() {
        System.out.println("--------------------------Menu-------------------");
        System.out.println("1---------------Add phone--------------------");
        System.out.println("2-----------Edit phone by IMEI-------------");
        System.out.println("3----------Delete phone by IMEI------------");
        System.out.println("4----------Sort by release_date------------");
        System.out.println("5-------------Sort by price-----------------");
        System.out.println("6---------Filter phones by release date----------");
        System.out.println("7--------Filter phones by price-------------------");
        System.out.println("8-----------------Show----------------------------");
        System.out.println("0-----------------Exit----------------------------");
        int Choose;
        System.out.println("enter the option : ");
        Scanner input = new Scanner(System.in);
        Choose = input.nextInt();

        switch (Choose) {
            case 1:
                input = new Scanner(System.in);

                System.out.println("Enter phone name: ");
                String name = input.nextLine();

                System.out.println("Enter phone carrier name: ");
                String manufacturer = input.nextLine();

                System.out.println("Enter phone IMEI: ");
                int IMEI = input.nextInt();

                System.out.println("Enter phone price: ");
                int price = input.nextInt();

                System.out.println("Enter release date: ");
                int release_date = input.nextInt();

                System.out.println("RAM: ");
                double ram = input.nextDouble();

                System.out.println("ROM: ");
                double rom = input.nextDouble();

                System.out.println("Phone chips: ");
                input.nextLine();
                String chip = input.nextLine();

                System.out.println("Dimensions of the screen: ");
                String screen_size = input.nextLine();

                System.out.println("Size of phone: ");
                String phone_size = input.nextLine();


                Phone ph = new Phone(IMEI, name, manufacturer, price, release_date, ram, rom, chip, screen_size, phone_size);

                arr.add(ph);
                break;
            case 2:
                input = new Scanner(System.in);
                System.out.println(" Enter IMEI of the phone you want to fix: ");
                IMEI = input.nextInt();
                boolean timThay = false;
                for (int i = 0; i < arr.size(); i++) {
                    if (IMEI == arr.get(i).getIMEI()) {

                        System.out.println("Enter phone name: ");
                        input.nextLine();
                        name = input.nextLine();

                        System.out.println("Enter phone carrier name: ");
                        manufacturer = input.nextLine();

                        System.out.println("Enter phone price: ");
                        price = input.nextInt();

                        System.out.println("Enter release date: ");
                        release_date = input.nextInt();

                        System.out.println("RAM: ");
                        ram = input.nextDouble();

                        System.out.println("ROM: ");
                        rom = input.nextDouble();

                        System.out.println("Phone chips: ");
                        input.nextLine();
                        chip = input.nextLine();

                        System.out.println("Dimensions of the screen: ");
                        screen_size = input.nextLine();

                        System.out.println("Size of phone: ");
                        phone_size = input.nextLine();

                        arr.get(i).setName(name);
                        arr.get(i).setManufacturer(manufacturer);
                        arr.get(i).setPrice(price);
                        arr.get(i).setRelease(release_date);
                        arr.get(i).setRAM_capacity(ram);
                        arr.get(i).setROM_capacity(rom);
                        arr.get(i).setChip(chip);
                        arr.get(i).setScreen_size(screen_size);
                        arr.get(i).setPhone_size(phone_size);
                        timThay = true;
                        break;
                    }
                }
                if (timThay == false) System.out.println("Phone not found");
                for (Phone a : arr) {
                    System.out.println(a.toString());
                }
                break;
            case 3:
                input = new Scanner(System.in);
                System.out.println("Enter IMEI of the phone you want to delete: ");
                IMEI = input.nextInt();

                int d = -1;
                boolean tinThay = false;
                for (int i = 0; i < arr.size(); i++) {
                    if (IMEI == arr.get(i).getIMEI()) {
                        tinThay = true;
                        d = i;
                        System.out.println("Deleted");
                        break;
                    }
                }

                if (tinThay = false) System.out.println("Phone not found");
                else {
                    arr.remove(d);
                };
                break;
            case 4:
                arr.sort(Comparator.comparing(Phone::getRelease));
                for (Phone a : arr) {
                    System.out.println(a.toString());
                }
                break;
            case 5:
                arr.sort(Comparator.comparing(Phone::getPrice));
                for (Phone a : arr) {
                    System.out.println(a.toString());
                }
                break;
            case 6:
                input = new Scanner(System.in);
                System.out.println("Enter the date you want to find: ");
                release_date = input.nextInt();
                for (int i = 0; i < arr.size(); i++) {
                    if (release_date == arr.get(i).getRelease()) {
                        System.out.println(arr.get(i).toString());
                    }
                }
                break;
            case 7:
                input = new Scanner(System.in);
                System.out.println("Enter the phone price you want to find: ");
                int Price = input.nextInt();
                for (int i = 0; i < arr.size(); i++) {
                    if (Price == arr.get(i).getPrice()) {
                        System.out.println(arr.get(i).toString());
                    }
                }
                break;
            case 8:
                for (Phone a : arr) {
                    System.out.println(a.toString());
                }
                break;
            case 0:
                System.out.println("Exit");
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        while (true) {
            Menu();
        }
    }
}

