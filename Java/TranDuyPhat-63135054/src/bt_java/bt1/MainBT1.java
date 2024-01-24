package bt_java.bt1;

public class MainBT1 {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("Phát","Nha Trang", 20,200, 20000.000);
        NhanVien nhanVien2 = new NhanVien("Lâm tàu","Nha Trang", 20,100, 10000.000);
        System.out.println(nhanVien1.toString());
        System.out.println(nhanVien2.toString());
    }
}
