package creational.builder.a6_data_access;

public class MainA6 {
    public static void main(String[] args) {
        UI1 u1 = new UI1();
        UI1 u2 = new UI1();
        u1.add(new SanPham("SP1","Phone",10,100000));
        u1.addSp(new SanPham("SP1","Phone",10,100000),"1");
        u2.add(new SanPham("SP2","TV",9,100000));
        u2.addSp(new SanPham("SP2","Tv",9,100000),"2");

    }
}
