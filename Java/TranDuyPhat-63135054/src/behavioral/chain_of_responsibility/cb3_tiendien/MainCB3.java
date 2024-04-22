package behavioral.chain_of_responsibility.cb3_tiendien;

public class MainCB3 {
    public static void main(String[] args) {
        TienDienBacThang bac1 = new BacThongThuong("Bậc 1", 0,50,1806);
        TienDienBacThang bac2 = new BacThongThuong("Bậc 2", 51,100,1866);
        TienDienBacThang bac3 = new BacThongThuong("Bậc 3", 101,200,2167);
        TienDienBacThang bac4 = new BacThongThuong("Bậc 4", 201,300,2729);
        TienDienBacThang bac5 = new BacThongThuong("Bậc 5", 301,400,3050);
        TienDienBacThang bac6 = new BacCaoNhat("Bậc 5", 401, Integer.MAX_VALUE,3050);
        bac1.keTiep(bac2).keTiep(bac3).keTiep(bac4).keTiep(bac5).keTiep(bac6);
        System.out.println(bac1.tinhTienDien(100));
    }
}
