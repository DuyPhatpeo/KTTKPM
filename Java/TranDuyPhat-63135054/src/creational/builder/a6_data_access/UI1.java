package creational.builder.a6_data_access;

public class UI1 {
    public void add(SanPham s){
        // Lấy đói tượng data Access: Instance
        var d = DataAccess.getInstance();

        d.add(s);
    }
    public void addSp(SanPham s, String tag){
        // Lấy đói tượng data AccessUpgrade
        var d = DataAccessUpgrade.getInstance(tag);
        d.add(s);
    }
    public void in(SanPham s, String tag){

    }
}
