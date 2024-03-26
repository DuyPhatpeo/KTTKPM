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

}
