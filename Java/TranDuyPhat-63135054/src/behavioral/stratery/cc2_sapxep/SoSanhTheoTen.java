package behavioral.stratery.cc2_sapxep;

public class SoSanhTheoTen implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        return o1.hoTen.compareTo(o2.hoTen);
    }
}
