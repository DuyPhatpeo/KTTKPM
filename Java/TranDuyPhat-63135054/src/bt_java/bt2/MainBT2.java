package bt_java.bt2;

import bt_java.bt1.NhanVien;

public class MainBT2 {
    public static void main(String[] args) {
        IQuanLy quanLy = new QuanLyNhanVien();

        quanLy.them(new NhanVien("Phát","Nha Trang", 20,200, 20000.000));
        quanLy.them(new NhanVien("Dan","Nha Trang", 20,200, 20000.000));
        quanLy.them(new NhanVien("Phuc","Nha Trang", 20,200, 20000.000));
        quanLy.them(new NhanVien("Lam","Nha Trang", 20,200, 20000.000));
        quanLy.them(new NhanVien("Thanh","Nha Trang", 20,200, 20000.000));

        quanLy.inDS();
    }
}
