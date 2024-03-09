package behavioral.stratery.cc3_giohang;

public class KhuyenMaiTyLeVaMax implements KhuyenMai {
    private double saletyle;
    private double salemax;

    public KhuyenMaiTyLeVaMax(double saletyle, double salemax) {
        this.saletyle = saletyle;
        this.salemax = salemax;
    }

    public double sale() {
        double donhang = 0.0;
        double giamgia = donhang * this.saletyle;
        return Math.min(giamgia, this.salemax);
    }
}
