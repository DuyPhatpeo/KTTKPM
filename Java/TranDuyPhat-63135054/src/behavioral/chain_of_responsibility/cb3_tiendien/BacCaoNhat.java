package behavioral.chain_of_responsibility.cb3_tiendien;

public class BacCaoNhat extends TienDienBacThang{
    public BacCaoNhat(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    public TienDienBacThang keTiep(TienDienBacThang k) {
        return null;
    }

    @Override
    public int tinhTienDien(int soKW) {
        return (soKW - min) * gia;
    }
}
