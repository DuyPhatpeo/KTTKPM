package structural.composite.b4_kehoachhoctap;

public abstract class KeHoachHocTap {
    String ten;
    String p = "";
    public KeHoachHocTap(String ten) {
        this.ten = ten;
    }
    abstract void add(KeHoachHocTap k);
    abstract void remove(KeHoachHocTap k);
    abstract int soTC();
    abstract int hocPhi();
    abstract String thongTin();
}
