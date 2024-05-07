package behavioral.chain_of_responsibility.cb5_xeploai;

public class MainCB5 {
    public static void main(String[] args) {
        LoaiXuatSac lxs1 = new LoaiXuatSac("Xuất sắc",9f);
        LoaiXuatSac lxs2 = new LoaiXuatSac("Giỏi",8f);
        LoaiXuatSac lxs3 = new LoaiXuatSac("Khá",7f);
        LoaiXuatSac lxs4 = new LoaiXuatSac("Trung bình",5f);
        LoaiXuatSac lxs5 = new LoaiXuatSac("Yếu",0f);
        lxs1.bacKeTiep(lxs2)
                .bacKeTiep(lxs3)
                .bacKeTiep(lxs4)
                .bacKeTiep(lxs5);
        System.out.println(lxs1.xetXepLoai(4.5f));
        System.out.println(lxs1.xetXepLoai(8.5f));
        System.out.println(lxs1.xetXepLoai(9.2f));
    }
}
