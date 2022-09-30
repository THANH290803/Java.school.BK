package New_Assignment;
import java.util.Scanner;

public class NgayThang {
    public static Scanner scanner = new Scanner(System.in);
    private int ngay;
    private int thang;
    private int nam;
    public void nhap() {
        System.out.println("Nhập ngày: ");
        int ng = scanner.nextInt();
        System.out.println("Nhập tháng: ");
        int th = scanner.nextInt();
        System.out.println("Nhập năm: ");
        int na = scanner.nextInt();
        checkNgayThang(ng, th, na);
    }

    //Constructor methods
    public NgayThang() {

    }

    public NgayThang(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public NgayThang(NgayThang ngayThang) {
        this(ngayThang.getNgay(), ngayThang.getThang(), ngayThang.getNam());
    }
    //Getter and Setter methods
    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    //Other methods
    public int ktra(int ktraNgay) {
        int ngayTrongThang[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(ktraNgay > 0 && ktraNgay <= ngayTrongThang[thang])return ktraNgay;
        else if((thang == 2 && ktraNgay == 29) && ((nam % 400 == 0) || (nam % 100 != 0 && nam%4 == 0)))
            return ktraNgay;
        else return 1;
    }
    public void checkNgayThang(int ngay1, int thang1, int nam1) {
        if(thang1 >=1 && thang1 <=12) {
            this.thang = thang1;
        }
        else {
            System.out.println("Tháng đã nhập không hợp lệ. Yêu cầu nhập lại: ");
            int month = scanner.nextInt();
            this.thang = month;
        }
        this.nam = nam1;
        this.ngay = ktra(ngay1);
        if(ktra(ngay1)==1) {
            System.out.println("Ngày đã nhập không hợp lệ. Yêu cầu nhập lại: ");
            int day = scanner.nextInt();
            this.ngay = day;
        }
    }

    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }

}

