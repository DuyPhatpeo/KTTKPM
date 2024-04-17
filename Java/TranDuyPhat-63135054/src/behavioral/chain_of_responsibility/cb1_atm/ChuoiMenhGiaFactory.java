package behavioral.chain_of_responsibility.cb1_atm;

public abstract class ChuoiMenhGiaFactory {
    public abstract ATM_TheoMenhGia getChuoiMenhGia(int menhgia);
    public void rutTien(int sotien, int menhGiaCaoNhat){
        ATM_TheoMenhGia chuoiMenhGia = getChuoiMenhGia(menhGiaCaoNhat);
        if(chuoiMenhGia != null){
            chuoiMenhGia.ruttien(sotien);
        }
    }
}
