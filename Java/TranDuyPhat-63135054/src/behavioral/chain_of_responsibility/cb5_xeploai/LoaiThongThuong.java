package behavioral.chain_of_responsibility.cb5_xeploai;

public class LoaiThongThuong extends XepLoai{
    public LoaiThongThuong(String tenXepLoai, float min) {
        super(tenXepLoai, min);
    }

    @Override
    public XepLoai bacKeTiep(XepLoai ketiep) {
        return null;
    }

    @Override
    public String xetXepLoai(float diem) {
        if(diem >= min){
            return tenXepLoai;
        }
        return "";
    }

}
