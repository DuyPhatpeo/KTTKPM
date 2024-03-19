package behavioral.chain_of_responsibility.cb1_atm;

public abstract class ATM {
    int menhGia;
    public abstract ATM thietMenhGiaThapHon(ATM atm);
    public abstract void rutTien(int soTien);

    public ATM(int menhGia) {
        this.menhGia = menhGia;
    }
}
