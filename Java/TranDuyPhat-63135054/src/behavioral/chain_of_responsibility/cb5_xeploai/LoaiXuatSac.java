package behavioral.chain_of_responsibility.cb5_xeploai;

public class LoaiXuatSac extends XepLoai{
    XepLoai ketiep;
    public LoaiXuatSac(String tenXepLoai, float min) {
        super(tenXepLoai, min);
    }

    @Override
    public XepLoai bacKeTiep(XepLoai ketiep) {
        this.ketiep = ketiep;
        return this.ketiep;
    }

    @Override
    public String xetXepLoai(float diem) {
        if(diem >= min){
            return tenXepLoai;
        }
        return ketiep.xetXepLoai(diem);
    }

}
