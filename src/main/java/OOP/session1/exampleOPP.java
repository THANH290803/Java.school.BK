package OOP.session1;
public class exampleOPP {
    public double chieuDai;

    public double chieuRong;

    public exampleOPP(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public exampleOPP(){
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
}
