package behavioral.stratery.cc2_sapxep;

import java.util.ArrayList;
import java.util.List;

public class MainCC2 {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        qlsv.themSV(new SinhVien("Phat","28/10/2003",8.7F));
        qlsv.themSV(new SinhVien("Phuc","28/10/2003",7F));
        qlsv.themSV(new SinhVien("Lam","28/10/2003",8F));
        qlsv.themSV(new SinhVien("Dan","28/10/2003",6F));
        qlsv.themSV(new SinhVien("Thanh","28/10/2003",7.3F));
        qlsv.themSV(new SinhVien("Dat","28/10/2003",5F));

        System.out.println("-------------------------");
        System.out.println("Truoc khi sap xep");
        qlsv.inDS();

        qlsv.setSoSanh(new SoSanhTheoDiem()).sapXep();
        System.out.println("-------------------------");
        System.out.println("Sau khi sap xep theo diem");
        qlsv.inDS();


        System.out.println("-------------------------");
        System.out.println("Sau khi sap xep theo ten");
        qlsv.setSoSanh(new SoSanhTheoTen()).sapXep2();
        qlsv.inDS();
    }
}
