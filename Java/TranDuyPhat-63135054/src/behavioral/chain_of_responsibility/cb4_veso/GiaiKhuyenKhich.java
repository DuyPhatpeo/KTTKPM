package behavioral.chain_of_responsibility.cb4_veso;

import java.util.List;

public class GiaiKhuyenKhich extends GiaiThuong{
    GiaiThuong giaiKeTiep;
    public GiaiKhuyenKhich(String tenGiai, List<String> boSoTrungThuong) {
        super(tenGiai, boSoTrungThuong);
    }

    @Override
    public void doVeSo(String veSo) {
        String giaThuong = boSoTrungThuong.getFirst();
        String sub = veSo.substring(veSo.length() - giaThuong.length());
        int count = 0;
        for (int i = 0; i < sub.length();i++){
            if(sub.charAt(i) == giaThuong.charAt(i))
                count++;
        }
        if(count == giaThuong.length() - 1)
            System.out.println("Trúng giải khuyến khích");
        giaiKeTiep.doVeSo(veSo);
    }

    @Override
    public GiaiThuong giaiKeTiep(GiaiThuong keTiep) {
        giaiKeTiep = keTiep;
        return this.giaiKeTiep;
    }
}
