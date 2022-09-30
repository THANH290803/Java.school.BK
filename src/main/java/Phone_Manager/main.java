//package Phone_Manager;
//
//import com.sun.javafx.binding.StringFormatter;
//
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        Scanner input= new Scanner(System.in);
//        int n=0;
//        String m;
//        Menu menu= new Menu();
//        HashMap<String, Phone> add_edit = new HashMap<String, Phone>();
//        Phone dv= new Phone();
//        Filter ft= new Filter();
//        Sort sort = new Sort();
//        for (;n!=6;) {
//            menu.menu_main();
//            System.out.print("Input number: ");
//            n= input.nextInt();
//
//
//            switch (n) {
//                case 1:
//                    dv.input(add_edit);
//
////                    System.out.println(add_edit.get(dv.getIMEI()));
//                    break;
//                case 2:
//                    dv.edit(add_edit);
//                    break;
//                case 3:
//                    System.out.print("Enter IMEI of the device you want to delete: ");
//                    m= input.nextLine();
//                    m= input.nextLine();
//                    for (;add_edit.containsKey(m) == false;){
//                        System.out.println("IMEI is not valid, re-enter: ");
//                        System.out.print("Input IMEI: ");
//                        m= input.nextLine();
//                    }
//                    add_edit.remove(m);
//                    break;
//                case 4:
//                    for (String key: add_edit.keySet()) {
//                        System.out.println(add_edit.get(key));
//                    }
//                    break;
//                case 5:
//                    menu.menu_filter();
//                    int h;
//                    System.out.print("Input number: ");
//                    h=input.nextInt();
//                    switch (h){
//                        case 1:
//                            ft.FBM(add_edit);
//                            break;
//                        case 2:
//                            ft.FBP(add_edit);
//                            break;
//                        case 3:
//                            sort.sbd(add_edit);
//                            break;
//                        case 4:
//                            sort.sbd(add_edit);
//                            break;
//                    }
//            }
//        }
//
//
//    }
//
//    private static class Sort {
//    }
//}