package bt_java.bt4;

public class MainBT4 {
    public static void main(String[] args) {
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        qlcx.themChuyenXe(new ChuyenXeNoiThanh("001", "Duc Thang", "79A-111111", 100000,1,10));
        qlcx.themChuyenXe(new ChuyenXeNoiThanh("002", "Duc Phanh", "79A-999999", 100000,1,10));
        qlcx.themChuyenXe(new ChuyenXeNoiThanh("003", "Lam", "79A-888888", 100000,1,10));
        qlcx.themChuyenXe(new ChuyenXeNoiThanh("004", "Phuc Ngu", "79A-111111", 100000,1,10));
        qlcx.themChuyenXe(new ChuyenXeNgoaiThanh("005", "Phuc", "79A-111111", 100000,"Nha Trang",2));
        qlcx.themChuyenXe(new ChuyenXeNgoaiThanh("006", "Ph", "79A-111111", 100000,"HCM",2));
        qlcx.themChuyenXe(new ChuyenXeNgoaiThanh("007", "P", "79A-111111", 100000,"Ha Noi",2));
        qlcx.xuatDanhSach();
        System.out.println("Doanh thu xe noi thanh: " + qlcx.doanhThuXeNoiThanh());
        System.out.println("Doanh thu xe ngoai thanh: " + qlcx.doanhThuXeNgoaiThanh());
        System.out.println("Tong doanh thu: " + qlcx.tongDoanhThu());
    }
}
