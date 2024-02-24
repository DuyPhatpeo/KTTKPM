package bt_java.cc2_sapxep;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    ISoSanh soSanh;

    List<SinhVien> list = new ArrayList<>();

    public  void themSV(SinhVien sv){
        list.add(sv);
    }
    public QLSV setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
        return this;
    }

    public void sapXep(){
        for(int i = 0; i< list.size()-1; i++)
            for(int j = i+1; j< list.size(); j++)
                // Nếu phần tử i lớn hơn phần tử j
                if(soSanh.soSanh(list.get(i),list.get(j)) > 0){
                    // Chuyển j về i
                    SinhVien s = list.get(i);// lấy bản sao phần tử i
                    list.set(i, list.get(j));// lấy bản sao phần tử j đặt vào vị trí i
                    list.set(j, s);

                }
    }

    public void sapXep2(){
        list.sort((o1, o2) -> soSanh.soSanh(o1,o2));
    }

    public void inDS(){
        for(SinhVien s:list)
            System.out.println(s.toString());
    }

}
