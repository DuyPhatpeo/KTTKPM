package behavioral.chain_of_responsibility.cb1_atm;

public class ChuoiMenhGiaVND extends ChuoiMenhGiaFactory{
    ATM_TheoMenhGia menhGia1 = new MenhGia(1);
    ATM_TheoMenhGia menhGia2 = new MenhGia(2);
    ATM_TheoMenhGia menhGia5 = new MenhGia(5);
    ATM_TheoMenhGia menhGia10 = new MenhGia(10);
    ATM_TheoMenhGia menhGia20 = new MenhGia(20);
    ATM_TheoMenhGia menhGia50 = new MenhGia(50);
    ATM_TheoMenhGia menhGia100 = new MenhGia(100);
    ATM_TheoMenhGia menhGia200 = new MenhGia(200);
    ATM_TheoMenhGia menhGia500 = new MenhGia(500);
    public ChuoiMenhGiaVND() {
        menhGia500.menhGiaTiepTheo(menhGia200).menhGiaTiepTheo(menhGia100).menhGiaTiepTheo(menhGia50).menhGiaTiepTheo(menhGia20).menhGiaTiepTheo(menhGia10).menhGiaTiepTheo(menhGia5).menhGiaTiepTheo(menhGia2).menhGiaTiepTheo(menhGia1);
    }
    @Override
    public ATM_TheoMenhGia getChuoiMenhGia(int menhgia) {
        switch (menhgia){
            case 500:
                return menhGia500;
            case 200:
                return menhGia200;
            case 100:
                return menhGia100;
            case 50:
                return menhGia50;
            case 20:
                return menhGia20;
            case 10:
                return menhGia10;
            case 5:
                return menhGia5;
            case 2:
                return menhGia2;
            case 1:
                return menhGia1;
            default:
                return null;
        }
    }
}

