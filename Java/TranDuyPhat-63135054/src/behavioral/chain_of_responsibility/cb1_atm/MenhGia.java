package behavioral.chain_of_responsibility.cb1_atm;

public class MenhGia extends ATM_TheoMenhGia {
    ATM_TheoMenhGia ketiep;
    public MenhGia(int menhgia) {
        super(menhgia);
    }

    @Override
    public ATM_TheoMenhGia menhGiaTiepTheo(ATM_TheoMenhGia ketiep) {
        this.ketiep = ketiep;
        return this.ketiep;
    }

    @Override
    public void ruttien(int sotien) {
        int soTo = sotien/menhgia;
        int soDu = sotien%menhgia;
        if(soTo >0)
            System.out.println(soTo + " tờ "+ menhgia);
        if(soDu>0)
            ketiep.ruttien(soDu);
    }
}