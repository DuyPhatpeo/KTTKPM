package behavioral.chain_of_responsibility.cb5_xeploai;

public abstract class XepLoai {
    String tenXepLoai;
    float max;
    public XepLoai(String tenXepLoai, float max) {
        this.tenXepLoai = tenXepLoai;
        this.max = max;
    }


    public abstract XepLoai bacKeTiep(XepLoai ketiep);
    public abstract String xetXepLoai(float diem);
}
