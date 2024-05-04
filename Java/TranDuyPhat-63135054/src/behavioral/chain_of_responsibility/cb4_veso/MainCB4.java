package behavioral.chain_of_responsibility.cb4_veso;

import java.util.ArrayList;
import java.util.Arrays;

public class MainCB4 {
    public static void main(String[] args) {
        GiaiThuong db = new GiaiThongThuong("Giải đặc biệt",new ArrayList(Arrays.asList("879503")));
        GiaiThuong g1 = new GiaiThongThuong("Giải 1",new ArrayList(Arrays.asList("17503")));
        GiaiThuong g2 = new GiaiThongThuong("Giải 2",new ArrayList(Arrays.asList("3503")));
        GiaiThuong g3 = new GiaiThongThuong("Giải 3",new ArrayList(Arrays.asList("49503")));
        GiaiThuong g4 = new GiaiThongThuong("Giải 4",new ArrayList(Arrays.asList("91808")));
        GiaiThuong g5 = new GiaiThongThuong("Giải 5",new ArrayList(Arrays.asList("17809","17809")));
        GiaiThuong g6 = new GiaiThongThuong("Giải 6",new ArrayList(Arrays.asList("3810","3810")));
        GiaiThuong g7 = new GiaiThongThuong("Giải 7",new ArrayList(Arrays.asList("871","789")));
        GiaiThuong g8 = new GiaiThapNhat("Giải 8",new ArrayList(Arrays.asList("68")));
        GiaiThuong kk = new GiaiKhuyenKhich("Giải khuyến kích",new ArrayList(Arrays.asList("879503")));
        db.giaiKeTiep(g1)
                .giaiKeTiep(kk)
                .giaiKeTiep(g2)
                .giaiKeTiep(g3)
                .giaiKeTiep(g4)
                .giaiKeTiep(g5)
                .giaiKeTiep(g6)
                .giaiKeTiep(g7)
                .giaiKeTiep(g8);
        db.doVeSo("889503");
    }

}
