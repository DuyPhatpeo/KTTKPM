package structural.decorator.b1_bieuthuc;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc b = new BieuThucDonGian(5);
        b = new Cong(b,3);
        b = new Cong(b,10);
        b = new Nhan(b,5);
        b = new Chia(b,-10);
        b = new GiaTriTuyetDoi(b);
        System.out.println(b.toString());
    }
}
