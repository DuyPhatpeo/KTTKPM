package bt_java.bt4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> list = new ArrayList<>();

    // thêm chuyến xe
    public void themChuyenXe(ChuyenXe c){
        // kiểm tra nếu đã có chuyến xe trong danh sách thì dừng
        for(ChuyenXe cx: list){
            if(cx.getMaSoChuyen().equals(cx.getMaSoChuyen()))
                return;
        }
        // thêm chuyến xe nếu chưa có trong danh sách
        list.add(c);
    }

    // tính doanh thu xe ngoại thành
    public float doanhThuXeNgoaiThanh(){
        float dt = 0;
        for(ChuyenXe c: list){
            if(c instanceof  ChuyenXeNgoaiThanh)
                dt += c.getDoanhThu();
        }
        return dt;
    }

    // tính doanh thu xe nội thành
    public float doanhThuXeNoiThanh(){
        float dt = 0;
        for(ChuyenXe c: list){
            if(c instanceof  ChuyenXeNoiThanh)
                dt += c.getDoanhThu();
        }
        return dt;
    }

    // tổng doang thu cả 2 xe
    public  float tongDoanhThu(){
        float dt = 0;
        for(ChuyenXe c: list){
            dt += c.getDoanhThu();
        }
        return dt;
    }

    // xuất danh sach chuyến xe
    public void xuatDanhSach(){
        for(ChuyenXe cx: list)
            System.out.println(cx.toString());
    }
}
