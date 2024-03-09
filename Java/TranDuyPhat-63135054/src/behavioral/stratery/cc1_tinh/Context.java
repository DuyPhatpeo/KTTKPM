package behavioral.stratery.cc1_tinh;

public class Context {
    // Sử dụng thành phần tuỳ biến thông qua một đối tượng đại diện
    private Tinh tinh;

    // Setter dược sử dụng để gán một đối tượng cụ thể cho biến đại diện khi sử dụng
    public Context setTinh(Tinh tinh){
        this.tinh = tinh;
        return this;
    }

    public float tinh(float a, float b){
        return tinh.tinh(a,b);
    }
}
