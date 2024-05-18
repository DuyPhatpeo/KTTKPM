package behavioral.chain_of_responsibility.cb5_xeploai;

public class LoaiThongThuong extends XepLoai{
    XepLoai ketiep;
    public LoaiThongThuong(String tenXepLoai, float max) {
        super(tenXepLoai, max);
    }

    @Override
    public XepLoai bacKeTiep(XepLoai ketiep) {
        this.ketiep = ketiep;
        return this.ketiep;
    }

    @Override
    public String xetXepLoai(float diem) {
        if(diem <= max){
            return tenXepLoai;
        }
        return ketiep.xetXepLoai(diem);

    }

}
