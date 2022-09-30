package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Phone {
    public Scanner input = new Scanner(System.in);
    static ArrayList<Phone> arr = new ArrayList<>();
    private int IMEI;
    private String name;
    public String manufacturer;
    private double price;
    private int release_date;
    private double RAM_capacity;
    private double ROM_capacity;
    private String chip;
    private String screen_size;

    private String phone_size;

    public Phone(int IMEI, String name, String manufacturer, int price, int release_date, double RAM_capacity, double ROM_capacity, String chip, String screen_size, String phone_size) {
        this.IMEI = IMEI;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.release_date = release_date;
        this.RAM_capacity = RAM_capacity;
        this.ROM_capacity = ROM_capacity;
        this.chip = chip;
        this.screen_size = screen_size;
        this.phone_size = phone_size;
    }

    public Phone() {
    }

    // Tiếp tạo ra các getting và setter
    public int getIMEI() {
        return IMEI;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer(String manufacturer) {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public int getRelease() {
        return release_date;
    }

    public double getRAM_capacity(double ram) {
        return RAM_capacity;
    }

    public double getROM_capacity(double rom) {
        return ROM_capacity;
    }

    public String getChip(String chip) {
        return chip;
    }

    public String getScreen_size(String screen_size) {
        return screen_size;
    }

    public String getPhone_size(String phone_size) {
        return phone_size;
    }


    public void setId(int IMEI) {
        this.IMEI = IMEI;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRelease(int release_date) {
        this.release_date = release_date;
    }


    public void setRAM_capacity(double RAM_capacity) {
        this.RAM_capacity = RAM_capacity;
    }

    public void setROM_capacity(double ROM_capacity) {
        this.ROM_capacity = ROM_capacity;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public void setScreen_size(String screen_size) {
        this.screen_size = screen_size;
    }

    public void setPhone_size(String phone_size) {
        this.phone_size = phone_size;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                " , IMEI = '" + IMEI +
                ", price=" + price +
                ", release_date=" + release_date +
                ", RAM_capacity=" + RAM_capacity +
                ", ROM_capacity=" + ROM_capacity +
                ", chip=" + chip +
                ", screen_size=" + screen_size +
                ", phone_size=" + phone_size +
                '}';
    }

}