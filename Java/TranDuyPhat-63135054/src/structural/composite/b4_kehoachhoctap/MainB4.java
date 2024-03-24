package structural.composite.b4_kehoachhoctap;

public class MainB4 {
    public static void main(String[] args) {
        KeHoachHocTap Nam1 = new KeHoachChung("Năm 1");
        KeHoachHocTap Ky1 = new KeHoachChung("Kỳ 1");
        KeHoachHocTap Ky2 = new KeHoachChung("Kỳ 2");
        KeHoachHocTap Toan = new MonHoc("Toán",200,3);
        KeHoachHocTap cpp = new MonHoc("Cpp",300,4);
        KeHoachHocTap Mon = new MonHoc("Mon1",200,3);
        Nam1.add(Ky1);
        Nam1.add(Ky2);
        Ky1.add(Toan);
        Ky1.add(cpp);
        Ky2.add(Mon);
        System.out.println(Nam1.thongTin());
    }
}
