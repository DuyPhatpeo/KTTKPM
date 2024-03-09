package behavioral.stratery.cc3_giohang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GioHang {
    private List<SanPham> dssp = new ArrayList();
    private ThanhToan thanhToan;
    private KhuyenMai khuyenMai;

    public GioHang() {
    }

    public void setThanhToan(ThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }

    public void setKhuyenMai(KhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public void themSP(SanPham sanPham) {
        this.dssp.add(sanPham);
    }

    public double SumGiaTri() {
        double giatritong = 0.0;

        SanPham sanPham;
        for(Iterator var3 = this.dssp.iterator(); var3.hasNext(); giatritong += (double)sanPham.getSoluongl() * sanPham.getGia()) {
            sanPham = (SanPham)var3.next();
        }

        return giatritong;
    }

    public double TinhGiaGiam() {
        return this.thanhToan.tinhToan();
    }

    public double TinhKhuyenMai() {
        return this.khuyenMai.sale();
    }

    public double TinhGiaTriCuiCung() {
        double giatritong = this.SumGiaTri();
        double giamGia = this.TinhGiaGiam();
        double saLe = this.TinhKhuyenMai();
        return giatritong - giamGia - saLe;
    }
}