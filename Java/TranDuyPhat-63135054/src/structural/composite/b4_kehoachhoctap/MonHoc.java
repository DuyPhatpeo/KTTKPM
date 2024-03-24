package structural.composite.b4_kehoachhoctap;

public class MonHoc extends KeHoachHocTap{
    int hocPhiTC;
    int soTC;

    public MonHoc(String ten, int hocPhiTC,int soTC) {
        super(ten);
        this.hocPhiTC = hocPhiTC;
        this.soTC = soTC;
    }

    @Override
    void add(KeHoachHocTap k) {

    }

    @Override
    void remove(KeHoachHocTap k) {

    }

    @Override
    int soTC() {
        return soTC;
    }

    @Override
    int hocPhi() {
        return hocPhiTC * soTC;
    }

    @Override
    String thongTin() {
        StringBuilder builder = new StringBuilder();
        builder.append(ten).append(": số tc:").append(soTC).append("\thọc phí:").append(hocPhi());
        return builder.toString();
    }
}
