package behavioral.chain_of_responsibility.cb1_atm;

public class MainCB1 {
    public static void main(String[] args) {
        ATM_TheoMenhGia menhGia500 = new MenhGia(500);
        ATM_TheoMenhGia menhGia200 = new MenhGia(200);
        ATM_TheoMenhGia menhGia100 = new MenhGia(100);
        ATM_TheoMenhGia menhGia50 = new MenhGia(50);
        ATM_TheoMenhGia menhGia20= new MenhGia(20);
        ATM_TheoMenhGia menhGia10= new MenhGia(10);
        ATM_TheoMenhGia menhGia5= new MenhGia(5);
        ATM_TheoMenhGia menhGia2= new MenhGia(2);
        ATM_TheoMenhGia menhGia1= new MenhGia(1);
        menhGia500.menhGiaTiepTheo(menhGia200).menhGiaTiepTheo(menhGia100).menhGiaTiepTheo(menhGia50).menhGiaTiepTheo(menhGia20).menhGiaTiepTheo(menhGia10).menhGiaTiepTheo(menhGia5).menhGiaTiepTheo(menhGia2).menhGiaTiepTheo(menhGia1);
        menhGia500.ruttien(888);
        System.out.println("----------------------------------------");
        ChuoiMenhGiaFactory chuoiMenhGiaFactory = new ChuoiMenhGiaVND();
        chuoiMenhGiaFactory.rutTien(760,50);
    }
}
