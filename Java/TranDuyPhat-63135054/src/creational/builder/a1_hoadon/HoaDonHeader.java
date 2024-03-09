package creational.builder.a1_hoadon;

public class HoaDonHeader {
    String maHoaDon, ngayBan, tenKH;

    public HoaDonHeader(String maHoaDon, String ngayBan, String tenKH) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(maHoaDon).append("\t")
                .append(ngayBan).append("\t")
                .append(tenKH);
        return builder.toString();
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
}
