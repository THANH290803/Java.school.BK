package New_Assignment;


import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class phone {
    public static Scanner scanner = new Scanner(System.in);


    private String maDT;
    private String tenDT;
    private String mauSac;
    private String NSX;
    private double donGia;
    private String Rom;
    private String Ram;
    private String heDieuHanh;
    private String CPU;
    private NgayThang ngayRaMat = new NgayThang();


    public phone() {

    }



    public phone(String maDT, String tenDT, String mauSac, String NSX, double donGia, String rom, String ram,  String heDieuHanh, String CPU, NgayThang ngayRaMat) {
        this.maDT = maDT;
        this.tenDT = tenDT;
        this.mauSac = mauSac;
        this.NSX = NSX;
        this.donGia = donGia;
        this.Rom = rom;
        this.Ram = ram;
        this.heDieuHanh = heDieuHanh;
        this.CPU = CPU;
        this.ngayRaMat = new NgayThang(ngayRaMat);
    }

    //Getter and Setter methods
    public String getMaDT() {
        return maDT;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getNSX() {
        return NSX;
    }

    public void setNSX(String nSX) {
        NSX = nSX;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getRom() {
        return Rom;
    }
    public void setRom(String Rom) {
        this.Rom = Rom;
    }

    public String getRam() {
        return Ram;
    }
    public void setRam(String Ram) {
        this.Ram = Ram;
    }

    public String getheDieuHanh () {
        return heDieuHanh;
    }
    public void setHeDieuHanh(String heDieuHanh) {
        this.heDieuHanh = heDieuHanh;
    }

    public String getCPU () {
        return CPU;
    }
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }



    public Date getNgayRaMat() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(ngayRaMat.getNgay(),ngayRaMat.getThang() - 1,ngayRaMat.getNam());
        return calendar.getTime();
    }

    public void setNgayRaMat(NgayThang ngayRaMat) {
        this.ngayRaMat = ngayRaMat;
    }


    public void nhap() {
        try {
            System.out.println("***Nh???p th??ng tin***");
            System.out.println("Nh???p m?? ??i???n tho???i");
            scanner.nextLine();
            maDT = scanner.nextLine();
            System.out.println("Nh???p t??n ??i???n tho???i");
            tenDT = scanner.nextLine();
            System.out.println("Nh???p ng??y ra m???t ??i???n tho???i");
            ngayRaMat.nhap();
            scanner.nextLine();
            System.out.println("Nh???p m??u s???c ??i???n tho???i");
            mauSac = scanner.nextLine();
            System.out.println("Nh???p H??? ??i???u H??nh ??i???n tho???i: ");
            heDieuHanh = scanner.nextLine();
            System.out.println("Nh???p CPU ??i???n tho???i: ");
            CPU = scanner.nextLine();
            System.out.println("Nh???p ROM ??i???n tho???i ");
            Rom = scanner.nextLine();
            System.out.println("Nh???p RAM ??i???n tho???i ");
            Ram = scanner.nextLine();
            System.out.println("Nh???p nh?? s???n xu???t");
            NSX = scanner.nextLine();
            System.out.println("Nh???p gi?? ??i???n tho???i");
            donGia = scanner.nextDouble();

        } catch (Exception ex) {
            System.out.println("C?? l???i x???y ra : " + ex.toString());
        }
    }


    public boolean equals(Object obj) {
        if (obj instanceof phone) {
            phone a = (phone) obj;
            if (this.getMaDT().equalsIgnoreCase(a.getMaDT())) {
                return true;
            }
        }
        return false;
    }
    public static void xuatTD() {
        System.out.printf("%-15s %-15s %15s %15s %15s %15s %15s %15s %15s %15s \n", "M?? DT", "T??n DT", "M??u s???c", "Nh?? SX",
                "Gi??", "Ng??y ra m???t", "ROM", "RAM", "H??? ??i???u h??nh", "CPU");
    }

    public void xuatDL() {
        System.out.printf("%-15s %-15s %15s %15s %15.1f %15s %15s %15s %15s %15s \n", maDT, tenDT, mauSac, NSX,
                donGia, ngayRaMat, Rom, Ram, heDieuHanh, CPU);
    }


}
