package behavioral.chain_of_responsibility.cb5_xeploai;

public abstract class XepLoai {
    String tenXepLoai;
    float min;
    public XepLoai(String tenXepLoai, float min) {
        this.tenXepLoai = tenXepLoai;
        this.min = min;
    }


    public abstract XepLoai bacKeTiep(XepLoai ketiep);
    public abstract String xetXepLoai(float diem);
}
