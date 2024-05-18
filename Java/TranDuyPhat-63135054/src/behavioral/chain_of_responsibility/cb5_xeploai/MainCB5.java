package behavioral.chain_of_responsibility.cb5_xeploai;

public class MainCB5 {
    public static void main(String[] args) {
        XepLoai yeu = new LoaiThongThuong("Yếu",5);
        XepLoai trungBinh = new LoaiThongThuong("Trung Bình",7);
        XepLoai kha = new LoaiThongThuong("Khá",8);
        XepLoai gioi = new LoaiThongThuong("Giỏi",9);
        XepLoai xuatSac = new LoaiXuatSac("Xuất Sắc",10);
        yeu.bacKeTiep(trungBinh)
                .bacKeTiep(kha)
                .bacKeTiep(gioi)
                .bacKeTiep(xuatSac);
        System.out.println(yeu.xetXepLoai(4.5f));
        System.out.println(yeu.xetXepLoai(6f));
        System.out.println(yeu.xetXepLoai(7.5f));
        System.out.println(yeu.xetXepLoai(8.5f));
        System.out.println(yeu.xetXepLoai(9.5f));
        System.out.println(yeu.xetXepLoai(11f));
    }
}
