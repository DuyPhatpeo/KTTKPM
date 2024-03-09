package behavioral.stratery.cc1_tinh;

public class MainCC1 {
    public static void main(String[] args) {
        Context c = new Context();
        System.out.println(c.setTinh(new Cong()).tinh(3,5));
        System.out.println(c.setTinh(new Tru()).tinh(3,5));
        System.out.println(c.setTinh(new Nhan()).tinh(3,5));
        System.out.println(c.setTinh(new Chia()).tinh(3,5));
    }
}
