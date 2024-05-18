package behavioral.chain_of_responsibility.cb5_xeploai;

public class LoaiXuatSac extends XepLoai{
    public LoaiXuatSac(String tenXepLoai, float max) {
        super(tenXepLoai, max);
    }

    @Override
    public XepLoai bacKeTiep(XepLoai ketiep) {
        return null;
    }

    @Override
    public String xetXepLoai(float diem) {
        if(diem <= max){
            return tenXepLoai;
        }
        return "Điểm số không đúng";
    }

}
