package behavioral.stratery.cc3_giohang;

public class SanPham {
    private String tenSP;
    private int soluongl;
    private double gia;

    public SanPham(String tenSP, int soluongl, double gia) {
        this.tenSP = tenSP;
        this.soluongl = soluongl;
        this.gia = gia;
    }

    public String getTenSP() {
        return this.tenSP;
    }

    public int getSoluongl() {
        return this.soluongl;
    }

    public double getGia() {
        return this.gia;
    }
}