package behavioral.stratery.cc2_sapxep;

public class SoSanhTheoDiem implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if(o1.diemTB > o2.diemTB)
            return 1;
        if(o1.diemTB == o2.diemTB)
            return 0;
        return -1;
    }
}
