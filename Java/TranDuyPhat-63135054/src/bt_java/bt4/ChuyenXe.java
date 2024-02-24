package bt_java.bt4;
/*Công ty vận tải V quản lý thông tin là các chuyến xe. Thông tin của 2 loại chuyến xe:
- Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh
thu.
- Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu.
*/
public abstract class ChuyenXe {
    String maSoChuyen, hoTenTaiXe, soXe;
    float doanhThu;

    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        return "Chuyen Xe" +
                "Ma so chuyen: " + maSoChuyen + '\n' +
                "Ho ten tai xe: " + hoTenTaiXe + '\n' +
                "So xe: " + soXe + '\n' +
                "Doanh thu: " + doanhThu + '\n';
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public float getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(float doanhThu) {
        this.doanhThu = doanhThu;
    }
}
