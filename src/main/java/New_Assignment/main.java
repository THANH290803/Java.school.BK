package New_Assignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<phone> dsDT = new ArrayList<phone>();


    public static void themDT(ArrayList<phone> dThoais) {
        phone a = new phone();
        a.nhap();

        if(dThoais.contains(a)) {
            System.out.println("Trùng mã điện thoại! Thêm không thành công");
            return;
        }
        else {
            dThoais.add(a);
            System.out.println("Thêm thành công!");
        }
    }
    public static void suaDT(ArrayList<phone> dienThoais, String maDT) {
        if(dienThoais.isEmpty()) {
            System.out.println("Danh sách đang rỗng");
            return;
        }
        for (phone dienThoai : dienThoais) {
            if(dienThoai.getMaDT().equalsIgnoreCase(maDT)) {
                System.out.println("Nhập thông tin mới cho sản phẩm");
                System.out.println("Nhập tên điện thoại");
                String tenDT = scanner.nextLine();
                System.out.println("Nhập màu sắc điện thoại");
                String  mauSac = scanner.nextLine();
                System.out.println("Nhập Hệ Điều Hành điện thoại: ");
                String heDieuHanh = scanner.nextLine();
                System.out.println("Nhập CPU điện thoại: ");
                String CPU = scanner.nextLine();
                System.out.println("Nhập ROM điện thoại ");
                String Rom = scanner.nextLine();
                System.out.println("Nhập RAM điện thoại ");
                String Ram = scanner.nextLine();
                System.out.println("Nhập nhà sản xuất");
                String NSX = scanner.nextLine();
                System.out.println("Nhập giá điện thoại");
                double donGia = scanner.nextDouble();
                System.out.println("Nhập ngày ra mắt điện thoại");
                NgayThang ngayRaMat = new NgayThang();
                ngayRaMat.nhap();

                //dienThoai.getMaDT(maDT);
                dienThoai.setTenDT(tenDT);
                dienThoai.setMauSac(mauSac);
                dienThoai.setHeDieuHanh(heDieuHanh);
                dienThoai.setCPU(CPU);
                dienThoai.setRom(Rom);
                dienThoai.setRam(Ram);
                dienThoai.setNSX(NSX);
                dienThoai.setDonGia(donGia);
                dienThoai.setNgayRaMat(ngayRaMat);
                System.out.println("Sửa thông tin điện thoại thành công!");
                break;
            }
            else {
                System.out.println("Không tìm thấy điện thoại có Mã : " + maDT);
                break;
            }
        }
    }
    public static void xoaDT(ArrayList<phone> dienThoais, String maDT) {
        if(dienThoais.isEmpty()) {
            System.out.println("Danh sách đang rỗng");
            return;
        }
        for (phone dienThoai : dienThoais) {
            if(dienThoai.getMaDT().equalsIgnoreCase(maDT)) {
                dienThoais.remove(dienThoai);
                System.out.println("Xóa điện thoại thành công!");
                break;
            }
            else {
                System.out.println("Không tìm thấy điện thoại có Mã : " + maDT);
                break;
            }
        }
    }
    public static void sxTheoNgay() {
        Collections.sort(dsDT, new Comparator<phone>() {

            @Override
            public int compare(phone o1, phone o2) {
                return o1.getNgayRaMat().compareTo(o2.getNgayRaMat());
            }

        });
    }
    public static void sxTheoGia() {
        Collections.sort(dsDT, new Comparator<phone>() {

            @Override
            public int compare(phone o1, phone o2) {
                if(o1.getDonGia() < o2.getDonGia()) {
                    return -1;
                }
                else if(o1.getDonGia() > o2.getDonGia()) {
                    return +1;
                }
                else return 0;
            }

        });
    }
    public static ArrayList<phone> timTheoNSX(ArrayList<phone> dienThoais, String NSX) {
        ArrayList<phone> resultsArrayList = new ArrayList<>();

        for (phone dienThoai : dienThoais) {
            if(dienThoai.getNSX().indexOf(NSX) >= 0) {
                resultsArrayList.add(dienThoai);
            }
        }

        return resultsArrayList;
    }
    public static ArrayList<phone> timTheoGia(ArrayList<phone> dienThoais, Double donGia) {
        ArrayList<phone> resultsArrayList = new ArrayList<>();

        for (phone dienThoai : dienThoais) {
            if(dienThoai.getDonGia() == donGia) {
                resultsArrayList.add(dienThoai);
            }
        }

        return resultsArrayList;
    }
    public static void hienThi(ArrayList<phone> dienThoais) {
        if(dienThoais.isEmpty()) {
            System.out.println("Danh sách đang rỗng");
            return;
        }
        phone.xuatTD();
        for (phone dienThoai : dienThoais) {
            dienThoai.xuatDL();
        }
    }
    public static void menu() {
        System.out.println("============================MENU============================");
        System.out.println("\t1. Thêm điện thoại vào danh sách");
        System.out.println("\t2. Hiển thị danh sách điện thoại");
        System.out.println("\t3. Sửa thông tin điện thoại theo mã điện thoại");
        System.out.println("\t4. Xóa điện thoại theo mã điện thoại");
        System.out.println("\t5. Sắp xếp danh sách điện thoại theo Gia");
        System.out.println("\t6. Sắp xếp danh sách điện thoại theo Ngay");
        System.out.println("\t7. Tìm tất cả điện thoại theo NSX");
        System.out.println("\t8. Tìm tất cả điện thoại theo Gia");
        System.out.println("\t9. Kết thúc chương trình");
    }

    public static void main(String[] args) {
        menu();
        int key;
        boolean kq = true;
        while(kq) {
            try {
                System.out.println("===================================");
                System.out.println("Nhập lựa chọn: ");
                key = scanner.nextInt();

                switch(key) {
                    case 1:
                        main.themDT(dsDT);
                        menu();
                        break;
                    case 2:
                        main.hienThi(dsDT);
                        break;
                    case 3:
                        System.out.println("Nhập mã điện thoại cần sửa");
                        scanner.nextLine();
                        String maDT = scanner.nextLine();
                        main.suaDT(dsDT, maDT);
                        menu();
                        break;
                    case 4:
                        System.out.println("Nhập mã điện thoại cần xóa");
                        scanner.nextLine();
                        String maDTX = scanner.nextLine();
                        main.xoaDT(dsDT, maDTX);
                        menu();
                        break;
                    case 5:
                        System.out.println("Danh sách điện thoại sau khi được sắp xếp theo Gia");
                        main.sxTheoGia();
                        main.hienThi(dsDT);
                        break;
                    case 6:
                        System.out.println("Danh sách điện thoại sau khi được sắp xếp theo Ngay");
                        main.sxTheoNgay();
                        main.hienThi(dsDT);
                        break;
                    case 7:
                        System.out.println("Nhập tên nhà sản xuất cần tìm");
                        scanner.nextLine();
                        String NSX = scanner.nextLine();
                        System.out.println("Danh sách điện thoại có tên nhà sản xuất là " + NSX);
                        ArrayList<phone> resultsArrayList = main.timTheoNSX(dsDT, NSX);
                        main.hienThi(resultsArrayList);
                        break;

                    case 8:
                        System.out.println("Nhập giá cần tìm");
                        scanner.nextLine();
                        double donGia = scanner.nextDouble();
                        System.out.println("Danh sách điện thoại có giá là " + donGia);
                        ArrayList<phone> resultsList = main.timTheoGia(dsDT, donGia);
                        main.hienThi(resultsList);
                        break;

                    case 9:
                        kq = false;
                        System.out.println("Đóng chương trình thành công!");
                        break;
                    default:
                        break;
                }
            } catch (Exception ex) {
                System.out.println("Có lỗi xảy ra : " + ex);
                break;
            }
        }
    }
}


