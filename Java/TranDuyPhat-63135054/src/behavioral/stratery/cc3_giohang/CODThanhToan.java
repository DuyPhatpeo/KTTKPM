package behavioral.stratery.cc3_giohang;

public class CODThanhToan implements ThanhToan {
    public CODThanhToan() {
    }

    public double tinhToan() {
        double donhang = 0.0;
        return donhang >= 2000000.0 ? donhang * 0.02 : 0.0;
    }
}
