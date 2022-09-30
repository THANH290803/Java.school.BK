package OOP.session4.package2;

import OOP.session4.package1.dongVat;


public class dongVatKhongChan extends dongVat {
    public void output(){
//        tho khong goi duoc do la default, muon goi phai dung getter setter
        System.out.println(getTho());
        System.out.println(an);
//        ngu khong goi duoc do la private, muon goi phai dung getter setter
        System.out.println(getNgu());

    }
}
