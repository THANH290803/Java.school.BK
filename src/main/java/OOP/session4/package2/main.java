package OOP.session4.package2;
import OOP.session4.package1.dongVatCoChan;
import OOP.session4.package1.dongVat;


public class main {
    public static void main(String[] args) {
        dongVatCoChan dvcc2 = new dongVatCoChan();
        System.out.println(dvcc2.canNguoi);

        dongVatKhongChan dvkc1 = new dongVatKhongChan();
        System.out.println(dvkc1.canNguoi);
//        tho khong goi duoc do la default, muon goi phai dung getter setter
        System.out.println(dvkc1.getTho());

        dongVat dv1 = new dongVat();
//        an khong goi duoc do la protected, muon goi phai dung getter setter
        System.out.println(dv1.getAn());
//        ngu khong goi duoc do la private, muon goi phai dung getter setter
        System.out.println(dvkc1.getNgu());
    }
}
