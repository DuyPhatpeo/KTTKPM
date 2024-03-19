package behavioral.chain_of_responsibility.f88;

public abstract class ChoVayF88 {
    int hanMucChoVay;
    String ten, chucVu;

    public ChoVayF88(String ten, String chucVu, int hanMucChoVay) {
        this.hanMucChoVay = hanMucChoVay;
        this.ten = ten;
        this.chucVu = chucVu;
    }

    public abstract ChoVayF88 capCaoHon(ChoVayF88 capCao);
    public abstract String xuLyVay(int soTienVay);
}
