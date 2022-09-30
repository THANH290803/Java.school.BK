package conNguoi;

public class conNguoi {
    // thuoc tinh: ho ten, tuoi, sdt, dia chi
    // cos nhung phuong thuc: an, ngu, choi
    // Khoi tao thuoc tinh
    public String hoTen;
    public int tuoi;
    public String diaChi;
    public String sdt;

    // khoi tao phuong thuc
    public void an() {
        System.out.println("An");
    }

    public void ngu() {
        System.out.println("Ngu");
    }

    public void choi() {
        System.out.println("Choi");
    }

    @Override
    public String toString() {
        return "conNguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", diaChi='" + diaChi + '\'' +
                ", sdt='" + sdt + '\'' +
                '}';

    }
    public conNguoi(String hoTen, int tuoi,String diaChi, String sdt){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public conNguoi(){
    }
}
