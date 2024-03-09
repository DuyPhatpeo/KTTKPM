package behavioral.stratery.cc2_sapxep;

import java.util.Date;

public class SinhVien {
    String hoTen, ngaySinh;
    float diemTB;

    public SinhVien(String hoTen, String ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "Ho va ten " + hoTen + '\n' +
                "Ngay sinh " + ngaySinh + '\n' +
                "Diem TB " + diemTB + '\n';
    }

}
