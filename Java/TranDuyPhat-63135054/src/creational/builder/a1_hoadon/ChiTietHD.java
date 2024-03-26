package creational.builder.a1_hoadon;

import java.util.ArrayList;
import java.util.List;

public class ChiTietHD {
    String sanPham;
    int soLuong, donGia;
    float chietKhau;

    public ChiTietHD(String sanPham, int soLuong, int donGia, float chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append(sanPham)
                .append("\n").append("Số lượng: ").append(soLuong)
                .append("\n").append("Đơn giá: ").append(donGia)
                .append("\n").append("Chiết khấu: ").append(chietKhau);
        return builder.toString();
    }

}
