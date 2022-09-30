package OOP.session4.package1;

public class main {
    public static void main(String[] args) {
        dongVatCoChan dvcc = new dongVatCoChan();
        System.out.println(dvcc.canNguoi);
        System.out.println(dvcc.tho);
        System.out.println(dvcc.an);
//        ngu khong goi duoc do la private, muon goi phai dung getter setter
        System.out.println(dvcc.getNgu());
    }
}
