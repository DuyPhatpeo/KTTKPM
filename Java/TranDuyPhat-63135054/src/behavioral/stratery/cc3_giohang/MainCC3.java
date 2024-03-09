package behavioral.stratery.cc3_giohang;

public class MainCC3 {
    public static void main(String[] args) {
        GioHang gioHang = new GioHang();
        gioHang.themSP(new SanPham("Laptop", 1, 1.5E7));
        gioHang.themSP(new SanPham("Chuột", 2, 500000.0));
        gioHang.setThanhToan(new CODThanhToan());
        gioHang.setKhuyenMai(new KhuyenMaiTyLeVaMax(0.1, 500000.0));
        double giaTriTong = gioHang.SumGiaTri();
        double giamGia = gioHang.TinhGiaGiam();
        double khuyenMai = gioHang.TinhKhuyenMai();
        double giaTriCuoiCung = gioHang.TinhGiaTriCuiCung();
        System.out.println("Tổng Giá trị: " + giaTriTong);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Khuyến mãi: " + khuyenMai);
        System.out.println("Giá trị Cuối cùng: " + giaTriCuoiCung);
    }
}
