package bt_java.bt3;

public class MainBT3 {
    public static void main(String[] args) {
        // Create instances of SinhVienPoly, SinhVienIT, and SinhVienBiz
        SinhVienPoly svPoly = new SinhVienPoly("Đan", "Poly") {
            @Override
            public double getDiem() {
                return 7;
            }
        };
        SinhVienIT svIT = new SinhVienIT("Phát", 8.5, 7.5, 9.0);
        SinhVienBiz svBiz = new SinhVienBiz("Phúc", 6.0, 8.0);

        // Display information for each student
        System.out.println("Thông tin sinh viên Poly:");
        svPoly.xuat();
        System.out.println();

        System.out.println("Thông tin sinh viên IT:");
        svIT.xuat();
        System.out.println();

        System.out.println("Thông tin sinh viên Biz:");
        svBiz.xuat();
    }
}
