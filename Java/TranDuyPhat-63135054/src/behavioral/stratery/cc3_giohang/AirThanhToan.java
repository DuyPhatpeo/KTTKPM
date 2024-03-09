package behavioral.stratery.cc3_giohang;

public class AirThanhToan implements ThanhToan {
    public AirThanhToan() {
    }

    public double tinhToan() {
        double donhang = 0.0;
        return donhang >= 1000000.0 ? donhang * 0.03 : 0.0;
    }
}