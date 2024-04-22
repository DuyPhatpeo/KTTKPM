package behavioral.chain_of_responsibility.cb3_tiendien;

public class BacThongThuong extends TienDienBacThang{
    TienDienBacThang keTiep;
    public BacThongThuong(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    public TienDienBacThang keTiep(TienDienBacThang k) {
        keTiep = k;
        return keTiep;
    }

    @Override
    public int tinhTienDien(int soKW) {
        if (soKW <= max)
            return (soKW - min) * gia;
        else
            return (max - min) * gia + keTiep.tinhTienDien(soKW);
    }
}
