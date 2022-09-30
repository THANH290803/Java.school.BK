package Phone_Manager;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Filter extends Phone {
    public void FBM(HashMap<String, Phone> device){
        Scanner input= new Scanner(System.in);
        try{
            System.out.print("Enter Producer: ");
            String m;
            m= input.nextLine();
            for (String key: device.keySet()) {
                if (Objects.equals(device.get(key).getProducer(), m)){
                    System.out.println(device.get(key));
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    public void FBP(HashMap<String, Phone> device){
        Scanner input= new Scanner(System.in);
        try{
            System.out.print("Enter Price: ");
            int m;
            m= input.nextInt();
            for (String key: device.keySet()) {
                if (device.get(key).getPrice()==m){
                    System.out.println(device.get(key));
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}