package creational.builder.a5_book;

public class MainBook {
    public static void main(String[] args) {
        Book b = new Book.Builder().setTuaDe("abc")
                .setTacGia("bca").setSoTrang(200).addDanhSachChuong(3 + "Chuong 1" + "Chuong 2 " + "Chuong 3").build();
        System.out.println(b.toString());
    }
}
