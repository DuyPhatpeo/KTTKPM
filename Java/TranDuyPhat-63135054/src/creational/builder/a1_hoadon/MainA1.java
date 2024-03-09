package creational.builder.a1_hoadon;

public class MainA1 {
    public static void main(String[] args) {
        HoaDon hd = new HoaDon.Builder()
                .setHoaDonHeader("HD01","9/4/2024","Phat")
                .addCTHD("Caphe",3,20000,15000)
                .addCTHD("Coca",3,20000,15000)
                .addCTHD("New",3,20000,15000).build();
        System.out.println(hd.toString());

    }
}
