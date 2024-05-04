package behavioral.chain_of_responsibility.cb4_veso;

import java.util.List;

public abstract class GiaiThuong {
    String tenGiai;
    List<String> boSoTrungThuong;

    public GiaiThuong(String tenGiai, List<String> boSoTrungThuong) {
        this.tenGiai = tenGiai;
        this.boSoTrungThuong = boSoTrungThuong;
    }

    public abstract void doVeSo(String veSo);
    public abstract GiaiThuong giaiKeTiep(GiaiThuong keTiep);
}
