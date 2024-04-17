package behavioral.chain_of_responsibility.cb1_atm;

public abstract class ATM_TheoMenhGia {
    int menhgia;

    public ATM_TheoMenhGia(int menhgia) {
        this.menhgia = menhgia;
    }

    public abstract ATM_TheoMenhGia menhGiaTiepTheo(ATM_TheoMenhGia m);
    public abstract void ruttien(int sotien);
}
