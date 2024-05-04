package behavioral.chain_of_responsibility.cb4_veso;

import java.util.List;

public class GiaiThongThuong extends GiaiThuong{
    GiaiThuong giaiKeTiep;

    public GiaiThongThuong(String tenGiai, List<String> boSoTrungThuong) {
        super(tenGiai, boSoTrungThuong);
    }

    @Override
    public void doVeSo(String veSo) {
        for (var s : boSoTrungThuong){
            if(veSo.endsWith(s)){
                System.out.println("Ban da trung giai "+ tenGiai);
                return;
            }
        }
        giaiKeTiep.doVeSo(veSo);
    }

    @Override
    public GiaiThuong giaiKeTiep(GiaiThuong keTiep) {
        giaiKeTiep = keTiep;
        return this.giaiKeTiep;
    }
}
