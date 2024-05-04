package behavioral.observer.ca1_streamdata;

import java.util.List;

public class MainCA1 {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream = new MyStream<>();
        DataAccess dataAccess  = new DataAccess(stream);
        MyClient client = new MyClient(stream);
        System.out.println("Lan 1");
        dataAccess.add(new MonHoc("lsd","001"));
        System.out.println("Lan 2");
        dataAccess.add(new MonHoc("boi","002"));
        System.out.println("lan 3");
        dataAccess.xoa("002");
    }
}
