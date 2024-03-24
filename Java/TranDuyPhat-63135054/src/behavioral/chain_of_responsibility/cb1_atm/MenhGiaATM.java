package behavioral.chain_of_responsibility.cb1_atm;

public class MenhGiaATM extends ATM{
    ATM menhGiaThapHon;

    public MenhGiaATM(int menhGia) {
        super(menhGia);
    }

    @Override
    public ATM thietMenhGiaThapHon(ATM atm) {
        return menhGiaThapHon;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo, soDu;
        soTo = soTien/menhGia;
        soDu = soTien%menhGia;
    }
}
