package creational.builder.a6_data_access;

public class SanPham {
    String maSP, tenSP;
    int soLuong;
    float donGia;

    public SanPham(String maSP, String tenSP, int soLuong, float donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Sản phẩm: " +
                "\nMã sp: " + maSP +
                "\nTên sp: " + tenSP +
                "\nSố lượng: " + soLuong +
                "\nĐơn giá: " + donGia;
    }

}
