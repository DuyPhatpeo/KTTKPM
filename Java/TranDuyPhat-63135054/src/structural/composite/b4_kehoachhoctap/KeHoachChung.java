package structural.composite.b4_kehoachhoctap;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends KeHoachHocTap{
    List<KeHoachHocTap> list = new ArrayList<>();
    public KeHoachChung(String ten) {
        super(ten);
    }

    @Override
    void add(KeHoachHocTap k) {
        list.add(k);
    }

    @Override
    void remove(KeHoachHocTap k) {
        list.remove(k);
    }

    @Override
    int soTC() {
        int t = 0;
        for(var k:list){
            t = t + k.soTC();
        }
        return t;
    }

    @Override
    int hocPhi() {
        int t = 0;
        for(var k:list){
            t = t + k.hocPhi();
        }
        return t;
    }

    @Override
    String thongTin() {
        StringBuilder builder = new StringBuilder();
        builder.append(ten).append("\tsố TC: ").append(soTC()).append("\thọc phí: ").append(hocPhi());
        for(var k:list){
            k.p = this.p + "\t";
            builder.append("\n").append(k.p)
                    .append(k.thongTin());
            k.p = "";
        }
        return builder.toString();
    }
}
