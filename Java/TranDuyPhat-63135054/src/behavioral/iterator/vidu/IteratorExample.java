package behavioral.iterator.vidu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    static void duyetMonHoc(Iterator<MonHoc> iterator){
        while (iterator.hasNext()){
            MonHoc  monHoc = iterator.next();
            System.out.println(monHoc.toString());
        }
    }

    public static void main(String[] args) {
        List<MonHoc> list = new ArrayList<>(Arrays.asList(
                new MonHoc("Thể dục",1),
                new MonHoc("Xác xuất thống kê",3),
                new MonHoc("CSDL",3),
                new MonHoc("Toán rời rạc", 3)
        ));
        duyetMonHoc(list.iterator());
    }
}
