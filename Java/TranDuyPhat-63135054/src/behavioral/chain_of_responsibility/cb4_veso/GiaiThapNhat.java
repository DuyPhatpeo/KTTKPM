package behavioral.chain_of_responsibility.cb4_veso;

import java.util.List;

public class GiaiThapNhat extends GiaiThuong{
    public GiaiThapNhat(String tenGiai, List<String> boSoTrungThuong) {
        super(tenGiai, boSoTrungThuong);
    }

    @Override
    public void doVeSo(String veSo) {
        for (var s : boSoTrungThuong){
            if(veSo.endsWith(s)){
                System.out.println("Ban da trung giai"+ tenGiai);
                return;
            }
            else
                System.out.println("Chuc ban may man lan sau!!!");
        }
    }

    @Override
    public GiaiThuong giaiKeTiep(GiaiThuong keTiep) {
        return null;
    }
}
